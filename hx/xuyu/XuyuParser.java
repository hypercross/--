// Generated from Xuyu.g4 by ANTLR 4.2.2

	package hx.xuyu;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XuyuParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, K_HWEI=3, K_YI=4, K_WEI=5, K_YAN=6, K_ZHONG=7, K_RUO=8, 
		K_FZE=9, K_ZE=10, K_YHUO=11, K_MDANG=12, K_FSHI=13, K_ZHI=14, K_QIU=15, 
		K_YUE=16, K_DE=17, K_QI=18, K_DUN=19, K_JU2=20, K_YZHU=21, K_WEN=22, K_JU=23, 
		K_CHENG=24, A_ZHI=25, O_JIN=26, O_TUI=27, O_JI=28, O_FEN=29, O_JIA=30, 
		O_JIAN=31, O_CHENG=32, O_CHU=33, O_YU=34, O_DA=35, O_XIAO=36, O_DENG=37, 
		O_BDA=38, O_BXIAO=39, O_BDENG=40, O_QIE=41, O_HUO=42, O_FEI=43, O_BHAN=44, 
		O_CQU=45, O_BYU=46, INDENT=47, DEDENT=48, COMMENT=49, STRLIT=50, DENT=51, 
		WORD=52, NUM=53, CNFRAC=54, CNNUM=55, CNBOOL=56, CNCHAR=57, CNNOUN=58, 
		NEWLINE=59, WS=60;
	public static final String[] tokenNames = {
		"<INVALID>", "'（'", "'）'", "'何为'", "K_YI", "'为'", "'言'", "'众'", "K_RUO", 
		"'否则'", "'则'", "'抑或'", "'每当'", "'复始'", "'止'", "'求'", "'曰'", "'得'", "'其'", 
		"'、'", "'举'", "'于诸'", "'问'", "'聚'", "'成'", "'之'", "'进以'", "'退以'", "'积以'", 
		"'分以'", "'加以'", "'减以'", "'乘以'", "'除以'", "'余以'", "'大于'", "'小于'", "'等于'", 
		"'不大于'", "'不小于'", "'不等于'", "'且'", "'或'", "'非'", "'包含'", "'除去'", "'并于'", 
		"INDENT", "DEDENT", "COMMENT", "STRLIT", "DENT", "WORD", "NUM", "CNFRAC", 
		"CNNUM", "CNBOOL", "CNCHAR", "CNNOUN", "NEWLINE", "WS"
	};
	public static final int
		RULE_file = 0, RULE_block = 1, RULE_inline = 2, RULE_stat = 3, RULE_print = 4, 
		RULE_assign = 5, RULE_conditional = 6, RULE_whiles = 7, RULE_breaks = 8, 
		RULE_continues = 9, RULE_deffunc = 10, RULE_returnst = 11, RULE_iterate = 12, 
		RULE_input = 13, RULE_expr = 14, RULE_val = 15, RULE_var = 16;
	public static final String[] ruleNames = {
		"file", "block", "inline", "stat", "print", "assign", "conditional", "whiles", 
		"breaks", "continues", "deffunc", "returnst", "iterate", "input", "expr", 
		"val", "var"
	};

	@Override
	public String getGrammarFileName() { return "Xuyu.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



		private XuyuCompiler xuyu = new XuyuCompiler();

	public XuyuParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public Block content;
		public BlockContext block;
		public List<TerminalNode> NEWLINE() { return getTokens(XuyuParser.NEWLINE); }
		public TerminalNode EOF() { return getToken(XuyuParser.EOF, 0); }
		public TerminalNode NEWLINE(int i) {
			return getToken(XuyuParser.NEWLINE, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(34); match(NEWLINE);
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40); ((FileContext)_localctx).block = block();
			setState(41); match(EOF);
			 ((FileContext)_localctx).content =  ((FileContext)_localctx).block.b;
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

	public static class BlockContext extends ParserRuleContext {
		public Block b;
		public StatContext stat;
		public TerminalNode INDENT() { return getToken(XuyuParser.INDENT, 0); }
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public TerminalNode DEDENT() { return getToken(XuyuParser.DEDENT, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); match(INDENT);
			 ((BlockContext)_localctx).b =  xuyu.pushBlock();
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46); ((BlockContext)_localctx).stat = stat();
				 xuyu.addStat(((BlockContext)_localctx).stat.s);
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << K_YI) | (1L << K_YAN) | (1L << K_RUO) | (1L << K_MDANG) | (1L << K_FSHI) | (1L << K_ZHI) | (1L << K_DE) | (1L << K_JU2) | (1L << K_WEN) | (1L << K_JU) | (1L << O_FEI) | (1L << CNFRAC) | (1L << CNNUM) | (1L << CNBOOL) | (1L << CNCHAR) | (1L << CNNOUN))) != 0) );
			setState(53); match(DEDENT);
			 ((BlockContext)_localctx).b =  xuyu.popBlock(); 
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

	public static class InlineContext extends ParserRuleContext {
		public Block b;
		public StatContext stat;
		public BlockContext block;
		public List<TerminalNode> NEWLINE() { return getTokens(XuyuParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(XuyuParser.NEWLINE, i);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).enterInline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).exitInline(this);
		}
	}

	public final InlineContext inline() throws RecognitionException {
		InlineContext _localctx = new InlineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inline);
		int _la;
		try {
			setState(67);
			switch (_input.LA(1)) {
			case 1:
			case K_YI:
			case K_YAN:
			case K_RUO:
			case K_MDANG:
			case K_FSHI:
			case K_ZHI:
			case K_DE:
			case K_JU2:
			case K_WEN:
			case K_JU:
			case O_FEI:
			case CNFRAC:
			case CNNUM:
			case CNBOOL:
			case CNCHAR:
			case CNNOUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(56); ((InlineContext)_localctx).stat = stat();
				 ((InlineContext)_localctx).b =  xuyu.pushBlock(); xuyu.addStat( ((InlineContext)_localctx).stat.s); xuyu.popBlock();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(59); match(NEWLINE);
					}
					}
					setState(62); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(64); ((InlineContext)_localctx).block = block();
				 ((InlineContext)_localctx).b =  ((InlineContext)_localctx).block.b;
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

	public static class StatContext extends ParserRuleContext {
		public Stat s;
		public ExprContext expr;
		public PrintContext print;
		public AssignContext assign;
		public ConditionalContext conditional;
		public WhilesContext whiles;
		public BreaksContext breaks;
		public ContinuesContext continues;
		public DeffuncContext deffunc;
		public ReturnstContext returnst;
		public IterateContext iterate;
		public ContinuesContext continues() {
			return getRuleContext(ContinuesContext.class,0);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(XuyuParser.NEWLINE, i);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public WhilesContext whiles() {
			return getRuleContext(WhilesContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public DeffuncContext deffunc() {
			return getRuleContext(DeffuncContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(XuyuParser.NEWLINE); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BreaksContext breaks() {
			return getRuleContext(BreaksContext.class,0);
		}
		public ReturnstContext returnst() {
			return getRuleContext(ReturnstContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public IterateContext iterate() {
			return getRuleContext(IterateContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(69); ((StatContext)_localctx).expr = expr(0);
				 ((StatContext)_localctx).s =  new Stat.EXP( ((StatContext)_localctx).expr.v); 
				}
				break;

			case 2:
				{
				setState(72); ((StatContext)_localctx).print = print();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).print.s; 
				}
				break;

			case 3:
				{
				setState(75); ((StatContext)_localctx).assign = assign();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).assign.s; 
				}
				break;

			case 4:
				{
				setState(78); ((StatContext)_localctx).conditional = conditional();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).conditional.s; 
				}
				break;

			case 5:
				{
				setState(81); ((StatContext)_localctx).whiles = whiles();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).whiles.s; 
				}
				break;

			case 6:
				{
				setState(84); ((StatContext)_localctx).breaks = breaks();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).breaks.s; 
				}
				break;

			case 7:
				{
				setState(87); ((StatContext)_localctx).continues = continues();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).continues.s; 
				}
				break;

			case 8:
				{
				setState(90); ((StatContext)_localctx).deffunc = deffunc();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).deffunc.s; 
				}
				break;

			case 9:
				{
				setState(93); ((StatContext)_localctx).returnst = returnst();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).returnst.s; 
				}
				break;

			case 10:
				{
				setState(96); ((StatContext)_localctx).iterate = iterate();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).iterate.s; 
				}
				break;

			case 11:
				{
				setState(99); input();
				}
				break;
			}
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102); match(NEWLINE);
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class PrintContext extends ParserRuleContext {
		public Stat s;
		public Token STRLIT;
		public ExprContext expr;
		public TerminalNode STRLIT() { return getToken(XuyuParser.STRLIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_YAN() { return getToken(XuyuParser.K_YAN, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); match(K_YAN);
			setState(114);
			switch (_input.LA(1)) {
			case STRLIT:
				{
				setState(109); ((PrintContext)_localctx).STRLIT = match(STRLIT);
				 ((PrintContext)_localctx).s =  new Stat.PRINT((((PrintContext)_localctx).STRLIT!=null?((PrintContext)_localctx).STRLIT.getText():null));
				}
				break;
			case 1:
			case K_YI:
			case O_FEI:
			case CNFRAC:
			case CNNUM:
			case CNBOOL:
			case CNCHAR:
			case CNNOUN:
				{
				setState(111); ((PrintContext)_localctx).expr = expr(0);
				 ((PrintContext)_localctx).s =  new Stat.PRINT(((PrintContext)_localctx).expr.v);
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

	public static class AssignContext extends ParserRuleContext {
		public Stat s;
		public ExprContext expr;
		public VarContext var;
		public TerminalNode K_CHENG() { return getToken(XuyuParser.K_CHENG, 0); }
		public TerminalNode K_WEI() { return getToken(XuyuParser.K_WEI, 0); }
		public TerminalNode K_JU() { return getToken(XuyuParser.K_JU, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode O_FEN() { return getToken(XuyuParser.O_FEN, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> K_DUN() { return getTokens(XuyuParser.K_DUN); }
		public TerminalNode O_TUI() { return getToken(XuyuParser.O_TUI, 0); }
		public TerminalNode K_YI() { return getToken(XuyuParser.K_YI, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode K_DUN(int i) {
			return getToken(XuyuParser.K_DUN, i);
		}
		public TerminalNode O_JI() { return getToken(XuyuParser.O_JI, 0); }
		public TerminalNode O_JIN() { return getToken(XuyuParser.O_JIN, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign);
		int _la;
		try {
			setState(163);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(116); match(K_YI);
					}
					break;
				}
				setState(119); ((AssignContext)_localctx).expr = expr(0);
				setState(120); match(K_WEI);
				setState(121); ((AssignContext)_localctx).var = var();
				 ((AssignContext)_localctx).s =  new Stat.ASSIGN( (((AssignContext)_localctx).var!=null?_input.getText(((AssignContext)_localctx).var.start,((AssignContext)_localctx).var.stop):null), ((AssignContext)_localctx).expr.v);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124); ((AssignContext)_localctx).var = var();
				setState(125); match(O_JIN);
				setState(126); ((AssignContext)_localctx).expr = expr(0);
				 ((AssignContext)_localctx).s =  Stat.ASSIGN.Inplace((((AssignContext)_localctx).var!=null?_input.getText(((AssignContext)_localctx).var.start,((AssignContext)_localctx).var.stop):null), ((AssignContext)_localctx).expr.v, xuyu.currentBlock(), Exp.Eval.ADD);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129); ((AssignContext)_localctx).var = var();
				setState(130); match(O_TUI);
				setState(131); ((AssignContext)_localctx).expr = expr(0);
				 ((AssignContext)_localctx).s =  Stat.ASSIGN.Inplace((((AssignContext)_localctx).var!=null?_input.getText(((AssignContext)_localctx).var.start,((AssignContext)_localctx).var.stop):null), ((AssignContext)_localctx).expr.v, xuyu.currentBlock(), Exp.Eval.SUB);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134); ((AssignContext)_localctx).var = var();
				setState(135); match(O_JI);
				setState(136); ((AssignContext)_localctx).expr = expr(0);
				 ((AssignContext)_localctx).s =  Stat.ASSIGN.Inplace((((AssignContext)_localctx).var!=null?_input.getText(((AssignContext)_localctx).var.start,((AssignContext)_localctx).var.stop):null), ((AssignContext)_localctx).expr.v, xuyu.currentBlock(), Exp.Eval.MUL);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139); ((AssignContext)_localctx).var = var();
				setState(140); match(O_FEN);
				setState(141); ((AssignContext)_localctx).expr = expr(0);
				 ((AssignContext)_localctx).s =  Stat.ASSIGN.Inplace((((AssignContext)_localctx).var!=null?_input.getText(((AssignContext)_localctx).var.start,((AssignContext)_localctx).var.stop):null), ((AssignContext)_localctx).expr.v, xuyu.currentBlock(), Exp.Eval.DIV);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(144); match(K_JU);
				 xuyu.pushVals(); 
				setState(157);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << K_YI) | (1L << O_FEI) | (1L << CNFRAC) | (1L << CNNUM) | (1L << CNBOOL) | (1L << CNCHAR) | (1L << CNNOUN))) != 0)) {
					{
					setState(146); ((AssignContext)_localctx).expr = expr(0);
					 xuyu.putVal(((AssignContext)_localctx).expr.v);
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==K_DUN) {
						{
						{
						setState(148); match(K_DUN);
						setState(149); ((AssignContext)_localctx).expr = expr(0);
						 xuyu.putVal(((AssignContext)_localctx).expr.v);
						}
						}
						setState(156);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(159); match(K_CHENG);
				setState(160); ((AssignContext)_localctx).var = var();
				 ((AssignContext)_localctx).s =  new Stat.ASSIGN( (((AssignContext)_localctx).var!=null?_input.getText(((AssignContext)_localctx).var.start,((AssignContext)_localctx).var.stop):null), new Exp.Lst(xuyu.popVals()));
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

	public static class ConditionalContext extends ParserRuleContext {
		public Stat.IF s;
		public ExprContext expr;
		public InlineContext inline;
		public List<TerminalNode> NEWLINE() { return getTokens(XuyuParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(XuyuParser.NEWLINE, i);
		}
		public List<TerminalNode> K_ZE() { return getTokens(XuyuParser.K_ZE); }
		public TerminalNode K_YHUO(int i) {
			return getToken(XuyuParser.K_YHUO, i);
		}
		public InlineContext inline(int i) {
			return getRuleContext(InlineContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_FZE() { return getToken(XuyuParser.K_FZE, 0); }
		public TerminalNode K_ZE(int i) {
			return getToken(XuyuParser.K_ZE, i);
		}
		public List<TerminalNode> K_YHUO() { return getTokens(XuyuParser.K_YHUO); }
		public List<InlineContext> inline() {
			return getRuleContexts(InlineContext.class);
		}
		public TerminalNode K_RUO() { return getToken(XuyuParser.K_RUO, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).exitConditional(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditional);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165); match(K_RUO);
			setState(166); ((ConditionalContext)_localctx).expr = expr(0);
			setState(167); match(K_ZE);
			setState(168); ((ConditionalContext)_localctx).inline = inline();
			 ((ConditionalContext)_localctx).s =  new Stat.IF (((ConditionalContext)_localctx).expr.v, ((ConditionalContext)_localctx).inline.b); Stat.IF head = _localctx.s; 
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(170); match(NEWLINE);
						}
						}
						setState(175);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(176); match(K_YHUO);
					setState(177); ((ConditionalContext)_localctx).expr = expr(0);
					setState(178); match(K_ZE);
					setState(179); ((ConditionalContext)_localctx).inline = inline();
					 Stat.IF nh = new Stat.IF (((ConditionalContext)_localctx).expr.v, ((ConditionalContext)_localctx).inline.b); head.setElif(nh); head = nh;
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(197);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(187); match(NEWLINE);
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(193); match(K_FZE);
				setState(194); ((ConditionalContext)_localctx).inline = inline();
				 head.setElif( new Stat.IF(((ConditionalContext)_localctx).inline.b));
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

	public static class WhilesContext extends ParserRuleContext {
		public Stat s;
		public ExprContext expr;
		public InlineContext inline;
		public TerminalNode K_ZE() { return getToken(XuyuParser.K_ZE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InlineContext inline() {
			return getRuleContext(InlineContext.class,0);
		}
		public TerminalNode K_MDANG() { return getToken(XuyuParser.K_MDANG, 0); }
		public WhilesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whiles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).enterWhiles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).exitWhiles(this);
		}
	}

	public final WhilesContext whiles() throws RecognitionException {
		WhilesContext _localctx = new WhilesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whiles);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); match(K_MDANG);
			setState(200); ((WhilesContext)_localctx).expr = expr(0);
			setState(201); match(K_ZE);
			setState(202); ((WhilesContext)_localctx).inline = inline();
			 ((WhilesContext)_localctx).s =  new Stat.WHILE ( ((WhilesContext)_localctx).expr.v, ((WhilesContext)_localctx).inline.b); 
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

	public static class BreaksContext extends ParserRuleContext {
		public Stat s;
		public TerminalNode K_ZHI() { return getToken(XuyuParser.K_ZHI, 0); }
		public BreaksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breaks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).enterBreaks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).exitBreaks(this);
		}
	}

	public final BreaksContext breaks() throws RecognitionException {
		BreaksContext _localctx = new BreaksContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_breaks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); match(K_ZHI);
			 ((BreaksContext)_localctx).s =  new Stat.BREAK();
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

	public static class ContinuesContext extends ParserRuleContext {
		public Stat s;
		public TerminalNode K_FSHI() { return getToken(XuyuParser.K_FSHI, 0); }
		public ContinuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).enterContinues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).exitContinues(this);
		}
	}

	public final ContinuesContext continues() throws RecognitionException {
		ContinuesContext _localctx = new ContinuesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_continues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); match(K_FSHI);
			 ((ContinuesContext)_localctx).s =  new Stat.CONTINUE();
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

	public static class DeffuncContext extends ParserRuleContext {
		public Stat s;
		public VarContext param;
		public VarContext func;
		public InlineContext inline;
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode K_DE() { return getToken(XuyuParser.K_DE, 0); }
		public TerminalNode K_YUE() { return getToken(XuyuParser.K_YUE, 0); }
		public List<TerminalNode> K_DUN() { return getTokens(XuyuParser.K_DUN); }
		public InlineContext inline() {
			return getRuleContext(InlineContext.class,0);
		}
		public TerminalNode K_YI() { return getToken(XuyuParser.K_YI, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public TerminalNode K_DUN(int i) {
			return getToken(XuyuParser.K_DUN, i);
		}
		public DeffuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deffunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).enterDeffunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).exitDeffunc(this);
		}
	}

	public final DeffuncContext deffunc() throws RecognitionException {
		DeffuncContext _localctx = new DeffuncContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_deffunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); match(K_YI);
			setState(223);
			_la = _input.LA(1);
			if (_la==CNCHAR || _la==CNNOUN) {
				{
				setState(212); ((DeffuncContext)_localctx).param = var();
				 xuyu.putId((((DeffuncContext)_localctx).param!=null?_input.getText(((DeffuncContext)_localctx).param.start,((DeffuncContext)_localctx).param.stop):null));
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_DUN) {
					{
					{
					setState(214); match(K_DUN);
					setState(215); ((DeffuncContext)_localctx).param = var();
					 xuyu.putId((((DeffuncContext)_localctx).param!=null?_input.getText(((DeffuncContext)_localctx).param.start,((DeffuncContext)_localctx).param.stop):null));
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(225); match(K_DE);
			setState(226); ((DeffuncContext)_localctx).func = var();
			setState(227); match(K_YUE);
			setState(228); ((DeffuncContext)_localctx).inline = inline();
			 ((DeffuncContext)_localctx).s =  new Stat.ASSIGN( (((DeffuncContext)_localctx).func!=null?_input.getText(((DeffuncContext)_localctx).func.start,((DeffuncContext)_localctx).func.stop):null), new Exp.Func(((DeffuncContext)_localctx).inline.b, xuyu.getIds()));
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

	public static class ReturnstContext extends ParserRuleContext {
		public Stat s;
		public ExprContext expr;
		public TerminalNode K_DE() { return getToken(XuyuParser.K_DE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).enterReturnst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).exitReturnst(this);
		}
	}

	public final ReturnstContext returnst() throws RecognitionException {
		ReturnstContext _localctx = new ReturnstContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_returnst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231); match(K_DE);
			setState(232); ((ReturnstContext)_localctx).expr = expr(0);
			 ((ReturnstContext)_localctx).s =  new Stat.RETURN( ((ReturnstContext)_localctx).expr.v); 
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

	public static class IterateContext extends ParserRuleContext {
		public Stat s;
		public VarContext var;
		public ExprContext expr;
		public BlockContext block;
		public List<TerminalNode> NEWLINE() { return getTokens(XuyuParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(XuyuParser.NEWLINE, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_YZHU() { return getToken(XuyuParser.K_YZHU, 0); }
		public TerminalNode K_JU2() { return getToken(XuyuParser.K_JU2, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public IterateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).enterIterate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).exitIterate(this);
		}
	}

	public final IterateContext iterate() throws RecognitionException {
		IterateContext _localctx = new IterateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_iterate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); match(K_JU2);
			setState(236); ((IterateContext)_localctx).var = var();
			setState(237); match(K_YZHU);
			setState(238); ((IterateContext)_localctx).expr = expr(0);
			setState(240); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(239); match(NEWLINE);
				}
				}
				setState(242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(244); ((IterateContext)_localctx).block = block();
			 ((IterateContext)_localctx).s =  new Stat.ITERATE((((IterateContext)_localctx).var!=null?_input.getText(((IterateContext)_localctx).var.start,((IterateContext)_localctx).var.stop):null), ((IterateContext)_localctx).expr.v , ((IterateContext)_localctx).block.b ); 
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode K_HWEI() { return getToken(XuyuParser.K_HWEI, 0); }
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode K_WEN() { return getToken(XuyuParser.K_WEN, 0); }
		public List<TerminalNode> K_DUN() { return getTokens(XuyuParser.K_DUN); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public TerminalNode K_DUN(int i) {
			return getToken(XuyuParser.K_DUN, i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247); match(K_WEN);
			setState(248); var();
			setState(249); match(K_HWEI);
			setState(250); var();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_DUN) {
				{
				{
				setState(251); match(K_DUN);
				setState(252); var();
				}
				}
				setState(257);
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

	public static class ExprContext extends ParserRuleContext {
		public Exp.Value v;
		public ExprContext a;
		public ValContext val;
		public ExprContext b;
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode O_DA() { return getToken(XuyuParser.O_DA, 0); }
		public TerminalNode O_CHENG() { return getToken(XuyuParser.O_CHENG, 0); }
		public TerminalNode O_BXIAO() { return getToken(XuyuParser.O_BXIAO, 0); }
		public TerminalNode O_JIAN() { return getToken(XuyuParser.O_JIAN, 0); }
		public TerminalNode O_CQU() { return getToken(XuyuParser.O_CQU, 0); }
		public TerminalNode O_BDENG() { return getToken(XuyuParser.O_BDENG, 0); }
		public TerminalNode O_CHU() { return getToken(XuyuParser.O_CHU, 0); }
		public TerminalNode O_HUO() { return getToken(XuyuParser.O_HUO, 0); }
		public TerminalNode O_YU() { return getToken(XuyuParser.O_YU, 0); }
		public TerminalNode O_BHAN() { return getToken(XuyuParser.O_BHAN, 0); }
		public TerminalNode O_QIE() { return getToken(XuyuParser.O_QIE, 0); }
		public TerminalNode O_DENG() { return getToken(XuyuParser.O_DENG, 0); }
		public TerminalNode O_BDA() { return getToken(XuyuParser.O_BDA, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode O_JIA() { return getToken(XuyuParser.O_JIA, 0); }
		public TerminalNode O_XIAO() { return getToken(XuyuParser.O_XIAO, 0); }
		public TerminalNode O_FEI() { return getToken(XuyuParser.O_FEI, 0); }
		public TerminalNode O_BYU() { return getToken(XuyuParser.O_BYU, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			switch (_input.LA(1)) {
			case O_FEI:
				{
				setState(259); match(O_FEI);
				setState(260); ((ExprContext)_localctx).a = expr(5);
				 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,null, Exp.Eval.NOT);
				}
				break;
			case 1:
				{
				setState(263); match(1);
				setState(264); ((ExprContext)_localctx).a = expr(0);
				setState(265); match(2);
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).a.v; 
				}
				break;
			case K_YI:
			case CNFRAC:
			case CNNUM:
			case CNBOOL:
			case CNCHAR:
			case CNNOUN:
				{
				setState(268); ((ExprContext)_localctx).val = val(0);
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).val.v;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(347);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(273);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(274); match(O_CHENG);
						setState(275); ((ExprContext)_localctx).b = expr(19);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.MUL);
						}
						break;

					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(278);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(279); match(O_CHU);
						setState(280); ((ExprContext)_localctx).b = expr(18);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.DIV);
						}
						break;

					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(283);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(284); match(O_YU);
						setState(285); ((ExprContext)_localctx).b = expr(17);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.RMD);
						}
						break;

					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(288);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(289); match(O_JIA);
						setState(290); ((ExprContext)_localctx).b = expr(16);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.ADD);
						}
						break;

					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(293);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(294); match(O_JIAN);
						setState(295); ((ExprContext)_localctx).b = expr(15);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.SUB);
						}
						break;

					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(298);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(299); match(O_DA);
						setState(300); ((ExprContext)_localctx).b = expr(14);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.GT);
						}
						break;

					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(303);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(304); match(O_XIAO);
						setState(305); ((ExprContext)_localctx).b = expr(13);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.LT);
						}
						break;

					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(308);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(309); match(O_DENG);
						setState(310); ((ExprContext)_localctx).b = expr(12);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.EQ);
						}
						break;

					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(313);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(314); match(O_BDA);
						setState(315); ((ExprContext)_localctx).b = expr(11);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.NGT);
						}
						break;

					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(318);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(319); match(O_BXIAO);
						setState(320); ((ExprContext)_localctx).b = expr(10);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.NLT);
						}
						break;

					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(323);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(324); match(O_BDENG);
						setState(325); ((ExprContext)_localctx).b = expr(9);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.NEQ);
						}
						break;

					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(328);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(329); match(O_QIE);
						setState(330); ((ExprContext)_localctx).b = expr(8);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.AND);
						}
						break;

					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(333);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(334); match(O_HUO);
						setState(335); ((ExprContext)_localctx).b = expr(7);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.OR);
						}
						break;

					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(338);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(339); match(O_BHAN);
						setState(340); expr(5);
						}
						break;

					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(341);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(342); match(O_CQU);
						setState(343); expr(4);
						}
						break;

					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(344);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(345); match(O_BYU);
						setState(346); expr(3);
						}
						break;
					}
					} 
				}
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class ValContext extends ParserRuleContext {
		public Exp.Value v;
		public ValContext a;
		public Token CNNUM;
		public Token CNBOOL;
		public VarContext var;
		public ExprContext param;
		public VarContext func;
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode K_QI() { return getToken(XuyuParser.K_QI, 0); }
		public TerminalNode CNFRAC() { return getToken(XuyuParser.CNFRAC, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CNBOOL() { return getToken(XuyuParser.CNBOOL, 0); }
		public TerminalNode CNNUM() { return getToken(XuyuParser.CNNUM, 0); }
		public List<TerminalNode> K_DUN() { return getTokens(XuyuParser.K_DUN); }
		public TerminalNode K_QIU() { return getToken(XuyuParser.K_QIU, 0); }
		public TerminalNode K_YI() { return getToken(XuyuParser.K_YI, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode K_DUN(int i) {
			return getToken(XuyuParser.K_DUN, i);
		}
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).exitVal(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		return val(0);
	}

	private ValContext val(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValContext _localctx = new ValContext(_ctx, _parentState);
		ValContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_val, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			switch (_input.LA(1)) {
			case CNNUM:
				{
				setState(353); ((ValContext)_localctx).CNNUM = match(CNNUM);
				 ((ValContext)_localctx).v =  new Exp.Num(ParserUtil.parseInt((((ValContext)_localctx).CNNUM!=null?((ValContext)_localctx).CNNUM.getText():null)));
				}
				break;
			case CNFRAC:
				{
				setState(355); match(CNFRAC);
				}
				break;
			case CNBOOL:
				{
				setState(356); ((ValContext)_localctx).CNBOOL = match(CNBOOL);
				 ((ValContext)_localctx).v =  new Exp.Num( "阳".equals((((ValContext)_localctx).CNBOOL!=null?((ValContext)_localctx).CNBOOL.getText():null)) ? 1 : 0); 
				}
				break;
			case CNCHAR:
			case CNNOUN:
				{
				setState(358); ((ValContext)_localctx).var = var();
				 ((ValContext)_localctx).v =  new Exp.Var((((ValContext)_localctx).var!=null?_input.getText(((ValContext)_localctx).var.start,((ValContext)_localctx).var.stop):null), xuyu.currentBlock());
				}
				break;
			case K_YI:
				{
				setState(361); match(K_YI);
				 xuyu.pushVals(); 
				setState(374);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << K_YI) | (1L << O_FEI) | (1L << CNFRAC) | (1L << CNNUM) | (1L << CNBOOL) | (1L << CNCHAR) | (1L << CNNOUN))) != 0)) {
					{
					setState(363); ((ValContext)_localctx).param = expr(0);
					 xuyu.putVal(((ValContext)_localctx).param.v);
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==K_DUN) {
						{
						{
						setState(365); match(K_DUN);
						setState(366); ((ValContext)_localctx).param = expr(0);
						 xuyu.putVal(((ValContext)_localctx).param.v);
						}
						}
						setState(373);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(376); match(K_QIU);
				setState(377); ((ValContext)_localctx).func = ((ValContext)_localctx).var = var();
				 ((ValContext)_localctx).v =  new Exp.Call(new Exp.Var((((ValContext)_localctx).func!=null?_input.getText(((ValContext)_localctx).func.start,((ValContext)_localctx).func.stop):null), xuyu.currentBlock()), xuyu.popVals());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ValContext(_parentctx, _parentState);
					_localctx.a = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_val);
					setState(382);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(383); match(K_QI);
					setState(384); ((ValContext)_localctx).CNNUM = match(CNNUM);
					 ((ValContext)_localctx).v =  new Exp.Prop( ((ValContext)_localctx).a.v, ParserUtil.parseInt((((ValContext)_localctx).CNNUM!=null?((ValContext)_localctx).CNNUM.getText():null)) - 1); 
					}
					} 
				}
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode CNNOUN() { return getToken(XuyuParser.CNNOUN, 0); }
		public TerminalNode CNCHAR(int i) {
			return getToken(XuyuParser.CNCHAR, i);
		}
		public List<TerminalNode> CNCHAR() { return getTokens(XuyuParser.CNCHAR); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_var);
		try {
			int _alt;
			setState(397);
			switch (_input.LA(1)) {
			case CNCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(392); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(391); match(CNCHAR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(394); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
				}
				break;
			case CNNOUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(396); match(CNNOUN);
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
		case 14: return expr_sempred((ExprContext)_localctx, predIndex);

		case 15: return val_sempred((ValContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean val_sempred(ValContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 18);

		case 1: return precpred(_ctx, 17);

		case 2: return precpred(_ctx, 16);

		case 3: return precpred(_ctx, 15);

		case 4: return precpred(_ctx, 14);

		case 5: return precpred(_ctx, 13);

		case 6: return precpred(_ctx, 12);

		case 7: return precpred(_ctx, 11);

		case 8: return precpred(_ctx, 10);

		case 9: return precpred(_ctx, 9);

		case 10: return precpred(_ctx, 8);

		case 11: return precpred(_ctx, 7);

		case 12: return precpred(_ctx, 6);

		case 13: return precpred(_ctx, 4);

		case 14: return precpred(_ctx, 3);

		case 15: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3>\u0192\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\6\3\64"+
		"\n\3\r\3\16\3\65\3\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4?\n\4\r\4\16\4@\3\4\3"+
		"\4\3\4\5\4F\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5g\n\5\3\5\7\5j\n\5\f\5\16\5m\13\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6u\n\6"+
		"\3\7\5\7x\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\7\7\u009b\n\7\f\7\16\7\u009e\13\7\5\7\u00a0\n\7\3\7\3\7\3\7\3\7"+
		"\5\7\u00a6\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00ae\n\b\f\b\16\b\u00b1\13"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00b9\n\b\f\b\16\b\u00bc\13\b\3\b\7\b\u00bf"+
		"\n\b\f\b\16\b\u00c2\13\b\3\b\3\b\3\b\3\b\5\b\u00c8\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00dd"+
		"\n\f\f\f\16\f\u00e0\13\f\5\f\u00e2\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\6\16\u00f3\n\16\r\16\16\16\u00f4\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0100\n\17\f\17\16\17\u0103"+
		"\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0112\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u015e\n\20\f\20\16\20\u0161\13"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\7\21\u0174\n\21\f\21\16\21\u0177\13\21\5\21\u0179\n"+
		"\21\3\21\3\21\3\21\3\21\5\21\u017f\n\21\3\21\3\21\3\21\3\21\7\21\u0185"+
		"\n\21\f\21\16\21\u0188\13\21\3\22\6\22\u018b\n\22\r\22\16\22\u018c\3\22"+
		"\5\22\u0190\n\22\3\22\2\4\36 \23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"\2\2\u01bb\2\'\3\2\2\2\4.\3\2\2\2\6E\3\2\2\2\bf\3\2\2\2\nn\3\2\2\2"+
		"\f\u00a5\3\2\2\2\16\u00a7\3\2\2\2\20\u00c9\3\2\2\2\22\u00cf\3\2\2\2\24"+
		"\u00d2\3\2\2\2\26\u00d5\3\2\2\2\30\u00e9\3\2\2\2\32\u00ed\3\2\2\2\34\u00f9"+
		"\3\2\2\2\36\u0111\3\2\2\2 \u017e\3\2\2\2\"\u018f\3\2\2\2$&\7=\2\2%$\3"+
		"\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\5\4\3\2"+
		"+,\7\2\2\3,-\b\2\1\2-\3\3\2\2\2./\7\61\2\2/\63\b\3\1\2\60\61\5\b\5\2\61"+
		"\62\b\3\1\2\62\64\3\2\2\2\63\60\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65"+
		"\66\3\2\2\2\66\67\3\2\2\2\678\7\62\2\289\b\3\1\29\5\3\2\2\2:;\5\b\5\2"+
		";<\b\4\1\2<F\3\2\2\2=?\7=\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2"+
		"AB\3\2\2\2BC\5\4\3\2CD\b\4\1\2DF\3\2\2\2E:\3\2\2\2E>\3\2\2\2F\7\3\2\2"+
		"\2GH\5\36\20\2HI\b\5\1\2Ig\3\2\2\2JK\5\n\6\2KL\b\5\1\2Lg\3\2\2\2MN\5\f"+
		"\7\2NO\b\5\1\2Og\3\2\2\2PQ\5\16\b\2QR\b\5\1\2Rg\3\2\2\2ST\5\20\t\2TU\b"+
		"\5\1\2Ug\3\2\2\2VW\5\22\n\2WX\b\5\1\2Xg\3\2\2\2YZ\5\24\13\2Z[\b\5\1\2"+
		"[g\3\2\2\2\\]\5\26\f\2]^\b\5\1\2^g\3\2\2\2_`\5\30\r\2`a\b\5\1\2ag\3\2"+
		"\2\2bc\5\32\16\2cd\b\5\1\2dg\3\2\2\2eg\5\34\17\2fG\3\2\2\2fJ\3\2\2\2f"+
		"M\3\2\2\2fP\3\2\2\2fS\3\2\2\2fV\3\2\2\2fY\3\2\2\2f\\\3\2\2\2f_\3\2\2\2"+
		"fb\3\2\2\2fe\3\2\2\2gk\3\2\2\2hj\7=\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2"+
		"kl\3\2\2\2l\t\3\2\2\2mk\3\2\2\2nt\7\b\2\2op\7\64\2\2pu\b\6\1\2qr\5\36"+
		"\20\2rs\b\6\1\2su\3\2\2\2to\3\2\2\2tq\3\2\2\2u\13\3\2\2\2vx\7\6\2\2wv"+
		"\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\5\36\20\2z{\7\7\2\2{|\5\"\22\2|}\b\7\1"+
		"\2}\u00a6\3\2\2\2~\177\5\"\22\2\177\u0080\7\34\2\2\u0080\u0081\5\36\20"+
		"\2\u0081\u0082\b\7\1\2\u0082\u00a6\3\2\2\2\u0083\u0084\5\"\22\2\u0084"+
		"\u0085\7\35\2\2\u0085\u0086\5\36\20\2\u0086\u0087\b\7\1\2\u0087\u00a6"+
		"\3\2\2\2\u0088\u0089\5\"\22\2\u0089\u008a\7\36\2\2\u008a\u008b\5\36\20"+
		"\2\u008b\u008c\b\7\1\2\u008c\u00a6\3\2\2\2\u008d\u008e\5\"\22\2\u008e"+
		"\u008f\7\37\2\2\u008f\u0090\5\36\20\2\u0090\u0091\b\7\1\2\u0091\u00a6"+
		"\3\2\2\2\u0092\u0093\7\31\2\2\u0093\u009f\b\7\1\2\u0094\u0095\5\36\20"+
		"\2\u0095\u009c\b\7\1\2\u0096\u0097\7\25\2\2\u0097\u0098\5\36\20\2\u0098"+
		"\u0099\b\7\1\2\u0099\u009b\3\2\2\2\u009a\u0096\3\2\2\2\u009b\u009e\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\u0094\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a2\7\32\2\2\u00a2\u00a3\5\"\22\2\u00a3\u00a4\b\7\1\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5w\3\2\2\2\u00a5~\3\2\2\2\u00a5\u0083\3\2\2\2\u00a5"+
		"\u0088\3\2\2\2\u00a5\u008d\3\2\2\2\u00a5\u0092\3\2\2\2\u00a6\r\3\2\2\2"+
		"\u00a7\u00a8\7\n\2\2\u00a8\u00a9\5\36\20\2\u00a9\u00aa\7\f\2\2\u00aa\u00ab"+
		"\5\6\4\2\u00ab\u00ba\b\b\1\2\u00ac\u00ae\7=\2\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\r\2\2\u00b3\u00b4\5\36\20\2\u00b4"+
		"\u00b5\7\f\2\2\u00b5\u00b6\5\6\4\2\u00b6\u00b7\b\b\1\2\u00b7\u00b9\3\2"+
		"\2\2\u00b8\u00af\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00c7\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00bf\7="+
		"\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\13"+
		"\2\2\u00c4\u00c5\5\6\4\2\u00c5\u00c6\b\b\1\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00c0\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\17\3\2\2\2\u00c9\u00ca\7\16\2"+
		"\2\u00ca\u00cb\5\36\20\2\u00cb\u00cc\7\f\2\2\u00cc\u00cd\5\6\4\2\u00cd"+
		"\u00ce\b\t\1\2\u00ce\21\3\2\2\2\u00cf\u00d0\7\20\2\2\u00d0\u00d1\b\n\1"+
		"\2\u00d1\23\3\2\2\2\u00d2\u00d3\7\17\2\2\u00d3\u00d4\b\13\1\2\u00d4\25"+
		"\3\2\2\2\u00d5\u00e1\7\6\2\2\u00d6\u00d7\5\"\22\2\u00d7\u00de\b\f\1\2"+
		"\u00d8\u00d9\7\25\2\2\u00d9\u00da\5\"\22\2\u00da\u00db\b\f\1\2\u00db\u00dd"+
		"\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00d6\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\7\23\2\2\u00e4"+
		"\u00e5\5\"\22\2\u00e5\u00e6\7\22\2\2\u00e6\u00e7\5\6\4\2\u00e7\u00e8\b"+
		"\f\1\2\u00e8\27\3\2\2\2\u00e9\u00ea\7\23\2\2\u00ea\u00eb\5\36\20\2\u00eb"+
		"\u00ec\b\r\1\2\u00ec\31\3\2\2\2\u00ed\u00ee\7\26\2\2\u00ee\u00ef\5\"\22"+
		"\2\u00ef\u00f0\7\27\2\2\u00f0\u00f2\5\36\20\2\u00f1\u00f3\7=\2\2\u00f2"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\5\4\3\2\u00f7\u00f8\b\16\1\2\u00f8"+
		"\33\3\2\2\2\u00f9\u00fa\7\30\2\2\u00fa\u00fb\5\"\22\2\u00fb\u00fc\7\5"+
		"\2\2\u00fc\u0101\5\"\22\2\u00fd\u00fe\7\25\2\2\u00fe\u0100\5\"\22\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\35\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\b\20\1\2\u0105\u0106"+
		"\7-\2\2\u0106\u0107\5\36\20\7\u0107\u0108\b\20\1\2\u0108\u0112\3\2\2\2"+
		"\u0109\u010a\7\3\2\2\u010a\u010b\5\36\20\2\u010b\u010c\7\4\2\2\u010c\u010d"+
		"\b\20\1\2\u010d\u0112\3\2\2\2\u010e\u010f\5 \21\2\u010f\u0110\b\20\1\2"+
		"\u0110\u0112\3\2\2\2\u0111\u0104\3\2\2\2\u0111\u0109\3\2\2\2\u0111\u010e"+
		"\3\2\2\2\u0112\u015f\3\2\2\2\u0113\u0114\f\24\2\2\u0114\u0115\7\"\2\2"+
		"\u0115\u0116\5\36\20\25\u0116\u0117\b\20\1\2\u0117\u015e\3\2\2\2\u0118"+
		"\u0119\f\23\2\2\u0119\u011a\7#\2\2\u011a\u011b\5\36\20\24\u011b\u011c"+
		"\b\20\1\2\u011c\u015e\3\2\2\2\u011d\u011e\f\22\2\2\u011e\u011f\7$\2\2"+
		"\u011f\u0120\5\36\20\23\u0120\u0121\b\20\1\2\u0121\u015e\3\2\2\2\u0122"+
		"\u0123\f\21\2\2\u0123\u0124\7 \2\2\u0124\u0125\5\36\20\22\u0125\u0126"+
		"\b\20\1\2\u0126\u015e\3\2\2\2\u0127\u0128\f\20\2\2\u0128\u0129\7!\2\2"+
		"\u0129\u012a\5\36\20\21\u012a\u012b\b\20\1\2\u012b\u015e\3\2\2\2\u012c"+
		"\u012d\f\17\2\2\u012d\u012e\7%\2\2\u012e\u012f\5\36\20\20\u012f\u0130"+
		"\b\20\1\2\u0130\u015e\3\2\2\2\u0131\u0132\f\16\2\2\u0132\u0133\7&\2\2"+
		"\u0133\u0134\5\36\20\17\u0134\u0135\b\20\1\2\u0135\u015e\3\2\2\2\u0136"+
		"\u0137\f\r\2\2\u0137\u0138\7\'\2\2\u0138\u0139\5\36\20\16\u0139\u013a"+
		"\b\20\1\2\u013a\u015e\3\2\2\2\u013b\u013c\f\f\2\2\u013c\u013d\7(\2\2\u013d"+
		"\u013e\5\36\20\r\u013e\u013f\b\20\1\2\u013f\u015e\3\2\2\2\u0140\u0141"+
		"\f\13\2\2\u0141\u0142\7)\2\2\u0142\u0143\5\36\20\f\u0143\u0144\b\20\1"+
		"\2\u0144\u015e\3\2\2\2\u0145\u0146\f\n\2\2\u0146\u0147\7*\2\2\u0147\u0148"+
		"\5\36\20\13\u0148\u0149\b\20\1\2\u0149\u015e\3\2\2\2\u014a\u014b\f\t\2"+
		"\2\u014b\u014c\7+\2\2\u014c\u014d\5\36\20\n\u014d\u014e\b\20\1\2\u014e"+
		"\u015e\3\2\2\2\u014f\u0150\f\b\2\2\u0150\u0151\7,\2\2\u0151\u0152\5\36"+
		"\20\t\u0152\u0153\b\20\1\2\u0153\u015e\3\2\2\2\u0154\u0155\f\6\2\2\u0155"+
		"\u0156\7.\2\2\u0156\u015e\5\36\20\7\u0157\u0158\f\5\2\2\u0158\u0159\7"+
		"/\2\2\u0159\u015e\5\36\20\6\u015a\u015b\f\4\2\2\u015b\u015c\7\60\2\2\u015c"+
		"\u015e\5\36\20\5\u015d\u0113\3\2\2\2\u015d\u0118\3\2\2\2\u015d\u011d\3"+
		"\2\2\2\u015d\u0122\3\2\2\2\u015d\u0127\3\2\2\2\u015d\u012c\3\2\2\2\u015d"+
		"\u0131\3\2\2\2\u015d\u0136\3\2\2\2\u015d\u013b\3\2\2\2\u015d\u0140\3\2"+
		"\2\2\u015d\u0145\3\2\2\2\u015d\u014a\3\2\2\2\u015d\u014f\3\2\2\2\u015d"+
		"\u0154\3\2\2\2\u015d\u0157\3\2\2\2\u015d\u015a\3\2\2\2\u015e\u0161\3\2"+
		"\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\37\3\2\2\2\u0161\u015f"+
		"\3\2\2\2\u0162\u0163\b\21\1\2\u0163\u0164\79\2\2\u0164\u017f\b\21\1\2"+
		"\u0165\u017f\78\2\2\u0166\u0167\7:\2\2\u0167\u017f\b\21\1\2\u0168\u0169"+
		"\5\"\22\2\u0169\u016a\b\21\1\2\u016a\u017f\3\2\2\2\u016b\u016c\7\6\2\2"+
		"\u016c\u0178\b\21\1\2\u016d\u016e\5\36\20\2\u016e\u0175\b\21\1\2\u016f"+
		"\u0170\7\25\2\2\u0170\u0171\5\36\20\2\u0171\u0172\b\21\1\2\u0172\u0174"+
		"\3\2\2\2\u0173\u016f\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u016d\3\2"+
		"\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\7\21\2\2\u017b"+
		"\u017c\5\"\22\2\u017c\u017d\b\21\1\2\u017d\u017f\3\2\2\2\u017e\u0162\3"+
		"\2\2\2\u017e\u0165\3\2\2\2\u017e\u0166\3\2\2\2\u017e\u0168\3\2\2\2\u017e"+
		"\u016b\3\2\2\2\u017f\u0186\3\2\2\2\u0180\u0181\f\4\2\2\u0181\u0182\7\24"+
		"\2\2\u0182\u0183\79\2\2\u0183\u0185\b\21\1\2\u0184\u0180\3\2\2\2\u0185"+
		"\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187!\3\2\2\2"+
		"\u0188\u0186\3\2\2\2\u0189\u018b\7;\2\2\u018a\u0189\3\2\2\2\u018b\u018c"+
		"\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u0190\3\2\2\2\u018e"+
		"\u0190\7<\2\2\u018f\u018a\3\2\2\2\u018f\u018e\3\2\2\2\u0190#\3\2\2\2\36"+
		"\'\65@Efktw\u009c\u009f\u00a5\u00af\u00ba\u00c0\u00c7\u00de\u00e1\u00f4"+
		"\u0101\u0111\u015d\u015f\u0175\u0178\u017e\u0186\u018c\u018f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}