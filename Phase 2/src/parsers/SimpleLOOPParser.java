// Generated from D:/CE@UT/Term 6/PLC/CA/CA2/P2_810198387_810198516/src/main/grammar\SimpleLOOP.g4 by ANTLR 4.9.2
package parsers;

     import main.ast.nodes.*;
     import main.ast.nodes.declaration.*;
     import main.ast.nodes.declaration.classDec.*;
     import main.ast.nodes.declaration.classDec.classMembersDec.*;
     import main.ast.nodes.declaration.variableDec.*;
     import main.ast.nodes.expression.*;
     import main.ast.nodes.expression.operators.*;
     import main.ast.nodes.expression.values.*;
     import main.ast.nodes.expression.values.primitive.*;
     import main.ast.nodes.statement.*;
     import main.ast.nodes.statement.set.*;
     import main.ast.types.*;
     import main.ast.types.primitives.*;
     import main.ast.types.set.*;
     import main.ast.types.functionPointer.*;
     import main.ast.types.array.*;
     import java.util.*;
 
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
		LINE_BREAK=1, CLASS=2, PUBLIC=3, PRIVATE=4, INITIALIZE=5, NEW=6, SELF=7, 
		RETURN=8, VOID=9, DELETE=10, INCLUDE=11, ADD=12, MERGE=13, PRINT=14, IF=15, 
		ELSE=16, ELSIF=17, PLUS=18, MINUS=19, MULT=20, DIVIDE=21, INC=22, DEC=23, 
		EQUAL=24, GREATER_THAN=25, LESS_THAN=26, ARROW=27, BAR=28, AND=29, OR=30, 
		NOT=31, TIF=32, TELSE=33, TRUE=34, FALSE=35, NULL=36, BEGIN=37, END=38, 
		INT=39, BOOL=40, FPTR=41, SET=42, EACH=43, DO=44, ASSIGN=45, SHARP=46, 
		LPAR=47, RPAR=48, LBRACK=49, RBRACK=50, LBRACE=51, RBRACE=52, COMMA=53, 
		DOT=54, SEMICOLON=55, NEWLINE=56, INT_VALUE=57, IDENTIFIER=58, CLASS_IDENTIFIER=59, 
		COMMENT=60, MLCOMMENT=61, WS=62;
	public static final int
		RULE_simpleLOOP = 0, RULE_program = 1, RULE_constructor = 2, RULE_classDeclaration = 3, 
		RULE_field_decleration = 4, RULE_method = 5, RULE_methodBody = 6, RULE_methodArgsDec = 7, 
		RULE_argDec = 8, RULE_methodArgs = 9, RULE_body = 10, RULE_blockStatement = 11, 
		RULE_singleStatement = 12, RULE_addStatement = 13, RULE_mergeStatement = 14, 
		RULE_deleteStatement = 15, RULE_varDecStatement = 16, RULE_ifStatement = 17, 
		RULE_elsifStatement = 18, RULE_condition = 19, RULE_elseStatement = 20, 
		RULE_printStatement = 21, RULE_methodCallStmt = 22, RULE_returnStatement = 23, 
		RULE_assignmentStatement = 24, RULE_loopStatement = 25, RULE_expression = 26, 
		RULE_ternaryExpression = 27, RULE_orExpression = 28, RULE_andExpression = 29, 
		RULE_equalityExpression = 30, RULE_relationalExpression = 31, RULE_additiveExpression = 32, 
		RULE_multiplicativeExpression = 33, RULE_preUnaryExpression = 34, RULE_postUnaryExpression = 35, 
		RULE_accessExpression = 36, RULE_otherExpression = 37, RULE_setNew = 38, 
		RULE_value = 39, RULE_boolValue = 40, RULE_class_identifier = 41, RULE_identifier = 42, 
		RULE_type = 43, RULE_array_type = 44, RULE_fptr_type = 45, RULE_set_type = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"simpleLOOP", "program", "constructor", "classDeclaration", "field_decleration", 
			"method", "methodBody", "methodArgsDec", "argDec", "methodArgs", "body", 
			"blockStatement", "singleStatement", "addStatement", "mergeStatement", 
			"deleteStatement", "varDecStatement", "ifStatement", "elsifStatement", 
			"condition", "elseStatement", "printStatement", "methodCallStmt", "returnStatement", 
			"assignmentStatement", "loopStatement", "expression", "ternaryExpression", 
			"orExpression", "andExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "preUnaryExpression", 
			"postUnaryExpression", "accessExpression", "otherExpression", "setNew", 
			"value", "boolValue", "class_identifier", "identifier", "type", "array_type", 
			"fptr_type", "set_type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'class'", "'public'", "'private'", "'initialize'", "'new'", 
			"'self'", "'return'", "'void'", "'delete'", "'include'", "'add'", "'merge'", 
			"'print'", "'if'", "'else'", "'elsif'", "'+'", "'-'", "'*'", "'/'", "'++'", 
			"'--'", "'=='", "'>'", "'<'", "'->'", "'|'", "'&&'", "'||'", "'!'", "'?'", 
			"':'", "'true'", "'false'", "'null'", "'=begin'", "'=end'", "'int'", 
			"'bool'", "'fptr'", "'Set'", "'each'", "'do'", "'='", "'#'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "','", "'.'", "';'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LINE_BREAK", "CLASS", "PUBLIC", "PRIVATE", "INITIALIZE", "NEW", 
			"SELF", "RETURN", "VOID", "DELETE", "INCLUDE", "ADD", "MERGE", "PRINT", 
			"IF", "ELSE", "ELSIF", "PLUS", "MINUS", "MULT", "DIVIDE", "INC", "DEC", 
			"EQUAL", "GREATER_THAN", "LESS_THAN", "ARROW", "BAR", "AND", "OR", "NOT", 
			"TIF", "TELSE", "TRUE", "FALSE", "NULL", "BEGIN", "END", "INT", "BOOL", 
			"FPTR", "SET", "EACH", "DO", "ASSIGN", "SHARP", "LPAR", "RPAR", "LBRACK", 
			"RBRACK", "LBRACE", "RBRACE", "COMMA", "DOT", "SEMICOLON", "NEWLINE", 
			"INT_VALUE", "IDENTIFIER", "CLASS_IDENTIFIER", "COMMENT", "MLCOMMENT", 
			"WS"
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
		public Program simpleLOOPProgram;
		public ProgramContext p;
		public TerminalNode EOF() { return getToken(SimpleLOOPParser.EOF, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					match(NEWLINE);
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(100);
			((SimpleLOOPContext)_localctx).p = program();
			((SimpleLOOPContext)_localctx).simpleLOOPProgram =  ((SimpleLOOPContext)_localctx).p.programRet;
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(102);
				match(NEWLINE);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(EOF);
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

	public static class ProgramContext extends ParserRuleContext {
		public Program programRet;
		public VarDecStatementContext v;
		public ClassDeclarationContext c;
		public List<VarDecStatementContext> varDecStatement() {
			return getRuleContexts(VarDecStatementContext.class);
		}
		public VarDecStatementContext varDecStatement(int i) {
			return getRuleContext(VarDecStatementContext.class,i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{

			        ((ProgramContext)_localctx).programRet =  new Program();
			        int line = 1;
			        _localctx.programRet.setLine(line);
			    
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FPTR) | (1L << SET) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				{
				setState(111);
				((ProgramContext)_localctx).v = varDecStatement();
				setState(113); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(112);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(115); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

				        for (VariableDeclaration varDec: ((ProgramContext)_localctx).v.varDecStmtRet)
				            _localctx.programRet.addGlobalVariable(varDec);
				    
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(124);
				((ProgramContext)_localctx).c = classDeclaration();
				setState(126); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(125);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(128); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				_localctx.programRet.addClass(((ProgramContext)_localctx).c.classDeclarationRet);
				}
				}
				setState(136);
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

	public static class ConstructorContext extends ParserRuleContext {
		public ConstructorDeclaration constructorDecRet;
		public Token init;
		public MethodArgsDecContext methodArgsDec;
		public MethodBodyContext methodBody;
		public TerminalNode PUBLIC() { return getToken(SimpleLOOPParser.PUBLIC, 0); }
		public MethodArgsDecContext methodArgsDec() {
			return getRuleContext(MethodArgsDecContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode INITIALIZE() { return getToken(SimpleLOOPParser.INITIALIZE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(PUBLIC);
			setState(138);
			((ConstructorContext)_localctx).init = match(INITIALIZE);

			        ((ConstructorContext)_localctx).constructorDecRet =  new ConstructorDeclaration();
			        _localctx.constructorDecRet.setLine(((ConstructorContext)_localctx).init.getLine());
			    
			setState(140);
			((ConstructorContext)_localctx).methodArgsDec = methodArgsDec();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(141);
				match(NEWLINE);
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			((ConstructorContext)_localctx).methodBody = methodBody();

			        _localctx.constructorDecRet.setArgs(((ConstructorContext)_localctx).methodArgsDec.methodArgsDecRet);
			        _localctx.constructorDecRet.setBody(((ConstructorContext)_localctx).methodBody.statements);
			        _localctx.constructorDecRet.setLocalVars(((ConstructorContext)_localctx).methodBody.localVars);
			    
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
		public ClassDeclaration classDeclarationRet;
		public Token CLASS;
		public Class_identifierContext className;
		public Class_identifierContext parent;
		public Field_declerationContext decs1;
		public Field_declerationContext decs2;
		public TerminalNode CLASS() { return getToken(SimpleLOOPParser.CLASS, 0); }
		public List<Class_identifierContext> class_identifier() {
			return getRuleContexts(Class_identifierContext.class);
		}
		public Class_identifierContext class_identifier(int i) {
			return getRuleContext(Class_identifierContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(SimpleLOOPParser.LESS_THAN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public TerminalNode LBRACE() { return getToken(SimpleLOOPParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimpleLOOPParser.RBRACE, 0); }
		public List<Field_declerationContext> field_decleration() {
			return getRuleContexts(Field_declerationContext.class);
		}
		public Field_declerationContext field_decleration(int i) {
			return getRuleContext(Field_declerationContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			((ClassDeclarationContext)_localctx).CLASS = match(CLASS);
			setState(151);
			((ClassDeclarationContext)_localctx).className = class_identifier();

			        ((ClassDeclarationContext)_localctx).classDeclarationRet =  new ClassDeclaration(((ClassDeclarationContext)_localctx).className.classIdRet);
			        _localctx.classDeclarationRet.setLine(((ClassDeclarationContext)_localctx).CLASS.getLine());
			    
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(153);
				match(LESS_THAN);
				setState(154);
				((ClassDeclarationContext)_localctx).parent = class_identifier();
				 _localctx.classDeclarationRet.setParentClassName(((ClassDeclarationContext)_localctx).parent.classIdRet); 
				}
			}

			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(159);
				match(NEWLINE);
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				{
				setState(165);
				match(LBRACE);
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(166);
					match(NEWLINE);
					}
					}
					setState(169); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(171);
					((ClassDeclarationContext)_localctx).decs1 = field_decleration();

					        for (Declaration dec: ((ClassDeclarationContext)_localctx).decs1.declarationsRet)
					        {
					            if(dec instanceof FieldDeclaration)
					                _localctx.classDeclarationRet.addField((FieldDeclaration)dec);
					            else if(dec instanceof ConstructorDeclaration)
					                _localctx.classDeclarationRet.setConstructor((ConstructorDeclaration)dec);
					            else if(dec instanceof MethodDeclaration)
					                _localctx.classDeclarationRet.addMethod((MethodDeclaration)dec);
					        }
					    
					setState(174); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(173);
						match(NEWLINE);
						}
						}
						setState(176); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					}
					}
					setState(180); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PUBLIC || _la==PRIVATE );
				setState(182);
				match(RBRACE);
				}
				}
				break;
			case PUBLIC:
			case PRIVATE:
				{
				{
				setState(184);
				((ClassDeclarationContext)_localctx).decs2 = field_decleration();

				        for (Declaration dec: ((ClassDeclarationContext)_localctx).decs2.declarationsRet)
				            {
				                if(dec instanceof FieldDeclaration)
				                    _localctx.classDeclarationRet.addField((FieldDeclaration)dec);
				                else if(dec instanceof ConstructorDeclaration)
				                    _localctx.classDeclarationRet.setConstructor((ConstructorDeclaration)dec);
				                else if(dec instanceof MethodDeclaration)
				                    _localctx.classDeclarationRet.addMethod((MethodDeclaration)dec);
				            }
				    
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Field_declerationContext extends ParserRuleContext {
		public ArrayList <Declaration> declarationsRet;
		public boolean isPrivate;
		public VarDecStatementContext v;
		public MethodContext m;
		public ConstructorContext c;
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(SimpleLOOPParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(SimpleLOOPParser.PRIVATE, 0); }
		public VarDecStatementContext varDecStatement() {
			return getRuleContext(VarDecStatementContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public Field_declerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decleration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterField_decleration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitField_decleration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitField_decleration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_declerationContext field_decleration() throws RecognitionException {
		Field_declerationContext _localctx = new Field_declerationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_field_decleration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((Field_declerationContext)_localctx).declarationsRet =  new ArrayList<Declaration>(); 
			{
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				{
				setState(194);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PUBLIC:
					{
					setState(190);
					match(PUBLIC);
					 ((Field_declerationContext)_localctx).isPrivate =  false; 
					}
					break;
				case PRIVATE:
					{
					setState(192);
					match(PRIVATE);
					 ((Field_declerationContext)_localctx).isPrivate =  true; 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(196);
					((Field_declerationContext)_localctx).v = varDecStatement();

					        for (VariableDeclaration varDec: ((Field_declerationContext)_localctx).v.varDecStmtRet)
					        {
					            FieldDeclaration fieldDec = new FieldDeclaration(varDec, _localctx.isPrivate);
					            fieldDec.setLine(varDec.getLine());
					            _localctx.declarationsRet.add(fieldDec);
					        }
					    
					}
					break;
				case 2:
					{
					setState(199);
					((Field_declerationContext)_localctx).m = method();

					        var methodDec = ((Field_declerationContext)_localctx).m.methodDecRet;
					        methodDec.setPrivate(_localctx.isPrivate);
					        _localctx.declarationsRet.add(methodDec);
					    
					}
					break;
				}
				}
				}
				break;
			case 2:
				{
				setState(204);
				((Field_declerationContext)_localctx).c = constructor();
				 _localctx.declarationsRet.add(((Field_declerationContext)_localctx).c.constructorDecRet); 
				}
				break;
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

	public static class MethodContext extends ParserRuleContext {
		public MethodDeclaration methodDecRet;
		public TypeContext t;
		public IdentifierContext id;
		public MethodArgsDecContext args;
		public MethodBodyContext b;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MethodArgsDecContext methodArgsDec() {
			return getRuleContext(MethodArgsDecContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode VOID() { return getToken(SimpleLOOPParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((MethodContext)_localctx).methodDecRet =  new MethodDeclaration(); 
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case FPTR:
			case SET:
			case CLASS_IDENTIFIER:
				{
				setState(210);
				((MethodContext)_localctx).t = type();

				        _localctx.methodDecRet.setReturnType(((MethodContext)_localctx).t.typeRet);
				        _localctx.methodDecRet.setDoesReturn(true);
				    
				}
				break;
			case VOID:
				{
				setState(213);
				match(VOID);
				 _localctx.methodDecRet.setReturnType(new VoidType()); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(217);
			((MethodContext)_localctx).id = identifier();

			        _localctx.methodDecRet.setMethodName(((MethodContext)_localctx).id.idRet);
			        _localctx.methodDecRet.setLine(((MethodContext)_localctx).id.idRet.getLine());
			    
			setState(219);
			((MethodContext)_localctx).args = methodArgsDec();
			 _localctx.methodDecRet.setArgs(((MethodContext)_localctx).args.methodArgsDecRet); 
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(221);
				match(NEWLINE);
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			((MethodContext)_localctx).b = methodBody();

			        _localctx.methodDecRet.setBody(((MethodContext)_localctx).b.statements);
			        _localctx.methodDecRet.setLocalVars(((MethodContext)_localctx).b.localVars);
			    
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

	public static class MethodBodyContext extends ParserRuleContext {
		public ArrayList<Statement> statements;
		public ArrayList<VariableDeclaration> localVars;
		public VarDecStatementContext v1;
		public SingleStatementContext s1;
		public VarDecStatementContext v2;
		public SingleStatementContext s2;
		public TerminalNode LBRACE() { return getToken(SimpleLOOPParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimpleLOOPParser.RBRACE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public List<VarDecStatementContext> varDecStatement() {
			return getRuleContexts(VarDecStatementContext.class);
		}
		public VarDecStatementContext varDecStatement(int i) {
			return getRuleContext(VarDecStatementContext.class,i);
		}
		public List<SingleStatementContext> singleStatement() {
			return getRuleContexts(SingleStatementContext.class);
		}
		public SingleStatementContext singleStatement(int i) {
			return getRuleContext(SingleStatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodBody);
		int _la;
		try {
			int _alt;
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{

				        ((MethodBodyContext)_localctx).statements =  new ArrayList<Statement>();
				        ((MethodBodyContext)_localctx).localVars =  new ArrayList<VariableDeclaration>();
				    
				setState(231);
				match(LBRACE);
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(232);
					match(NEWLINE);
					}
					}
					setState(235); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(237);
						((MethodBodyContext)_localctx).v1 = varDecStatement();
						 _localctx.localVars.addAll(((MethodBodyContext)_localctx).v1.varDecStmtRet); 
						setState(240); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(239);
							match(NEWLINE);
							}
							}
							setState(242); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==NEWLINE );
						}
						} 
					}
					setState(248);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << RETURN) | (1L << PRINT) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SET) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << CLASS_IDENTIFIER))) != 0)) {
					{
					{
					setState(249);
					((MethodBodyContext)_localctx).s1 = singleStatement();
					 _localctx.statements.add(((MethodBodyContext)_localctx).s1.stmtRet); 
					setState(252); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(251);
						match(NEWLINE);
						}
						}
						setState(254); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(261);
				match(RBRACE);
				}
				break;
			case SELF:
			case RETURN:
			case PRINT:
			case IF:
			case MINUS:
			case NOT:
			case TRUE:
			case FALSE:
			case INT:
			case BOOL:
			case FPTR:
			case SET:
			case LPAR:
			case INT_VALUE:
			case IDENTIFIER:
			case CLASS_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{

				        ((MethodBodyContext)_localctx).statements =  new ArrayList<Statement>();
				        ((MethodBodyContext)_localctx).localVars =  new ArrayList<VariableDeclaration>();
				    
				setState(269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					{
					setState(263);
					((MethodBodyContext)_localctx).v2 = varDecStatement();
					 _localctx.localVars.addAll(((MethodBodyContext)_localctx).v2.varDecStmtRet); 
					}
					}
					break;
				case 2:
					{
					{
					setState(266);
					((MethodBodyContext)_localctx).s2 = singleStatement();
					 _localctx.statements.add(((MethodBodyContext)_localctx).s2.stmtRet); 
					}
					}
					break;
				}
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

	public static class MethodArgsDecContext extends ParserRuleContext {
		public ArrayList<VariableDeclaration> methodArgsDecRet;
		public ArgDecContext arg1;
		public ArgDecContext arg2;
		public ArgDecContext arg3;
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public List<ArgDecContext> argDec() {
			return getRuleContexts(ArgDecContext.class);
		}
		public ArgDecContext argDec(int i) {
			return getRuleContext(ArgDecContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SimpleLOOPParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SimpleLOOPParser.ASSIGN, i);
		}
		public List<OrExpressionContext> orExpression() {
			return getRuleContexts(OrExpressionContext.class);
		}
		public OrExpressionContext orExpression(int i) {
			return getRuleContext(OrExpressionContext.class,i);
		}
		public MethodArgsDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgsDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMethodArgsDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMethodArgsDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMethodArgsDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgsDecContext methodArgsDec() throws RecognitionException {
		MethodArgsDecContext _localctx = new MethodArgsDecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodArgsDec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 ((MethodArgsDecContext)_localctx).methodArgsDecRet =  new ArrayList<VariableDeclaration>(); 
			setState(274);
			match(LPAR);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FPTR) | (1L << SET) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				setState(275);
				((MethodArgsDecContext)_localctx).arg1 = argDec();
				 _localctx.methodArgsDecRet.add(((MethodArgsDecContext)_localctx).arg1.varDecRet); 
				setState(288);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					{
					setState(277);
					match(ASSIGN);
					setState(278);
					orExpression();
					}
					}
					break;
				case RPAR:
				case COMMA:
					{
					setState(285);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(279);
							match(COMMA);
							setState(280);
							((MethodArgsDecContext)_localctx).arg2 = argDec();
							 _localctx.methodArgsDecRet.add(((MethodArgsDecContext)_localctx).arg2.varDecRet); 
							}
							} 
						}
						setState(287);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(290);
					match(COMMA);
					setState(291);
					((MethodArgsDecContext)_localctx).arg3 = argDec();
					 _localctx.methodArgsDecRet.add(((MethodArgsDecContext)_localctx).arg3.varDecRet); 
					setState(293);
					match(ASSIGN);
					setState(294);
					orExpression();
					}
					}
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(303);
			match(RPAR);
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

	public static class ArgDecContext extends ParserRuleContext {
		public VariableDeclaration varDecRet;
		public TypeContext t;
		public IdentifierContext id;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterArgDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitArgDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitArgDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgDecContext argDec() throws RecognitionException {
		ArgDecContext _localctx = new ArgDecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			((ArgDecContext)_localctx).t = type();
			setState(306);
			((ArgDecContext)_localctx).id = identifier();

			        ((ArgDecContext)_localctx).varDecRet =  new VariableDeclaration(((ArgDecContext)_localctx).id.idRet, ((ArgDecContext)_localctx).t.typeRet);
			        _localctx.varDecRet.setLine(((ArgDecContext)_localctx).id.idRet.getLine());
			    
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

	public static class MethodArgsContext extends ParserRuleContext {
		public ArrayList<Expression> methodArgsRet;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public MethodArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMethodArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMethodArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMethodArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgsContext methodArgs() throws RecognitionException {
		MethodArgsContext _localctx = new MethodArgsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((MethodArgsContext)_localctx).methodArgsRet =  new ArrayList<Expression>(); 
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SET) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				setState(310);
				((MethodArgsContext)_localctx).e1 = expression();
				_localctx.methodArgsRet.add(((MethodArgsContext)_localctx).e1.exprRet);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(312);
					match(COMMA);
					setState(313);
					((MethodArgsContext)_localctx).e2 = expression();
					_localctx.methodArgsRet.add(((MethodArgsContext)_localctx).e2.exprRet);
					}
					}
					setState(320);
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

	public static class BodyContext extends ParserRuleContext {
		public Statement stmtRet;
		public BlockStatementContext blockStatement;
		public SingleStatementContext singleStatement;
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(323);
				((BodyContext)_localctx).blockStatement = blockStatement();
				 ((BodyContext)_localctx).stmtRet =  ((BodyContext)_localctx).blockStatement.blockStmtRet; 
				}
				break;
			case NEWLINE:
				{
				{
				setState(327); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(326);
					match(NEWLINE);
					}
					}
					setState(329); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(331);
				((BodyContext)_localctx).singleStatement = singleStatement();
				 ((BodyContext)_localctx).stmtRet =  ((BodyContext)_localctx).singleStatement.stmtRet; 
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public BlockStmt blockStmtRet;
		public Token LBRACE;
		public SingleStatementContext s;
		public TerminalNode LBRACE() { return getToken(SimpleLOOPParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimpleLOOPParser.RBRACE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public List<SingleStatementContext> singleStatement() {
			return getRuleContexts(SingleStatementContext.class);
		}
		public SingleStatementContext singleStatement(int i) {
			return getRuleContext(SingleStatementContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			((BlockStatementContext)_localctx).LBRACE = match(LBRACE);

			        ((BlockStatementContext)_localctx).blockStmtRet =  new BlockStmt();
			        _localctx.blockStmtRet.setLine(((BlockStatementContext)_localctx).LBRACE.getLine());
			    
			setState(339); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(338);
				match(NEWLINE);
				}
				}
				setState(341); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << RETURN) | (1L << PRINT) | (1L << IF) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SET) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				{
				setState(343);
				((BlockStatementContext)_localctx).s = singleStatement();
				 _localctx.blockStmtRet.addStatement(((BlockStatementContext)_localctx).s.stmtRet); 
				setState(346); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(345);
					match(NEWLINE);
					}
					}
					setState(348); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355);
			match(RBRACE);
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
		public Statement stmtRet;
		public IfStatementContext ifStatement;
		public PrintStatementContext printStatement;
		public MethodCallStmtContext methodCallStmt;
		public ReturnStatementContext returnStatement;
		public AssignmentStatementContext assignmentStatement;
		public LoopStatementContext loopStatement;
		public AddStatementContext addStatement;
		public MergeStatementContext mergeStatement;
		public DeleteStatementContext deleteStatement;
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public MethodCallStmtContext methodCallStmt() {
			return getRuleContext(MethodCallStmtContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public AddStatementContext addStatement() {
			return getRuleContext(AddStatementContext.class,0);
		}
		public MergeStatementContext mergeStatement() {
			return getRuleContext(MergeStatementContext.class,0);
		}
		public DeleteStatementContext deleteStatement() {
			return getRuleContext(DeleteStatementContext.class,0);
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
		enterRule(_localctx, 24, RULE_singleStatement);
		try {
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				((SingleStatementContext)_localctx).ifStatement = ifStatement();
				 ((SingleStatementContext)_localctx).stmtRet =  ((SingleStatementContext)_localctx).ifStatement.conditionalStmtRet; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				((SingleStatementContext)_localctx).printStatement = printStatement();
				 ((SingleStatementContext)_localctx).stmtRet =  ((SingleStatementContext)_localctx).printStatement.printStmtRet; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				((SingleStatementContext)_localctx).methodCallStmt = methodCallStmt();
				 ((SingleStatementContext)_localctx).stmtRet =  ((SingleStatementContext)_localctx).methodCallStmt.methodCallStmtRet; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(366);
				((SingleStatementContext)_localctx).returnStatement = returnStatement();
				 ((SingleStatementContext)_localctx).stmtRet =  ((SingleStatementContext)_localctx).returnStatement.returnStmtRet; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(369);
				((SingleStatementContext)_localctx).assignmentStatement = assignmentStatement();
				 ((SingleStatementContext)_localctx).stmtRet =  ((SingleStatementContext)_localctx).assignmentStatement.assignmentStmtRet; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(372);
				((SingleStatementContext)_localctx).loopStatement = loopStatement();
				 ((SingleStatementContext)_localctx).stmtRet =  ((SingleStatementContext)_localctx).loopStatement.eachStmtRet; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(375);
				((SingleStatementContext)_localctx).addStatement = addStatement();
				 ((SingleStatementContext)_localctx).stmtRet =  ((SingleStatementContext)_localctx).addStatement.setAddRet; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(378);
				((SingleStatementContext)_localctx).mergeStatement = mergeStatement();
				 ((SingleStatementContext)_localctx).stmtRet =  ((SingleStatementContext)_localctx).mergeStatement.setMergeRet; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(381);
				((SingleStatementContext)_localctx).deleteStatement = deleteStatement();
				 ((SingleStatementContext)_localctx).stmtRet =  ((SingleStatementContext)_localctx).deleteStatement.setDeleteRet; 
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

	public static class AddStatementContext extends ParserRuleContext {
		public SetAdd setAddRet;
		public ExpressionContext expr;
		public Token ADD;
		public OrExpressionContext orExpr;
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode ADD() { return getToken(SimpleLOOPParser.ADD, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_addStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			((AddStatementContext)_localctx).expr = expression();
			setState(387);
			match(DOT);
			setState(388);
			((AddStatementContext)_localctx).ADD = match(ADD);
			setState(389);
			match(LPAR);
			setState(390);
			((AddStatementContext)_localctx).orExpr = orExpression();
			setState(391);
			match(RPAR);

			        ((AddStatementContext)_localctx).setAddRet =  new SetAdd(((AddStatementContext)_localctx).expr.exprRet, ((AddStatementContext)_localctx).orExpr.orExprRet);
			        _localctx.setAddRet.setLine(((AddStatementContext)_localctx).ADD.getLine());
			    
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
		public SetMerge setMergeRet;
		public Expression setArg;
		public ArrayList<Expression> elementArgs;
		public ExpressionContext expr;
		public Token MERGE;
		public OrExpressionContext orExpr1;
		public OrExpressionContext orExpr2;
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode MERGE() { return getToken(SimpleLOOPParser.MERGE, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<OrExpressionContext> orExpression() {
			return getRuleContexts(OrExpressionContext.class);
		}
		public OrExpressionContext orExpression(int i) {
			return getRuleContext(OrExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
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
		enterRule(_localctx, 28, RULE_mergeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((MergeStatementContext)_localctx).elementArgs =  new ArrayList<Expression>(); 
			setState(395);
			((MergeStatementContext)_localctx).expr = expression();
			 ((MergeStatementContext)_localctx).setArg =  ((MergeStatementContext)_localctx).expr.exprRet; 
			setState(397);
			match(DOT);
			setState(398);
			((MergeStatementContext)_localctx).MERGE = match(MERGE);
			setState(399);
			match(LPAR);
			setState(400);
			((MergeStatementContext)_localctx).orExpr1 = orExpression();
			 _localctx.elementArgs.add(((MergeStatementContext)_localctx).orExpr1.orExprRet); 
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(402);
				match(COMMA);
				setState(403);
				((MergeStatementContext)_localctx).orExpr2 = orExpression();
				 _localctx.elementArgs.add(((MergeStatementContext)_localctx).orExpr2.orExprRet); 
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411);
			match(RPAR);

			        ((MergeStatementContext)_localctx).setMergeRet =  new SetMerge(_localctx.setArg, _localctx.elementArgs);
			        _localctx.setMergeRet.setLine(((MergeStatementContext)_localctx).MERGE.getLine());
			    
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
		public SetDelete setDeleteRet;
		public ExpressionContext expr;
		public Token DELETE;
		public OrExpressionContext orExpr;
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode DELETE() { return getToken(SimpleLOOPParser.DELETE, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_deleteStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			((DeleteStatementContext)_localctx).expr = expression();
			setState(415);
			match(DOT);
			setState(416);
			((DeleteStatementContext)_localctx).DELETE = match(DELETE);
			setState(417);
			match(LPAR);
			setState(418);
			((DeleteStatementContext)_localctx).orExpr = orExpression();
			setState(419);
			match(RPAR);

			        ((DeleteStatementContext)_localctx).setDeleteRet =  new SetDelete(((DeleteStatementContext)_localctx).expr.exprRet, ((DeleteStatementContext)_localctx).orExpr.orExprRet);
			        _localctx.setDeleteRet.setLine(((DeleteStatementContext)_localctx).DELETE.getLine());
			    
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

	public static class VarDecStatementContext extends ParserRuleContext {
		public ArrayList<VariableDeclaration> varDecStmtRet;
		public TypeContext t;
		public IdentifierContext id1;
		public IdentifierContext id2;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public VarDecStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterVarDecStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitVarDecStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitVarDecStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecStatementContext varDecStatement() throws RecognitionException {
		VarDecStatementContext _localctx = new VarDecStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varDecStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((VarDecStatementContext)_localctx).varDecStmtRet =  new ArrayList<VariableDeclaration>(); 
			setState(423);
			((VarDecStatementContext)_localctx).t = type();
			setState(424);
			((VarDecStatementContext)_localctx).id1 = identifier();

			        VariableDeclaration varDec1 = new VariableDeclaration(((VarDecStatementContext)_localctx).id1.idRet, ((VarDecStatementContext)_localctx).t.typeRet);
			        varDec1.setLine(((VarDecStatementContext)_localctx).id1.idRet.getLine());
			        _localctx.varDecStmtRet.add(varDec1);
			    
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(426);
				match(COMMA);
				setState(427);
				((VarDecStatementContext)_localctx).id2 = identifier();

				        VariableDeclaration varDec2 = new VariableDeclaration(((VarDecStatementContext)_localctx).id2.idRet, ((VarDecStatementContext)_localctx).t.typeRet);
				        varDec2.setLine(((VarDecStatementContext)_localctx).id2.idRet.getLine());
				        _localctx.varDecStmtRet.add(varDec2);
				    
				}
				}
				setState(434);
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

	public static class IfStatementContext extends ParserRuleContext {
		public ConditionalStmt conditionalStmtRet;
		public Token IF;
		public ConditionContext condition;
		public BodyContext body;
		public ElsifStatementContext elsifStatement;
		public ElseStatementContext elseStatement;
		public TerminalNode IF() { return getToken(SimpleLOOPParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<ElsifStatementContext> elsifStatement() {
			return getRuleContexts(ElsifStatementContext.class);
		}
		public ElsifStatementContext elsifStatement(int i) {
			return getRuleContext(ElsifStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			((IfStatementContext)_localctx).IF = match(IF);
			setState(436);
			((IfStatementContext)_localctx).condition = condition();
			setState(437);
			((IfStatementContext)_localctx).body = body();

			        ((IfStatementContext)_localctx).conditionalStmtRet =  new ConditionalStmt(((IfStatementContext)_localctx).condition.condExpr, ((IfStatementContext)_localctx).body.stmtRet);
			        _localctx.conditionalStmtRet.setLine(((IfStatementContext)_localctx).IF.getLine());
			    
			setState(444);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(439);
					((IfStatementContext)_localctx).elsifStatement = elsifStatement();
					 _localctx.conditionalStmtRet.addElsif(((IfStatementContext)_localctx).elsifStatement.elsifRet); 
					}
					} 
				}
				setState(446);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(447);
				((IfStatementContext)_localctx).elseStatement = elseStatement();
				 _localctx.conditionalStmtRet.setElseBody(((IfStatementContext)_localctx).elseStatement.elseRet); 
				}
				break;
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

	public static class ElsifStatementContext extends ParserRuleContext {
		public ElsifStmt elsifRet;
		public ConditionContext condition;
		public BodyContext body;
		public TerminalNode ELSIF() { return getToken(SimpleLOOPParser.ELSIF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public ElsifStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterElsifStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitElsifStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitElsifStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsifStatementContext elsifStatement() throws RecognitionException {
		ElsifStatementContext _localctx = new ElsifStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elsifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(452);
				match(NEWLINE);
				}
				}
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(458);
			match(ELSIF);
			setState(459);
			((ElsifStatementContext)_localctx).condition = condition();
			setState(460);
			((ElsifStatementContext)_localctx).body = body();
			 ((ElsifStatementContext)_localctx).elsifRet =  new ElsifStmt(((ElsifStatementContext)_localctx).condition.condExpr, ((ElsifStatementContext)_localctx).body.stmtRet); 
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

	public static class ConditionContext extends ParserRuleContext {
		public Expression condExpr;
		public ExpressionContext expr1;
		public ExpressionContext expr2;
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condition);
		try {
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(463);
				match(LPAR);
				setState(464);
				((ConditionContext)_localctx).expr1 = expression();
				 ((ConditionContext)_localctx).condExpr =  ((ConditionContext)_localctx).expr1.exprRet; 
				setState(466);
				match(RPAR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(468);
				((ConditionContext)_localctx).expr2 = expression();
				 ((ConditionContext)_localctx).condExpr =  ((ConditionContext)_localctx).expr2.exprRet; 
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

	public static class ElseStatementContext extends ParserRuleContext {
		public Statement elseRet;
		public BodyContext body;
		public TerminalNode ELSE() { return getToken(SimpleLOOPParser.ELSE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SimpleLOOPParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SimpleLOOPParser.NEWLINE, i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(473);
				match(NEWLINE);
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(479);
			match(ELSE);
			setState(480);
			((ElseStatementContext)_localctx).body = body();
			 ((ElseStatementContext)_localctx).elseRet =  ((ElseStatementContext)_localctx).body.stmtRet; 
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
		public PrintStmt printStmtRet;
		public Token PRINT;
		public ExpressionContext expr;
		public TerminalNode PRINT() { return getToken(SimpleLOOPParser.PRINT, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 42, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			((PrintStatementContext)_localctx).PRINT = match(PRINT);
			setState(484);
			match(LPAR);
			setState(485);
			((PrintStatementContext)_localctx).expr = expression();
			setState(486);
			match(RPAR);

			        ((PrintStatementContext)_localctx).printStmtRet =  new PrintStmt(((PrintStatementContext)_localctx).expr.exprRet);
			        _localctx.printStmtRet.setLine(((PrintStatementContext)_localctx).PRINT.getLine());
			    
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

	public static class MethodCallStmtContext extends ParserRuleContext {
		public MethodCallStmt methodCallStmtRet;
		public Expression instance;
		public AccessExpressionContext accessExpression;
		public Token init;
		public IdentifierContext id2;
		public Token LPAR;
		public MethodArgsContext methodArgs;
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SimpleLOOPParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SimpleLOOPParser.DOT, i);
		}
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public MethodArgsContext methodArgs() {
			return getRuleContext(MethodArgsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public List<TerminalNode> INITIALIZE() { return getTokens(SimpleLOOPParser.INITIALIZE); }
		public TerminalNode INITIALIZE(int i) {
			return getToken(SimpleLOOPParser.INITIALIZE, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public MethodCallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterMethodCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitMethodCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitMethodCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallStmtContext methodCallStmt() throws RecognitionException {
		MethodCallStmtContext _localctx = new MethodCallStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_methodCallStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			((MethodCallStmtContext)_localctx).accessExpression = accessExpression();
			 ((MethodCallStmtContext)_localctx).instance =  ((MethodCallStmtContext)_localctx).accessExpression.accessExprRet; 
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(491);
				match(DOT);
				setState(497);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INITIALIZE:
					{
					setState(492);
					((MethodCallStmtContext)_localctx).init = match(INITIALIZE);

					        Identifier id1 = new Identifier((((MethodCallStmtContext)_localctx).init!=null?((MethodCallStmtContext)_localctx).init.getText():null));
					        id1.setLine(((MethodCallStmtContext)_localctx).init.getLine());
					        ((MethodCallStmtContext)_localctx).instance =  new ObjectMemberAccess(_localctx.instance, id1);
					        _localctx.instance.setLine(id1.getLine());
					    
					}
					break;
				case IDENTIFIER:
					{
					setState(494);
					((MethodCallStmtContext)_localctx).id2 = identifier();

					        ((MethodCallStmtContext)_localctx).instance =  new ObjectMemberAccess(_localctx.instance, ((MethodCallStmtContext)_localctx).id2.idRet);
					        _localctx.instance.setLine(((MethodCallStmtContext)_localctx).id2.idRet.getLine());
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			{
			setState(504);
			((MethodCallStmtContext)_localctx).LPAR = match(LPAR);
			setState(505);
			((MethodCallStmtContext)_localctx).methodArgs = methodArgs();
			setState(506);
			match(RPAR);
			}
			}

			        MethodCall methodCall = new MethodCall(_localctx.instance, ((MethodCallStmtContext)_localctx).methodArgs.methodArgsRet);
			        methodCall.setLine(((MethodCallStmtContext)_localctx).LPAR.getLine());
			        ((MethodCallStmtContext)_localctx).methodCallStmtRet =  new MethodCallStmt(methodCall);
			        _localctx.methodCallStmtRet.setLine(((MethodCallStmtContext)_localctx).LPAR.getLine());
			    
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
		public ReturnStmt returnStmtRet;
		public Token RETURN;
		public ExpressionContext expr;
		public TerminalNode RETURN() { return getToken(SimpleLOOPParser.RETURN, 0); }
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
		enterRule(_localctx, 46, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			((ReturnStatementContext)_localctx).RETURN = match(RETURN);

			        ((ReturnStatementContext)_localctx).returnStmtRet =  new ReturnStmt();
			        _localctx.returnStmtRet.setLine(((ReturnStatementContext)_localctx).RETURN.getLine());
			    
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELF) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << SET) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << CLASS_IDENTIFIER))) != 0)) {
				{
				setState(512);
				((ReturnStatementContext)_localctx).expr = expression();

				        _localctx.returnStmtRet.setReturnedExpr(((ReturnStatementContext)_localctx).expr.exprRet);
				    
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public AssignmentStmt assignmentStmtRet;
		public OrExpressionContext lval;
		public Token ASSIGN;
		public ExpressionContext rval;
		public TerminalNode ASSIGN() { return getToken(SimpleLOOPParser.ASSIGN, 0); }
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			((AssignmentStatementContext)_localctx).lval = orExpression();
			setState(518);
			((AssignmentStatementContext)_localctx).ASSIGN = match(ASSIGN);
			setState(519);
			((AssignmentStatementContext)_localctx).rval = expression();

			        ((AssignmentStatementContext)_localctx).assignmentStmtRet =  new AssignmentStmt(((AssignmentStatementContext)_localctx).lval.orExprRet, ((AssignmentStatementContext)_localctx).rval.exprRet);
			        _localctx.assignmentStmtRet.setLine(((AssignmentStatementContext)_localctx).ASSIGN.getLine());
			    
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

	public static class LoopStatementContext extends ParserRuleContext {
		public EachStmt eachStmtRet;
		public Expression list;
		public AccessExpressionContext accessExpression;
		public Token LPAR;
		public ExpressionContext leftExpr;
		public ExpressionContext rightExpr;
		public Token EACH;
		public IdentifierContext id;
		public BodyContext b;
		public List<TerminalNode> DOT() { return getTokens(SimpleLOOPParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SimpleLOOPParser.DOT, i);
		}
		public TerminalNode EACH() { return getToken(SimpleLOOPParser.EACH, 0); }
		public TerminalNode DO() { return getToken(SimpleLOOPParser.DO, 0); }
		public List<TerminalNode> BAR() { return getTokens(SimpleLOOPParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(SimpleLOOPParser.BAR, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_loopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				{
				setState(522);
				((LoopStatementContext)_localctx).accessExpression = accessExpression();
				 ((LoopStatementContext)_localctx).list =  ((LoopStatementContext)_localctx).accessExpression.accessExprRet; 
				}
				}
				break;
			case 2:
				{
				{
				setState(525);
				((LoopStatementContext)_localctx).LPAR = match(LPAR);
				setState(526);
				((LoopStatementContext)_localctx).leftExpr = expression();
				setState(527);
				match(DOT);
				setState(528);
				match(DOT);
				setState(529);
				((LoopStatementContext)_localctx).rightExpr = expression();
				setState(530);
				match(RPAR);

				        RangeExpression rangeExpr = new RangeExpression(((LoopStatementContext)_localctx).leftExpr.exprRet, ((LoopStatementContext)_localctx).rightExpr.exprRet);
				        rangeExpr.setLine(((LoopStatementContext)_localctx).LPAR.getLine());
				        ((LoopStatementContext)_localctx).list =  rangeExpr;
				    
				}
				}
				break;
			}
			setState(535);
			match(DOT);
			setState(536);
			((LoopStatementContext)_localctx).EACH = match(EACH);
			setState(537);
			match(DO);
			setState(538);
			match(BAR);
			setState(539);
			((LoopStatementContext)_localctx).id = identifier();
			setState(540);
			match(BAR);
			setState(541);
			((LoopStatementContext)_localctx).b = body();

			        ((LoopStatementContext)_localctx).eachStmtRet =  new EachStmt(((LoopStatementContext)_localctx).id.idRet, _localctx.list);
			        _localctx.eachStmtRet.setLine(((LoopStatementContext)_localctx).EACH.getLine());
			        _localctx.eachStmtRet.setBody(((LoopStatementContext)_localctx).b.stmtRet);
			    
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
		public Expression exprRet;
		public TernaryExpressionContext ternaryExpr;
		public Token ASSIGN;
		public ExpressionContext expr;
		public Token INCLUDE;
		public OrExpressionContext orExpr;
		public TernaryExpressionContext ternaryExpression() {
			return getRuleContext(TernaryExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SimpleLOOPParser.ASSIGN, 0); }
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode INCLUDE() { return getToken(SimpleLOOPParser.INCLUDE, 0); }
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
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
		enterRule(_localctx, 52, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			((ExpressionContext)_localctx).ternaryExpr = ternaryExpression();
			 ((ExpressionContext)_localctx).exprRet =  ((ExpressionContext)_localctx).ternaryExpr.ternaryExprRet; 
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(546);
				((ExpressionContext)_localctx).ASSIGN = match(ASSIGN);
				setState(547);
				((ExpressionContext)_localctx).expr = expression();

				        BinaryOperator op = BinaryOperator.assign;
				        ((ExpressionContext)_localctx).exprRet =  new BinaryExpression(_localctx.exprRet, ((ExpressionContext)_localctx).expr.exprRet, op);
				        _localctx.exprRet.setLine(((ExpressionContext)_localctx).ASSIGN.getLine());
				    
				}
			}

			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(552);
				match(DOT);
				setState(553);
				((ExpressionContext)_localctx).INCLUDE = match(INCLUDE);
				setState(554);
				match(LPAR);
				setState(555);
				((ExpressionContext)_localctx).orExpr = orExpression();
				setState(556);
				match(RPAR);

				        ((ExpressionContext)_localctx).exprRet =  new SetInclude(_localctx.exprRet, ((ExpressionContext)_localctx).orExpr.orExprRet);
				        _localctx.exprRet.setLine(((ExpressionContext)_localctx).INCLUDE.getLine());
				    
				}
				break;
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

	public static class TernaryExpressionContext extends ParserRuleContext {
		public Expression ternaryExprRet;
		public OrExpressionContext orExpr;
		public Token TIF;
		public TernaryExpressionContext trueExpr;
		public TernaryExpressionContext falseExpr;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode TIF() { return getToken(SimpleLOOPParser.TIF, 0); }
		public TerminalNode TELSE() { return getToken(SimpleLOOPParser.TELSE, 0); }
		public List<TernaryExpressionContext> ternaryExpression() {
			return getRuleContexts(TernaryExpressionContext.class);
		}
		public TernaryExpressionContext ternaryExpression(int i) {
			return getRuleContext(TernaryExpressionContext.class,i);
		}
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
		enterRule(_localctx, 54, RULE_ternaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			((TernaryExpressionContext)_localctx).orExpr = orExpression();
			 ((TernaryExpressionContext)_localctx).ternaryExprRet =  ((TernaryExpressionContext)_localctx).orExpr.orExprRet; 
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIF) {
				{
				setState(563);
				((TernaryExpressionContext)_localctx).TIF = match(TIF);
				setState(564);
				((TernaryExpressionContext)_localctx).trueExpr = ternaryExpression();
				setState(565);
				match(TELSE);
				setState(566);
				((TernaryExpressionContext)_localctx).falseExpr = ternaryExpression();

				        ((TernaryExpressionContext)_localctx).ternaryExprRet =  new TernaryExpression(_localctx.ternaryExprRet, ((TernaryExpressionContext)_localctx).trueExpr.ternaryExprRet, ((TernaryExpressionContext)_localctx).falseExpr.ternaryExprRet);
				        _localctx.ternaryExprRet.setLine(((TernaryExpressionContext)_localctx).TIF.getLine());
				    
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

	public static class OrExpressionContext extends ParserRuleContext {
		public Expression orExprRet;
		public BinaryOperator op;
		public int line;
		public AndExpressionContext operand1;
		public Token OR;
		public AndExpressionContext operand2;
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(SimpleLOOPParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SimpleLOOPParser.OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			((OrExpressionContext)_localctx).operand1 = andExpression();
			 ((OrExpressionContext)_localctx).orExprRet =  ((OrExpressionContext)_localctx).operand1.andExprRet; 
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(573);
				((OrExpressionContext)_localctx).OR = match(OR);

				        ((OrExpressionContext)_localctx).op =  BinaryOperator.or;
				        ((OrExpressionContext)_localctx).line =  ((OrExpressionContext)_localctx).OR.getLine();
				    
				setState(575);
				((OrExpressionContext)_localctx).operand2 = andExpression();

				        ((OrExpressionContext)_localctx).orExprRet =  new BinaryExpression(_localctx.orExprRet, ((OrExpressionContext)_localctx).operand2.andExprRet, _localctx.op);
				        _localctx.orExprRet.setLine(_localctx.line);
				    
				}
				}
				setState(582);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public Expression andExprRet;
		public BinaryOperator op;
		public int line;
		public EqualityExpressionContext operand1;
		public Token AND;
		public EqualityExpressionContext operand2;
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(SimpleLOOPParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SimpleLOOPParser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			((AndExpressionContext)_localctx).operand1 = equalityExpression();
			 ((AndExpressionContext)_localctx).andExprRet =  ((AndExpressionContext)_localctx).operand1.eqExprRet; 
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(585);
				((AndExpressionContext)_localctx).AND = match(AND);

				        ((AndExpressionContext)_localctx).op =  BinaryOperator.and;
				        ((AndExpressionContext)_localctx).line =  ((AndExpressionContext)_localctx).AND.getLine();
				    
				setState(587);
				((AndExpressionContext)_localctx).operand2 = equalityExpression();

				        ((AndExpressionContext)_localctx).andExprRet =  new BinaryExpression(_localctx.andExprRet, ((AndExpressionContext)_localctx).operand2.eqExprRet, _localctx.op);
				        _localctx.andExprRet.setLine(_localctx.line);
				    
				}
				}
				setState(594);
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
		public Expression eqExprRet;
		public BinaryOperator op;
		public int line;
		public RelationalExpressionContext operand1;
		public Token EQUAL;
		public RelationalExpressionContext operand2;
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(SimpleLOOPParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(SimpleLOOPParser.EQUAL, i);
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
		enterRule(_localctx, 60, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			((EqualityExpressionContext)_localctx).operand1 = relationalExpression();
			 ((EqualityExpressionContext)_localctx).eqExprRet =  ((EqualityExpressionContext)_localctx).operand1.relExprRet; 
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				setState(597);
				((EqualityExpressionContext)_localctx).EQUAL = match(EQUAL);

				        ((EqualityExpressionContext)_localctx).op =  BinaryOperator.eq;
				        ((EqualityExpressionContext)_localctx).line =  ((EqualityExpressionContext)_localctx).EQUAL.getLine();
				    
				setState(599);
				((EqualityExpressionContext)_localctx).operand2 = relationalExpression();

				        ((EqualityExpressionContext)_localctx).eqExprRet =  new BinaryExpression(_localctx.eqExprRet, ((EqualityExpressionContext)_localctx).operand2.relExprRet, _localctx.op);
				        _localctx.eqExprRet.setLine(_localctx.line);
				    
				}
				}
				setState(606);
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
		public Expression relExprRet;
		public BinaryOperator op;
		public int line;
		public AdditiveExpressionContext operand1;
		public Token GREATER_THAN;
		public Token LESS_THAN;
		public AdditiveExpressionContext operand2;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(SimpleLOOPParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(SimpleLOOPParser.GREATER_THAN, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(SimpleLOOPParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(SimpleLOOPParser.LESS_THAN, i);
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
		enterRule(_localctx, 62, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			((RelationalExpressionContext)_localctx).operand1 = additiveExpression();
			 ((RelationalExpressionContext)_localctx).relExprRet =  ((RelationalExpressionContext)_localctx).operand1.addExprRet; 
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				{
				setState(613);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(609);
					((RelationalExpressionContext)_localctx).GREATER_THAN = match(GREATER_THAN);

					        ((RelationalExpressionContext)_localctx).op =  BinaryOperator.gt;
					        ((RelationalExpressionContext)_localctx).line =  ((RelationalExpressionContext)_localctx).GREATER_THAN.getLine();
					    
					}
					break;
				case LESS_THAN:
					{
					setState(611);
					((RelationalExpressionContext)_localctx).LESS_THAN = match(LESS_THAN);

					        ((RelationalExpressionContext)_localctx).op =  BinaryOperator.lt;
					        ((RelationalExpressionContext)_localctx).line =  ((RelationalExpressionContext)_localctx).LESS_THAN.getLine();
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(615);
				((RelationalExpressionContext)_localctx).operand2 = additiveExpression();

				        ((RelationalExpressionContext)_localctx).relExprRet =  new BinaryExpression(_localctx.relExprRet, ((RelationalExpressionContext)_localctx).operand2.addExprRet, _localctx.op);
				        _localctx.relExprRet.setLine(_localctx.line);
				    
				}
				}
				setState(622);
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
		public Expression addExprRet;
		public BinaryOperator op;
		public int line;
		public MultiplicativeExpressionContext operand1;
		public Token PLUS;
		public Token MINUS;
		public MultiplicativeExpressionContext operand2;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SimpleLOOPParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SimpleLOOPParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SimpleLOOPParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SimpleLOOPParser.MINUS, i);
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
		enterRule(_localctx, 64, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			((AdditiveExpressionContext)_localctx).operand1 = multiplicativeExpression();
			 ((AdditiveExpressionContext)_localctx).addExprRet =  ((AdditiveExpressionContext)_localctx).operand1.multExprRet; 
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(629);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(625);
					((AdditiveExpressionContext)_localctx).PLUS = match(PLUS);

					        ((AdditiveExpressionContext)_localctx).op =  BinaryOperator.add;
					        ((AdditiveExpressionContext)_localctx).line =  ((AdditiveExpressionContext)_localctx).PLUS.getLine();
					    
					}
					break;
				case MINUS:
					{
					setState(627);
					((AdditiveExpressionContext)_localctx).MINUS = match(MINUS);

					        ((AdditiveExpressionContext)_localctx).op =  BinaryOperator.sub;
					        ((AdditiveExpressionContext)_localctx).line =  ((AdditiveExpressionContext)_localctx).MINUS.getLine();
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(631);
				((AdditiveExpressionContext)_localctx).operand2 = multiplicativeExpression();

				        ((AdditiveExpressionContext)_localctx).addExprRet =  new BinaryExpression(_localctx.addExprRet, ((AdditiveExpressionContext)_localctx).operand2.multExprRet, _localctx.op);
				        _localctx.addExprRet.setLine(_localctx.line);
				    
				}
				}
				setState(638);
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
		public Expression multExprRet;
		public BinaryOperator op;
		public int line;
		public PreUnaryExpressionContext operand1;
		public Token MULT;
		public Token DIVIDE;
		public PreUnaryExpressionContext operand2;
		public List<PreUnaryExpressionContext> preUnaryExpression() {
			return getRuleContexts(PreUnaryExpressionContext.class);
		}
		public PreUnaryExpressionContext preUnaryExpression(int i) {
			return getRuleContext(PreUnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(SimpleLOOPParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(SimpleLOOPParser.MULT, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(SimpleLOOPParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(SimpleLOOPParser.DIVIDE, i);
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
		enterRule(_localctx, 66, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			((MultiplicativeExpressionContext)_localctx).operand1 = preUnaryExpression();
			 ((MultiplicativeExpressionContext)_localctx).multExprRet =  ((MultiplicativeExpressionContext)_localctx).operand1.preUnaryExprRet; 
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIVIDE) {
				{
				{
				setState(645);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(641);
					((MultiplicativeExpressionContext)_localctx).MULT = match(MULT);

					        ((MultiplicativeExpressionContext)_localctx).op =  BinaryOperator.mult;
					        ((MultiplicativeExpressionContext)_localctx).line =  ((MultiplicativeExpressionContext)_localctx).MULT.getLine();
					    
					}
					break;
				case DIVIDE:
					{
					setState(643);
					((MultiplicativeExpressionContext)_localctx).DIVIDE = match(DIVIDE);

					        ((MultiplicativeExpressionContext)_localctx).op =  BinaryOperator.div;
					        ((MultiplicativeExpressionContext)_localctx).line =  ((MultiplicativeExpressionContext)_localctx).DIVIDE.getLine();
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(647);
				((MultiplicativeExpressionContext)_localctx).operand2 = preUnaryExpression();

				        ((MultiplicativeExpressionContext)_localctx).multExprRet =  new BinaryExpression(_localctx.multExprRet, ((MultiplicativeExpressionContext)_localctx).operand2.preUnaryExprRet, _localctx.op);
				        _localctx.multExprRet.setLine(_localctx.line);
				    
				}
				}
				setState(654);
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

	public static class PreUnaryExpressionContext extends ParserRuleContext {
		public Expression preUnaryExprRet;
		public UnaryOperator op;
		public int line;
		public Token NOT;
		public Token MINUS;
		public PreUnaryExpressionContext pre;
		public PostUnaryExpressionContext post;
		public PreUnaryExpressionContext preUnaryExpression() {
			return getRuleContext(PreUnaryExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SimpleLOOPParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(SimpleLOOPParser.MINUS, 0); }
		public PostUnaryExpressionContext postUnaryExpression() {
			return getRuleContext(PostUnaryExpressionContext.class,0);
		}
		public PreUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterPreUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitPreUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitPreUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreUnaryExpressionContext preUnaryExpression() throws RecognitionException {
		PreUnaryExpressionContext _localctx = new PreUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_preUnaryExpression);
		try {
			setState(667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(659);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(655);
					((PreUnaryExpressionContext)_localctx).NOT = match(NOT);

					        ((PreUnaryExpressionContext)_localctx).op =  UnaryOperator.not;
					        ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).NOT.getLine();
					    
					}
					break;
				case MINUS:
					{
					setState(657);
					((PreUnaryExpressionContext)_localctx).MINUS = match(MINUS);

					        ((PreUnaryExpressionContext)_localctx).op =  UnaryOperator.minus;
					        ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).MINUS.getLine();
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(661);
				((PreUnaryExpressionContext)_localctx).pre = preUnaryExpression();

				        ((PreUnaryExpressionContext)_localctx).preUnaryExprRet =  new UnaryExpression(((PreUnaryExpressionContext)_localctx).pre.preUnaryExprRet, _localctx.op);
				        _localctx.preUnaryExprRet.setLine(_localctx.line);
				    
				}
				}
				break;
			case SELF:
			case TRUE:
			case FALSE:
			case SET:
			case LPAR:
			case INT_VALUE:
			case IDENTIFIER:
			case CLASS_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				((PreUnaryExpressionContext)_localctx).post = postUnaryExpression();

				        ((PreUnaryExpressionContext)_localctx).preUnaryExprRet =  ((PreUnaryExpressionContext)_localctx).post.postUnaryExprRet;
				    
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

	public static class PostUnaryExpressionContext extends ParserRuleContext {
		public Expression postUnaryExprRet;
		public AccessExpressionContext ae;
		public Token INC;
		public Token DEC;
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(SimpleLOOPParser.INC, 0); }
		public TerminalNode DEC() { return getToken(SimpleLOOPParser.DEC, 0); }
		public PostUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterPostUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitPostUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitPostUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostUnaryExpressionContext postUnaryExpression() throws RecognitionException {
		PostUnaryExpressionContext _localctx = new PostUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_postUnaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			((PostUnaryExpressionContext)_localctx).ae = accessExpression();
			 ((PostUnaryExpressionContext)_localctx).postUnaryExprRet =  ((PostUnaryExpressionContext)_localctx).ae.accessExprRet; 
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INC || _la==DEC) {
				{
				setState(675);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INC:
					{
					setState(671);
					((PostUnaryExpressionContext)_localctx).INC = match(INC);
					 UnaryOperator op = UnaryOperator.postinc;
					      ((PostUnaryExpressionContext)_localctx).postUnaryExprRet =  new UnaryExpression(_localctx.postUnaryExprRet, op);
					      _localctx.postUnaryExprRet.setLine(((PostUnaryExpressionContext)_localctx).INC.getLine());
					    
					}
					break;
				case DEC:
					{
					setState(673);
					((PostUnaryExpressionContext)_localctx).DEC = match(DEC);
					 UnaryOperator op = UnaryOperator.postdec;
					      ((PostUnaryExpressionContext)_localctx).postUnaryExprRet =  new UnaryExpression(_localctx.postUnaryExprRet, op);
					      _localctx.postUnaryExprRet.setLine(((PostUnaryExpressionContext)_localctx).DEC.getLine());
					    
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class AccessExpressionContext extends ParserRuleContext {
		public Expression accessExprRet;
		public OtherExpressionContext oe;
		public Token LPAR;
		public MethodArgsContext args;
		public MethodArgsContext methodArgs;
		public IdentifierContext id1;
		public Token NEW;
		public Token init;
		public IdentifierContext id2;
		public Token LBRACK;
		public ExpressionContext expr;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(SimpleLOOPParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SimpleLOOPParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(SimpleLOOPParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SimpleLOOPParser.RPAR, i);
		}
		public List<TerminalNode> DOT() { return getTokens(SimpleLOOPParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SimpleLOOPParser.DOT, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SimpleLOOPParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SimpleLOOPParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SimpleLOOPParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SimpleLOOPParser.RBRACK, i);
		}
		public List<MethodArgsContext> methodArgs() {
			return getRuleContexts(MethodArgsContext.class);
		}
		public MethodArgsContext methodArgs(int i) {
			return getRuleContext(MethodArgsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> NEW() { return getTokens(SimpleLOOPParser.NEW); }
		public TerminalNode NEW(int i) {
			return getToken(SimpleLOOPParser.NEW, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> INITIALIZE() { return getTokens(SimpleLOOPParser.INITIALIZE); }
		public TerminalNode INITIALIZE(int i) {
			return getToken(SimpleLOOPParser.INITIALIZE, i);
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
		enterRule(_localctx, 72, RULE_accessExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			((AccessExpressionContext)_localctx).oe = otherExpression();
			 ((AccessExpressionContext)_localctx).accessExprRet =  ((AccessExpressionContext)_localctx).oe.otherExprRet; 
			setState(698);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(696);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(681);
						((AccessExpressionContext)_localctx).LPAR = match(LPAR);
						setState(682);
						((AccessExpressionContext)_localctx).args = ((AccessExpressionContext)_localctx).methodArgs = methodArgs();

						        if(_localctx.accessExprRet instanceof NewClassInstance)
						        {
						            ((NewClassInstance) _localctx.accessExprRet).setArgs(((AccessExpressionContext)_localctx).methodArgs.methodArgsRet);
						        }
						        else{
						            ((AccessExpressionContext)_localctx).accessExprRet =  new MethodCall(_localctx.accessExprRet, ((AccessExpressionContext)_localctx).args.methodArgsRet);
						            _localctx.accessExprRet.setLine((((AccessExpressionContext)_localctx).LPAR!=null?((AccessExpressionContext)_localctx).LPAR.getLine():0));
						        }
						    
						setState(684);
						match(RPAR);
						}
						}
						break;
					case DOT:
						{
						{
						setState(686);
						match(DOT);
						setState(694);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IDENTIFIER:
							{
							setState(687);
							((AccessExpressionContext)_localctx).id1 = identifier();

							        ((AccessExpressionContext)_localctx).accessExprRet =  new ObjectMemberAccess(_localctx.accessExprRet, ((AccessExpressionContext)_localctx).id1.idRet);
							        _localctx.accessExprRet.setLine(((AccessExpressionContext)_localctx).id1.idRet.getLine());
							    
							}
							break;
						case NEW:
							{
							setState(690);
							((AccessExpressionContext)_localctx).NEW = match(NEW);

							        ClassType c = new ClassType((Identifier)_localctx.accessExprRet);
							        ((AccessExpressionContext)_localctx).accessExprRet =  new NewClassInstance(c);
							        _localctx.accessExprRet.setLine(((AccessExpressionContext)_localctx).NEW.getLine());
							    
							}
							break;
						case INITIALIZE:
							{
							setState(692);
							((AccessExpressionContext)_localctx).init = match(INITIALIZE);

							        Identifier id2 = new Identifier((((AccessExpressionContext)_localctx).init!=null?((AccessExpressionContext)_localctx).init.getText():null));
							        id2.setLine(((AccessExpressionContext)_localctx).init.getLine());
							        ((AccessExpressionContext)_localctx).accessExprRet =  new ObjectMemberAccess(_localctx.accessExprRet, id2);
							        _localctx.accessExprRet.setLine(id2.getLine());
							    
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(700);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			setState(712);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(710);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
						{
						{
						setState(701);
						match(DOT);
						{
						setState(702);
						((AccessExpressionContext)_localctx).id2 = identifier();

						        ((AccessExpressionContext)_localctx).accessExprRet =  new ObjectMemberAccess(_localctx.accessExprRet, ((AccessExpressionContext)_localctx).id2.idRet);
						        _localctx.accessExprRet.setLine(((AccessExpressionContext)_localctx).id2.idRet.getLine());
						    
						}
						}
						}
						break;
					case LBRACK:
						{
						{
						setState(705);
						((AccessExpressionContext)_localctx).LBRACK = match(LBRACK);
						setState(706);
						((AccessExpressionContext)_localctx).expr = expression();

						        ((AccessExpressionContext)_localctx).accessExprRet =  new ArrayAccessByIndex(_localctx.accessExprRet, ((AccessExpressionContext)_localctx).expr.exprRet);
						        _localctx.accessExprRet.setLine((((AccessExpressionContext)_localctx).LBRACK!=null?((AccessExpressionContext)_localctx).LBRACK.getLine():0));
						    
						setState(708);
						match(RBRACK);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(714);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	public static class OtherExpressionContext extends ParserRuleContext {
		public Expression otherExprRet;
		public Token SELF;
		public Class_identifierContext c;
		public ValueContext v;
		public IdentifierContext i;
		public SetNewContext s;
		public ExpressionContext e;
		public TerminalNode SELF() { return getToken(SimpleLOOPParser.SELF, 0); }
		public Class_identifierContext class_identifier() {
			return getRuleContext(Class_identifierContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SetNewContext setNew() {
			return getRuleContext(SetNewContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SimpleLOOPParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleLOOPParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OtherExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitOtherExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitOtherExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherExpressionContext otherExpression() throws RecognitionException {
		OtherExpressionContext _localctx = new OtherExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_otherExpression);
		try {
			setState(734);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELF:
				enterOuterAlt(_localctx, 1);
				{
				setState(715);
				((OtherExpressionContext)_localctx).SELF = match(SELF);

				        ((OtherExpressionContext)_localctx).otherExprRet =  new SelfClass();
				        _localctx.otherExprRet.setLine(((OtherExpressionContext)_localctx).SELF.getLine());
				    
				}
				break;
			case CLASS_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(717);
				((OtherExpressionContext)_localctx).c = class_identifier();
				((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).c.classIdRet; 
				}
				break;
			case TRUE:
			case FALSE:
			case INT_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(720);
				((OtherExpressionContext)_localctx).v = value();
				((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).v.valueRet; 
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(723);
				((OtherExpressionContext)_localctx).i = identifier();
				((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).i.idRet; 
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 5);
				{
				setState(726);
				((OtherExpressionContext)_localctx).s = setNew();
				((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).s.setNewRet; 
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(729);
				match(LPAR);
				setState(730);
				((OtherExpressionContext)_localctx).e = expression();
				setState(731);
				match(RPAR);
				((OtherExpressionContext)_localctx).otherExprRet =  ((OtherExpressionContext)_localctx).e.exprRet; 
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

	public static class SetNewContext extends ParserRuleContext {
		public SetNew setNewRet;
		public ArrayList<Expression> args;
		public Token NEW;
		public OrExpressionContext orExpr1;
		public OrExpressionContext orExpr2;
		public TerminalNode SET() { return getToken(SimpleLOOPParser.SET, 0); }
		public TerminalNode DOT() { return getToken(SimpleLOOPParser.DOT, 0); }
		public TerminalNode NEW() { return getToken(SimpleLOOPParser.NEW, 0); }
		public List<TerminalNode> LPAR() { return getTokens(SimpleLOOPParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SimpleLOOPParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(SimpleLOOPParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SimpleLOOPParser.RPAR, i);
		}
		public List<OrExpressionContext> orExpression() {
			return getRuleContexts(OrExpressionContext.class);
		}
		public OrExpressionContext orExpression(int i) {
			return getRuleContext(OrExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public SetNewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setNew; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSetNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSetNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSetNew(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetNewContext setNew() throws RecognitionException {
		SetNewContext _localctx = new SetNewContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_setNew);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((SetNewContext)_localctx).args =  new ArrayList<Expression>(); 
			setState(737);
			match(SET);
			setState(738);
			match(DOT);
			setState(739);
			((SetNewContext)_localctx).NEW = match(NEW);
			setState(740);
			match(LPAR);
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(741);
				match(LPAR);
				setState(742);
				((SetNewContext)_localctx).orExpr1 = orExpression();
				 _localctx.args.add(((SetNewContext)_localctx).orExpr1.orExprRet); 
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(744);
					match(COMMA);
					setState(745);
					((SetNewContext)_localctx).orExpr2 = orExpression();
					 _localctx.args.add(((SetNewContext)_localctx).orExpr2.orExprRet); 
					}
					}
					setState(752);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(753);
				match(RPAR);
				}
			}

			setState(757);
			match(RPAR);

			        ((SetNewContext)_localctx).setNewRet =  new SetNew(_localctx.args);
			        _localctx.setNewRet.setLine(((SetNewContext)_localctx).NEW.getLine());
			    
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

	public static class ValueContext extends ParserRuleContext {
		public Value valueRet;
		public BoolValueContext boolValue;
		public Token INT_VALUE;
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public TerminalNode INT_VALUE() { return getToken(SimpleLOOPParser.INT_VALUE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_value);
		try {
			setState(765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(760);
				((ValueContext)_localctx).boolValue = boolValue();
				 ((ValueContext)_localctx).valueRet =  ((ValueContext)_localctx).boolValue.boolValueRet; 
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
				((ValueContext)_localctx).INT_VALUE = match(INT_VALUE);

				        ((ValueContext)_localctx).valueRet =  new IntValue((((ValueContext)_localctx).INT_VALUE!=null?Integer.valueOf(((ValueContext)_localctx).INT_VALUE.getText()):0));
				        _localctx.valueRet.setLine(((ValueContext)_localctx).INT_VALUE.getLine());
				    
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

	public static class BoolValueContext extends ParserRuleContext {
		public BoolValue boolValueRet;
		public Token TRUE;
		public Token FALSE;
		public TerminalNode TRUE() { return getToken(SimpleLOOPParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SimpleLOOPParser.FALSE, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_boolValue);
		try {
			setState(771);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				((BoolValueContext)_localctx).TRUE = match(TRUE);

				        ((BoolValueContext)_localctx).boolValueRet =  new BoolValue(true);
				        _localctx.boolValueRet.setLine(((BoolValueContext)_localctx).TRUE.getLine());
				    
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				((BoolValueContext)_localctx).FALSE = match(FALSE);

				        ((BoolValueContext)_localctx).boolValueRet =  new BoolValue(false);
				        _localctx.boolValueRet.setLine(((BoolValueContext)_localctx).FALSE.getLine());
				    
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

	public static class Class_identifierContext extends ParserRuleContext {
		public Identifier classIdRet;
		public Token cid;
		public TerminalNode CLASS_IDENTIFIER() { return getToken(SimpleLOOPParser.CLASS_IDENTIFIER, 0); }
		public Class_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterClass_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitClass_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitClass_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_identifierContext class_identifier() throws RecognitionException {
		Class_identifierContext _localctx = new Class_identifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_class_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			((Class_identifierContext)_localctx).cid = match(CLASS_IDENTIFIER);

			        ((Class_identifierContext)_localctx).classIdRet =  new Identifier((((Class_identifierContext)_localctx).cid!=null?((Class_identifierContext)_localctx).cid.getText():null));
			        _localctx.classIdRet.setLine(((Class_identifierContext)_localctx).cid.getLine());
			    
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

	public static class IdentifierContext extends ParserRuleContext {
		public Identifier idRet;
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(SimpleLOOPParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			((IdentifierContext)_localctx).id = match(IDENTIFIER);

			        ((IdentifierContext)_localctx).idRet =  new Identifier((((IdentifierContext)_localctx).id!=null?((IdentifierContext)_localctx).id.getText():null));
			        _localctx.idRet.setLine(((IdentifierContext)_localctx).id.getLine());
			    
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
		public Type typeRet;
		public Array_typeContext a;
		public Fptr_typeContext f;
		public Set_typeContext s;
		public Class_identifierContext c;
		public TerminalNode INT() { return getToken(SimpleLOOPParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(SimpleLOOPParser.BOOL, 0); }
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Fptr_typeContext fptr_type() {
			return getRuleContext(Fptr_typeContext.class,0);
		}
		public Set_typeContext set_type() {
			return getRuleContext(Set_typeContext.class,0);
		}
		public Class_identifierContext class_identifier() {
			return getRuleContext(Class_identifierContext.class,0);
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
		enterRule(_localctx, 86, RULE_type);
		try {
			setState(795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				match(INT);
				 ((TypeContext)_localctx).typeRet =   new IntType(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
				match(BOOL);
				 ((TypeContext)_localctx).typeRet =   new BoolType(); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(783);
				((TypeContext)_localctx).a = array_type();
				 ((TypeContext)_localctx).typeRet =   ((TypeContext)_localctx).a.arrayTypeRet; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(786);
				((TypeContext)_localctx).f = fptr_type();
				 ((TypeContext)_localctx).typeRet =   ((TypeContext)_localctx).f.fptrTypeRet; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(789);
				((TypeContext)_localctx).s = set_type();
				 ((TypeContext)_localctx).typeRet =   ((TypeContext)_localctx).s.setTypeRet; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(792);
				((TypeContext)_localctx).c = class_identifier();
				 ((TypeContext)_localctx).typeRet =  new ClassType(((TypeContext)_localctx).c.classIdRet); 
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

	public static class Array_typeContext extends ParserRuleContext {
		public ArrayType arrayTypeRet;
		public Type t;
		public ArrayList<Expression> dims;
		public Class_identifierContext class_identifier;
		public ExpressionContext expression;
		public TerminalNode INT() { return getToken(SimpleLOOPParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(SimpleLOOPParser.BOOL, 0); }
		public Class_identifierContext class_identifier() {
			return getRuleContext(Class_identifierContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SimpleLOOPParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SimpleLOOPParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SimpleLOOPParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SimpleLOOPParser.RBRACK, i);
		}
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterArray_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitArray_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitArray_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_array_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((Array_typeContext)_localctx).dims =  new ArrayList<Expression>(); 
			setState(805);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(798);
				match(INT);
				 ((Array_typeContext)_localctx).t =  new IntType(); 
				}
				break;
			case BOOL:
				{
				setState(800);
				match(BOOL);
				 ((Array_typeContext)_localctx).t =   new BoolType(); 
				}
				break;
			case CLASS_IDENTIFIER:
				{
				setState(802);
				((Array_typeContext)_localctx).class_identifier = class_identifier();
				 ((Array_typeContext)_localctx).t =  new ClassType(((Array_typeContext)_localctx).class_identifier.classIdRet); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(812); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(807);
				match(LBRACK);
				setState(808);
				((Array_typeContext)_localctx).expression = expression();
				setState(809);
				match(RBRACK);
				 _localctx.dims.add(((Array_typeContext)_localctx).expression.exprRet); 
				}
				}
				setState(814); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACK );
			 ((Array_typeContext)_localctx).arrayTypeRet =  new ArrayType(_localctx.t, _localctx.dims); 
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

	public static class Fptr_typeContext extends ParserRuleContext {
		public FptrType fptrTypeRet;
		public ArrayList<Type> argsTypes;
		public Type returnType;
		public TypeContext t1;
		public TypeContext t2;
		public TypeContext t3;
		public TerminalNode FPTR() { return getToken(SimpleLOOPParser.FPTR, 0); }
		public TerminalNode LESS_THAN() { return getToken(SimpleLOOPParser.LESS_THAN, 0); }
		public TerminalNode ARROW() { return getToken(SimpleLOOPParser.ARROW, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SimpleLOOPParser.GREATER_THAN, 0); }
		public List<TerminalNode> VOID() { return getTokens(SimpleLOOPParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(SimpleLOOPParser.VOID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLOOPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLOOPParser.COMMA, i);
		}
		public Fptr_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fptr_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterFptr_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitFptr_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitFptr_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fptr_typeContext fptr_type() throws RecognitionException {
		Fptr_typeContext _localctx = new Fptr_typeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_fptr_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((Fptr_typeContext)_localctx).argsTypes =  new ArrayList<Type>(); 
			setState(819);
			match(FPTR);
			setState(820);
			match(LESS_THAN);
			setState(833);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(821);
				match(VOID);
				}
				break;
			case INT:
			case BOOL:
			case FPTR:
			case SET:
			case CLASS_IDENTIFIER:
				{
				{
				setState(822);
				((Fptr_typeContext)_localctx).t1 = type();
				_localctx.argsTypes.add(((Fptr_typeContext)_localctx).t1.typeRet); 
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(824);
					match(COMMA);
					setState(825);
					((Fptr_typeContext)_localctx).t2 = type();
					_localctx.argsTypes.add(((Fptr_typeContext)_localctx).t2.typeRet); 
					}
					}
					setState(832);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(835);
			match(ARROW);
			setState(841);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case FPTR:
			case SET:
			case CLASS_IDENTIFIER:
				{
				setState(836);
				((Fptr_typeContext)_localctx).t3 = type();
				 ((Fptr_typeContext)_localctx).returnType =  ((Fptr_typeContext)_localctx).t3.typeRet; 
				}
				break;
			case VOID:
				{
				setState(839);
				match(VOID);
				 ((Fptr_typeContext)_localctx).returnType =  new VoidType(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(843);
			match(GREATER_THAN);
			 ((Fptr_typeContext)_localctx).fptrTypeRet =  new FptrType(_localctx.argsTypes, _localctx.returnType); 
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

	public static class Set_typeContext extends ParserRuleContext {
		public SetType setTypeRet;
		public TerminalNode SET() { return getToken(SimpleLOOPParser.SET, 0); }
		public TerminalNode LESS_THAN() { return getToken(SimpleLOOPParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SimpleLOOPParser.GREATER_THAN, 0); }
		public TerminalNode INT() { return getToken(SimpleLOOPParser.INT, 0); }
		public Set_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).enterSet_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLOOPListener ) ((SimpleLOOPListener)listener).exitSet_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLOOPVisitor ) return ((SimpleLOOPVisitor<? extends T>)visitor).visitSet_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_typeContext set_type() throws RecognitionException {
		Set_typeContext _localctx = new Set_typeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_set_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(SET);
			setState(847);
			match(LESS_THAN);
			{
			setState(848);
			match(INT);
			}
			setState(849);
			match(GREATER_THAN);
			((Set_typeContext)_localctx).setTypeRet =  new SetType(); 
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u0357\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\7\2b\n\2\f\2\16\2e\13\2\3\2\3\2\3"+
		"\2\7\2j\n\2\f\2\16\2m\13\2\3\2\3\2\3\3\3\3\3\3\6\3t\n\3\r\3\16\3u\3\3"+
		"\3\3\7\3z\n\3\f\3\16\3}\13\3\3\3\3\3\6\3\u0081\n\3\r\3\16\3\u0082\3\3"+
		"\3\3\7\3\u0087\n\3\f\3\16\3\u008a\13\3\3\4\3\4\3\4\3\4\3\4\7\4\u0091\n"+
		"\4\f\4\16\4\u0094\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a0"+
		"\n\5\3\5\7\5\u00a3\n\5\f\5\16\5\u00a6\13\5\3\5\3\5\6\5\u00aa\n\5\r\5\16"+
		"\5\u00ab\3\5\3\5\3\5\6\5\u00b1\n\5\r\5\16\5\u00b2\6\5\u00b5\n\5\r\5\16"+
		"\5\u00b6\3\5\3\5\3\5\3\5\3\5\5\5\u00be\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u00c5"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00cd\n\6\3\6\3\6\3\6\5\6\u00d2\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7\u00da\n\7\3\7\3\7\3\7\3\7\3\7\7\7\u00e1\n\7"+
		"\f\7\16\7\u00e4\13\7\3\7\3\7\3\7\3\b\3\b\3\b\6\b\u00ec\n\b\r\b\16\b\u00ed"+
		"\3\b\3\b\3\b\6\b\u00f3\n\b\r\b\16\b\u00f4\7\b\u00f7\n\b\f\b\16\b\u00fa"+
		"\13\b\3\b\3\b\3\b\6\b\u00ff\n\b\r\b\16\b\u0100\7\b\u0103\n\b\f\b\16\b"+
		"\u0106\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0110\n\b\5\b\u0112\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u011e\n\t\f\t\16\t\u0121"+
		"\13\t\5\t\u0123\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u012b\n\t\f\t\16\t\u012e"+
		"\13\t\5\t\u0130\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\7\13\u013f\n\13\f\13\16\13\u0142\13\13\5\13\u0144\n\13\3\f\3"+
		"\f\3\f\3\f\6\f\u014a\n\f\r\f\16\f\u014b\3\f\3\f\3\f\5\f\u0151\n\f\3\r"+
		"\3\r\3\r\6\r\u0156\n\r\r\r\16\r\u0157\3\r\3\r\3\r\6\r\u015d\n\r\r\r\16"+
		"\r\u015e\7\r\u0161\n\r\f\r\16\r\u0164\13\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0183\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u0199\n\20\f\20\16\20\u019c\13\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u01b1\n\22\f\22\16\22\u01b4\13\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u01bd\n\23\f\23\16\23\u01c0\13\23\3\23\3\23"+
		"\3\23\5\23\u01c5\n\23\3\24\7\24\u01c8\n\24\f\24\16\24\u01cb\13\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01da"+
		"\n\25\3\26\7\26\u01dd\n\26\f\26\16\26\u01e0\13\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u01f4\n\30\7\30\u01f6\n\30\f\30\16\30\u01f9\13\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u0206\n\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u0218\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u0229\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0232\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u023c\n\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0245\n\36\f\36\16\36\u0248\13"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0251\n\37\f\37\16\37\u0254"+
		"\13\37\3 \3 \3 \3 \3 \3 \3 \7 \u025d\n \f \16 \u0260\13 \3!\3!\3!\3!\3"+
		"!\3!\5!\u0268\n!\3!\3!\3!\7!\u026d\n!\f!\16!\u0270\13!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\5\"\u0278\n\"\3\"\3\"\3\"\7\"\u027d\n\"\f\"\16\"\u0280\13\"\3"+
		"#\3#\3#\3#\3#\3#\5#\u0288\n#\3#\3#\3#\7#\u028d\n#\f#\16#\u0290\13#\3$"+
		"\3$\3$\3$\5$\u0296\n$\3$\3$\3$\3$\3$\3$\5$\u029e\n$\3%\3%\3%\3%\3%\3%"+
		"\5%\u02a6\n%\5%\u02a8\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\5&\u02b9\n&\7&\u02bb\n&\f&\16&\u02be\13&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7"+
		"&\u02c9\n&\f&\16&\u02cc\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u02e1\n\'\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\7(\u02ef\n(\f(\16(\u02f2\13(\3(\3(\5(\u02f6\n(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\5)\u0300\n)\3*\3*\3*\3*\5*\u0306\n*\3+\3+\3+\3,\3,\3"+
		",\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u031e\n-\3.\3.\3"+
		".\3.\3.\3.\3.\3.\5.\u0328\n.\3.\3.\3.\3.\3.\6.\u032f\n.\r.\16.\u0330\3"+
		".\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u033f\n/\f/\16/\u0342\13/\5/\u0344"+
		"\n/\3/\3/\3/\3/\3/\3/\5/\u034c\n/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\2\2\61\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^\2\2\2\u0388\2c\3\2\2\2\4p\3\2\2\2\6\u008b"+
		"\3\2\2\2\b\u0098\3\2\2\2\n\u00bf\3\2\2\2\f\u00d3\3\2\2\2\16\u0111\3\2"+
		"\2\2\20\u0113\3\2\2\2\22\u0133\3\2\2\2\24\u0137\3\2\2\2\26\u0150\3\2\2"+
		"\2\30\u0152\3\2\2\2\32\u0182\3\2\2\2\34\u0184\3\2\2\2\36\u018c\3\2\2\2"+
		" \u01a0\3\2\2\2\"\u01a8\3\2\2\2$\u01b5\3\2\2\2&\u01c9\3\2\2\2(\u01d9\3"+
		"\2\2\2*\u01de\3\2\2\2,\u01e5\3\2\2\2.\u01eb\3\2\2\2\60\u0200\3\2\2\2\62"+
		"\u0207\3\2\2\2\64\u0217\3\2\2\2\66\u0222\3\2\2\28\u0233\3\2\2\2:\u023d"+
		"\3\2\2\2<\u0249\3\2\2\2>\u0255\3\2\2\2@\u0261\3\2\2\2B\u0271\3\2\2\2D"+
		"\u0281\3\2\2\2F\u029d\3\2\2\2H\u029f\3\2\2\2J\u02a9\3\2\2\2L\u02e0\3\2"+
		"\2\2N\u02e2\3\2\2\2P\u02ff\3\2\2\2R\u0305\3\2\2\2T\u0307\3\2\2\2V\u030a"+
		"\3\2\2\2X\u031d\3\2\2\2Z\u031f\3\2\2\2\\\u0334\3\2\2\2^\u0350\3\2\2\2"+
		"`b\7:\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2"+
		"fg\5\4\3\2gk\b\2\1\2hj\7:\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2"+
		"ln\3\2\2\2mk\3\2\2\2no\7\2\2\3o\3\3\2\2\2p{\b\3\1\2qs\5\"\22\2rt\7:\2"+
		"\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\b\3\1\2xz\3\2\2"+
		"\2yq\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0088\3\2\2\2}{\3\2\2\2~\u0080"+
		"\5\b\5\2\177\u0081\7:\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\3"+
		"\1\2\u0085\u0087\3\2\2\2\u0086~\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\5\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008c\7\5\2\2\u008c\u008d\7\7\2\2\u008d\u008e\b\4\1\2\u008e\u0092\5\20"+
		"\t\2\u008f\u0091\7:\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0095\u0096\5\16\b\2\u0096\u0097\b\4\1\2\u0097\7\3\2\2\2\u0098\u0099"+
		"\7\4\2\2\u0099\u009a\5T+\2\u009a\u009f\b\5\1\2\u009b\u009c\7\34\2\2\u009c"+
		"\u009d\5T+\2\u009d\u009e\b\5\1\2\u009e\u00a0\3\2\2\2\u009f\u009b\3\2\2"+
		"\2\u009f\u00a0\3\2\2\2\u00a0\u00a4\3\2\2\2\u00a1\u00a3\7:\2\2\u00a2\u00a1"+
		"\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00bd\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\7\65\2\2\u00a8\u00aa\7"+
		":\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00b4\3\2\2\2\u00ad\u00ae\5\n\6\2\u00ae\u00b0\b\5"+
		"\1\2\u00af\u00b1\7:\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00ad\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\7\66\2\2\u00b9\u00be\3\2\2\2\u00ba\u00bb\5"+
		"\n\6\2\u00bb\u00bc\b\5\1\2\u00bc\u00be\3\2\2\2\u00bd\u00a7\3\2\2\2\u00bd"+
		"\u00ba\3\2\2\2\u00be\t\3\2\2\2\u00bf\u00d1\b\6\1\2\u00c0\u00c1\7\5\2\2"+
		"\u00c1\u00c5\b\6\1\2\u00c2\u00c3\7\6\2\2\u00c3\u00c5\b\6\1\2\u00c4\u00c0"+
		"\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00cc\3\2\2\2\u00c6\u00c7\5\"\22\2"+
		"\u00c7\u00c8\b\6\1\2\u00c8\u00cd\3\2\2\2\u00c9\u00ca\5\f\7\2\u00ca\u00cb"+
		"\b\6\1\2\u00cb\u00cd\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cd"+
		"\u00d2\3\2\2\2\u00ce\u00cf\5\6\4\2\u00cf\u00d0\b\6\1\2\u00d0\u00d2\3\2"+
		"\2\2\u00d1\u00c4\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d2\13\3\2\2\2\u00d3\u00d9"+
		"\b\7\1\2\u00d4\u00d5\5X-\2\u00d5\u00d6\b\7\1\2\u00d6\u00da\3\2\2\2\u00d7"+
		"\u00d8\7\13\2\2\u00d8\u00da\b\7\1\2\u00d9\u00d4\3\2\2\2\u00d9\u00d7\3"+
		"\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\5V,\2\u00dc\u00dd\b\7\1\2\u00dd"+
		"\u00de\5\20\t\2\u00de\u00e2\b\7\1\2\u00df\u00e1\7:\2\2\u00e0\u00df\3\2"+
		"\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\5\16\b\2\u00e6\u00e7\b"+
		"\7\1\2\u00e7\r\3\2\2\2\u00e8\u00e9\b\b\1\2\u00e9\u00eb\7\65\2\2\u00ea"+
		"\u00ec\7:\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f8\3\2\2\2\u00ef\u00f0\5\"\22\2\u00f0"+
		"\u00f2\b\b\1\2\u00f1\u00f3\7:\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6"+
		"\u00ef\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u0104\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\5\32\16\2\u00fc"+
		"\u00fe\b\b\1\2\u00fd\u00ff\7:\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102"+
		"\u00fb\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0112\7\66\2\2\u0108"+
		"\u010f\b\b\1\2\u0109\u010a\5\"\22\2\u010a\u010b\b\b\1\2\u010b\u0110\3"+
		"\2\2\2\u010c\u010d\5\32\16\2\u010d\u010e\b\b\1\2\u010e\u0110\3\2\2\2\u010f"+
		"\u0109\3\2\2\2\u010f\u010c\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u00e8\3\2"+
		"\2\2\u0111\u0108\3\2\2\2\u0112\17\3\2\2\2\u0113\u0114\b\t\1\2\u0114\u012f"+
		"\7\61\2\2\u0115\u0116\5\22\n\2\u0116\u0122\b\t\1\2\u0117\u0118\7/\2\2"+
		"\u0118\u0123\5:\36\2\u0119\u011a\7\67\2\2\u011a\u011b\5\22\n\2\u011b\u011c"+
		"\b\t\1\2\u011c\u011e\3\2\2\2\u011d\u0119\3\2\2\2\u011e\u0121\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0122\u0117\3\2\2\2\u0122\u011f\3\2\2\2\u0123\u012c\3\2\2\2\u0124"+
		"\u0125\7\67\2\2\u0125\u0126\5\22\n\2\u0126\u0127\b\t\1\2\u0127\u0128\7"+
		"/\2\2\u0128\u0129\5:\36\2\u0129\u012b\3\2\2\2\u012a\u0124\3\2\2\2\u012b"+
		"\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0130\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012f\u0115\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0132\7\62\2\2\u0132\21\3\2\2\2\u0133\u0134\5X-\2"+
		"\u0134\u0135\5V,\2\u0135\u0136\b\n\1\2\u0136\23\3\2\2\2\u0137\u0143\b"+
		"\13\1\2\u0138\u0139\5\66\34\2\u0139\u0140\b\13\1\2\u013a\u013b\7\67\2"+
		"\2\u013b\u013c\5\66\34\2\u013c\u013d\b\13\1\2\u013d\u013f\3\2\2\2\u013e"+
		"\u013a\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0138\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\25\3\2\2\2\u0145\u0146\5\30\r\2\u0146\u0147\b\f\1"+
		"\2\u0147\u0151\3\2\2\2\u0148\u014a\7:\2\2\u0149\u0148\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014e\5\32\16\2\u014e\u014f\b\f\1\2\u014f\u0151\3\2\2\2\u0150\u0145\3"+
		"\2\2\2\u0150\u0149\3\2\2\2\u0151\27\3\2\2\2\u0152\u0153\7\65\2\2\u0153"+
		"\u0155\b\r\1\2\u0154\u0156\7:\2\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0162\3\2\2\2\u0159"+
		"\u015a\5\32\16\2\u015a\u015c\b\r\1\2\u015b\u015d\7:\2\2\u015c\u015b\3"+
		"\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0161\3\2\2\2\u0160\u0159\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2"+
		"\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165"+
		"\u0166\7\66\2\2\u0166\31\3\2\2\2\u0167\u0168\5$\23\2\u0168\u0169\b\16"+
		"\1\2\u0169\u0183\3\2\2\2\u016a\u016b\5,\27\2\u016b\u016c\b\16\1\2\u016c"+
		"\u0183\3\2\2\2\u016d\u016e\5.\30\2\u016e\u016f\b\16\1\2\u016f\u0183\3"+
		"\2\2\2\u0170\u0171\5\60\31\2\u0171\u0172\b\16\1\2\u0172\u0183\3\2\2\2"+
		"\u0173\u0174\5\62\32\2\u0174\u0175\b\16\1\2\u0175\u0183\3\2\2\2\u0176"+
		"\u0177\5\64\33\2\u0177\u0178\b\16\1\2\u0178\u0183\3\2\2\2\u0179\u017a"+
		"\5\34\17\2\u017a\u017b\b\16\1\2\u017b\u0183\3\2\2\2\u017c\u017d\5\36\20"+
		"\2\u017d\u017e\b\16\1\2\u017e\u0183\3\2\2\2\u017f\u0180\5 \21\2\u0180"+
		"\u0181\b\16\1\2\u0181\u0183\3\2\2\2\u0182\u0167\3\2\2\2\u0182\u016a\3"+
		"\2\2\2\u0182\u016d\3\2\2\2\u0182\u0170\3\2\2\2\u0182\u0173\3\2\2\2\u0182"+
		"\u0176\3\2\2\2\u0182\u0179\3\2\2\2\u0182\u017c\3\2\2\2\u0182\u017f\3\2"+
		"\2\2\u0183\33\3\2\2\2\u0184\u0185\5\66\34\2\u0185\u0186\78\2\2\u0186\u0187"+
		"\7\16\2\2\u0187\u0188\7\61\2\2\u0188\u0189\5:\36\2\u0189\u018a\7\62\2"+
		"\2\u018a\u018b\b\17\1\2\u018b\35\3\2\2\2\u018c\u018d\b\20\1\2\u018d\u018e"+
		"\5\66\34\2\u018e\u018f\b\20\1\2\u018f\u0190\78\2\2\u0190\u0191\7\17\2"+
		"\2\u0191\u0192\7\61\2\2\u0192\u0193\5:\36\2\u0193\u019a\b\20\1\2\u0194"+
		"\u0195\7\67\2\2\u0195\u0196\5:\36\2\u0196\u0197\b\20\1\2\u0197\u0199\3"+
		"\2\2\2\u0198\u0194\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019e\7\62"+
		"\2\2\u019e\u019f\b\20\1\2\u019f\37\3\2\2\2\u01a0\u01a1\5\66\34\2\u01a1"+
		"\u01a2\78\2\2\u01a2\u01a3\7\f\2\2\u01a3\u01a4\7\61\2\2\u01a4\u01a5\5:"+
		"\36\2\u01a5\u01a6\7\62\2\2\u01a6\u01a7\b\21\1\2\u01a7!\3\2\2\2\u01a8\u01a9"+
		"\b\22\1\2\u01a9\u01aa\5X-\2\u01aa\u01ab\5V,\2\u01ab\u01b2\b\22\1\2\u01ac"+
		"\u01ad\7\67\2\2\u01ad\u01ae\5V,\2\u01ae\u01af\b\22\1\2\u01af\u01b1\3\2"+
		"\2\2\u01b0\u01ac\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3#\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\7\21\2\2"+
		"\u01b6\u01b7\5(\25\2\u01b7\u01b8\5\26\f\2\u01b8\u01be\b\23\1\2\u01b9\u01ba"+
		"\5&\24\2\u01ba\u01bb\b\23\1\2\u01bb\u01bd\3\2\2\2\u01bc\u01b9\3\2\2\2"+
		"\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c4"+
		"\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c2\5*\26\2\u01c2\u01c3\b\23\1\2"+
		"\u01c3\u01c5\3\2\2\2\u01c4\u01c1\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5%\3"+
		"\2\2\2\u01c6\u01c8\7:\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9"+
		"\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01c9\3\2"+
		"\2\2\u01cc\u01cd\7\23\2\2\u01cd\u01ce\5(\25\2\u01ce\u01cf\5\26\f\2\u01cf"+
		"\u01d0\b\24\1\2\u01d0\'\3\2\2\2\u01d1\u01d2\7\61\2\2\u01d2\u01d3\5\66"+
		"\34\2\u01d3\u01d4\b\25\1\2\u01d4\u01d5\7\62\2\2\u01d5\u01da\3\2\2\2\u01d6"+
		"\u01d7\5\66\34\2\u01d7\u01d8\b\25\1\2\u01d8\u01da\3\2\2\2\u01d9\u01d1"+
		"\3\2\2\2\u01d9\u01d6\3\2\2\2\u01da)\3\2\2\2\u01db\u01dd\7:\2\2\u01dc\u01db"+
		"\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01e1\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\7\22\2\2\u01e2\u01e3\5"+
		"\26\f\2\u01e3\u01e4\b\26\1\2\u01e4+\3\2\2\2\u01e5\u01e6\7\20\2\2\u01e6"+
		"\u01e7\7\61\2\2\u01e7\u01e8\5\66\34\2\u01e8\u01e9\7\62\2\2\u01e9\u01ea"+
		"\b\27\1\2\u01ea-\3\2\2\2\u01eb\u01ec\5J&\2\u01ec\u01f7\b\30\1\2\u01ed"+
		"\u01f3\78\2\2\u01ee\u01ef\7\7\2\2\u01ef\u01f4\b\30\1\2\u01f0\u01f1\5V"+
		",\2\u01f1\u01f2\b\30\1\2\u01f2\u01f4\3\2\2\2\u01f3\u01ee\3\2\2\2\u01f3"+
		"\u01f0\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01ed\3\2\2\2\u01f6\u01f9\3\2"+
		"\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9"+
		"\u01f7\3\2\2\2\u01fa\u01fb\7\61\2\2\u01fb\u01fc\5\24\13\2\u01fc\u01fd"+
		"\7\62\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\b\30\1\2\u01ff/\3\2\2\2\u0200"+
		"\u0201\7\n\2\2\u0201\u0205\b\31\1\2\u0202\u0203\5\66\34\2\u0203\u0204"+
		"\b\31\1\2\u0204\u0206\3\2\2\2\u0205\u0202\3\2\2\2\u0205\u0206\3\2\2\2"+
		"\u0206\61\3\2\2\2\u0207\u0208\5:\36\2\u0208\u0209\7/\2\2\u0209\u020a\5"+
		"\66\34\2\u020a\u020b\b\32\1\2\u020b\63\3\2\2\2\u020c\u020d\5J&\2\u020d"+
		"\u020e\b\33\1\2\u020e\u0218\3\2\2\2\u020f\u0210\7\61\2\2\u0210\u0211\5"+
		"\66\34\2\u0211\u0212\78\2\2\u0212\u0213\78\2\2\u0213\u0214\5\66\34\2\u0214"+
		"\u0215\7\62\2\2\u0215\u0216\b\33\1\2\u0216\u0218\3\2\2\2\u0217\u020c\3"+
		"\2\2\2\u0217\u020f\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\78\2\2\u021a"+
		"\u021b\7-\2\2\u021b\u021c\7.\2\2\u021c\u021d\7\36\2\2\u021d\u021e\5V,"+
		"\2\u021e\u021f\7\36\2\2\u021f\u0220\5\26\f\2\u0220\u0221\b\33\1\2\u0221"+
		"\65\3\2\2\2\u0222\u0223\58\35\2\u0223\u0228\b\34\1\2\u0224\u0225\7/\2"+
		"\2\u0225\u0226\5\66\34\2\u0226\u0227\b\34\1\2\u0227\u0229\3\2\2\2\u0228"+
		"\u0224\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u0231\3\2\2\2\u022a\u022b\78"+
		"\2\2\u022b\u022c\7\r\2\2\u022c\u022d\7\61\2\2\u022d\u022e\5:\36\2\u022e"+
		"\u022f\7\62\2\2\u022f\u0230\b\34\1\2\u0230\u0232\3\2\2\2\u0231\u022a\3"+
		"\2\2\2\u0231\u0232\3\2\2\2\u0232\67\3\2\2\2\u0233\u0234\5:\36\2\u0234"+
		"\u023b\b\35\1\2\u0235\u0236\7\"\2\2\u0236\u0237\58\35\2\u0237\u0238\7"+
		"#\2\2\u0238\u0239\58\35\2\u0239\u023a\b\35\1\2\u023a\u023c\3\2\2\2\u023b"+
		"\u0235\3\2\2\2\u023b\u023c\3\2\2\2\u023c9\3\2\2\2\u023d\u023e\5<\37\2"+
		"\u023e\u0246\b\36\1\2\u023f\u0240\7 \2\2\u0240\u0241\b\36\1\2\u0241\u0242"+
		"\5<\37\2\u0242\u0243\b\36\1\2\u0243\u0245\3\2\2\2\u0244\u023f\3\2\2\2"+
		"\u0245\u0248\3\2\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247;\3"+
		"\2\2\2\u0248\u0246\3\2\2\2\u0249\u024a\5> \2\u024a\u0252\b\37\1\2\u024b"+
		"\u024c\7\37\2\2\u024c\u024d\b\37\1\2\u024d\u024e\5> \2\u024e\u024f\b\37"+
		"\1\2\u024f\u0251\3\2\2\2\u0250\u024b\3\2\2\2\u0251\u0254\3\2\2\2\u0252"+
		"\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253=\3\2\2\2\u0254\u0252\3\2\2\2"+
		"\u0255\u0256\5@!\2\u0256\u025e\b \1\2\u0257\u0258\7\32\2\2\u0258\u0259"+
		"\b \1\2\u0259\u025a\5@!\2\u025a\u025b\b \1\2\u025b\u025d\3\2\2\2\u025c"+
		"\u0257\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2"+
		"\2\2\u025f?\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u0262\5B\"\2\u0262\u026e"+
		"\b!\1\2\u0263\u0264\7\33\2\2\u0264\u0268\b!\1\2\u0265\u0266\7\34\2\2\u0266"+
		"\u0268\b!\1\2\u0267\u0263\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u0269\3\2"+
		"\2\2\u0269\u026a\5B\"\2\u026a\u026b\b!\1\2\u026b\u026d\3\2\2\2\u026c\u0267"+
		"\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"A\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0272\5D#\2\u0272\u027e\b\"\1\2\u0273"+
		"\u0274\7\24\2\2\u0274\u0278\b\"\1\2\u0275\u0276\7\25\2\2\u0276\u0278\b"+
		"\"\1\2\u0277\u0273\3\2\2\2\u0277\u0275\3\2\2\2\u0278\u0279\3\2\2\2\u0279"+
		"\u027a\5D#\2\u027a\u027b\b\"\1\2\u027b\u027d\3\2\2\2\u027c\u0277\3\2\2"+
		"\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027fC"+
		"\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0282\5F$\2\u0282\u028e\b#\1\2\u0283"+
		"\u0284\7\26\2\2\u0284\u0288\b#\1\2\u0285\u0286\7\27\2\2\u0286\u0288\b"+
		"#\1\2\u0287\u0283\3\2\2\2\u0287\u0285\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"\u028a\5F$\2\u028a\u028b\b#\1\2\u028b\u028d\3\2\2\2\u028c\u0287\3\2\2"+
		"\2\u028d\u0290\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028fE"+
		"\3\2\2\2\u0290\u028e\3\2\2\2\u0291\u0292\7!\2\2\u0292\u0296\b$\1\2\u0293"+
		"\u0294\7\25\2\2\u0294\u0296\b$\1\2\u0295\u0291\3\2\2\2\u0295\u0293\3\2"+
		"\2\2\u0296\u0297\3\2\2\2\u0297\u0298\5F$\2\u0298\u0299\b$\1\2\u0299\u029e"+
		"\3\2\2\2\u029a\u029b\5H%\2\u029b\u029c\b$\1\2\u029c\u029e\3\2\2\2\u029d"+
		"\u0295\3\2\2\2\u029d\u029a\3\2\2\2\u029eG\3\2\2\2\u029f\u02a0\5J&\2\u02a0"+
		"\u02a7\b%\1\2\u02a1\u02a2\7\30\2\2\u02a2\u02a6\b%\1\2\u02a3\u02a4\7\31"+
		"\2\2\u02a4\u02a6\b%\1\2\u02a5\u02a1\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6"+
		"\u02a8\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8I\3\2\2\2"+
		"\u02a9\u02aa\5L\'\2\u02aa\u02bc\b&\1\2\u02ab\u02ac\7\61\2\2\u02ac\u02ad"+
		"\5\24\13\2\u02ad\u02ae\b&\1\2\u02ae\u02af\7\62\2\2\u02af\u02bb\3\2\2\2"+
		"\u02b0\u02b8\78\2\2\u02b1\u02b2\5V,\2\u02b2\u02b3\b&\1\2\u02b3\u02b9\3"+
		"\2\2\2\u02b4\u02b5\7\b\2\2\u02b5\u02b9\b&\1\2\u02b6\u02b7\7\7\2\2\u02b7"+
		"\u02b9\b&\1\2\u02b8\u02b1\3\2\2\2\u02b8\u02b4\3\2\2\2\u02b8\u02b6\3\2"+
		"\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02ab\3\2\2\2\u02ba\u02b0\3\2\2\2\u02bb"+
		"\u02be\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02ca\3\2"+
		"\2\2\u02be\u02bc\3\2\2\2\u02bf\u02c0\78\2\2\u02c0\u02c1\5V,\2\u02c1\u02c2"+
		"\b&\1\2\u02c2\u02c9\3\2\2\2\u02c3\u02c4\7\63\2\2\u02c4\u02c5\5\66\34\2"+
		"\u02c5\u02c6\b&\1\2\u02c6\u02c7\7\64\2\2\u02c7\u02c9\3\2\2\2\u02c8\u02bf"+
		"\3\2\2\2\u02c8\u02c3\3\2\2\2\u02c9\u02cc\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca"+
		"\u02cb\3\2\2\2\u02cbK\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cd\u02ce\7\t\2\2"+
		"\u02ce\u02e1\b\'\1\2\u02cf\u02d0\5T+\2\u02d0\u02d1\b\'\1\2\u02d1\u02e1"+
		"\3\2\2\2\u02d2\u02d3\5P)\2\u02d3\u02d4\b\'\1\2\u02d4\u02e1\3\2\2\2\u02d5"+
		"\u02d6\5V,\2\u02d6\u02d7\b\'\1\2\u02d7\u02e1\3\2\2\2\u02d8\u02d9\5N(\2"+
		"\u02d9\u02da\b\'\1\2\u02da\u02e1\3\2\2\2\u02db\u02dc\7\61\2\2\u02dc\u02dd"+
		"\5\66\34\2\u02dd\u02de\7\62\2\2\u02de\u02df\b\'\1\2\u02df\u02e1\3\2\2"+
		"\2\u02e0\u02cd\3\2\2\2\u02e0\u02cf\3\2\2\2\u02e0\u02d2\3\2\2\2\u02e0\u02d5"+
		"\3\2\2\2\u02e0\u02d8\3\2\2\2\u02e0\u02db\3\2\2\2\u02e1M\3\2\2\2\u02e2"+
		"\u02e3\b(\1\2\u02e3\u02e4\7,\2\2\u02e4\u02e5\78\2\2\u02e5\u02e6\7\b\2"+
		"\2\u02e6\u02f5\7\61\2\2\u02e7\u02e8\7\61\2\2\u02e8\u02e9\5:\36\2\u02e9"+
		"\u02f0\b(\1\2\u02ea\u02eb\7\67\2\2\u02eb\u02ec\5:\36\2\u02ec\u02ed\b("+
		"\1\2\u02ed\u02ef\3\2\2\2\u02ee\u02ea\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0"+
		"\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f3\3\2\2\2\u02f2\u02f0\3\2"+
		"\2\2\u02f3\u02f4\7\62\2\2\u02f4\u02f6\3\2\2\2\u02f5\u02e7\3\2\2\2\u02f5"+
		"\u02f6\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8\7\62\2\2\u02f8\u02f9\b"+
		"(\1\2\u02f9O\3\2\2\2\u02fa\u02fb\5R*\2\u02fb\u02fc\b)\1\2\u02fc\u0300"+
		"\3\2\2\2\u02fd\u02fe\7;\2\2\u02fe\u0300\b)\1\2\u02ff\u02fa\3\2\2\2\u02ff"+
		"\u02fd\3\2\2\2\u0300Q\3\2\2\2\u0301\u0302\7$\2\2\u0302\u0306\b*\1\2\u0303"+
		"\u0304\7%\2\2\u0304\u0306\b*\1\2\u0305\u0301\3\2\2\2\u0305\u0303\3\2\2"+
		"\2\u0306S\3\2\2\2\u0307\u0308\7=\2\2\u0308\u0309\b+\1\2\u0309U\3\2\2\2"+
		"\u030a\u030b\7<\2\2\u030b\u030c\b,\1\2\u030cW\3\2\2\2\u030d\u030e\7)\2"+
		"\2\u030e\u031e\b-\1\2\u030f\u0310\7*\2\2\u0310\u031e\b-\1\2\u0311\u0312"+
		"\5Z.\2\u0312\u0313\b-\1\2\u0313\u031e\3\2\2\2\u0314\u0315\5\\/\2\u0315"+
		"\u0316\b-\1\2\u0316\u031e\3\2\2\2\u0317\u0318\5^\60\2\u0318\u0319\b-\1"+
		"\2\u0319\u031e\3\2\2\2\u031a\u031b\5T+\2\u031b\u031c\b-\1\2\u031c\u031e"+
		"\3\2\2\2\u031d\u030d\3\2\2\2\u031d\u030f\3\2\2\2\u031d\u0311\3\2\2\2\u031d"+
		"\u0314\3\2\2\2\u031d\u0317\3\2\2\2\u031d\u031a\3\2\2\2\u031eY\3\2\2\2"+
		"\u031f\u0327\b.\1\2\u0320\u0321\7)\2\2\u0321\u0328\b.\1\2\u0322\u0323"+
		"\7*\2\2\u0323\u0328\b.\1\2\u0324\u0325\5T+\2\u0325\u0326\b.\1\2\u0326"+
		"\u0328\3\2\2\2\u0327\u0320\3\2\2\2\u0327\u0322\3\2\2\2\u0327\u0324\3\2"+
		"\2\2\u0328\u032e\3\2\2\2\u0329\u032a\7\63\2\2\u032a\u032b\5\66\34\2\u032b"+
		"\u032c\7\64\2\2\u032c\u032d\b.\1\2\u032d\u032f\3\2\2\2\u032e\u0329\3\2"+
		"\2\2\u032f\u0330\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331"+
		"\u0332\3\2\2\2\u0332\u0333\b.\1\2\u0333[\3\2\2\2\u0334\u0335\b/\1\2\u0335"+
		"\u0336\7+\2\2\u0336\u0343\7\34\2\2\u0337\u0344\7\13\2\2\u0338\u0339\5"+
		"X-\2\u0339\u0340\b/\1\2\u033a\u033b\7\67\2\2\u033b\u033c\5X-\2\u033c\u033d"+
		"\b/\1\2\u033d\u033f\3\2\2\2\u033e\u033a\3\2\2\2\u033f\u0342\3\2\2\2\u0340"+
		"\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0344\3\2\2\2\u0342\u0340\3\2"+
		"\2\2\u0343\u0337\3\2\2\2\u0343\u0338\3\2\2\2\u0344\u0345\3\2\2\2\u0345"+
		"\u034b\7\35\2\2\u0346\u0347\5X-\2\u0347\u0348\b/\1\2\u0348\u034c\3\2\2"+
		"\2\u0349\u034a\7\13\2\2\u034a\u034c\b/\1\2\u034b\u0346\3\2\2\2\u034b\u0349"+
		"\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\7\33\2\2\u034e\u034f\b/\1\2\u034f"+
		"]\3\2\2\2\u0350\u0351\7,\2\2\u0351\u0352\7\34\2\2\u0352\u0353\7)\2\2\u0353"+
		"\u0354\7\33\2\2\u0354\u0355\b\60\1\2\u0355_\3\2\2\2Rcku{\u0082\u0088\u0092"+
		"\u009f\u00a4\u00ab\u00b2\u00b6\u00bd\u00c4\u00cc\u00d1\u00d9\u00e2\u00ed"+
		"\u00f4\u00f8\u0100\u0104\u010f\u0111\u011f\u0122\u012c\u012f\u0140\u0143"+
		"\u014b\u0150\u0157\u015e\u0162\u0182\u019a\u01b2\u01be\u01c4\u01c9\u01d9"+
		"\u01de\u01f3\u01f7\u0205\u0217\u0228\u0231\u023b\u0246\u0252\u025e\u0267"+
		"\u026e\u0277\u027e\u0287\u028e\u0295\u029d\u02a5\u02a7\u02b8\u02ba\u02bc"+
		"\u02c8\u02ca\u02e0\u02f0\u02f5\u02ff\u0305\u031d\u0327\u0330\u0340\u0343"+
		"\u034b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}