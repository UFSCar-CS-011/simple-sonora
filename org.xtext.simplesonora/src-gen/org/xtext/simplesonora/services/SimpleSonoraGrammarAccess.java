/*
 * generated by Xtext
 */
package org.xtext.simplesonora.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class SimpleSonoraGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class DocumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Document");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cHeaderAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cHeaderHeaderParserRuleCall_0_0 = (RuleCall)cHeaderAssignment_0.eContents().get(0);
		private final Assignment cSongAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSongSongParserRuleCall_1_0 = (RuleCall)cSongAssignment_1.eContents().get(0);
		
		//Document:
		//	header=Header song=Song;
		@Override public ParserRule getRule() { return rule; }

		//header=Header song=Song
		public Group getGroup() { return cGroup; }

		//header=Header
		public Assignment getHeaderAssignment_0() { return cHeaderAssignment_0; }

		//Header
		public RuleCall getHeaderHeaderParserRuleCall_0_0() { return cHeaderHeaderParserRuleCall_0_0; }

		//song=Song
		public Assignment getSongAssignment_1() { return cSongAssignment_1; }

		//Song
		public RuleCall getSongSongParserRuleCall_1_0() { return cSongSongParserRuleCall_1_0; }
	}

	public class HeaderElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Header");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Keyword cTitleKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cSongNameAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cSongNameIDTerminalRuleCall_0_2_0 = (RuleCall)cSongNameAssignment_0_2.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cTempoKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cTempoAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cTempoINTTerminalRuleCall_1_2_0 = (RuleCall)cTempoAssignment_1_2.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cKeyKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cKeyAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cKeyKeyParserRuleCall_2_2_0 = (RuleCall)cKeyAssignment_2_2.eContents().get(0);
		
		/// * Header of the file containing the tempo, time and key of melody. * / Header:
		//	("title" "=" songName=ID) ("tempo" "=" tempo=INT)? // default is 120 (Allegro)
		//	("key" "=" key=Key)? // default is C major
		//;
		@Override public ParserRule getRule() { return rule; }

		//("title" "=" songName=ID) ("tempo" "=" tempo=INT)? // default is 120 (Allegro)
		//("key" "=" key=Key)? // default is C major
		public Group getGroup() { return cGroup; }

		//"title" "=" songName=ID
		public Group getGroup_0() { return cGroup_0; }

		//"title"
		public Keyword getTitleKeyword_0_0() { return cTitleKeyword_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_0_1() { return cEqualsSignKeyword_0_1; }

		//songName=ID
		public Assignment getSongNameAssignment_0_2() { return cSongNameAssignment_0_2; }

		//ID
		public RuleCall getSongNameIDTerminalRuleCall_0_2_0() { return cSongNameIDTerminalRuleCall_0_2_0; }

		//("tempo" "=" tempo=INT)?
		public Group getGroup_1() { return cGroup_1; }

		//"tempo"
		public Keyword getTempoKeyword_1_0() { return cTempoKeyword_1_0; }

		//"="
		public Keyword getEqualsSignKeyword_1_1() { return cEqualsSignKeyword_1_1; }

		//tempo=INT
		public Assignment getTempoAssignment_1_2() { return cTempoAssignment_1_2; }

		//INT
		public RuleCall getTempoINTTerminalRuleCall_1_2_0() { return cTempoINTTerminalRuleCall_1_2_0; }

		//("key" "=" key=Key)?
		public Group getGroup_2() { return cGroup_2; }

		//"key"
		public Keyword getKeyKeyword_2_0() { return cKeyKeyword_2_0; }

		//"="
		public Keyword getEqualsSignKeyword_2_1() { return cEqualsSignKeyword_2_1; }

		//key=Key
		public Assignment getKeyAssignment_2_2() { return cKeyAssignment_2_2; }

		//Key
		public RuleCall getKeyKeyParserRuleCall_2_2_0() { return cKeyKeyParserRuleCall_2_2_0; }
	}

	public class KeyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Key");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cNOTE_IDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cACCIDENTALTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cINTERVALTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//Key:
		//	NOTE_ID ACCIDENTAL? INTERVAL;
		@Override public ParserRule getRule() { return rule; }

		//NOTE_ID ACCIDENTAL? INTERVAL
		public Group getGroup() { return cGroup; }

		//NOTE_ID
		public RuleCall getNOTE_IDTerminalRuleCall_0() { return cNOTE_IDTerminalRuleCall_0; }

		//ACCIDENTAL?
		public RuleCall getACCIDENTALTerminalRuleCall_1() { return cACCIDENTALTerminalRuleCall_1; }

		//INTERVAL
		public RuleCall getINTERVALTerminalRuleCall_2() { return cINTERVALTerminalRuleCall_2; }
	}

	public class SongElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Song");
		private final Assignment cInstrumentsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cInstrumentsInstrumentParserRuleCall_0 = (RuleCall)cInstrumentsAssignment.eContents().get(0);
		
		/// * The body of the file with melody. * / Song:
		//	instruments+=Instrument+;
		@Override public ParserRule getRule() { return rule; }

		//instruments+=Instrument+
		public Assignment getInstrumentsAssignment() { return cInstrumentsAssignment; }

		//Instrument
		public RuleCall getInstrumentsInstrumentParserRuleCall_0() { return cInstrumentsInstrumentParserRuleCall_0; }
	}

	public class InstrumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Instrument");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cInstrumentNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cInstrumentNameIDTerminalRuleCall_0_0 = (RuleCall)cInstrumentNameAssignment_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSequencesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSequencesSequenceParserRuleCall_2_0 = (RuleCall)cSequencesAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Instrument:
		//	instrumentName=ID "{" sequences+=Sequence+ "}";
		@Override public ParserRule getRule() { return rule; }

		//instrumentName=ID "{" sequences+=Sequence+ "}"
		public Group getGroup() { return cGroup; }

		//instrumentName=ID
		public Assignment getInstrumentNameAssignment_0() { return cInstrumentNameAssignment_0; }

		//ID
		public RuleCall getInstrumentNameIDTerminalRuleCall_0_0() { return cInstrumentNameIDTerminalRuleCall_0_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//sequences+=Sequence+
		public Assignment getSequencesAssignment_2() { return cSequencesAssignment_2; }

		//Sequence
		public RuleCall getSequencesSequenceParserRuleCall_2_0() { return cSequencesSequenceParserRuleCall_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}

	public class SequenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Sequence");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cNoteAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cNoteNoteParserRuleCall_0_0 = (RuleCall)cNoteAssignment_0.eContents().get(0);
		private final Assignment cChordAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cChordChordParserRuleCall_1_0 = (RuleCall)cChordAssignment_1.eContents().get(0);
		
		//Sequence:
		//	note=Note | chord=Chord;
		@Override public ParserRule getRule() { return rule; }

		//note=Note | chord=Chord
		public Alternatives getAlternatives() { return cAlternatives; }

		//note=Note
		public Assignment getNoteAssignment_0() { return cNoteAssignment_0; }

		//Note
		public RuleCall getNoteNoteParserRuleCall_0_0() { return cNoteNoteParserRuleCall_0_0; }

		//chord=Chord
		public Assignment getChordAssignment_1() { return cChordAssignment_1; }

		//Chord
		public RuleCall getChordChordParserRuleCall_1_0() { return cChordChordParserRuleCall_1_0; }
	}

	public class ChordElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Chord");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cChordNotesAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cChordNotesNoteParserRuleCall_0_0 = (RuleCall)cChordNotesAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cSolidusKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cChordNotesAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cChordNotesNoteParserRuleCall_1_1_0 = (RuleCall)cChordNotesAssignment_1_1.eContents().get(0);
		
		//Chord:
		//	chordNotes+=Note ("/" chordNotes+=Note)+;
		@Override public ParserRule getRule() { return rule; }

		//chordNotes+=Note ("/" chordNotes+=Note)+
		public Group getGroup() { return cGroup; }

		//chordNotes+=Note
		public Assignment getChordNotesAssignment_0() { return cChordNotesAssignment_0; }

		//Note
		public RuleCall getChordNotesNoteParserRuleCall_0_0() { return cChordNotesNoteParserRuleCall_0_0; }

		//("/" chordNotes+=Note)+
		public Group getGroup_1() { return cGroup_1; }

		//"/"
		public Keyword getSolidusKeyword_1_0() { return cSolidusKeyword_1_0; }

		//chordNotes+=Note
		public Assignment getChordNotesAssignment_1_1() { return cChordNotesAssignment_1_1; }

		//Note
		public RuleCall getChordNotesNoteParserRuleCall_1_1_0() { return cChordNotesNoteParserRuleCall_1_1_0; }
	}

	public class NoteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Note");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOctaveAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cOctaveOCTAVETerminalRuleCall_0_0 = (RuleCall)cOctaveAssignment_0.eContents().get(0);
		private final Assignment cNoteAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNoteNOTE_IDTerminalRuleCall_1_0 = (RuleCall)cNoteAssignment_1.eContents().get(0);
		private final Assignment cAccidentalAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAccidentalACCIDENTALTerminalRuleCall_2_0 = (RuleCall)cAccidentalAssignment_2.eContents().get(0);
		private final Assignment cDurationAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDurationDURATIONTerminalRuleCall_3_0 = (RuleCall)cDurationAssignment_3.eContents().get(0);
		
		//Note:
		//	octave=OCTAVE? note=NOTE_ID accidental=ACCIDENTAL? duration=DURATION?;
		@Override public ParserRule getRule() { return rule; }

		//octave=OCTAVE? note=NOTE_ID accidental=ACCIDENTAL? duration=DURATION?
		public Group getGroup() { return cGroup; }

		//octave=OCTAVE?
		public Assignment getOctaveAssignment_0() { return cOctaveAssignment_0; }

		//OCTAVE
		public RuleCall getOctaveOCTAVETerminalRuleCall_0_0() { return cOctaveOCTAVETerminalRuleCall_0_0; }

		//note=NOTE_ID
		public Assignment getNoteAssignment_1() { return cNoteAssignment_1; }

		//NOTE_ID
		public RuleCall getNoteNOTE_IDTerminalRuleCall_1_0() { return cNoteNOTE_IDTerminalRuleCall_1_0; }

		//accidental=ACCIDENTAL?
		public Assignment getAccidentalAssignment_2() { return cAccidentalAssignment_2; }

		//ACCIDENTAL
		public RuleCall getAccidentalACCIDENTALTerminalRuleCall_2_0() { return cAccidentalACCIDENTALTerminalRuleCall_2_0; }

		//duration=DURATION?
		public Assignment getDurationAssignment_3() { return cDurationAssignment_3; }

		//DURATION
		public RuleCall getDurationDURATIONTerminalRuleCall_3_0() { return cDurationDURATIONTerminalRuleCall_3_0; }
	}
	
	
	private final DocumentElements pDocument;
	private final HeaderElements pHeader;
	private final KeyElements pKey;
	private final TerminalRule tINTERVAL;
	private final SongElements pSong;
	private final InstrumentElements pInstrument;
	private final SequenceElements pSequence;
	private final ChordElements pChord;
	private final NoteElements pNote;
	private final TerminalRule tOCTAVE;
	private final TerminalRule tACCIDENTAL;
	private final TerminalRule tNOTE_ID;
	private final TerminalRule tDURATION;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SimpleSonoraGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDocument = new DocumentElements();
		this.pHeader = new HeaderElements();
		this.pKey = new KeyElements();
		this.tINTERVAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "INTERVAL");
		this.pSong = new SongElements();
		this.pInstrument = new InstrumentElements();
		this.pSequence = new SequenceElements();
		this.pChord = new ChordElements();
		this.pNote = new NoteElements();
		this.tOCTAVE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "OCTAVE");
		this.tACCIDENTAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ACCIDENTAL");
		this.tNOTE_ID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "NOTE_ID");
		this.tDURATION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "DURATION");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.simplesonora.SimpleSonora".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Document:
	//	header=Header song=Song;
	public DocumentElements getDocumentAccess() {
		return pDocument;
	}
	
	public ParserRule getDocumentRule() {
		return getDocumentAccess().getRule();
	}

	/// * Header of the file containing the tempo, time and key of melody. * / Header:
	//	("title" "=" songName=ID) ("tempo" "=" tempo=INT)? // default is 120 (Allegro)
	//	("key" "=" key=Key)? // default is C major
	//;
	public HeaderElements getHeaderAccess() {
		return pHeader;
	}
	
	public ParserRule getHeaderRule() {
		return getHeaderAccess().getRule();
	}

	//Key:
	//	NOTE_ID ACCIDENTAL? INTERVAL;
	public KeyElements getKeyAccess() {
		return pKey;
	}
	
	public ParserRule getKeyRule() {
		return getKeyAccess().getRule();
	}

	//terminal INTERVAL:
	//	"maj" | "min";
	public TerminalRule getINTERVALRule() {
		return tINTERVAL;
	} 

	/// * The body of the file with melody. * / Song:
	//	instruments+=Instrument+;
	public SongElements getSongAccess() {
		return pSong;
	}
	
	public ParserRule getSongRule() {
		return getSongAccess().getRule();
	}

	//Instrument:
	//	instrumentName=ID "{" sequences+=Sequence+ "}";
	public InstrumentElements getInstrumentAccess() {
		return pInstrument;
	}
	
	public ParserRule getInstrumentRule() {
		return getInstrumentAccess().getRule();
	}

	//Sequence:
	//	note=Note | chord=Chord;
	public SequenceElements getSequenceAccess() {
		return pSequence;
	}
	
	public ParserRule getSequenceRule() {
		return getSequenceAccess().getRule();
	}

	//Chord:
	//	chordNotes+=Note ("/" chordNotes+=Note)+;
	public ChordElements getChordAccess() {
		return pChord;
	}
	
	public ParserRule getChordRule() {
		return getChordAccess().getRule();
	}

	//Note:
	//	octave=OCTAVE? note=NOTE_ID accidental=ACCIDENTAL? duration=DURATION?;
	public NoteElements getNoteAccess() {
		return pNote;
	}
	
	public ParserRule getNoteRule() {
		return getNoteAccess().getRule();
	}

	//terminal OCTAVE:
	//	"<"+ | "o" "0".."9" | ">"+;
	public TerminalRule getOCTAVERule() {
		return tOCTAVE;
	} 

	//terminal ACCIDENTAL:
	//	"+" | "-";
	public TerminalRule getACCIDENTALRule() {
		return tACCIDENTAL;
	} 

	//terminal NOTE_ID:
	//	"a".."g" | "A".."G";
	public TerminalRule getNOTE_IDRule() {
		return tNOTE_ID;
	} 

	//terminal DURATION:
	//	":" ("1" | "2" | "4" | "8" | "16" | "32");
	public TerminalRule getDURATIONRule() {
		return tDURATION;
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
