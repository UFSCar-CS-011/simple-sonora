/*
 * generated by Xtext
 */
package org.xtext.simplesonora.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.jfugue.player.Player
import org.xtext.simplesonora.simpleSonora.Header
import org.jfugue.pattern.Pattern
import org.jfugue.midi.MidiFileManager
import java.io.File
import org.xtext.simplesonora.simpleSonora.Sequence
import org.xtext.simplesonora.simpleSonora.Note
import org.xtext.simplesonora.simpleSonora.Instrument

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
 
class SimpleSonoraGenerator implements IGenerator {
	
	String songName = new String("")			// song name to create 'midi' file
	String key = new String("")					// key signature
	
	Integer curVoice = 0						// MIDI track/channel/voice
	Integer curOctave = 4 						// default octave 
	String auxNote = new String("")				// aux variable for note
	String auxChord = new String("")			// aux variable for chord
	String curDuration = new String("h")		// default note duration 
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
				
		//JFugue Player and Pattern
		val player = new Player()	
		val pattern = new Pattern()
				
		// Header information to define the basics of the music
		for(Header h :resource.allContents.toIterable.filter(Header)){
			songName = h.songName			// get the song name
			if(h.tempo > 0)
				pattern.tempo = h.tempo			// define the tempo (velocity)
			if(h.key != null)
				pattern.add(h.key.keyToPattern)	// define key signature
		}
		
		curVoice = 0 // first MIDI track/channel/voice
		
		for (Instrument instrument : resource.allContents.toIterable.filter(Instrument)) {
			
			curDuration = 'h' // reset to default each time
			curOctave = 4		
			
			pattern.add('V' + curVoice)
			pattern.add('I[' + instrument.instrumentName + ']')
			
			// Sequence of Notes and/or Chords of the Instrument
			for (Sequence s : instrument.sequences) {
				
				// note
				if (s.note != null) {
					// octave
					if (s.note.octave != null) s.note.octave.setOctave
					pattern.add(s.note.noteToPattern)
				}
				// chord
				if (s.chord != null) {
					auxChord = ""
					for (n : s.chord.chordNotes.toList) {
						// for each note get the pattern and add a '+' 
						if(n.octave != null) n.octave.setOctave
						
						auxChord = auxChord.concat(n.noteToPattern + "+")
					}
					// add the chord pattern minus the extra '+' at the end
					pattern.add(auxChord.substring(0, auxChord.length - 1))
				}
			}
			curVoice++
		}
		
		player.play(pattern) // Play the pattern
		System.out.println(pattern.toString) // Print the pattern on Console
		// Write the .midi file on Eclipse root folder
		MidiFileManager.savePatternToMidi(pattern, new File(songName+".mid"))
	}
	
	/**
	 * Converts the Simple-Sonora key signature pattern to the JFugue pattern.
	 * 
	 * @param k	String containing.
	 * @return String with JFugue Pattern notation for key signature.
	 */
	def String keyToPattern(String k){
		key = "KEY:"	// starts with 'KEY:'
		 // note must be upper case
		key = key.concat(Character.toUpperCase(k.charAt(0)).toString())
		
		// convert the accident 
		if(k.charAt(1).compareTo('+') == 0){
			key = key.concat('#')
		}
		else if (k.charAt(1).compareTo('-') == 0){
			key = key.concat('b')
		}
		// concatenate 'maj' or 'min' to the string
		key = key.concat(k.substring(2).trim)
		
		return key
	}	
	
	/**
	 * Changes the current octave accordingly to the octave operator used.
	 * 
	 * @param o String containing the octave information.
	 */
	def void setOctave(String o){
		// go one octave higher
		if(o.compareTo('>') == 0){
			curOctave++
		}
		// go one octave lower
		else if(o.compareTo('<') == 0){
			curOctave--
		}
		// go to N octave
		else {
			curOctave = Integer.parseInt(o.charAt(1).toString)
		}
	}
	
	/**
	 * Converts from Simple-Sonora note pattern to the JFugue one.
	 * 
	 * @param note Note containing note id, accidental and duration.
	 * @return String with JFugue pattern notation for notes.
	 */
	def String noteToPattern(Note note){
		auxNote =  note.note.toUpperCase	// note must be upper case
		
		// If there is an Accidental - gets the accidental value for JFugue
		if(note.accidental != null){	
			auxNote = auxNote.concat(note.accidental.accidentalToPattern)	
		}
		
		// If there is a duration - gets the duration value for JFugue
		if(note.duration != null){
			curDuration = note.duration.durationToPattern
		}
		
		// concatenate current octave and current duration to the note
		auxNote = auxNote.concat(curOctave.toString + curDuration)
		
		return auxNote	
	}
	
	/**
	 * Converts Simple-Sonora to JFugue duration pattern.
	 * 
	 * @param dur Simple-Sonora notation for duration.
	 * @return JFugue notation for duration.
	 */
	def String durationToPattern(String dur){
		switch(dur){
			case ':1':		// 1		semibreve
				return 'w'			
			case ':2':		// 1/2		minim
				return 'h'
			case ':4':		// 1/4		crotchet
				return 'q'
			case ':8':		// 1/8		quaver
				return 'i'
			case ':16':		// 1/16		semiquaver
				return 's'
			case ':32':		// 1/32		demisemiquaver
				return 't'
			case ':64':		// 1/64		hemidemisemiquaver
				return 'x'
			case ':128':	// 1/128	semihemidemisemiquaver
				return 'o'			
		}		
		return ""
	}
	
	/**
	 * Converts Simple-Sonora to JFugue accidental pattern.
	 * 
	 * @param acc Simple-Sonora accidental notation.
	 * @return JFugue accidental notation.
	 */
	def String accidentalToPattern(String acc){
		switch(acc){
			case '+':		// sharp
				return '#'			
			case '-':		// flat
				return 'b'			
		}			
		return ""
	}
}
