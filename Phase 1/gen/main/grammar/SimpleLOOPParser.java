// Generated from D:/CE@UT/Term 6/PLC/CA/antlr_intro/src/main/grammar\SimpleLOOP.g4 by ANTLR 4.9.2
package main.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLOOPParser extends Parser {
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
	public static final int
		RULE_simpleLOOP = 0, RULE_globalSection = 1, RULE_classSection = 2, RULE_classDeclaration = 3, 
		RULE_classBody = 4, RULE_classVariable = 5, RULE_classMethod = 6, RULE_scope = 7, 
		RULE_multiStatements = 8, RULE_singleStatement = 9, RULE_ifStatement = 10, 
		RULE_returnStatement = 11, RULE_iterativeStatement = 12, RULE_statement = 13, 
		RULE_methodArguments = 14, RULE_methodCallStatement = 15, RULE_mergeStatement = 16, 
		RULE_addStatement = 17, RULE_deleteStatement = 18, RULE_printStatement = 19, 
		RULE_methodDeclarationArguments = 20, RULE_singleMethodArgument = 21, 
		RULE_variableDeclaration = 22, RULE_identifiers = 23, RULE_type = 24, 
		RULE_arrayType = 25, RULE_fptrType = 26, RULE_setType = 27, RULE_assignStatement = 28, 
		RULE_expression = 29, RULE_assignExpression = 30, RULE_ternaryExpression = 31, 
		RULE_logicalOrExpression = 32, RULE_logicalAndExpression = 33, RULE_equalityExpression = 34, 
		RULE_relationalExpression = 35, RULE_additiveExpression = 36, RULE_multiplicativeExpression = 37, 
		RULE_notExpression = 38, RULE_unaryExpression = 39, RULE_accessExpression = 40, 
		RULE_defaultExpressions = 41, RULE_values = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"simpleLOOP", "globalSection", "classSection", "classDeclaration", "classBody", 
			"classVariable", "classMethod", "scope", "multiStatements", "singleStatement", 
			"ifStatement", "returnStatement", "iterativeStatement", "statement", 
			"methodArguments", "methodCallStatement", "mergeStatement", "addStatement", 
			"deleteStatement", "printStatement", "methodDeclarationArguments", "singleMethodArgument", 
			"variableDeclaration", "identifiers", "type", "arrayType", "fptrType", 
			"setType", "assignStatement", "expression", "assignExpression", "ternaryExpression", 
			"logicalOrExpression", "logicalAndExpression", "equalityExpression", 
			"relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"notExpression", "unaryExpression", "accessExpression", "defaultExpressions", 
			"values"
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

	@Override
	public String getGrammarFileName() { return "SimpleLOOP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleLOOPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SimpleLOOPContext extends ParserRuleContext {
		public GlobalSectionContext globalSection() {
			return getRuleContext(GlobalSectionContext.class,0);
		}
		public ClassSectionContext classSection() {
			return getRuleContext(ClassSectionContext.class,0);
		}
		public List<TerminalNode> NewLine() { return getTokens(SimpleLOOPParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(SimpleLOOPParser.NewLine, i);
		}
		public SimpleLOOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleLOOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSimpleLOOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSimpleLOOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSimpleLOOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleLOOPContext simpleLOOP() throws RecognitionException {
		SimpleLOOPContext _localctx = new SimpleLOOPContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_simpleLOOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			globalSection();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(87);
				match(NewLine);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			classSection();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalSectionContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> NewLine() { return getTokens(SimpleLOOPParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(SimpleLOOPParser.NewLine, i);
		}
		public GlobalSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterGlobalSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitGlobalSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitGlobalSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalSectionContext globalSection() throws RecognitionException {
		GlobalSectionContext _localctx = new GlobalSectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_globalSection);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NewLine) {
						{
						{
						setState(95);
						match(NewLine);
						}
						}
						setState(100);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(101);
					variableDeclaration();
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassSectionContext extends ParserRuleContext {
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public ClassSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterClassSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitClassSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitClassSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassSectionContext classSection() throws RecognitionException {
		ClassSectionContext _localctx = new ClassSectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Class) {
				{
				{
				setState(107);
				classDeclaration();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public Token className;
		public Token parent;
		public TerminalNode Class() { return getToken(SimpleLOOPParser.Class, 0); }
		public TerminalNode LeftCurlyBracket() { return getToken(SimpleLOOPParser.LeftCurlyBracket, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode RightCurlyBracket() { return getToken(SimpleLOOPParser.RightCurlyBracket, 0); }
		public List<TerminalNode> ClassIndentifier() { return getTokens(SimpleLOOPParser.ClassIndentifier); }
		public TerminalNode ClassIndentifier(int i) {
			return getToken(SimpleLOOPParser.ClassIndentifier, i);
		}
		public TerminalNode Less() { return getToken(SimpleLOOPParser.Less, 0); }
		public List<TerminalNode> NewLine() { return getTokens(SimpleLOOPParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(SimpleLOOPParser.NewLine, i);
		}
		public ClassVariableContext classVariable() {
			return getRuleContext(ClassVariableContext.class,0);
		}
		public ClassMethodContext classMethod() {
			return getRuleContext(ClassMethodContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDeclaration);
		int _la;
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(Class);
				setState(114);
				((ClassDeclarationContext)_localctx).className = match(ClassIndentifier);
				System.out.println("ClassDec : " + (((ClassDeclarationContext)_localctx).className!=null?((ClassDeclarationContext)_localctx).className.getText():null));
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Less) {
					{
					setState(116);
					match(Less);
					setState(117);
					((ClassDeclarationContext)_localctx).parent = match(ClassIndentifier);
					System.out.println("Inheritance : " + (((ClassDeclarationContext)_localctx).className!=null?((ClassDeclarationContext)_localctx).className.getText():null) + " < " + (((ClassDeclarationContext)_localctx).parent!=null?((ClassDeclarationContext)_localctx).parent.getText():null));
					}
				}

				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NewLine) {
					{
					{
					setState(121);
					match(NewLine);
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(LeftCurlyBracket);
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(128);
					match(NewLine);
					}
					}
					setState(131); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NewLine );
				setState(133);
				classBody();
				setState(134);
				match(RightCurlyBracket);
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(135);
					match(NewLine);
					}
					}
					setState(138); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NewLine );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(Class);
				setState(141);
				((ClassDeclarationContext)_localctx).className = match(ClassIndentifier);
				System.out.println("ClassDec : " + (((ClassDeclarationContext)_localctx).className!=null?((ClassDeclarationContext)_localctx).className.getText():null));
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Less) {
					{
					setState(143);
					match(Less);
					setState(144);
					((ClassDeclarationContext)_localctx).parent = match(ClassIndentifier);
					System.out.println("Inheritance : " + (((ClassDeclarationContext)_localctx).className!=null?((ClassDeclarationContext)_localctx).className.getText():null) + " < " + (((ClassDeclarationContext)_localctx).parent!=null?((ClassDeclarationContext)_localctx).parent.getText():null));
					}
				}

				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(148);
					match(NewLine);
					}
					}
					setState(151); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NewLine );
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(153);
					classVariable();
					setState(155); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(154);
						match(NewLine);
						}
						}
						setState(157); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NewLine );
					}
					break;
				case 2:
					{
					setState(159);
					classMethod();
					setState(161); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(160);
						match(NewLine);
						}
						}
						setState(163); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NewLine );
					}
					break;
				case 3:
					{
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassVariableContext> classVariable() {
			return getRuleContexts(ClassVariableContext.class);
		}
		public ClassVariableContext classVariable(int i) {
			return getRuleContext(ClassVariableContext.class,i);
		}
		public List<ClassMethodContext> classMethod() {
			return getRuleContexts(ClassMethodContext.class);
		}
		public ClassMethodContext classMethod(int i) {
			return getRuleContext(ClassMethodContext.class,i);
		}
		public List<TerminalNode> NewLine() { return getTokens(SimpleLOOPParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(SimpleLOOPParser.NewLine, i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Private || _la==Public) {
				{
				setState(177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(170);
					classVariable();
					setState(172); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(171);
						match(NewLine);
						}
						}
						setState(174); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NewLine );
					}
					break;
				case 2:
					{
					setState(176);
					classMethod();
					}
					break;
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassVariableContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode Private() { return getToken(SimpleLOOPParser.Private, 0); }
		public TerminalNode Public() { return getToken(SimpleLOOPParser.Public, 0); }
		public ClassVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterClassVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitClassVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitClassVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassVariableContext classVariable() throws RecognitionException {
		ClassVariableContext _localctx = new ClassVariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !(_la==Private || _la==Public) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(183);
			variableDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMethodContext extends ParserRuleContext {
		public Token methodName;
		public TerminalNode LeftParenthesis() { return getToken(SimpleLOOPParser.LeftParenthesis, 0); }
		public MethodDeclarationArgumentsContext methodDeclarationArguments() {
			return getRuleContext(MethodDeclarationArgumentsContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(SimpleLOOPParser.RightParenthesis, 0); }
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public TerminalNode Private() { return getToken(SimpleLOOPParser.Private, 0); }
		public TerminalNode Public() { return getToken(SimpleLOOPParser.Public, 0); }
		public TerminalNode Identifier() { return getToken(SimpleLOOPParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Void() { return getToken(SimpleLOOPParser.Void, 0); }
		public TerminalNode Initialize() { return getToken(SimpleLOOPParser.Initialize, 0); }
		public ClassMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterClassMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitClassMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitClassMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMethodContext classMethod() throws RecognitionException {
		ClassMethodContext _localctx = new ClassMethodContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classMethod);
		int _la;
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				_la = _input.LA(1);
				if ( !(_la==Private || _la==Public) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(188);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Int:
				case Bool:
				case Fptr:
				case Set:
				case ClassIndentifier:
					{
					setState(186);
					type();
					}
					break;
				case Void:
					{
					setState(187);
					match(Void);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(190);
				((ClassMethodContext)_localctx).methodName = match(Identifier);
				System.out.println("MethodDec : " + (((ClassMethodContext)_localctx).methodName!=null?((ClassMethodContext)_localctx).methodName.getText():null));
				setState(192);
				match(LeftParenthesis);
				setState(193);
				methodDeclarationArguments();
				setState(194);
				match(RightParenthesis);
				setState(195);
				scope();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(Public);
				setState(198);
				match(Initialize);
				setState(199);
				match(LeftParenthesis);
				setState(200);
				methodDeclarationArguments();
				setState(201);
				match(RightParenthesis);
				setState(202);
				scope();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScopeContext extends ParserRuleContext {
		public MultiStatementsContext multiStatements() {
			return getRuleContext(MultiStatementsContext.class,0);
		}
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_scope);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				multiStatements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				singleStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiStatementsContext extends ParserRuleContext {
		public TerminalNode LeftCurlyBracket() { return getToken(SimpleLOOPParser.LeftCurlyBracket, 0); }
		public TerminalNode RightCurlyBracket() { return getToken(SimpleLOOPParser.RightCurlyBracket, 0); }
		public List<TerminalNode> NewLine() { return getTokens(SimpleLOOPParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(SimpleLOOPParser.NewLine, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MultiStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMultiStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMultiStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMultiStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiStatementsContext multiStatements() throws RecognitionException {
		MultiStatementsContext _localctx = new MultiStatementsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_multiStatements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(210);
				match(NewLine);
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(LeftCurlyBracket);
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(217);
				match(NewLine);
				}
				}
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NewLine );
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Bool) | (1L << BoolLiteral) | (1L << IntLiteral) | (1L << Fptr) | (1L << Set) | (1L << If) | (1L << Self) | (1L << Print) | (1L << Return) | (1L << LeftParenthesis) | (1L << Minus) | (1L << Not) | (1L << ClassIndentifier) | (1L << Identifier))) != 0)) {
				{
				{
				setState(222);
				statement();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			match(RightCurlyBracket);
			setState(230); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(229);
					match(NewLine);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(232); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> NewLine() { return getTokens(SimpleLOOPParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(SimpleLOOPParser.NewLine, i);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_singleStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(234);
				match(NewLine);
				}
				}
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NewLine );
			setState(239);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(SimpleLOOPParser.If, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ScopeContext> scope() {
			return getRuleContexts(ScopeContext.class);
		}
		public ScopeContext scope(int i) {
			return getRuleContext(ScopeContext.class,i);
		}
		public List<TerminalNode> Elsif() { return getTokens(SimpleLOOPParser.Elsif); }
		public TerminalNode Elsif(int i) {
			return getToken(SimpleLOOPParser.Elsif, i);
		}
		public TerminalNode Else() { return getToken(SimpleLOOPParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(If);
			System.out.println("Conditional : if");
			setState(243);
			expression();
			setState(244);
			scope();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Elsif) {
				{
				{
				setState(245);
				match(Elsif);
				System.out.println("Conditional : elsif");
				setState(247);
				expression();
				setState(248);
				scope();
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(255);
				match(Else);
				System.out.println("Conditional : else");
				setState(257);
				scope();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(SimpleLOOPParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(Return);
			System.out.println("Return");
			setState(262);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterativeStatementContext extends ParserRuleContext {
		public List<TerminalNode> Dot() { return getTokens(SimpleLOOPParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(SimpleLOOPParser.Dot, i);
		}
		public TerminalNode Each() { return getToken(SimpleLOOPParser.Each, 0); }
		public TerminalNode Do() { return getToken(SimpleLOOPParser.Do, 0); }
		public List<TerminalNode> Bar() { return getTokens(SimpleLOOPParser.Bar); }
		public TerminalNode Bar(int i) {
			return getToken(SimpleLOOPParser.Bar, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(SimpleLOOPParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SimpleLOOPParser.Identifier, i);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public TerminalNode LeftParenthesis() { return getToken(SimpleLOOPParser.LeftParenthesis, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RightParenthesis() { return getToken(SimpleLOOPParser.RightParenthesis, 0); }
		public IterativeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterativeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterIterativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitIterativeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitIterativeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterativeStatementContext iterativeStatement() throws RecognitionException {
		IterativeStatementContext _localctx = new IterativeStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_iterativeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(264);
				match(Identifier);
				}
				break;
			case LeftParenthesis:
				{
				{
				setState(265);
				match(LeftParenthesis);
				setState(266);
				expression();
				setState(267);
				match(Dot);
				setState(268);
				match(Dot);
				setState(269);
				expression();
				setState(270);
				match(RightParenthesis);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(274);
			match(Dot);
			setState(275);
			match(Each);
			System.out.println("Loop : each");
			setState(277);
			match(Do);
			setState(278);
			match(Bar);
			setState(279);
			match(Identifier);
			setState(280);
			match(Bar);
			setState(281);
			scope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public List<TerminalNode> NewLine() { return getTokens(SimpleLOOPParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(SimpleLOOPParser.NewLine, i);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(SimpleLOOPParser.Semicolon, 0); }
		public IterativeStatementContext iterativeStatement() {
			return getRuleContext(IterativeStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public MethodCallStatementContext methodCallStatement() {
			return getRuleContext(MethodCallStatementContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public MergeStatementContext mergeStatement() {
			return getRuleContext(MergeStatementContext.class,0);
		}
		public AddStatementContext addStatement() {
			return getRuleContext(AddStatementContext.class,0);
		}
		public DeleteStatementContext deleteStatement() {
			return getRuleContext(DeleteStatementContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				variableDeclaration();
				setState(285); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(284);
						match(NewLine);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(287); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				ifStatement();
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Semicolon) {
					{
					setState(290);
					match(Semicolon);
					}
				}

				setState(294); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(293);
						match(NewLine);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(296); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				iterativeStatement();
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Semicolon) {
					{
					setState(299);
					match(Semicolon);
					}
				}

				setState(303); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(302);
						match(NewLine);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(305); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				returnStatement();
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Semicolon) {
					{
					setState(308);
					match(Semicolon);
					}
				}

				setState(312); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(311);
						match(NewLine);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(314); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(316);
				printStatement();
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Semicolon) {
					{
					setState(317);
					match(Semicolon);
					}
				}

				setState(321); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(320);
						match(NewLine);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(323); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(325);
				methodCallStatement();
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Semicolon) {
					{
					setState(326);
					match(Semicolon);
					}
				}

				setState(330); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(329);
						match(NewLine);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(332); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(334);
				assignStatement();
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Semicolon) {
					{
					setState(335);
					match(Semicolon);
					}
				}

				setState(339); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(338);
						match(NewLine);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(341); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(343);
				mergeStatement();
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Semicolon) {
					{
					setState(344);
					match(Semicolon);
					}
				}

				setState(348); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(347);
						match(NewLine);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(350); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(352);
				addStatement();
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Semicolon) {
					{
					setState(353);
					match(Semicolon);
					}
				}

				setState(357); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(356);
						match(NewLine);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(359); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(361);
				deleteStatement();
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Semicolon) {
					{
					setState(362);
					match(Semicolon);
					}
				}

				setState(366); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(365);
						match(NewLine);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(368); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(370);
				unaryExpression(0);
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Semicolon) {
					{
					setState(371);
					match(Semicolon);
					}
				}

				setState(375); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(374);
						match(NewLine);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(377); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLOOPParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLOOPParser.Comma, i);
		}
		public MethodArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMethodArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMethodArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMethodArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgumentsContext methodArguments() throws RecognitionException {
		MethodArgumentsContext _localctx = new MethodArgumentsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_methodArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BoolLiteral) | (1L << IntLiteral) | (1L << Set) | (1L << Self) | (1L << LeftParenthesis) | (1L << Minus) | (1L << Not) | (1L << ClassIndentifier) | (1L << Identifier))) != 0)) {
				{
				setState(381);
				expression();
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(382);
					match(Comma);
					setState(383);
					expression();
					}
					}
					setState(388);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallStatementContext extends ParserRuleContext {
		public TernaryExpressionContext ternaryExpression() {
			return getRuleContext(TernaryExpressionContext.class,0);
		}
		public TerminalNode LeftParenthesis() { return getToken(SimpleLOOPParser.LeftParenthesis, 0); }
		public MethodArgumentsContext methodArguments() {
			return getRuleContext(MethodArgumentsContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(SimpleLOOPParser.RightParenthesis, 0); }
		public MethodCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMethodCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMethodCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMethodCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallStatementContext methodCallStatement() throws RecognitionException {
		MethodCallStatementContext _localctx = new MethodCallStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			ternaryExpression();
			System.out.println("MethodCall");
			setState(393);
			match(LeftParenthesis);
			setState(394);
			methodArguments();
			setState(395);
			match(RightParenthesis);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MergeStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(SimpleLOOPParser.Dot, 0); }
		public TerminalNode Merge() { return getToken(SimpleLOOPParser.Merge, 0); }
		public TerminalNode LeftParenthesis() { return getToken(SimpleLOOPParser.LeftParenthesis, 0); }
		public MethodArgumentsContext methodArguments() {
			return getRuleContext(MethodArgumentsContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(SimpleLOOPParser.RightParenthesis, 0); }
		public MergeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMergeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMergeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMergeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MergeStatementContext mergeStatement() throws RecognitionException {
		MergeStatementContext _localctx = new MergeStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mergeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			expression();
			setState(398);
			match(Dot);
			setState(399);
			match(Merge);
			System.out.println("MERGE");
			setState(401);
			match(LeftParenthesis);
			setState(402);
			methodArguments();
			setState(403);
			match(RightParenthesis);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Dot() { return getToken(SimpleLOOPParser.Dot, 0); }
		public TerminalNode Add() { return getToken(SimpleLOOPParser.Add, 0); }
		public TerminalNode LeftParenthesis() { return getToken(SimpleLOOPParser.LeftParenthesis, 0); }
		public TerminalNode RightParenthesis() { return getToken(SimpleLOOPParser.RightParenthesis, 0); }
		public AddStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAddStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAddStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAddStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddStatementContext addStatement() throws RecognitionException {
		AddStatementContext _localctx = new AddStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_addStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			expression();
			setState(406);
			match(Dot);
			setState(407);
			match(Add);
			System.out.println("ADD");
			setState(409);
			match(LeftParenthesis);
			setState(410);
			expression();
			setState(411);
			match(RightParenthesis);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Dot() { return getToken(SimpleLOOPParser.Dot, 0); }
		public TerminalNode Delete() { return getToken(SimpleLOOPParser.Delete, 0); }
		public TerminalNode LeftParenthesis() { return getToken(SimpleLOOPParser.LeftParenthesis, 0); }
		public TerminalNode RightParenthesis() { return getToken(SimpleLOOPParser.RightParenthesis, 0); }
		public DeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterDeleteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitDeleteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitDeleteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStatementContext deleteStatement() throws RecognitionException {
		DeleteStatementContext _localctx = new DeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_deleteStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			expression();
			setState(414);
			match(Dot);
			setState(415);
			match(Delete);
			System.out.println("DELETE");
			setState(417);
			match(LeftParenthesis);
			setState(418);
			expression();
			setState(419);
			match(RightParenthesis);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode Print() { return getToken(SimpleLOOPParser.Print, 0); }
		public TerminalNode LeftParenthesis() { return getToken(SimpleLOOPParser.LeftParenthesis, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(SimpleLOOPParser.RightParenthesis, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(Print);
			System.out.println("Built-in : print");
			setState(423);
			match(LeftParenthesis);
			setState(424);
			expression();
			setState(425);
			match(RightParenthesis);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationArgumentsContext extends ParserRuleContext {
		public List<SingleMethodArgumentContext> singleMethodArgument() {
			return getRuleContexts(SingleMethodArgumentContext.class);
		}
		public SingleMethodArgumentContext singleMethodArgument(int i) {
			return getRuleContext(SingleMethodArgumentContext.class,i);
		}
		public List<TerminalNode> Assign() { return getTokens(SimpleLOOPParser.Assign); }
		public TerminalNode Assign(int i) {
			return getToken(SimpleLOOPParser.Assign, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLOOPParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLOOPParser.Comma, i);
		}
		public MethodDeclarationArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarationArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMethodDeclarationArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMethodDeclarationArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMethodDeclarationArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationArgumentsContext methodDeclarationArguments() throws RecognitionException {
		MethodDeclarationArgumentsContext _localctx = new MethodDeclarationArgumentsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_methodDeclarationArguments);
		int _la;
		try {
			int _alt;
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				singleMethodArgument();
				setState(428);
				match(Assign);
				setState(429);
				expression();
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(430);
					match(Comma);
					setState(431);
					singleMethodArgument();
					setState(432);
					match(Assign);
					setState(433);
					expression();
					}
					}
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				singleMethodArgument();
				setState(445);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(441);
						match(Comma);
						setState(442);
						singleMethodArgument();
						}
						} 
					}
					setState(447);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(448);
					match(Comma);
					setState(449);
					singleMethodArgument();
					setState(450);
					match(Assign);
					setState(451);
					expression();
					}
					}
					setState(457);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleMethodArgumentContext extends ParserRuleContext {
		public Token argumentName;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SimpleLOOPParser.Identifier, 0); }
		public SingleMethodArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleMethodArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSingleMethodArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSingleMethodArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSingleMethodArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleMethodArgumentContext singleMethodArgument() throws RecognitionException {
		SingleMethodArgumentContext _localctx = new SingleMethodArgumentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_singleMethodArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			type();
			setState(462);
			((SingleMethodArgumentContext)_localctx).argumentName = match(Identifier);
			System.out.println("ArgumentDec : " + (((SingleMethodArgumentContext)_localctx).argumentName!=null?((SingleMethodArgumentContext)_localctx).argumentName.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(SimpleLOOPParser.Semicolon, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			type();
			setState(466);
			identifiers();
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Semicolon) {
				{
				setState(467);
				match(Semicolon);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifiersContext extends ParserRuleContext {
		public Token varName;
		public List<TerminalNode> Identifier() { return getTokens(SimpleLOOPParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SimpleLOOPParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLOOPParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLOOPParser.Comma, i);
		}
		public IdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterIdentifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitIdentifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitIdentifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifiersContext identifiers() throws RecognitionException {
		IdentifiersContext _localctx = new IdentifiersContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_identifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			((IdentifiersContext)_localctx).varName = match(Identifier);
			System.out.println("VarDec : " + (((IdentifiersContext)_localctx).varName!=null?((IdentifiersContext)_localctx).varName.getText():null));
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(472);
				match(Comma);
				setState(473);
				((IdentifiersContext)_localctx).varName = match(Identifier);
				System.out.println("VarDec : " + (((IdentifiersContext)_localctx).varName!=null?((IdentifiersContext)_localctx).varName.getText():null));
				}
				}
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(SimpleLOOPParser.Int, 0); }
		public TerminalNode Bool() { return getToken(SimpleLOOPParser.Bool, 0); }
		public TerminalNode ClassIndentifier() { return getToken(SimpleLOOPParser.ClassIndentifier, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public FptrTypeContext fptrType() {
			return getRuleContext(FptrTypeContext.class,0);
		}
		public SetTypeContext setType() {
			return getRuleContext(SetTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_type);
		try {
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				match(Int);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				match(Bool);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(482);
				match(ClassIndentifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(483);
				arrayType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(484);
				fptrType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(485);
				setType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(SimpleLOOPParser.Int, 0); }
		public TerminalNode Bool() { return getToken(SimpleLOOPParser.Bool, 0); }
		public TerminalNode ClassIndentifier() { return getToken(SimpleLOOPParser.ClassIndentifier, 0); }
		public List<TerminalNode> LeftBracket() { return getTokens(SimpleLOOPParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(SimpleLOOPParser.LeftBracket, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(SimpleLOOPParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(SimpleLOOPParser.RightBracket, i);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Bool) | (1L << ClassIndentifier))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(493); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(489);
				match(LeftBracket);
				setState(490);
				expression();
				setState(491);
				match(RightBracket);
				}
				}
				setState(495); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LeftBracket );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FptrTypeContext extends ParserRuleContext {
		public TerminalNode Fptr() { return getToken(SimpleLOOPParser.Fptr, 0); }
		public TerminalNode Less() { return getToken(SimpleLOOPParser.Less, 0); }
		public TerminalNode Arrow() { return getToken(SimpleLOOPParser.Arrow, 0); }
		public TerminalNode Greater() { return getToken(SimpleLOOPParser.Greater, 0); }
		public List<TerminalNode> Void() { return getTokens(SimpleLOOPParser.Void); }
		public TerminalNode Void(int i) {
			return getToken(SimpleLOOPParser.Void, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLOOPParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLOOPParser.Comma, i);
		}
		public FptrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fptrType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterFptrType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitFptrType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitFptrType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FptrTypeContext fptrType() throws RecognitionException {
		FptrTypeContext _localctx = new FptrTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fptrType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(Fptr);
			setState(498);
			match(Less);
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Void:
				{
				setState(499);
				match(Void);
				}
				break;
			case Int:
			case Bool:
			case Fptr:
			case Set:
			case ClassIndentifier:
				{
				setState(500);
				type();
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(501);
					match(Comma);
					setState(502);
					type();
					}
					}
					setState(507);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(510);
			match(Arrow);
			setState(513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Void:
				{
				setState(511);
				match(Void);
				}
				break;
			case Int:
			case Bool:
			case Fptr:
			case Set:
			case ClassIndentifier:
				{
				setState(512);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(515);
			match(Greater);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetTypeContext extends ParserRuleContext {
		public TerminalNode Set() { return getToken(SimpleLOOPParser.Set, 0); }
		public TerminalNode Less() { return getToken(SimpleLOOPParser.Less, 0); }
		public TerminalNode Int() { return getToken(SimpleLOOPParser.Int, 0); }
		public TerminalNode Greater() { return getToken(SimpleLOOPParser.Greater, 0); }
		public SetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSetType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSetType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetTypeContext setType() throws RecognitionException {
		SetTypeContext _localctx = new SetTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_setType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(Set);
			setState(518);
			match(Less);
			setState(519);
			match(Int);
			setState(520);
			match(Greater);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignStatementContext extends ParserRuleContext {
		public TernaryExpressionContext ternaryExpression() {
			return getRuleContext(TernaryExpressionContext.class,0);
		}
		public TerminalNode Assign() { return getToken(SimpleLOOPParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			ternaryExpression();
			setState(523);
			match(Assign);
			setState(524);
			expression();
			System.out.println("Operator : =");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token op;
		public TernaryExpressionContext ternaryExpression() {
			return getRuleContext(TernaryExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Assign() { return getToken(SimpleLOOPParser.Assign, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			ternaryExpression();
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(528);
				((ExpressionContext)_localctx).op = match(Assign);
				setState(529);
				expression();
				System.out.println("Operator : =");
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignExpressionContext extends ParserRuleContext {
		public TernaryExpressionContext ternaryExpression() {
			return getRuleContext(TernaryExpressionContext.class,0);
		}
		public TerminalNode Assign() { return getToken(SimpleLOOPParser.Assign, 0); }
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public AssignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAssignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAssignExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAssignExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignExpressionContext assignExpression() throws RecognitionException {
		AssignExpressionContext _localctx = new AssignExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_assignExpression);
		try {
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				ternaryExpression();
				setState(535);
				match(Assign);
				setState(536);
				assignExpression();
				System.out.println("Operator : =");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				ternaryExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TernaryExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode Ternary() { return getToken(SimpleLOOPParser.Ternary, 0); }
		public List<TernaryExpressionContext> ternaryExpression() {
			return getRuleContexts(TernaryExpressionContext.class);
		}
		public TernaryExpressionContext ternaryExpression(int i) {
			return getRuleContext(TernaryExpressionContext.class,i);
		}
		public TerminalNode Colon() { return getToken(SimpleLOOPParser.Colon, 0); }
		public TernaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryExpressionContext ternaryExpression() throws RecognitionException {
		TernaryExpressionContext _localctx = new TernaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ternaryExpression);
		try {
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				logicalOrExpression();
				setState(543);
				match(Ternary);
				setState(544);
				ternaryExpression();
				setState(545);
				match(Colon);
				setState(546);
				ternaryExpression();
				System.out.println("Operator : ?:");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				logicalOrExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> Or() { return getTokens(SimpleLOOPParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(SimpleLOOPParser.Or, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			logicalAndExpression();
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(553);
				match(Or);
				setState(554);
				logicalAndExpression();
				System.out.println("Operator : ||");
				}
				}
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(SimpleLOOPParser.And); }
		public TerminalNode And(int i) {
			return getToken(SimpleLOOPParser.And, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			equalityExpression();
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(563);
				match(And);
				setState(564);
				equalityExpression();
				System.out.println("Operator : &&");
				}
				}
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> Equals() { return getTokens(SimpleLOOPParser.Equals); }
		public TerminalNode Equals(int i) {
			return getToken(SimpleLOOPParser.Equals, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			relationalExpression();
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Equals) {
				{
				{
				setState(573);
				match(Equals);
				setState(574);
				relationalExpression();
				System.out.println("Operator : ==");
				}
				}
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public Token r;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> Less() { return getTokens(SimpleLOOPParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(SimpleLOOPParser.Less, i);
		}
		public List<TerminalNode> Greater() { return getTokens(SimpleLOOPParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(SimpleLOOPParser.Greater, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			additiveExpression();
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Less || _la==Greater) {
				{
				{
				setState(583);
				((RelationalExpressionContext)_localctx).r = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Less || _la==Greater) ) {
					((RelationalExpressionContext)_localctx).r = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(584);
				additiveExpression();
				System.out.println("Operator : " + (((RelationalExpressionContext)_localctx).r!=null?((RelationalExpressionContext)_localctx).r.getText():null));
				}
				}
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Token r;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(SimpleLOOPParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(SimpleLOOPParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(SimpleLOOPParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(SimpleLOOPParser.Minus, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			multiplicativeExpression();
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				{
				setState(593);
				((AdditiveExpressionContext)_localctx).r = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
					((AdditiveExpressionContext)_localctx).r = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(594);
				multiplicativeExpression();
				System.out.println("Operator : " + (((AdditiveExpressionContext)_localctx).r!=null?((AdditiveExpressionContext)_localctx).r.getText():null));
				}
				}
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Token r;
		public List<NotExpressionContext> notExpression() {
			return getRuleContexts(NotExpressionContext.class);
		}
		public NotExpressionContext notExpression(int i) {
			return getRuleContext(NotExpressionContext.class,i);
		}
		public List<TerminalNode> Multiply() { return getTokens(SimpleLOOPParser.Multiply); }
		public TerminalNode Multiply(int i) {
			return getToken(SimpleLOOPParser.Multiply, i);
		}
		public List<TerminalNode> Division() { return getTokens(SimpleLOOPParser.Division); }
		public TerminalNode Division(int i) {
			return getToken(SimpleLOOPParser.Division, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			notExpression();
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Multiply || _la==Division) {
				{
				{
				setState(603);
				((MultiplicativeExpressionContext)_localctx).r = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Multiply || _la==Division) ) {
					((MultiplicativeExpressionContext)_localctx).r = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(604);
				notExpression();
				System.out.println("Operator : " + (((MultiplicativeExpressionContext)_localctx).r!=null?((MultiplicativeExpressionContext)_localctx).r.getText():null));
				}
				}
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotExpressionContext extends ParserRuleContext {
		public Token r;
		public NotExpressionContext notExpression() {
			return getRuleContext(NotExpressionContext.class,0);
		}
		public TerminalNode Minus() { return getToken(SimpleLOOPParser.Minus, 0); }
		public TerminalNode Not() { return getToken(SimpleLOOPParser.Not, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public NotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExpressionContext notExpression() throws RecognitionException {
		NotExpressionContext _localctx = new NotExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_notExpression);
		int _la;
		try {
			setState(617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Minus:
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				((NotExpressionContext)_localctx).r = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Minus || _la==Not) ) {
					((NotExpressionContext)_localctx).r = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(613);
				notExpression();
				System.out.println("Operator : " + (((NotExpressionContext)_localctx).r!=null?((NotExpressionContext)_localctx).r.getText():null));
				}
				break;
			case BoolLiteral:
			case IntLiteral:
			case Set:
			case Self:
			case LeftParenthesis:
			case ClassIndentifier:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
				unaryExpression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public Token r;
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(SimpleLOOPParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(SimpleLOOPParser.MinusMinus, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		return unaryExpression(0);
	}

	private UnaryExpressionContext unaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, _parentState);
		UnaryExpressionContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_unaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(620);
			accessExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(627);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new UnaryExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_unaryExpression);
					setState(622);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(623);
					((UnaryExpressionContext)_localctx).r = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PlusPlus || _la==MinusMinus) ) {
						((UnaryExpressionContext)_localctx).r = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					System.out.println("Operator : " + (((UnaryExpressionContext)_localctx).r!=null?((UnaryExpressionContext)_localctx).r.getText():null));
					}
					} 
				}
				setState(629);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AccessExpressionContext extends ParserRuleContext {
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public List<TerminalNode> LeftParenthesis() { return getTokens(SimpleLOOPParser.LeftParenthesis); }
		public TerminalNode LeftParenthesis(int i) {
			return getToken(SimpleLOOPParser.LeftParenthesis, i);
		}
		public List<MethodArgumentsContext> methodArguments() {
			return getRuleContexts(MethodArgumentsContext.class);
		}
		public MethodArgumentsContext methodArguments(int i) {
			return getRuleContext(MethodArgumentsContext.class,i);
		}
		public List<TerminalNode> RightParenthesis() { return getTokens(SimpleLOOPParser.RightParenthesis); }
		public TerminalNode RightParenthesis(int i) {
			return getToken(SimpleLOOPParser.RightParenthesis, i);
		}
		public List<DefaultExpressionsContext> defaultExpressions() {
			return getRuleContexts(DefaultExpressionsContext.class);
		}
		public DefaultExpressionsContext defaultExpressions(int i) {
			return getRuleContext(DefaultExpressionsContext.class,i);
		}
		public List<TerminalNode> Dot() { return getTokens(SimpleLOOPParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(SimpleLOOPParser.Dot, i);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(SimpleLOOPParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(SimpleLOOPParser.LeftBracket, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(SimpleLOOPParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(SimpleLOOPParser.RightBracket, i);
		}
		public List<TerminalNode> Initialize() { return getTokens(SimpleLOOPParser.Initialize); }
		public TerminalNode Initialize(int i) {
			return getToken(SimpleLOOPParser.Initialize, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(SimpleLOOPParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SimpleLOOPParser.Identifier, i);
		}
		public AccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessExpressionContext accessExpression() throws RecognitionException {
		AccessExpressionContext _localctx = new AccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_accessExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			values();
			setState(644);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(642);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						{
						setState(631);
						match(LeftParenthesis);
						setState(632);
						methodArguments();
						setState(633);
						match(RightParenthesis);
						}
						}
						break;
					case 2:
						{
						{
						setState(635);
						defaultExpressions();
						}
						}
						break;
					case 3:
						{
						{
						setState(636);
						match(Dot);
						setState(637);
						_la = _input.LA(1);
						if ( !(_la==Initialize || _la==Identifier) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					case 4:
						{
						{
						setState(638);
						match(LeftBracket);
						setState(639);
						expression();
						setState(640);
						match(RightBracket);
						}
						}
						break;
					}
					} 
				}
				setState(646);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultExpressionsContext extends ParserRuleContext {
		public TerminalNode LeftParenthesis() { return getToken(SimpleLOOPParser.LeftParenthesis, 0); }
		public MethodArgumentsContext methodArguments() {
			return getRuleContext(MethodArgumentsContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(SimpleLOOPParser.RightParenthesis, 0); }
		public TerminalNode Dot() { return getToken(SimpleLOOPParser.Dot, 0); }
		public TerminalNode New() { return getToken(SimpleLOOPParser.New, 0); }
		public TerminalNode Include() { return getToken(SimpleLOOPParser.Include, 0); }
		public DefaultExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultExpressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterDefaultExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitDefaultExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitDefaultExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultExpressionsContext defaultExpressions() throws RecognitionException {
		DefaultExpressionsContext _localctx = new DefaultExpressionsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_defaultExpressions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(647);
				match(Dot);
				setState(648);
				match(New);
				System.out.println("NEW");
				}
				break;
			case 2:
				{
				setState(650);
				match(Dot);
				setState(651);
				match(Include);
				System.out.println("INCLUDE");
				}
				break;
			}
			setState(655);
			match(LeftParenthesis);
			setState(656);
			methodArguments();
			setState(657);
			match(RightParenthesis);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuesContext extends ParserRuleContext {
		public TerminalNode LeftParenthesis() { return getToken(SimpleLOOPParser.LeftParenthesis, 0); }
		public MethodArgumentsContext methodArguments() {
			return getRuleContext(MethodArgumentsContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(SimpleLOOPParser.RightParenthesis, 0); }
		public TerminalNode IntLiteral() { return getToken(SimpleLOOPParser.IntLiteral, 0); }
		public TerminalNode BoolLiteral() { return getToken(SimpleLOOPParser.BoolLiteral, 0); }
		public TerminalNode Self() { return getToken(SimpleLOOPParser.Self, 0); }
		public TerminalNode Set() { return getToken(SimpleLOOPParser.Set, 0); }
		public TerminalNode ClassIndentifier() { return getToken(SimpleLOOPParser.ClassIndentifier, 0); }
		public TerminalNode Identifier() { return getToken(SimpleLOOPParser.Identifier, 0); }
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_values);
		try {
			setState(669);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParenthesis:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				match(LeftParenthesis);
				setState(660);
				methodArguments();
				setState(661);
				match(RightParenthesis);
				}
				break;
			case IntLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				match(IntLiteral);
				}
				break;
			case BoolLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(664);
				match(BoolLiteral);
				}
				break;
			case Self:
				enterOuterAlt(_localctx, 4);
				{
				setState(665);
				match(Self);
				}
				break;
			case Set:
				enterOuterAlt(_localctx, 5);
				{
				setState(666);
				match(Set);
				}
				break;
			case ClassIndentifier:
				enterOuterAlt(_localctx, 6);
				{
				setState(667);
				match(ClassIndentifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 7);
				{
				setState(668);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 39:
			return unaryExpression_sempred((UnaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean unaryExpression_sempred(UnaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u02a2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\7\2[\n\2\f\2\16\2^\13\2\3\2\3\2\3\3\7\3c\n\3\f\3\16\3f\13"+
		"\3\3\3\7\3i\n\3\f\3\16\3l\13\3\3\4\7\4o\n\4\f\4\16\4r\13\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5z\n\5\3\5\7\5}\n\5\f\5\16\5\u0080\13\5\3\5\3\5\6\5\u0084"+
		"\n\5\r\5\16\5\u0085\3\5\3\5\3\5\6\5\u008b\n\5\r\5\16\5\u008c\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5\u0095\n\5\3\5\6\5\u0098\n\5\r\5\16\5\u0099\3\5\3\5"+
		"\6\5\u009e\n\5\r\5\16\5\u009f\3\5\3\5\6\5\u00a4\n\5\r\5\16\5\u00a5\3\5"+
		"\5\5\u00a9\n\5\5\5\u00ab\n\5\3\6\3\6\6\6\u00af\n\6\r\6\16\6\u00b0\3\6"+
		"\7\6\u00b4\n\6\f\6\16\6\u00b7\13\6\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u00bf\n"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00cf\n"+
		"\b\3\t\3\t\5\t\u00d3\n\t\3\n\7\n\u00d6\n\n\f\n\16\n\u00d9\13\n\3\n\3\n"+
		"\6\n\u00dd\n\n\r\n\16\n\u00de\3\n\7\n\u00e2\n\n\f\n\16\n\u00e5\13\n\3"+
		"\n\3\n\6\n\u00e9\n\n\r\n\16\n\u00ea\3\13\6\13\u00ee\n\13\r\13\16\13\u00ef"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00fd\n\f\f\f\16\f"+
		"\u0100\13\f\3\f\3\f\3\f\5\f\u0105\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u0113\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\6\17\u0120\n\17\r\17\16\17\u0121\3\17\3\17\5"+
		"\17\u0126\n\17\3\17\6\17\u0129\n\17\r\17\16\17\u012a\3\17\3\17\5\17\u012f"+
		"\n\17\3\17\6\17\u0132\n\17\r\17\16\17\u0133\3\17\3\17\5\17\u0138\n\17"+
		"\3\17\6\17\u013b\n\17\r\17\16\17\u013c\3\17\3\17\5\17\u0141\n\17\3\17"+
		"\6\17\u0144\n\17\r\17\16\17\u0145\3\17\3\17\5\17\u014a\n\17\3\17\6\17"+
		"\u014d\n\17\r\17\16\17\u014e\3\17\3\17\5\17\u0153\n\17\3\17\6\17\u0156"+
		"\n\17\r\17\16\17\u0157\3\17\3\17\5\17\u015c\n\17\3\17\6\17\u015f\n\17"+
		"\r\17\16\17\u0160\3\17\3\17\5\17\u0165\n\17\3\17\6\17\u0168\n\17\r\17"+
		"\16\17\u0169\3\17\3\17\5\17\u016e\n\17\3\17\6\17\u0171\n\17\r\17\16\17"+
		"\u0172\3\17\3\17\5\17\u0177\n\17\3\17\6\17\u017a\n\17\r\17\16\17\u017b"+
		"\5\17\u017e\n\17\3\20\3\20\3\20\7\20\u0183\n\20\f\20\16\20\u0186\13\20"+
		"\5\20\u0188\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u01b6\n\26\f\26\16\26\u01b9\13\26\3\26"+
		"\3\26\3\26\7\26\u01be\n\26\f\26\16\26\u01c1\13\26\3\26\3\26\3\26\3\26"+
		"\3\26\7\26\u01c8\n\26\f\26\16\26\u01cb\13\26\3\26\5\26\u01ce\n\26\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u01d7\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\7\31\u01de\n\31\f\31\16\31\u01e1\13\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u01e9\n\32\3\33\3\33\3\33\3\33\3\33\6\33\u01f0\n\33\r\33\16\33\u01f1"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u01fa\n\34\f\34\16\34\u01fd\13\34"+
		"\5\34\u01ff\n\34\3\34\3\34\3\34\5\34\u0204\n\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\5\37\u0217"+
		"\n\37\3 \3 \3 \3 \3 \3 \5 \u021f\n \3!\3!\3!\3!\3!\3!\3!\3!\5!\u0229\n"+
		"!\3\"\3\"\3\"\3\"\3\"\7\"\u0230\n\"\f\"\16\"\u0233\13\"\3#\3#\3#\3#\3"+
		"#\7#\u023a\n#\f#\16#\u023d\13#\3$\3$\3$\3$\3$\7$\u0244\n$\f$\16$\u0247"+
		"\13$\3%\3%\3%\3%\3%\7%\u024e\n%\f%\16%\u0251\13%\3&\3&\3&\3&\3&\7&\u0258"+
		"\n&\f&\16&\u025b\13&\3\'\3\'\3\'\3\'\3\'\7\'\u0262\n\'\f\'\16\'\u0265"+
		"\13\'\3(\3(\3(\3(\3(\5(\u026c\n(\3)\3)\3)\3)\3)\3)\7)\u0274\n)\f)\16)"+
		"\u0277\13)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\7*\u0285\n*\f*\16*\u0288"+
		"\13*\3+\3+\3+\3+\3+\3+\5+\u0290\n+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\5,\u02a0\n,\3,\2\3P-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\n\3\2\3\4\4\2\5\6\66\66\3\2\63\64"+
		"\3\2$%\3\2&\'\4\2%%,,\3\2()\4\2\30\30\67\67\2\u02da\2X\3\2\2\2\4j\3\2"+
		"\2\2\6p\3\2\2\2\b\u00aa\3\2\2\2\n\u00b5\3\2\2\2\f\u00b8\3\2\2\2\16\u00ce"+
		"\3\2\2\2\20\u00d2\3\2\2\2\22\u00d7\3\2\2\2\24\u00ed\3\2\2\2\26\u00f3\3"+
		"\2\2\2\30\u0106\3\2\2\2\32\u0112\3\2\2\2\34\u017d\3\2\2\2\36\u0187\3\2"+
		"\2\2 \u0189\3\2\2\2\"\u018f\3\2\2\2$\u0197\3\2\2\2&\u019f\3\2\2\2(\u01a7"+
		"\3\2\2\2*\u01cd\3\2\2\2,\u01cf\3\2\2\2.\u01d3\3\2\2\2\60\u01d8\3\2\2\2"+
		"\62\u01e8\3\2\2\2\64\u01ea\3\2\2\2\66\u01f3\3\2\2\28\u0207\3\2\2\2:\u020c"+
		"\3\2\2\2<\u0211\3\2\2\2>\u021e\3\2\2\2@\u0228\3\2\2\2B\u022a\3\2\2\2D"+
		"\u0234\3\2\2\2F\u023e\3\2\2\2H\u0248\3\2\2\2J\u0252\3\2\2\2L\u025c\3\2"+
		"\2\2N\u026b\3\2\2\2P\u026d\3\2\2\2R\u0278\3\2\2\2T\u028f\3\2\2\2V\u029f"+
		"\3\2\2\2X\\\5\4\3\2Y[\7\62\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2"+
		"\2]_\3\2\2\2^\\\3\2\2\2_`\5\6\4\2`\3\3\2\2\2ac\7\62\2\2ba\3\2\2\2cf\3"+
		"\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gi\5.\30\2hd\3\2\2\2il\3"+
		"\2\2\2jh\3\2\2\2jk\3\2\2\2k\5\3\2\2\2lj\3\2\2\2mo\5\b\5\2nm\3\2\2\2or"+
		"\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\7\3\2\2\2rp\3\2\2\2st\7\t\2\2tu\7\66\2\2"+
		"uy\b\5\1\2vw\7\63\2\2wx\7\66\2\2xz\b\5\1\2yv\3\2\2\2yz\3\2\2\2z~\3\2\2"+
		"\2{}\7\62\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081"+
		"\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\7!\2\2\u0082\u0084\7\62\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0088\5\n\6\2\u0088\u008a\7\"\2\2\u0089"+
		"\u008b\7\62\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3"+
		"\2\2\2\u008c\u008d\3\2\2\2\u008d\u00ab\3\2\2\2\u008e\u008f\7\t\2\2\u008f"+
		"\u0090\7\66\2\2\u0090\u0094\b\5\1\2\u0091\u0092\7\63\2\2\u0092\u0093\7"+
		"\66\2\2\u0093\u0095\b\5\1\2\u0094\u0091\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u0098\7\62\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3"+
		"\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00a8\3\2\2\2\u009b"+
		"\u009d\5\f\7\2\u009c\u009e\7\62\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3"+
		"\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a9\3\2\2\2\u00a1"+
		"\u00a3\5\16\b\2\u00a2\u00a4\7\62\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3"+
		"\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u009b\3\2\2\2\u00a8\u00a1\3\2\2\2\u00a8\u00a7\3\2"+
		"\2\2\u00a9\u00ab\3\2\2\2\u00aas\3\2\2\2\u00aa\u008e\3\2\2\2\u00ab\t\3"+
		"\2\2\2\u00ac\u00ae\5\f\7\2\u00ad\u00af\7\62\2\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b4\3\2"+
		"\2\2\u00b2\u00b4\5\16\b\2\u00b3\u00ac\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4"+
		"\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\13\3\2\2"+
		"\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\t\2\2\2\u00b9\u00ba\5.\30\2\u00ba\r"+
		"\3\2\2\2\u00bb\u00be\t\2\2\2\u00bc\u00bf\5\62\32\2\u00bd\u00bf\7\r\2\2"+
		"\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1"+
		"\7\67\2\2\u00c1\u00c2\b\b\1\2\u00c2\u00c3\7\37\2\2\u00c3\u00c4\5*\26\2"+
		"\u00c4\u00c5\7 \2\2\u00c5\u00c6\5\20\t\2\u00c6\u00cf\3\2\2\2\u00c7\u00c8"+
		"\7\4\2\2\u00c8\u00c9\7\30\2\2\u00c9\u00ca\7\37\2\2\u00ca\u00cb\5*\26\2"+
		"\u00cb\u00cc\7 \2\2\u00cc\u00cd\5\20\t\2\u00cd\u00cf\3\2\2\2\u00ce\u00bb"+
		"\3\2\2\2\u00ce\u00c7\3\2\2\2\u00cf\17\3\2\2\2\u00d0\u00d3\5\22\n\2\u00d1"+
		"\u00d3\5\24\13\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\21\3\2"+
		"\2\2\u00d4\u00d6\7\62\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00da\u00dc\7!\2\2\u00db\u00dd\7\62\2\2\u00dc\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e3\3\2"+
		"\2\2\u00e0\u00e2\5\34\17\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e6\u00e8\7\"\2\2\u00e7\u00e9\7\62\2\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\23\3\2\2"+
		"\2\u00ec\u00ee\7\62\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\5\34"+
		"\17\2\u00f2\25\3\2\2\2\u00f3\u00f4\7\16\2\2\u00f4\u00f5\b\f\1\2\u00f5"+
		"\u00f6\5<\37\2\u00f6\u00fe\5\20\t\2\u00f7\u00f8\7\17\2\2\u00f8\u00f9\b"+
		"\f\1\2\u00f9\u00fa\5<\37\2\u00fa\u00fb\5\20\t\2\u00fb\u00fd\3\2\2\2\u00fc"+
		"\u00f7\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u0104\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7\20\2\2\u0102"+
		"\u0103\b\f\1\2\u0103\u0105\5\20\t\2\u0104\u0101\3\2\2\2\u0104\u0105\3"+
		"\2\2\2\u0105\27\3\2\2\2\u0106\u0107\7\31\2\2\u0107\u0108\b\r\1\2\u0108"+
		"\u0109\5<\37\2\u0109\31\3\2\2\2\u010a\u0113\7\67\2\2\u010b\u010c\7\37"+
		"\2\2\u010c\u010d\5<\37\2\u010d\u010e\7\60\2\2\u010e\u010f\7\60\2\2\u010f"+
		"\u0110\5<\37\2\u0110\u0111\7 \2\2\u0111\u0113\3\2\2\2\u0112\u010a\3\2"+
		"\2\2\u0112\u010b\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\7\60\2\2\u0115"+
		"\u0116\7\32\2\2\u0116\u0117\b\16\1\2\u0117\u0118\7\33\2\2\u0118\u0119"+
		"\7\34\2\2\u0119\u011a\7\67\2\2\u011a\u011b\7\34\2\2\u011b\u011c\5\20\t"+
		"\2\u011c\33\3\2\2\2\u011d\u011f\5.\30\2\u011e\u0120\7\62\2\2\u011f\u011e"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u017e\3\2\2\2\u0123\u0125\5\26\f\2\u0124\u0126\7\65\2\2\u0125\u0124\3"+
		"\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0129\7\62\2\2\u0128"+
		"\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u017e\3\2\2\2\u012c\u012e\5\32\16\2\u012d\u012f\7\65\2\2\u012e"+
		"\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u0132\7\62"+
		"\2\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u017e\3\2\2\2\u0135\u0137\5\30\r\2\u0136\u0138\7"+
		"\65\2\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139"+
		"\u013b\7\62\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3"+
		"\2\2\2\u013c\u013d\3\2\2\2\u013d\u017e\3\2\2\2\u013e\u0140\5(\25\2\u013f"+
		"\u0141\7\65\2\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3"+
		"\2\2\2\u0142\u0144\7\62\2\2\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u017e\3\2\2\2\u0147\u0149\5 "+
		"\21\2\u0148\u014a\7\65\2\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014c\3\2\2\2\u014b\u014d\7\62\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3"+
		"\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u017e\3\2\2\2\u0150"+
		"\u0152\5:\36\2\u0151\u0153\7\65\2\2\u0152\u0151\3\2\2\2\u0152\u0153\3"+
		"\2\2\2\u0153\u0155\3\2\2\2\u0154\u0156\7\62\2\2\u0155\u0154\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u017e\3\2"+
		"\2\2\u0159\u015b\5\"\22\2\u015a\u015c\7\65\2\2\u015b\u015a\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015f\7\62\2\2\u015e\u015d\3"+
		"\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u017e\3\2\2\2\u0162\u0164\5$\23\2\u0163\u0165\7\65\2\2\u0164\u0163\3"+
		"\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0168\7\62\2\2\u0167"+
		"\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2"+
		"\2\2\u016a\u017e\3\2\2\2\u016b\u016d\5&\24\2\u016c\u016e\7\65\2\2\u016d"+
		"\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u0171\7\62"+
		"\2\2\u0170\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u017e\3\2\2\2\u0174\u0176\5P)\2\u0175\u0177\7\65"+
		"\2\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178"+
		"\u017a\7\62\2\2\u0179\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0179\3"+
		"\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u011d\3\2\2\2\u017d"+
		"\u0123\3\2\2\2\u017d\u012c\3\2\2\2\u017d\u0135\3\2\2\2\u017d\u013e\3\2"+
		"\2\2\u017d\u0147\3\2\2\2\u017d\u0150\3\2\2\2\u017d\u0159\3\2\2\2\u017d"+
		"\u0162\3\2\2\2\u017d\u016b\3\2\2\2\u017d\u0174\3\2\2\2\u017e\35\3\2\2"+
		"\2\u017f\u0184\5<\37\2\u0180\u0181\7\f\2\2\u0181\u0183\5<\37\2\u0182\u0180"+
		"\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u017f\3\2\2\2\u0187\u0188\3\2"+
		"\2\2\u0188\37\3\2\2\2\u0189\u018a\5@!\2\u018a\u018b\b\21\1\2\u018b\u018c"+
		"\7\37\2\2\u018c\u018d\5\36\20\2\u018d\u018e\7 \2\2\u018e!\3\2\2\2\u018f"+
		"\u0190\5<\37\2\u0190\u0191\7\60\2\2\u0191\u0192\7\24\2\2\u0192\u0193\b"+
		"\22\1\2\u0193\u0194\7\37\2\2\u0194\u0195\5\36\20\2\u0195\u0196\7 \2\2"+
		"\u0196#\3\2\2\2\u0197\u0198\5<\37\2\u0198\u0199\7\60\2\2\u0199\u019a\7"+
		"\23\2\2\u019a\u019b\b\23\1\2\u019b\u019c\7\37\2\2\u019c\u019d\5<\37\2"+
		"\u019d\u019e\7 \2\2\u019e%\3\2\2\2\u019f\u01a0\5<\37\2\u01a0\u01a1\7\60"+
		"\2\2\u01a1\u01a2\7\26\2\2\u01a2\u01a3\b\24\1\2\u01a3\u01a4\7\37\2\2\u01a4"+
		"\u01a5\5<\37\2\u01a5\u01a6\7 \2\2\u01a6\'\3\2\2\2\u01a7\u01a8\7\22\2\2"+
		"\u01a8\u01a9\b\25\1\2\u01a9\u01aa\7\37\2\2\u01aa\u01ab\5<\37\2\u01ab\u01ac"+
		"\7 \2\2\u01ac)\3\2\2\2\u01ad\u01ae\5,\27\2\u01ae\u01af\7#\2\2\u01af\u01b7"+
		"\5<\37\2\u01b0\u01b1\7\f\2\2\u01b1\u01b2\5,\27\2\u01b2\u01b3\7#\2\2\u01b3"+
		"\u01b4\5<\37\2\u01b4\u01b6\3\2\2\2\u01b5\u01b0\3\2\2\2\u01b6\u01b9\3\2"+
		"\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ce\3\2\2\2\u01b9"+
		"\u01b7\3\2\2\2\u01ba\u01bf\5,\27\2\u01bb\u01bc\7\f\2\2\u01bc\u01be\5,"+
		"\27\2\u01bd\u01bb\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u01c9\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c3\7\f"+
		"\2\2\u01c3\u01c4\5,\27\2\u01c4\u01c5\7#\2\2\u01c5\u01c6\5<\37\2\u01c6"+
		"\u01c8\3\2\2\2\u01c7\u01c2\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2"+
		"\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01ce\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc"+
		"\u01ce\3\2\2\2\u01cd\u01ad\3\2\2\2\u01cd\u01ba\3\2\2\2\u01cd\u01cc\3\2"+
		"\2\2\u01ce+\3\2\2\2\u01cf\u01d0\5\62\32\2\u01d0\u01d1\7\67\2\2\u01d1\u01d2"+
		"\b\27\1\2\u01d2-\3\2\2\2\u01d3\u01d4\5\62\32\2\u01d4\u01d6\5\60\31\2\u01d5"+
		"\u01d7\7\65\2\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7/\3\2\2\2"+
		"\u01d8\u01d9\7\67\2\2\u01d9\u01df\b\31\1\2\u01da\u01db\7\f\2\2\u01db\u01dc"+
		"\7\67\2\2\u01dc\u01de\b\31\1\2\u01dd\u01da\3\2\2\2\u01de\u01e1\3\2\2\2"+
		"\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\61\3\2\2\2\u01e1\u01df"+
		"\3\2\2\2\u01e2\u01e9\7\5\2\2\u01e3\u01e9\7\6\2\2\u01e4\u01e9\7\66\2\2"+
		"\u01e5\u01e9\5\64\33\2\u01e6\u01e9\5\66\34\2\u01e7\u01e9\58\35\2\u01e8"+
		"\u01e2\3\2\2\2\u01e8\u01e3\3\2\2\2\u01e8\u01e4\3\2\2\2\u01e8\u01e5\3\2"+
		"\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e7\3\2\2\2\u01e9\63\3\2\2\2\u01ea\u01ef"+
		"\t\3\2\2\u01eb\u01ec\7\35\2\2\u01ec\u01ed\5<\37\2\u01ed\u01ee\7\36\2\2"+
		"\u01ee\u01f0\3\2\2\2\u01ef\u01eb\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01ef"+
		"\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\65\3\2\2\2\u01f3\u01f4\7\n\2\2\u01f4"+
		"\u01fe\7\63\2\2\u01f5\u01ff\7\r\2\2\u01f6\u01fb\5\62\32\2\u01f7\u01f8"+
		"\7\f\2\2\u01f8\u01fa\5\62\32\2\u01f9\u01f7\3\2\2\2\u01fa\u01fd\3\2\2\2"+
		"\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb"+
		"\3\2\2\2\u01fe\u01f5\3\2\2\2\u01fe\u01f6\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"\u0203\7\61\2\2\u0201\u0204\7\r\2\2\u0202\u0204\5\62\32\2\u0203\u0201"+
		"\3\2\2\2\u0203\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\7\64\2\2"+
		"\u0206\67\3\2\2\2\u0207\u0208\7\13\2\2\u0208\u0209\7\63\2\2\u0209\u020a"+
		"\7\5\2\2\u020a\u020b\7\64\2\2\u020b9\3\2\2\2\u020c\u020d\5@!\2\u020d\u020e"+
		"\7#\2\2\u020e\u020f\5<\37\2\u020f\u0210\b\36\1\2\u0210;\3\2\2\2\u0211"+
		"\u0216\5@!\2\u0212\u0213\7#\2\2\u0213\u0214\5<\37\2\u0214\u0215\b\37\1"+
		"\2\u0215\u0217\3\2\2\2\u0216\u0212\3\2\2\2\u0216\u0217\3\2\2\2\u0217="+
		"\3\2\2\2\u0218\u0219\5@!\2\u0219\u021a\7#\2\2\u021a\u021b\5> \2\u021b"+
		"\u021c\b \1\2\u021c\u021f\3\2\2\2\u021d\u021f\5@!\2\u021e\u0218\3\2\2"+
		"\2\u021e\u021d\3\2\2\2\u021f?\3\2\2\2\u0220\u0221\5B\"\2\u0221\u0222\7"+
		"*\2\2\u0222\u0223\5@!\2\u0223\u0224\7+\2\2\u0224\u0225\5@!\2\u0225\u0226"+
		"\b!\1\2\u0226\u0229\3\2\2\2\u0227\u0229\5B\"\2\u0228\u0220\3\2\2\2\u0228"+
		"\u0227\3\2\2\2\u0229A\3\2\2\2\u022a\u0231\5D#\2\u022b\u022c\7.\2\2\u022c"+
		"\u022d\5D#\2\u022d\u022e\b\"\1\2\u022e\u0230\3\2\2\2\u022f\u022b\3\2\2"+
		"\2\u0230\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232C"+
		"\3\2\2\2\u0233\u0231\3\2\2\2\u0234\u023b\5F$\2\u0235\u0236\7-\2\2\u0236"+
		"\u0237\5F$\2\u0237\u0238\b#\1\2\u0238\u023a\3\2\2\2\u0239\u0235\3\2\2"+
		"\2\u023a\u023d\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023cE"+
		"\3\2\2\2\u023d\u023b\3\2\2\2\u023e\u0245\5H%\2\u023f\u0240\7/\2\2\u0240"+
		"\u0241\5H%\2\u0241\u0242\b$\1\2\u0242\u0244\3\2\2\2\u0243\u023f\3\2\2"+
		"\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246G"+
		"\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u024f\5J&\2\u0249\u024a\t\4\2\2\u024a"+
		"\u024b\5J&\2\u024b\u024c\b%\1\2\u024c\u024e\3\2\2\2\u024d\u0249\3\2\2"+
		"\2\u024e\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250I"+
		"\3\2\2\2\u0251\u024f\3\2\2\2\u0252\u0259\5L\'\2\u0253\u0254\t\5\2\2\u0254"+
		"\u0255\5L\'\2\u0255\u0256\b&\1\2\u0256\u0258\3\2\2\2\u0257\u0253\3\2\2"+
		"\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025aK"+
		"\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u0263\5N(\2\u025d\u025e\t\6\2\2\u025e"+
		"\u025f\5N(\2\u025f\u0260\b\'\1\2\u0260\u0262\3\2\2\2\u0261\u025d\3\2\2"+
		"\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264M"+
		"\3\2\2\2\u0265\u0263\3\2\2\2\u0266\u0267\t\7\2\2\u0267\u0268\5N(\2\u0268"+
		"\u0269\b(\1\2\u0269\u026c\3\2\2\2\u026a\u026c\5P)\2\u026b\u0266\3\2\2"+
		"\2\u026b\u026a\3\2\2\2\u026cO\3\2\2\2\u026d\u026e\b)\1\2\u026e\u026f\5"+
		"R*\2\u026f\u0275\3\2\2\2\u0270\u0271\f\4\2\2\u0271\u0272\t\b\2\2\u0272"+
		"\u0274\b)\1\2\u0273\u0270\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3\2"+
		"\2\2\u0275\u0276\3\2\2\2\u0276Q\3\2\2\2\u0277\u0275\3\2\2\2\u0278\u0286"+
		"\5V,\2\u0279\u027a\7\37\2\2\u027a\u027b\5\36\20\2\u027b\u027c\7 \2\2\u027c"+
		"\u0285\3\2\2\2\u027d\u0285\5T+\2\u027e\u027f\7\60\2\2\u027f\u0285\t\t"+
		"\2\2\u0280\u0281\7\35\2\2\u0281\u0282\5<\37\2\u0282\u0283\7\36\2\2\u0283"+
		"\u0285\3\2\2\2\u0284\u0279\3\2\2\2\u0284\u027d\3\2\2\2\u0284\u027e\3\2"+
		"\2\2\u0284\u0280\3\2\2\2\u0285\u0288\3\2\2\2\u0286\u0284\3\2\2\2\u0286"+
		"\u0287\3\2\2\2\u0287S\3\2\2\2\u0288\u0286\3\2\2\2\u0289\u028a\7\60\2\2"+
		"\u028a\u028b\7\27\2\2\u028b\u0290\b+\1\2\u028c\u028d\7\60\2\2\u028d\u028e"+
		"\7\25\2\2\u028e\u0290\b+\1\2\u028f\u0289\3\2\2\2\u028f\u028c\3\2\2\2\u0290"+
		"\u0291\3\2\2\2\u0291\u0292\7\37\2\2\u0292\u0293\5\36\20\2\u0293\u0294"+
		"\7 \2\2\u0294U\3\2\2\2\u0295\u0296\7\37\2\2\u0296\u0297\5\36\20\2\u0297"+
		"\u0298\7 \2\2\u0298\u02a0\3\2\2\2\u0299\u02a0\7\b\2\2\u029a\u02a0\7\7"+
		"\2\2\u029b\u02a0\7\21\2\2\u029c\u02a0\7\13\2\2\u029d\u02a0\7\66\2\2\u029e"+
		"\u02a0\7\67\2\2\u029f\u0295\3\2\2\2\u029f\u0299\3\2\2\2\u029f\u029a\3"+
		"\2\2\2\u029f\u029b\3\2\2\2\u029f\u029c\3\2\2\2\u029f\u029d\3\2\2\2\u029f"+
		"\u029e\3\2\2\2\u02a0W\3\2\2\2P\\djpy~\u0085\u008c\u0094\u0099\u009f\u00a5"+
		"\u00a8\u00aa\u00b0\u00b3\u00b5\u00be\u00ce\u00d2\u00d7\u00de\u00e3\u00ea"+
		"\u00ef\u00fe\u0104\u0112\u0121\u0125\u012a\u012e\u0133\u0137\u013c\u0140"+
		"\u0145\u0149\u014e\u0152\u0157\u015b\u0160\u0164\u0169\u016d\u0172\u0176"+
		"\u017b\u017d\u0184\u0187\u01b7\u01bf\u01c9\u01cd\u01d6\u01df\u01e8\u01f1"+
		"\u01fb\u01fe\u0203\u0216\u021e\u0228\u0231\u023b\u0245\u024f\u0259\u0263"+
		"\u026b\u0275\u0284\u0286\u028f\u029f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}