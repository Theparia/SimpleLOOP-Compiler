// Generated from D:/CE@UT/Term 6/PLC/CA/antlr_intro/src/main/grammar\SimpleLOOP.g4 by ANTLR 4.9.2
package main.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLOOPLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Private=1, Public=2, Int=3, Bool=4, BoolLiteral=5, IntLiteral=6, Class=7, 
		Fptr=8, Set=9, Comma=10, Void=11, If=12, Elsif=13, Else=14, Self=15, Print=16, 
		Add=17, Merge=18, Include=19, Delete=20, New=21, Initialize=22, Return=23, 
		Each=24, Do=25, Bar=26, LeftBracket=27, RightBracket=28, LeftParenthesis=29, 
		RightParenthesis=30, LeftCurlyBracket=31, RightCurlyBracket=32, Assign=33, 
		Plus=34, Minus=35, Multiply=36, Division=37, PlusPlus=38, MinusMinus=39, 
		Ternary=40, Colon=41, Not=42, And=43, Or=44, Equals=45, Dot=46, Arrow=47, 
		NewLine=48, Less=49, Greater=50, Semicolon=51, ClassIndentifier=52, Identifier=53, 
		Comment=54, MultilineComment=55, WS=56, FloorDivision=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Private", "Public", "Int", "Bool", "BoolLiteral", "IntLiteral", "Class", 
			"Fptr", "Set", "Comma", "Void", "If", "Elsif", "Else", "Self", "Print", 
			"Add", "Merge", "Include", "Delete", "New", "Initialize", "Return", "Each", 
			"Do", "Bar", "LeftBracket", "RightBracket", "LeftParenthesis", "RightParenthesis", 
			"LeftCurlyBracket", "RightCurlyBracket", "Assign", "Plus", "Minus", "Multiply", 
			"Division", "PlusPlus", "MinusMinus", "Ternary", "Colon", "Not", "And", 
			"Or", "Equals", "Dot", "Arrow", "NewLine", "Less", "Greater", "Semicolon", 
			"ClassIndentifier", "Identifier", "Comment", "MultilineComment", "WS", 
			"FloorDivision"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'private'", "'public'", "'int'", "'bool'", null, null, "'class'", 
			"'fptr'", "'Set'", "','", "'void'", "'if'", "'elsif'", "'else'", "'self'", 
			"'print'", "'add'", "'merge'", "'include'", "'delete'", "'new'", "'initialize'", 
			"'return'", "'each'", "'do'", "'|'", "'['", "']'", "'('", "')'", "'{'", 
			"'}'", "'='", "'+'", "'-'", "'*'", "'/'", "'++'", "'--'", "'?'", "':'", 
			"'!'", "'&&'", "'||'", "'=='", "'.'", "'->'", null, "'<'", "'>'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Private", "Public", "Int", "Bool", "BoolLiteral", "IntLiteral", 
			"Class", "Fptr", "Set", "Comma", "Void", "If", "Elsif", "Else", "Self", 
			"Print", "Add", "Merge", "Include", "Delete", "New", "Initialize", "Return", 
			"Each", "Do", "Bar", "LeftBracket", "RightBracket", "LeftParenthesis", 
			"RightParenthesis", "LeftCurlyBracket", "RightCurlyBracket", "Assign", 
			"Plus", "Minus", "Multiply", "Division", "PlusPlus", "MinusMinus", "Ternary", 
			"Colon", "Not", "And", "Or", "Equals", "Dot", "Arrow", "NewLine", "Less", 
			"Greater", "Semicolon", "ClassIndentifier", "Identifier", "Comment", 
			"MultilineComment", "WS", "FloorDivision"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SimpleLOOPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleLOOP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u017e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0097\n\6\3\7\3\7\7\7"+
		"\u009b\n\7\f\7\16\7\u009e\13\7\3\7\5\7\u00a1\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&"+
		"\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/"+
		"\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\7"+
		"\65\u0145\n\65\f\65\16\65\u0148\13\65\3\66\3\66\7\66\u014c\n\66\f\66\16"+
		"\66\u014f\13\66\3\67\3\67\7\67\u0153\n\67\f\67\16\67\u0156\13\67\3\67"+
		"\3\67\38\38\38\38\38\38\38\38\78\u0162\n8\f8\168\u0165\138\38\38\38\3"+
		"8\38\38\38\39\39\39\39\3:\3:\3:\3:\7:\u0176\n:\f:\16:\u0179\13:\3:\3:"+
		"\3:\3:\4\u0163\u0177\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64g\65i\66k\67m8o9q:s;\3\2\n\3\2\63;\3\2\62;\3\2\62\62\4\2\f\f\17"+
		"\17\3\2C\\\6\2\62;C\\aac|\4\2aac|\4\2\13\13\"\"\2\u0185\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5}\3\2\2\2\7\u0084\3\2\2\2\t\u0088\3\2"+
		"\2\2\13\u0096\3\2\2\2\r\u00a0\3\2\2\2\17\u00a2\3\2\2\2\21\u00a8\3\2\2"+
		"\2\23\u00ad\3\2\2\2\25\u00b1\3\2\2\2\27\u00b3\3\2\2\2\31\u00b8\3\2\2\2"+
		"\33\u00bb\3\2\2\2\35\u00c1\3\2\2\2\37\u00c6\3\2\2\2!\u00cb\3\2\2\2#\u00d1"+
		"\3\2\2\2%\u00d5\3\2\2\2\'\u00db\3\2\2\2)\u00e3\3\2\2\2+\u00ea\3\2\2\2"+
		"-\u00ee\3\2\2\2/\u00f9\3\2\2\2\61\u0100\3\2\2\2\63\u0105\3\2\2\2\65\u0108"+
		"\3\2\2\2\67\u010a\3\2\2\29\u010c\3\2\2\2;\u010e\3\2\2\2=\u0110\3\2\2\2"+
		"?\u0112\3\2\2\2A\u0114\3\2\2\2C\u0116\3\2\2\2E\u0118\3\2\2\2G\u011a\3"+
		"\2\2\2I\u011c\3\2\2\2K\u011e\3\2\2\2M\u0120\3\2\2\2O\u0123\3\2\2\2Q\u0126"+
		"\3\2\2\2S\u0128\3\2\2\2U\u012a\3\2\2\2W\u012c\3\2\2\2Y\u012f\3\2\2\2["+
		"\u0132\3\2\2\2]\u0135\3\2\2\2_\u0137\3\2\2\2a\u013a\3\2\2\2c\u013c\3\2"+
		"\2\2e\u013e\3\2\2\2g\u0140\3\2\2\2i\u0142\3\2\2\2k\u0149\3\2\2\2m\u0150"+
		"\3\2\2\2o\u0159\3\2\2\2q\u016d\3\2\2\2s\u0171\3\2\2\2uv\7r\2\2vw\7t\2"+
		"\2wx\7k\2\2xy\7x\2\2yz\7c\2\2z{\7v\2\2{|\7g\2\2|\4\3\2\2\2}~\7r\2\2~\177"+
		"\7w\2\2\177\u0080\7d\2\2\u0080\u0081\7n\2\2\u0081\u0082\7k\2\2\u0082\u0083"+
		"\7e\2\2\u0083\6\3\2\2\2\u0084\u0085\7k\2\2\u0085\u0086\7p\2\2\u0086\u0087"+
		"\7v\2\2\u0087\b\3\2\2\2\u0088\u0089\7d\2\2\u0089\u008a\7q\2\2\u008a\u008b"+
		"\7q\2\2\u008b\u008c\7n\2\2\u008c\n\3\2\2\2\u008d\u008e\7v\2\2\u008e\u008f"+
		"\7t\2\2\u008f\u0090\7w\2\2\u0090\u0097\7g\2\2\u0091\u0092\7h\2\2\u0092"+
		"\u0093\7c\2\2\u0093\u0094\7n\2\2\u0094\u0095\7u\2\2\u0095\u0097\7g\2\2"+
		"\u0096\u008d\3\2\2\2\u0096\u0091\3\2\2\2\u0097\f\3\2\2\2\u0098\u009c\t"+
		"\2\2\2\u0099\u009b\t\3\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a1\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009f\u00a1\t\4\2\2\u00a0\u0098\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\16\3\2\2\2\u00a2\u00a3\7e\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7c\2\2\u00a5"+
		"\u00a6\7u\2\2\u00a6\u00a7\7u\2\2\u00a7\20\3\2\2\2\u00a8\u00a9\7h\2\2\u00a9"+
		"\u00aa\7r\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7t\2\2\u00ac\22\3\2\2\2\u00ad"+
		"\u00ae\7U\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7v\2\2\u00b0\24\3\2\2\2\u00b1"+
		"\u00b2\7.\2\2\u00b2\26\3\2\2\2\u00b3\u00b4\7x\2\2\u00b4\u00b5\7q\2\2\u00b5"+
		"\u00b6\7k\2\2\u00b6\u00b7\7f\2\2\u00b7\30\3\2\2\2\u00b8\u00b9\7k\2\2\u00b9"+
		"\u00ba\7h\2\2\u00ba\32\3\2\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7n\2\2\u00bd"+
		"\u00be\7u\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7h\2\2\u00c0\34\3\2\2\2\u00c1"+
		"\u00c2\7g\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7g\2\2"+
		"\u00c5\36\3\2\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7"+
		"n\2\2\u00c9\u00ca\7h\2\2\u00ca \3\2\2\2\u00cb\u00cc\7r\2\2\u00cc\u00cd"+
		"\7t\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7v\2\2\u00d0"+
		"\"\3\2\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7f\2\2\u00d3\u00d4\7f\2\2\u00d4"+
		"$\3\2\2\2\u00d5\u00d6\7o\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7t\2\2\u00d8"+
		"\u00d9\7i\2\2\u00d9\u00da\7g\2\2\u00da&\3\2\2\2\u00db\u00dc\7k\2\2\u00dc"+
		"\u00dd\7p\2\2\u00dd\u00de\7e\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7w\2\2"+
		"\u00e0\u00e1\7f\2\2\u00e1\u00e2\7g\2\2\u00e2(\3\2\2\2\u00e3\u00e4\7f\2"+
		"\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8"+
		"\7v\2\2\u00e8\u00e9\7g\2\2\u00e9*\3\2\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec"+
		"\7g\2\2\u00ec\u00ed\7y\2\2\u00ed,\3\2\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0"+
		"\7p\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7k\2\2\u00f3"+
		"\u00f4\7c\2\2\u00f4\u00f5\7n\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7|\2\2"+
		"\u00f7\u00f8\7g\2\2\u00f8.\3\2\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7g\2"+
		"\2\u00fb\u00fc\7v\2\2\u00fc\u00fd\7w\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff"+
		"\7p\2\2\u00ff\60\3\2\2\2\u0100\u0101\7g\2\2\u0101\u0102\7c\2\2\u0102\u0103"+
		"\7e\2\2\u0103\u0104\7j\2\2\u0104\62\3\2\2\2\u0105\u0106\7f\2\2\u0106\u0107"+
		"\7q\2\2\u0107\64\3\2\2\2\u0108\u0109\7~\2\2\u0109\66\3\2\2\2\u010a\u010b"+
		"\7]\2\2\u010b8\3\2\2\2\u010c\u010d\7_\2\2\u010d:\3\2\2\2\u010e\u010f\7"+
		"*\2\2\u010f<\3\2\2\2\u0110\u0111\7+\2\2\u0111>\3\2\2\2\u0112\u0113\7}"+
		"\2\2\u0113@\3\2\2\2\u0114\u0115\7\177\2\2\u0115B\3\2\2\2\u0116\u0117\7"+
		"?\2\2\u0117D\3\2\2\2\u0118\u0119\7-\2\2\u0119F\3\2\2\2\u011a\u011b\7/"+
		"\2\2\u011bH\3\2\2\2\u011c\u011d\7,\2\2\u011dJ\3\2\2\2\u011e\u011f\7\61"+
		"\2\2\u011fL\3\2\2\2\u0120\u0121\7-\2\2\u0121\u0122\7-\2\2\u0122N\3\2\2"+
		"\2\u0123\u0124\7/\2\2\u0124\u0125\7/\2\2\u0125P\3\2\2\2\u0126\u0127\7"+
		"A\2\2\u0127R\3\2\2\2\u0128\u0129\7<\2\2\u0129T\3\2\2\2\u012a\u012b\7#"+
		"\2\2\u012bV\3\2\2\2\u012c\u012d\7(\2\2\u012d\u012e\7(\2\2\u012eX\3\2\2"+
		"\2\u012f\u0130\7~\2\2\u0130\u0131\7~\2\2\u0131Z\3\2\2\2\u0132\u0133\7"+
		"?\2\2\u0133\u0134\7?\2\2\u0134\\\3\2\2\2\u0135\u0136\7\60\2\2\u0136^\3"+
		"\2\2\2\u0137\u0138\7/\2\2\u0138\u0139\7@\2\2\u0139`\3\2\2\2\u013a\u013b"+
		"\t\5\2\2\u013bb\3\2\2\2\u013c\u013d\7>\2\2\u013dd\3\2\2\2\u013e\u013f"+
		"\7@\2\2\u013ff\3\2\2\2\u0140\u0141\7=\2\2\u0141h\3\2\2\2\u0142\u0146\t"+
		"\6\2\2\u0143\u0145\t\7\2\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147j\3\2\2\2\u0148\u0146\3\2\2\2"+
		"\u0149\u014d\t\b\2\2\u014a\u014c\t\7\2\2\u014b\u014a\3\2\2\2\u014c\u014f"+
		"\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014el\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u0150\u0154\7%\2\2\u0151\u0153\n\5\2\2\u0152\u0151\3\2"+
		"\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\b\67\2\2\u0158n\3\2\2\2"+
		"\u0159\u015a\7?\2\2\u015a\u015b\7d\2\2\u015b\u015c\7g\2\2\u015c\u015d"+
		"\7i\2\2\u015d\u015e\7k\2\2\u015e\u015f\7p\2\2\u015f\u0163\3\2\2\2\u0160"+
		"\u0162\13\2\2\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0164\3"+
		"\2\2\2\u0163\u0161\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166"+
		"\u0167\7?\2\2\u0167\u0168\7g\2\2\u0168\u0169\7p\2\2\u0169\u016a\7f\2\2"+
		"\u016a\u016b\3\2\2\2\u016b\u016c\b8\2\2\u016cp\3\2\2\2\u016d\u016e\t\t"+
		"\2\2\u016e\u016f\3\2\2\2\u016f\u0170\b9\2\2\u0170r\3\2\2\2\u0171\u0172"+
		"\7\61\2\2\u0172\u0173\7\61\2\2\u0173\u0177\3\2\2\2\u0174\u0176\13\2\2"+
		"\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0178\3\2\2\2\u0177\u0175"+
		"\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\7\f\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017d\b:\2\2\u017dt\3\2\2\2\13\2\u0096\u009c\u00a0"+
		"\u0146\u014d\u0154\u0163\u0177\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}