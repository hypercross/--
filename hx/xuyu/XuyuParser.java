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
		K_CHENG=24, A_ZHI=25, K_PIAN=26, K_XU=27, K_YYOU=28, O_JIN=29, O_TUI=30, 
		O_JI=31, O_FEN=32, O_JIA=33, O_JIAN=34, O_CHENG=35, O_CHU=36, O_YU=37, 
		O_DA=38, O_XIAO=39, O_DENG=40, O_BDA=41, O_BXIAO=42, O_BDENG=43, O_QIE=44, 
		O_HUO=45, O_FEI=46, O_BHAN=47, O_JZI=48, O_JZHI=49, O_BRU=50, INDENT=51, 
		DEDENT=52, COMMENT=53, STRLIT=54, DENT=55, WORD=56, NUM=57, CNFRAC=58, 
		CNNUM=59, CNBOOL=60, CNCHAR=61, CNNOUN=62, NEWLINE=63, WS=64;
	public static final String[] tokenNames = {
		"<INVALID>", "'（'", "'）'", "'何为'", "K_YI", "'为'", "'言'", "'众'", "K_RUO", 
		"'否则'", "'则'", "'抑或'", "'每当'", "'复始'", "'止'", "'求'", "'曰'", "'得'", "'其'", 
		"'、'", "'举'", "'于诸'", "'问'", "'聚'", "'成'", "'之'", "'篇'", "'续'", "'又有'", 
		"'进以'", "'退以'", "'积以'", "'分以'", "'加以'", "'减以'", "'乘以'", "'除以'", "'余以'", 
		"'大于'", "'小于'", "'等于'", "'不大于'", "'不小于'", "'不等于'", "'且'", "'或'", "'非'", 
		"'包含'", "'截自'", "'截至'", "'并入'", "INDENT", "DEDENT", "COMMENT", "STRLIT", 
		"DENT", "WORD", "NUM", "CNFRAC", "CNNUM", "CNBOOL", "CNCHAR", "CNNOUN", 
		"NEWLINE", "WS"
	};
	public static final int
		RULE_file = 0, RULE_block = 1, RULE_inline = 2, RULE_stat = 3, RULE_print = 4, 
		RULE_assign = 5, RULE_conditional = 6, RULE_whiles = 7, RULE_breaks = 8, 
		RULE_continues = 9, RULE_deffunc = 10, RULE_defobj = 11, RULE_returnst = 12, 
		RULE_iterate = 13, RULE_input = 14, RULE_declare = 15, RULE_expr = 16, 
		RULE_val = 17, RULE_var = 18;
	public static final String[] ruleNames = {
		"file", "block", "inline", "stat", "print", "assign", "conditional", "whiles", 
		"breaks", "continues", "deffunc", "defobj", "returnst", "iterate", "input", 
		"declare", "expr", "val", "var"
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
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(38); match(NEWLINE);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44); ((FileContext)_localctx).block = block();
			setState(45); match(EOF);
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
			setState(48); match(INDENT);
			 ((BlockContext)_localctx).b =  xuyu.pushBlock();
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50); ((BlockContext)_localctx).stat = stat();
				 xuyu.addStat(((BlockContext)_localctx).stat.s);
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << K_YI) | (1L << K_YAN) | (1L << K_RUO) | (1L << K_MDANG) | (1L << K_FSHI) | (1L << K_ZHI) | (1L << K_DE) | (1L << K_JU2) | (1L << K_WEN) | (1L << K_JU) | (1L << K_YYOU) | (1L << O_FEI) | (1L << CNFRAC) | (1L << CNNUM) | (1L << CNBOOL) | (1L << CNCHAR) | (1L << CNNOUN))) != 0) );
			setState(57); match(DEDENT);
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
			setState(72);
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
			case K_YYOU:
			case O_FEI:
			case CNFRAC:
			case CNNUM:
			case CNBOOL:
			case CNCHAR:
			case CNNOUN:
				enterOuterAlt(_localctx, 1);
				{
				 ((InlineContext)_localctx).b =  xuyu.pushBlock();
				setState(61); ((InlineContext)_localctx).stat = stat();
				 xuyu.addStat( ((InlineContext)_localctx).stat.s); xuyu.popBlock();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(64); match(NEWLINE);
					}
					}
					setState(67); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(69); ((InlineContext)_localctx).block = block();
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
		public PrintContext print;
		public AssignContext assign;
		public ConditionalContext conditional;
		public WhilesContext whiles;
		public BreaksContext breaks;
		public ContinuesContext continues;
		public DeffuncContext deffunc;
		public DefobjContext defobj;
		public ReturnstContext returnst;
		public IterateContext iterate;
		public DeclareContext declare;
		public ExprContext expr;
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
		public DefobjContext defobj() {
			return getRuleContext(DefobjContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public IterateContext iterate() {
			return getRuleContext(IterateContext.class,0);
		}
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
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
			setState(111);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(74); ((StatContext)_localctx).print = print();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).print.s; 
				}
				break;

			case 2:
				{
				setState(77); ((StatContext)_localctx).assign = assign();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).assign.s; 
				}
				break;

			case 3:
				{
				setState(80); ((StatContext)_localctx).conditional = conditional();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).conditional.s; 
				}
				break;

			case 4:
				{
				setState(83); ((StatContext)_localctx).whiles = whiles();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).whiles.s; 
				}
				break;

			case 5:
				{
				setState(86); ((StatContext)_localctx).breaks = breaks();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).breaks.s; 
				}
				break;

			case 6:
				{
				setState(89); ((StatContext)_localctx).continues = continues();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).continues.s; 
				}
				break;

			case 7:
				{
				setState(92); ((StatContext)_localctx).deffunc = deffunc();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).deffunc.s; 
				}
				break;

			case 8:
				{
				setState(95); ((StatContext)_localctx).defobj = defobj();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).defobj.s;
				}
				break;

			case 9:
				{
				setState(98); ((StatContext)_localctx).returnst = returnst();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).returnst.s; 
				}
				break;

			case 10:
				{
				setState(101); ((StatContext)_localctx).iterate = iterate();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).iterate.s; 
				}
				break;

			case 11:
				{
				setState(104); ((StatContext)_localctx).declare = declare();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).declare.s; 
				}
				break;

			case 12:
				{
				setState(107); ((StatContext)_localctx).expr = expr(0);
				 ((StatContext)_localctx).s =  new Stat.EXP( ((StatContext)_localctx).expr.v); 
				}
				break;

			case 13:
				{
				setState(110); input();
				}
				break;
			}
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(113); match(NEWLINE);
					}
					} 
				}
				setState(118);
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
			setState(119); match(K_YAN);
			setState(125);
			switch (_input.LA(1)) {
			case STRLIT:
				{
				setState(120); ((PrintContext)_localctx).STRLIT = match(STRLIT);
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
				setState(122); ((PrintContext)_localctx).expr = expr(0);
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
		public ValContext val;
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
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
			setState(174);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(127); match(K_YI);
					}
					break;
				}
				setState(130); ((AssignContext)_localctx).expr = expr(0);
				setState(131); match(K_WEI);
				setState(132); ((AssignContext)_localctx).val = val(0);
				 ((AssignContext)_localctx).s =  new Stat.SETPROP( ((AssignContext)_localctx).val.v, ((AssignContext)_localctx).expr.v);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135); ((AssignContext)_localctx).val = val(0);
				setState(136); match(O_JIN);
				setState(137); ((AssignContext)_localctx).expr = expr(0);
				 ((AssignContext)_localctx).s =  new Stat.SETPROP( ((AssignContext)_localctx).val.v, new Exp.Eval(((AssignContext)_localctx).val.v, ((AssignContext)_localctx).expr.v, Exp.Eval.ADD));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140); ((AssignContext)_localctx).val = val(0);
				setState(141); match(O_TUI);
				setState(142); ((AssignContext)_localctx).expr = expr(0);
				 ((AssignContext)_localctx).s =  new Stat.SETPROP( ((AssignContext)_localctx).val.v, new Exp.Eval(((AssignContext)_localctx).val.v, ((AssignContext)_localctx).expr.v, Exp.Eval.SUB));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(145); ((AssignContext)_localctx).val = val(0);
				setState(146); match(O_JI);
				setState(147); ((AssignContext)_localctx).expr = expr(0);
				 ((AssignContext)_localctx).s =  new Stat.SETPROP( ((AssignContext)_localctx).val.v, new Exp.Eval(((AssignContext)_localctx).val.v, ((AssignContext)_localctx).expr.v, Exp.Eval.MUL));
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(150); ((AssignContext)_localctx).val = val(0);
				setState(151); match(O_FEN);
				setState(152); ((AssignContext)_localctx).expr = expr(0);
				 ((AssignContext)_localctx).s =  new Stat.SETPROP( ((AssignContext)_localctx).val.v, new Exp.Eval(((AssignContext)_localctx).val.v, ((AssignContext)_localctx).expr.v, Exp.Eval.DIV));
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(155); match(K_JU);
				 xuyu.pushVals(); 
				setState(168);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << K_YI) | (1L << O_FEI) | (1L << CNFRAC) | (1L << CNNUM) | (1L << CNBOOL) | (1L << CNCHAR) | (1L << CNNOUN))) != 0)) {
					{
					setState(157); ((AssignContext)_localctx).expr = expr(0);
					 xuyu.putVal(((AssignContext)_localctx).expr.v);
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==K_DUN) {
						{
						{
						setState(159); match(K_DUN);
						setState(160); ((AssignContext)_localctx).expr = expr(0);
						 xuyu.putVal(((AssignContext)_localctx).expr.v);
						}
						}
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(170); match(K_CHENG);
				setState(171); ((AssignContext)_localctx).val = val(0);
				 ((AssignContext)_localctx).s =  new Stat.SETPROP( ((AssignContext)_localctx).val.v, new Exp.Lst(xuyu.popVals()));
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
			setState(176); match(K_RUO);
			setState(177); ((ConditionalContext)_localctx).expr = expr(0);
			setState(178); match(K_ZE);
			setState(179); ((ConditionalContext)_localctx).inline = inline();
			 ((ConditionalContext)_localctx).s =  new Stat.IF (((ConditionalContext)_localctx).expr.v, ((ConditionalContext)_localctx).inline.b); Stat.IF head = _localctx.s; 
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(181); match(NEWLINE);
						}
						}
						setState(186);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(187); match(K_YHUO);
					setState(188); ((ConditionalContext)_localctx).expr = expr(0);
					setState(189); match(K_ZE);
					setState(190); ((ConditionalContext)_localctx).inline = inline();
					 Stat.IF nh = new Stat.IF (((ConditionalContext)_localctx).expr.v, ((ConditionalContext)_localctx).inline.b); head.setElif(nh); head = nh;
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(208);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(198); match(NEWLINE);
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204); match(K_FZE);
				setState(205); ((ConditionalContext)_localctx).inline = inline();
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
			setState(210); match(K_MDANG);
			setState(211); ((WhilesContext)_localctx).expr = expr(0);
			setState(212); match(K_ZE);
			setState(213); ((WhilesContext)_localctx).inline = inline();
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
			setState(216); match(K_ZHI);
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
			setState(219); match(K_FSHI);
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
			setState(222); match(K_YI);
			setState(234);
			_la = _input.LA(1);
			if (_la==CNCHAR || _la==CNNOUN) {
				{
				setState(223); ((DeffuncContext)_localctx).param = var();
				 xuyu.putId((((DeffuncContext)_localctx).param!=null?_input.getText(((DeffuncContext)_localctx).param.start,((DeffuncContext)_localctx).param.stop):null));
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_DUN) {
					{
					{
					setState(225); match(K_DUN);
					setState(226); ((DeffuncContext)_localctx).param = var();
					 xuyu.putId((((DeffuncContext)_localctx).param!=null?_input.getText(((DeffuncContext)_localctx).param.start,((DeffuncContext)_localctx).param.stop):null));
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(236); match(K_DE);
			setState(237); ((DeffuncContext)_localctx).func = var();
			setState(238); match(K_YUE);
			setState(239); ((DeffuncContext)_localctx).inline = inline();
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

	public static class DefobjContext extends ParserRuleContext {
		public Stat s;
		public VarContext a;
		public VarContext c;
		public BlockContext b;
		public List<TerminalNode> NEWLINE() { return getTokens(XuyuParser.NEWLINE); }
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(XuyuParser.NEWLINE, i);
		}
		public List<TerminalNode> K_PIAN() { return getTokens(XuyuParser.K_PIAN); }
		public TerminalNode K_XU() { return getToken(XuyuParser.K_XU, 0); }
		public TerminalNode K_PIAN(int i) {
			return getToken(XuyuParser.K_PIAN, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public DefobjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defobj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).enterDefobj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).exitDefobj(this);
		}
	}

	public final DefobjContext defobj() throws RecognitionException {
		DefobjContext _localctx = new DefobjContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_defobj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242); ((DefobjContext)_localctx).a = var();
			setState(243); match(K_PIAN);
			setState(248);
			_la = _input.LA(1);
			if (_la==K_XU) {
				{
				setState(244); match(K_XU);
				setState(245); ((DefobjContext)_localctx).c = var();
				setState(246); match(K_PIAN);
				}
			}

			setState(251); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(250); match(NEWLINE);
				}
				}
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(255); ((DefobjContext)_localctx).b = block();
			 ((DefobjContext)_localctx).s =  new Stat.DEFOBJ( (((DefobjContext)_localctx).a!=null?_input.getText(((DefobjContext)_localctx).a.start,((DefobjContext)_localctx).a.stop):null), ((DefobjContext)_localctx).b.b, (((DefobjContext)_localctx).c!=null?_input.getText(((DefobjContext)_localctx).c.start,((DefobjContext)_localctx).c.stop):null) == null ? null : new Exp.Var( (((DefobjContext)_localctx).c!=null?_input.getText(((DefobjContext)_localctx).c.start,((DefobjContext)_localctx).c.stop):null), xuyu.currentBlock()));
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
		enterRule(_localctx, 24, RULE_returnst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); match(K_DE);
			setState(259); ((ReturnstContext)_localctx).expr = expr(0);
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
		enterRule(_localctx, 26, RULE_iterate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); match(K_JU2);
			setState(263); ((IterateContext)_localctx).var = var();
			setState(264); match(K_YZHU);
			setState(265); ((IterateContext)_localctx).expr = expr(0);
			setState(267); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(266); match(NEWLINE);
				}
				}
				setState(269); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(271); ((IterateContext)_localctx).block = block();
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
		enterRule(_localctx, 28, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); match(K_WEN);
			setState(275); var();
			setState(276); match(K_HWEI);
			setState(277); var();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_DUN) {
				{
				{
				setState(278); match(K_DUN);
				setState(279); var();
				}
				}
				setState(284);
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

	public static class DeclareContext extends ParserRuleContext {
		public Stat s;
		public VarContext var;
		public TerminalNode K_YYOU() { return getToken(XuyuParser.K_YYOU, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XuyuListener ) ((XuyuListener)listener).exitDeclare(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285); match(K_YYOU);
			setState(286); ((DeclareContext)_localctx).var = var();
			 ((DeclareContext)_localctx).s =  new Stat.DEFLOC( (((DeclareContext)_localctx).var!=null?_input.getText(((DeclareContext)_localctx).var.start,((DeclareContext)_localctx).var.stop):null));
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
		public TerminalNode O_BDENG() { return getToken(XuyuParser.O_BDENG, 0); }
		public TerminalNode O_CHU() { return getToken(XuyuParser.O_CHU, 0); }
		public TerminalNode O_JZHI() { return getToken(XuyuParser.O_JZHI, 0); }
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
		public TerminalNode O_JZI() { return getToken(XuyuParser.O_JZI, 0); }
		public TerminalNode O_BRU() { return getToken(XuyuParser.O_BRU, 0); }
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			switch (_input.LA(1)) {
			case O_FEI:
				{
				setState(290); match(O_FEI);
				setState(291); ((ExprContext)_localctx).a = expr(6);
				 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,null, Exp.Eval.NOT);
				}
				break;
			case 1:
				{
				setState(294); match(1);
				setState(295); ((ExprContext)_localctx).a = expr(0);
				setState(296); match(2);
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
				setState(299); ((ExprContext)_localctx).val = val(0);
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).val.v;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(389);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(304);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(305); match(O_CHENG);
						setState(306); ((ExprContext)_localctx).b = expr(20);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.MUL);
						}
						break;

					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(309);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(310); match(O_CHU);
						setState(311); ((ExprContext)_localctx).b = expr(19);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.DIV);
						}
						break;

					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(314);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(315); match(O_YU);
						setState(316); ((ExprContext)_localctx).b = expr(18);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.RMD);
						}
						break;

					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(319);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(320); match(O_JIA);
						setState(321); ((ExprContext)_localctx).b = expr(17);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.ADD);
						}
						break;

					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(324);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(325); match(O_JIAN);
						setState(326); ((ExprContext)_localctx).b = expr(16);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.SUB);
						}
						break;

					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(329);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(330); match(O_DA);
						setState(331); ((ExprContext)_localctx).b = expr(15);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.GT);
						}
						break;

					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(334);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(335); match(O_XIAO);
						setState(336); ((ExprContext)_localctx).b = expr(14);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.LT);
						}
						break;

					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(339);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(340); match(O_DENG);
						setState(341); ((ExprContext)_localctx).b = expr(13);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.EQ);
						}
						break;

					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(344);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(345); match(O_BDA);
						setState(346); ((ExprContext)_localctx).b = expr(12);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.NGT);
						}
						break;

					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(349);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(350); match(O_BXIAO);
						setState(351); ((ExprContext)_localctx).b = expr(11);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.NLT);
						}
						break;

					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(354);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(355); match(O_BDENG);
						setState(356); ((ExprContext)_localctx).b = expr(10);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.NEQ);
						}
						break;

					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(359);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(360); match(O_QIE);
						setState(361); ((ExprContext)_localctx).b = expr(9);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.AND);
						}
						break;

					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(364);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(365); match(O_HUO);
						setState(366); ((ExprContext)_localctx).b = expr(8);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.OR);
						}
						break;

					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(369);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(370); match(O_BHAN);
						setState(371); ((ExprContext)_localctx).b = expr(6);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).b.v,((ExprContext)_localctx).a.v, Exp.Eval.ISIN);
						}
						break;

					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(374);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(375); match(O_JZI);
						setState(376); ((ExprContext)_localctx).b = expr(5);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v,((ExprContext)_localctx).b.v, Exp.Eval.CUTL);
						}
						break;

					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(379);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(380); match(O_JZHI);
						setState(381); ((ExprContext)_localctx).b = expr(4);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v,((ExprContext)_localctx).b.v, Exp.Eval.CUTR);
						}
						break;

					case 17:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(384);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(385); match(O_BRU);
						setState(386); ((ExprContext)_localctx).b = expr(3);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v,((ExprContext)_localctx).b.v, Exp.Eval.JOIN);
						}
						break;
					}
					} 
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		public ExprContext param;
		public ValContext func;
		public Token CNNUM;
		public Token CNBOOL;
		public VarContext var;
		public ValContext i;
		public VarContext b;
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public TerminalNode K_QI() { return getToken(XuyuParser.K_QI, 0); }
		public TerminalNode CNFRAC() { return getToken(XuyuParser.CNFRAC, 0); }
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public TerminalNode CNBOOL() { return getToken(XuyuParser.CNBOOL, 0); }
		public TerminalNode K_YI() { return getToken(XuyuParser.K_YI, 0); }
		public TerminalNode A_ZHI() { return getToken(XuyuParser.A_ZHI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CNNUM() { return getToken(XuyuParser.CNNUM, 0); }
		public TerminalNode K_QIU() { return getToken(XuyuParser.K_QIU, 0); }
		public List<TerminalNode> K_DUN() { return getTokens(XuyuParser.K_DUN); }
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_val, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			switch (_input.LA(1)) {
			case K_YI:
				{
				setState(395); match(K_YI);
				 xuyu.pushVals(); 
				setState(408);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << K_YI) | (1L << O_FEI) | (1L << CNFRAC) | (1L << CNNUM) | (1L << CNBOOL) | (1L << CNCHAR) | (1L << CNNOUN))) != 0)) {
					{
					setState(397); ((ValContext)_localctx).param = expr(0);
					 xuyu.putVal(((ValContext)_localctx).param.v);
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==K_DUN) {
						{
						{
						setState(399); match(K_DUN);
						setState(400); ((ValContext)_localctx).param = expr(0);
						 xuyu.putVal(((ValContext)_localctx).param.v);
						}
						}
						setState(407);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(410); match(K_QIU);
				setState(411); ((ValContext)_localctx).func = val(1);
				 ((ValContext)_localctx).v =  new Exp.Call(((ValContext)_localctx).func.v, xuyu.popVals());
				}
				break;
			case CNNUM:
				{
				setState(414); ((ValContext)_localctx).CNNUM = match(CNNUM);
				 ((ValContext)_localctx).v =  new Exp.Num(ParserUtil.parseInt((((ValContext)_localctx).CNNUM!=null?((ValContext)_localctx).CNNUM.getText():null)));
				}
				break;
			case CNFRAC:
				{
				setState(416); match(CNFRAC);
				}
				break;
			case CNBOOL:
				{
				setState(417); ((ValContext)_localctx).CNBOOL = match(CNBOOL);
				 ((ValContext)_localctx).v =  new Exp.Num( "阳".equals((((ValContext)_localctx).CNBOOL!=null?((ValContext)_localctx).CNBOOL.getText():null)) ? 1 : 0); 
				}
				break;
			case CNCHAR:
			case CNNOUN:
				{
				setState(419); ((ValContext)_localctx).var = var();
				 ((ValContext)_localctx).v =  new Exp.Var((((ValContext)_localctx).var!=null?_input.getText(((ValContext)_localctx).var.start,((ValContext)_localctx).var.stop):null), xuyu.currentBlock());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(434);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ValContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_val);
						setState(424);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(425); match(K_QI);
						setState(426); ((ValContext)_localctx).i = val(4);
						 ((ValContext)_localctx).v =  new Exp.Index( ((ValContext)_localctx).a.v, ((ValContext)_localctx).i.v); 
						}
						break;

					case 2:
						{
						_localctx = new ValContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_val);
						setState(429);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(430); match(A_ZHI);
						setState(431); ((ValContext)_localctx).b = ((ValContext)_localctx).var = var();
						 ((ValContext)_localctx).v =  new Exp.Var((((ValContext)_localctx).b!=null?_input.getText(((ValContext)_localctx).b.start,((ValContext)_localctx).b.stop):null), ((ValContext)_localctx).a.v); 
						}
						break;
					}
					} 
				}
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		enterRule(_localctx, 36, RULE_var);
		try {
			int _alt;
			setState(445);
			switch (_input.LA(1)) {
			case CNCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(440); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(439); match(CNCHAR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(442); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
				}
				break;
			case CNNOUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(444); match(CNNOUN);
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
		case 16: return expr_sempred((ExprContext)_localctx, predIndex);

		case 17: return val_sempred((ValContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean val_sempred(ValContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17: return precpred(_ctx, 3);

		case 18: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 19);

		case 1: return precpred(_ctx, 18);

		case 2: return precpred(_ctx, 17);

		case 3: return precpred(_ctx, 16);

		case 4: return precpred(_ctx, 15);

		case 5: return precpred(_ctx, 14);

		case 6: return precpred(_ctx, 13);

		case 7: return precpred(_ctx, 12);

		case 8: return precpred(_ctx, 11);

		case 9: return precpred(_ctx, 10);

		case 10: return precpred(_ctx, 9);

		case 11: return precpred(_ctx, 8);

		case 12: return precpred(_ctx, 7);

		case 13: return precpred(_ctx, 5);

		case 14: return precpred(_ctx, 4);

		case 15: return precpred(_ctx, 3);

		case 16: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3B\u01c2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\6\38\n\3\r\3\16\39\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\6\4"+
		"D\n\4\r\4\16\4E\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5r\n\5\3\5\7\5u\n\5\f\5"+
		"\16\5x\13\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0080\n\6\3\7\5\7\u0083\n\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a6"+
		"\n\7\f\7\16\7\u00a9\13\7\5\7\u00ab\n\7\3\7\3\7\3\7\3\7\5\7\u00b1\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\7\b\u00b9\n\b\f\b\16\b\u00bc\13\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\b\u00c4\n\b\f\b\16\b\u00c7\13\b\3\b\7\b\u00ca\n\b\f\b\16"+
		"\b\u00cd\13\b\3\b\3\b\3\b\3\b\5\b\u00d3\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00e8\n\f\f"+
		"\f\16\f\u00eb\13\f\5\f\u00ed\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00fb\n\r\3\r\6\r\u00fe\n\r\r\r\16\r\u00ff\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\6\17\u010e\n\17\r\17\16"+
		"\17\u010f\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u011b\n\20"+
		"\f\20\16\20\u011e\13\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0131\n\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0188"+
		"\n\22\f\22\16\22\u018b\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\7\23\u0196\n\23\f\23\16\23\u0199\13\23\5\23\u019b\n\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01a9\n\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u01b5\n\23\f\23\16"+
		"\23\u01b8\13\23\3\24\6\24\u01bb\n\24\r\24\16\24\u01bc\3\24\5\24\u01c0"+
		"\n\24\3\24\2\4\"$\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\2\u01ef"+
		"\2+\3\2\2\2\4\62\3\2\2\2\6J\3\2\2\2\bq\3\2\2\2\ny\3\2\2\2\f\u00b0\3\2"+
		"\2\2\16\u00b2\3\2\2\2\20\u00d4\3\2\2\2\22\u00da\3\2\2\2\24\u00dd\3\2\2"+
		"\2\26\u00e0\3\2\2\2\30\u00f4\3\2\2\2\32\u0104\3\2\2\2\34\u0108\3\2\2\2"+
		"\36\u0114\3\2\2\2 \u011f\3\2\2\2\"\u0130\3\2\2\2$\u01a8\3\2\2\2&\u01bf"+
		"\3\2\2\2(*\7A\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+"+
		"\3\2\2\2./\5\4\3\2/\60\7\2\2\3\60\61\b\2\1\2\61\3\3\2\2\2\62\63\7\65\2"+
		"\2\63\67\b\3\1\2\64\65\5\b\5\2\65\66\b\3\1\2\668\3\2\2\2\67\64\3\2\2\2"+
		"89\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\66\2\2<=\b\3\1\2=\5\3\2"+
		"\2\2>?\b\4\1\2?@\5\b\5\2@A\b\4\1\2AK\3\2\2\2BD\7A\2\2CB\3\2\2\2DE\3\2"+
		"\2\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\5\4\3\2HI\b\4\1\2IK\3\2\2\2J>\3\2"+
		"\2\2JC\3\2\2\2K\7\3\2\2\2LM\5\n\6\2MN\b\5\1\2Nr\3\2\2\2OP\5\f\7\2PQ\b"+
		"\5\1\2Qr\3\2\2\2RS\5\16\b\2ST\b\5\1\2Tr\3\2\2\2UV\5\20\t\2VW\b\5\1\2W"+
		"r\3\2\2\2XY\5\22\n\2YZ\b\5\1\2Zr\3\2\2\2[\\\5\24\13\2\\]\b\5\1\2]r\3\2"+
		"\2\2^_\5\26\f\2_`\b\5\1\2`r\3\2\2\2ab\5\30\r\2bc\b\5\1\2cr\3\2\2\2de\5"+
		"\32\16\2ef\b\5\1\2fr\3\2\2\2gh\5\34\17\2hi\b\5\1\2ir\3\2\2\2jk\5 \21\2"+
		"kl\b\5\1\2lr\3\2\2\2mn\5\"\22\2no\b\5\1\2or\3\2\2\2pr\5\36\20\2qL\3\2"+
		"\2\2qO\3\2\2\2qR\3\2\2\2qU\3\2\2\2qX\3\2\2\2q[\3\2\2\2q^\3\2\2\2qa\3\2"+
		"\2\2qd\3\2\2\2qg\3\2\2\2qj\3\2\2\2qm\3\2\2\2qp\3\2\2\2rv\3\2\2\2su\7A"+
		"\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\t\3\2\2\2xv\3\2\2\2y\177"+
		"\7\b\2\2z{\78\2\2{\u0080\b\6\1\2|}\5\"\22\2}~\b\6\1\2~\u0080\3\2\2\2\177"+
		"z\3\2\2\2\177|\3\2\2\2\u0080\13\3\2\2\2\u0081\u0083\7\6\2\2\u0082\u0081"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\5\"\22\2"+
		"\u0085\u0086\7\7\2\2\u0086\u0087\5$\23\2\u0087\u0088\b\7\1\2\u0088\u00b1"+
		"\3\2\2\2\u0089\u008a\5$\23\2\u008a\u008b\7\37\2\2\u008b\u008c\5\"\22\2"+
		"\u008c\u008d\b\7\1\2\u008d\u00b1\3\2\2\2\u008e\u008f\5$\23\2\u008f\u0090"+
		"\7 \2\2\u0090\u0091\5\"\22\2\u0091\u0092\b\7\1\2\u0092\u00b1\3\2\2\2\u0093"+
		"\u0094\5$\23\2\u0094\u0095\7!\2\2\u0095\u0096\5\"\22\2\u0096\u0097\b\7"+
		"\1\2\u0097\u00b1\3\2\2\2\u0098\u0099\5$\23\2\u0099\u009a\7\"\2\2\u009a"+
		"\u009b\5\"\22\2\u009b\u009c\b\7\1\2\u009c\u00b1\3\2\2\2\u009d\u009e\7"+
		"\31\2\2\u009e\u00aa\b\7\1\2\u009f\u00a0\5\"\22\2\u00a0\u00a7\b\7\1\2\u00a1"+
		"\u00a2\7\25\2\2\u00a2\u00a3\5\"\22\2\u00a3\u00a4\b\7\1\2\u00a4\u00a6\3"+
		"\2\2\2\u00a5\u00a1\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u009f\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\32\2\2\u00ad"+
		"\u00ae\5$\23\2\u00ae\u00af\b\7\1\2\u00af\u00b1\3\2\2\2\u00b0\u0082\3\2"+
		"\2\2\u00b0\u0089\3\2\2\2\u00b0\u008e\3\2\2\2\u00b0\u0093\3\2\2\2\u00b0"+
		"\u0098\3\2\2\2\u00b0\u009d\3\2\2\2\u00b1\r\3\2\2\2\u00b2\u00b3\7\n\2\2"+
		"\u00b3\u00b4\5\"\22\2\u00b4\u00b5\7\f\2\2\u00b5\u00b6\5\6\4\2\u00b6\u00c5"+
		"\b\b\1\2\u00b7\u00b9\7A\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bd\u00be\7\r\2\2\u00be\u00bf\5\"\22\2\u00bf\u00c0\7\f\2\2\u00c0"+
		"\u00c1\5\6\4\2\u00c1\u00c2\b\b\1\2\u00c2\u00c4\3\2\2\2\u00c3\u00ba\3\2"+
		"\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00d2\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\7A\2\2\u00c9\u00c8\3\2"+
		"\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7\13\2\2\u00cf\u00d0\5"+
		"\6\4\2\u00d0\u00d1\b\b\1\2\u00d1\u00d3\3\2\2\2\u00d2\u00cb\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\17\3\2\2\2\u00d4\u00d5\7\16\2\2\u00d5\u00d6\5\"\22"+
		"\2\u00d6\u00d7\7\f\2\2\u00d7\u00d8\5\6\4\2\u00d8\u00d9\b\t\1\2\u00d9\21"+
		"\3\2\2\2\u00da\u00db\7\20\2\2\u00db\u00dc\b\n\1\2\u00dc\23\3\2\2\2\u00dd"+
		"\u00de\7\17\2\2\u00de\u00df\b\13\1\2\u00df\25\3\2\2\2\u00e0\u00ec\7\6"+
		"\2\2\u00e1\u00e2\5&\24\2\u00e2\u00e9\b\f\1\2\u00e3\u00e4\7\25\2\2\u00e4"+
		"\u00e5\5&\24\2\u00e5\u00e6\b\f\1\2\u00e6\u00e8\3\2\2\2\u00e7\u00e3\3\2"+
		"\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00e1\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\7\23\2\2\u00ef\u00f0\5&\24\2\u00f0"+
		"\u00f1\7\22\2\2\u00f1\u00f2\5\6\4\2\u00f2\u00f3\b\f\1\2\u00f3\27\3\2\2"+
		"\2\u00f4\u00f5\5&\24\2\u00f5\u00fa\7\34\2\2\u00f6\u00f7\7\35\2\2\u00f7"+
		"\u00f8\5&\24\2\u00f8\u00f9\7\34\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f6\3"+
		"\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fe\7A\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101\u0102\5\4\3\2\u0102\u0103\b\r\1\2\u0103"+
		"\31\3\2\2\2\u0104\u0105\7\23\2\2\u0105\u0106\5\"\22\2\u0106\u0107\b\16"+
		"\1\2\u0107\33\3\2\2\2\u0108\u0109\7\26\2\2\u0109\u010a\5&\24\2\u010a\u010b"+
		"\7\27\2\2\u010b\u010d\5\"\22\2\u010c\u010e\7A\2\2\u010d\u010c\3\2\2\2"+
		"\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\u0112\5\4\3\2\u0112\u0113\b\17\1\2\u0113\35\3\2\2\2\u0114"+
		"\u0115\7\30\2\2\u0115\u0116\5&\24\2\u0116\u0117\7\5\2\2\u0117\u011c\5"+
		"&\24\2\u0118\u0119\7\25\2\2\u0119\u011b\5&\24\2\u011a\u0118\3\2\2\2\u011b"+
		"\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\37\3\2\2"+
		"\2\u011e\u011c\3\2\2\2\u011f\u0120\7\36\2\2\u0120\u0121\5&\24\2\u0121"+
		"\u0122\b\21\1\2\u0122!\3\2\2\2\u0123\u0124\b\22\1\2\u0124\u0125\7\60\2"+
		"\2\u0125\u0126\5\"\22\b\u0126\u0127\b\22\1\2\u0127\u0131\3\2\2\2\u0128"+
		"\u0129\7\3\2\2\u0129\u012a\5\"\22\2\u012a\u012b\7\4\2\2\u012b\u012c\b"+
		"\22\1\2\u012c\u0131\3\2\2\2\u012d\u012e\5$\23\2\u012e\u012f\b\22\1\2\u012f"+
		"\u0131\3\2\2\2\u0130\u0123\3\2\2\2\u0130\u0128\3\2\2\2\u0130\u012d\3\2"+
		"\2\2\u0131\u0189\3\2\2\2\u0132\u0133\f\25\2\2\u0133\u0134\7%\2\2\u0134"+
		"\u0135\5\"\22\26\u0135\u0136\b\22\1\2\u0136\u0188\3\2\2\2\u0137\u0138"+
		"\f\24\2\2\u0138\u0139\7&\2\2\u0139\u013a\5\"\22\25\u013a\u013b\b\22\1"+
		"\2\u013b\u0188\3\2\2\2\u013c\u013d\f\23\2\2\u013d\u013e\7\'\2\2\u013e"+
		"\u013f\5\"\22\24\u013f\u0140\b\22\1\2\u0140\u0188\3\2\2\2\u0141\u0142"+
		"\f\22\2\2\u0142\u0143\7#\2\2\u0143\u0144\5\"\22\23\u0144\u0145\b\22\1"+
		"\2\u0145\u0188\3\2\2\2\u0146\u0147\f\21\2\2\u0147\u0148\7$\2\2\u0148\u0149"+
		"\5\"\22\22\u0149\u014a\b\22\1\2\u014a\u0188\3\2\2\2\u014b\u014c\f\20\2"+
		"\2\u014c\u014d\7(\2\2\u014d\u014e\5\"\22\21\u014e\u014f\b\22\1\2\u014f"+
		"\u0188\3\2\2\2\u0150\u0151\f\17\2\2\u0151\u0152\7)\2\2\u0152\u0153\5\""+
		"\22\20\u0153\u0154\b\22\1\2\u0154\u0188\3\2\2\2\u0155\u0156\f\16\2\2\u0156"+
		"\u0157\7*\2\2\u0157\u0158\5\"\22\17\u0158\u0159\b\22\1\2\u0159\u0188\3"+
		"\2\2\2\u015a\u015b\f\r\2\2\u015b\u015c\7+\2\2\u015c\u015d\5\"\22\16\u015d"+
		"\u015e\b\22\1\2\u015e\u0188\3\2\2\2\u015f\u0160\f\f\2\2\u0160\u0161\7"+
		",\2\2\u0161\u0162\5\"\22\r\u0162\u0163\b\22\1\2\u0163\u0188\3\2\2\2\u0164"+
		"\u0165\f\13\2\2\u0165\u0166\7-\2\2\u0166\u0167\5\"\22\f\u0167\u0168\b"+
		"\22\1\2\u0168\u0188\3\2\2\2\u0169\u016a\f\n\2\2\u016a\u016b\7.\2\2\u016b"+
		"\u016c\5\"\22\13\u016c\u016d\b\22\1\2\u016d\u0188\3\2\2\2\u016e\u016f"+
		"\f\t\2\2\u016f\u0170\7/\2\2\u0170\u0171\5\"\22\n\u0171\u0172\b\22\1\2"+
		"\u0172\u0188\3\2\2\2\u0173\u0174\f\7\2\2\u0174\u0175\7\61\2\2\u0175\u0176"+
		"\5\"\22\b\u0176\u0177\b\22\1\2\u0177\u0188\3\2\2\2\u0178\u0179\f\6\2\2"+
		"\u0179\u017a\7\62\2\2\u017a\u017b\5\"\22\7\u017b\u017c\b\22\1\2\u017c"+
		"\u0188\3\2\2\2\u017d\u017e\f\5\2\2\u017e\u017f\7\63\2\2\u017f\u0180\5"+
		"\"\22\6\u0180\u0181\b\22\1\2\u0181\u0188\3\2\2\2\u0182\u0183\f\4\2\2\u0183"+
		"\u0184\7\64\2\2\u0184\u0185\5\"\22\5\u0185\u0186\b\22\1\2\u0186\u0188"+
		"\3\2\2\2\u0187\u0132\3\2\2\2\u0187\u0137\3\2\2\2\u0187\u013c\3\2\2\2\u0187"+
		"\u0141\3\2\2\2\u0187\u0146\3\2\2\2\u0187\u014b\3\2\2\2\u0187\u0150\3\2"+
		"\2\2\u0187\u0155\3\2\2\2\u0187\u015a\3\2\2\2\u0187\u015f\3\2\2\2\u0187"+
		"\u0164\3\2\2\2\u0187\u0169\3\2\2\2\u0187\u016e\3\2\2\2\u0187\u0173\3\2"+
		"\2\2\u0187\u0178\3\2\2\2\u0187\u017d\3\2\2\2\u0187\u0182\3\2\2\2\u0188"+
		"\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a#\3\2\2\2"+
		"\u018b\u0189\3\2\2\2\u018c\u018d\b\23\1\2\u018d\u018e\7\6\2\2\u018e\u019a"+
		"\b\23\1\2\u018f\u0190\5\"\22\2\u0190\u0197\b\23\1\2\u0191\u0192\7\25\2"+
		"\2\u0192\u0193\5\"\22\2\u0193\u0194\b\23\1\2\u0194\u0196\3\2\2\2\u0195"+
		"\u0191\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2"+
		"\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u018f\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\7\21\2\2\u019d\u019e\5"+
		"$\23\3\u019e\u019f\b\23\1\2\u019f\u01a9\3\2\2\2\u01a0\u01a1\7=\2\2\u01a1"+
		"\u01a9\b\23\1\2\u01a2\u01a9\7<\2\2\u01a3\u01a4\7>\2\2\u01a4\u01a9\b\23"+
		"\1\2\u01a5\u01a6\5&\24\2\u01a6\u01a7\b\23\1\2\u01a7\u01a9\3\2\2\2\u01a8"+
		"\u018c\3\2\2\2\u01a8\u01a0\3\2\2\2\u01a8\u01a2\3\2\2\2\u01a8\u01a3\3\2"+
		"\2\2\u01a8\u01a5\3\2\2\2\u01a9\u01b6\3\2\2\2\u01aa\u01ab\f\5\2\2\u01ab"+
		"\u01ac\7\24\2\2\u01ac\u01ad\5$\23\6\u01ad\u01ae\b\23\1\2\u01ae\u01b5\3"+
		"\2\2\2\u01af\u01b0\f\4\2\2\u01b0\u01b1\7\33\2\2\u01b1\u01b2\5&\24\2\u01b2"+
		"\u01b3\b\23\1\2\u01b3\u01b5\3\2\2\2\u01b4\u01aa\3\2\2\2\u01b4\u01af\3"+
		"\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"%\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01bb\7?\2\2\u01ba\u01b9\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c0\3\2"+
		"\2\2\u01be\u01c0\7@\2\2\u01bf\u01ba\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0"+
		"\'\3\2\2\2!+9EJqv\177\u0082\u00a7\u00aa\u00b0\u00ba\u00c5\u00cb\u00d2"+
		"\u00e9\u00ec\u00fa\u00ff\u010f\u011c\u0130\u0187\u0189\u0197\u019a\u01a8"+
		"\u01b4\u01b6\u01bc\u01bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}