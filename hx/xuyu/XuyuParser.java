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
		K_CHENG=24, A_ZHI=25, K_PIAN=26, K_XU=27, O_JIN=28, O_TUI=29, O_JI=30, 
		O_FEN=31, O_JIA=32, O_JIAN=33, O_CHENG=34, O_CHU=35, O_YU=36, O_DA=37, 
		O_XIAO=38, O_DENG=39, O_BDA=40, O_BXIAO=41, O_BDENG=42, O_QIE=43, O_HUO=44, 
		O_FEI=45, O_BHAN=46, O_JZI=47, O_JZHI=48, O_BRU=49, INDENT=50, DEDENT=51, 
		COMMENT=52, STRLIT=53, DENT=54, WORD=55, NUM=56, CNFRAC=57, CNNUM=58, 
		CNBOOL=59, CNCHAR=60, CNNOUN=61, NEWLINE=62, WS=63;
	public static final String[] tokenNames = {
		"<INVALID>", "'（'", "'）'", "'何为'", "K_YI", "'为'", "'言'", "'众'", "K_RUO", 
		"'否则'", "'则'", "'抑或'", "'每当'", "'复始'", "'止'", "'求'", "'曰'", "'得'", "'其'", 
		"'、'", "'举'", "'于诸'", "'问'", "'聚'", "'成'", "'之'", "'篇'", "'续'", "'进以'", 
		"'退以'", "'积以'", "'分以'", "'加以'", "'减以'", "'乘以'", "'除以'", "'余以'", "'大于'", 
		"'小于'", "'等于'", "'不大于'", "'不小于'", "'不等于'", "'且'", "'或'", "'非'", "'包含'", 
		"'截自'", "'截至'", "'并入'", "INDENT", "DEDENT", "COMMENT", "STRLIT", "DENT", 
		"WORD", "NUM", "CNFRAC", "CNNUM", "CNBOOL", "CNCHAR", "CNNOUN", "NEWLINE", 
		"WS"
	};
	public static final int
		RULE_file = 0, RULE_block = 1, RULE_inline = 2, RULE_stat = 3, RULE_print = 4, 
		RULE_assign = 5, RULE_conditional = 6, RULE_whiles = 7, RULE_breaks = 8, 
		RULE_continues = 9, RULE_deffunc = 10, RULE_defobj = 11, RULE_returnst = 12, 
		RULE_iterate = 13, RULE_input = 14, RULE_expr = 15, RULE_val = 16, RULE_var = 17;
	public static final String[] ruleNames = {
		"file", "block", "inline", "stat", "print", "assign", "conditional", "whiles", 
		"breaks", "continues", "deffunc", "defobj", "returnst", "iterate", "input", 
		"expr", "val", "var"
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
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(36); match(NEWLINE);
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42); ((FileContext)_localctx).block = block();
			setState(43); match(EOF);
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
			setState(46); match(INDENT);
			 ((BlockContext)_localctx).b =  xuyu.pushBlock();
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48); ((BlockContext)_localctx).stat = stat();
				 xuyu.addStat(((BlockContext)_localctx).stat.s);
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << K_YI) | (1L << K_YAN) | (1L << K_RUO) | (1L << K_MDANG) | (1L << K_FSHI) | (1L << K_ZHI) | (1L << K_DE) | (1L << K_JU2) | (1L << K_WEN) | (1L << K_JU) | (1L << O_FEI) | (1L << CNFRAC) | (1L << CNNUM) | (1L << CNBOOL) | (1L << CNCHAR) | (1L << CNNOUN))) != 0) );
			setState(55); match(DEDENT);
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
			setState(70);
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
				 ((InlineContext)_localctx).b =  xuyu.pushBlock();
				setState(59); ((InlineContext)_localctx).stat = stat();
				 xuyu.addStat( ((InlineContext)_localctx).stat.s); xuyu.popBlock();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(62); match(NEWLINE);
					}
					}
					setState(65); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(67); ((InlineContext)_localctx).block = block();
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
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(72); ((StatContext)_localctx).print = print();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).print.s; 
				}
				break;

			case 2:
				{
				setState(75); ((StatContext)_localctx).assign = assign();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).assign.s; 
				}
				break;

			case 3:
				{
				setState(78); ((StatContext)_localctx).conditional = conditional();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).conditional.s; 
				}
				break;

			case 4:
				{
				setState(81); ((StatContext)_localctx).whiles = whiles();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).whiles.s; 
				}
				break;

			case 5:
				{
				setState(84); ((StatContext)_localctx).breaks = breaks();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).breaks.s; 
				}
				break;

			case 6:
				{
				setState(87); ((StatContext)_localctx).continues = continues();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).continues.s; 
				}
				break;

			case 7:
				{
				setState(90); ((StatContext)_localctx).deffunc = deffunc();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).deffunc.s; 
				}
				break;

			case 8:
				{
				setState(93); ((StatContext)_localctx).defobj = defobj();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).defobj.s;
				}
				break;

			case 9:
				{
				setState(96); ((StatContext)_localctx).returnst = returnst();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).returnst.s; 
				}
				break;

			case 10:
				{
				setState(99); ((StatContext)_localctx).iterate = iterate();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).iterate.s; 
				}
				break;

			case 11:
				{
				setState(102); ((StatContext)_localctx).expr = expr(0);
				 ((StatContext)_localctx).s =  new Stat.EXP( ((StatContext)_localctx).expr.v); 
				}
				break;

			case 12:
				{
				setState(105); input();
				}
				break;
			}
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(108); match(NEWLINE);
					}
					} 
				}
				setState(113);
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
			setState(114); match(K_YAN);
			setState(120);
			switch (_input.LA(1)) {
			case STRLIT:
				{
				setState(115); ((PrintContext)_localctx).STRLIT = match(STRLIT);
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
				setState(117); ((PrintContext)_localctx).expr = expr(0);
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
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(122); match(K_YI);
					}
					break;
				}
				setState(125); ((AssignContext)_localctx).expr = expr(0);
				setState(126); match(K_WEI);
				setState(127); ((AssignContext)_localctx).var = var();
				 ((AssignContext)_localctx).s =  new Stat.ASSIGN( (((AssignContext)_localctx).var!=null?_input.getText(((AssignContext)_localctx).var.start,((AssignContext)_localctx).var.stop):null), ((AssignContext)_localctx).expr.v);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130); ((AssignContext)_localctx).var = var();
				setState(131); match(O_JIN);
				setState(132); ((AssignContext)_localctx).expr = expr(0);
				 ((AssignContext)_localctx).s =  Stat.ASSIGN.Inplace((((AssignContext)_localctx).var!=null?_input.getText(((AssignContext)_localctx).var.start,((AssignContext)_localctx).var.stop):null), ((AssignContext)_localctx).expr.v, xuyu.currentBlock(), Exp.Eval.ADD);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135); ((AssignContext)_localctx).var = var();
				setState(136); match(O_TUI);
				setState(137); ((AssignContext)_localctx).expr = expr(0);
				 ((AssignContext)_localctx).s =  Stat.ASSIGN.Inplace((((AssignContext)_localctx).var!=null?_input.getText(((AssignContext)_localctx).var.start,((AssignContext)_localctx).var.stop):null), ((AssignContext)_localctx).expr.v, xuyu.currentBlock(), Exp.Eval.SUB);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140); ((AssignContext)_localctx).var = var();
				setState(141); match(O_JI);
				setState(142); ((AssignContext)_localctx).expr = expr(0);
				 ((AssignContext)_localctx).s =  Stat.ASSIGN.Inplace((((AssignContext)_localctx).var!=null?_input.getText(((AssignContext)_localctx).var.start,((AssignContext)_localctx).var.stop):null), ((AssignContext)_localctx).expr.v, xuyu.currentBlock(), Exp.Eval.MUL);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145); ((AssignContext)_localctx).var = var();
				setState(146); match(O_FEN);
				setState(147); ((AssignContext)_localctx).expr = expr(0);
				 ((AssignContext)_localctx).s =  Stat.ASSIGN.Inplace((((AssignContext)_localctx).var!=null?_input.getText(((AssignContext)_localctx).var.start,((AssignContext)_localctx).var.stop):null), ((AssignContext)_localctx).expr.v, xuyu.currentBlock(), Exp.Eval.DIV);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(150); match(K_JU);
				 xuyu.pushVals(); 
				setState(163);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << K_YI) | (1L << O_FEI) | (1L << CNFRAC) | (1L << CNNUM) | (1L << CNBOOL) | (1L << CNCHAR) | (1L << CNNOUN))) != 0)) {
					{
					setState(152); ((AssignContext)_localctx).expr = expr(0);
					 xuyu.putVal(((AssignContext)_localctx).expr.v);
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==K_DUN) {
						{
						{
						setState(154); match(K_DUN);
						setState(155); ((AssignContext)_localctx).expr = expr(0);
						 xuyu.putVal(((AssignContext)_localctx).expr.v);
						}
						}
						setState(162);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(165); match(K_CHENG);
				setState(166); ((AssignContext)_localctx).var = var();
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
			setState(171); match(K_RUO);
			setState(172); ((ConditionalContext)_localctx).expr = expr(0);
			setState(173); match(K_ZE);
			setState(174); ((ConditionalContext)_localctx).inline = inline();
			 ((ConditionalContext)_localctx).s =  new Stat.IF (((ConditionalContext)_localctx).expr.v, ((ConditionalContext)_localctx).inline.b); Stat.IF head = _localctx.s; 
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(176); match(NEWLINE);
						}
						}
						setState(181);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(182); match(K_YHUO);
					setState(183); ((ConditionalContext)_localctx).expr = expr(0);
					setState(184); match(K_ZE);
					setState(185); ((ConditionalContext)_localctx).inline = inline();
					 Stat.IF nh = new Stat.IF (((ConditionalContext)_localctx).expr.v, ((ConditionalContext)_localctx).inline.b); head.setElif(nh); head = nh;
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(203);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(193); match(NEWLINE);
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(199); match(K_FZE);
				setState(200); ((ConditionalContext)_localctx).inline = inline();
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
			setState(205); match(K_MDANG);
			setState(206); ((WhilesContext)_localctx).expr = expr(0);
			setState(207); match(K_ZE);
			setState(208); ((WhilesContext)_localctx).inline = inline();
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
			setState(211); match(K_ZHI);
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
			setState(214); match(K_FSHI);
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
			setState(217); match(K_YI);
			setState(229);
			_la = _input.LA(1);
			if (_la==CNCHAR || _la==CNNOUN) {
				{
				setState(218); ((DeffuncContext)_localctx).param = var();
				 xuyu.putId((((DeffuncContext)_localctx).param!=null?_input.getText(((DeffuncContext)_localctx).param.start,((DeffuncContext)_localctx).param.stop):null));
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_DUN) {
					{
					{
					setState(220); match(K_DUN);
					setState(221); ((DeffuncContext)_localctx).param = var();
					 xuyu.putId((((DeffuncContext)_localctx).param!=null?_input.getText(((DeffuncContext)_localctx).param.start,((DeffuncContext)_localctx).param.stop):null));
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(231); match(K_DE);
			setState(232); ((DeffuncContext)_localctx).func = var();
			setState(233); match(K_YUE);
			setState(234); ((DeffuncContext)_localctx).inline = inline();
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
			setState(237); ((DefobjContext)_localctx).a = var();
			setState(238); match(K_PIAN);
			setState(243);
			_la = _input.LA(1);
			if (_la==K_XU) {
				{
				setState(239); match(K_XU);
				setState(240); ((DefobjContext)_localctx).c = var();
				setState(241); match(K_PIAN);
				}
			}

			setState(246); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(245); match(NEWLINE);
				}
				}
				setState(248); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(250); ((DefobjContext)_localctx).b = block();
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
			setState(253); match(K_DE);
			setState(254); ((ReturnstContext)_localctx).expr = expr(0);
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
			setState(257); match(K_JU2);
			setState(258); ((IterateContext)_localctx).var = var();
			setState(259); match(K_YZHU);
			setState(260); ((IterateContext)_localctx).expr = expr(0);
			setState(262); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(261); match(NEWLINE);
				}
				}
				setState(264); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(266); ((IterateContext)_localctx).block = block();
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
			setState(269); match(K_WEN);
			setState(270); var();
			setState(271); match(K_HWEI);
			setState(272); var();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_DUN) {
				{
				{
				setState(273); match(K_DUN);
				setState(274); var();
				}
				}
				setState(279);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			switch (_input.LA(1)) {
			case O_FEI:
				{
				setState(281); match(O_FEI);
				setState(282); ((ExprContext)_localctx).a = expr(6);
				 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,null, Exp.Eval.NOT);
				}
				break;
			case 1:
				{
				setState(285); match(1);
				setState(286); ((ExprContext)_localctx).a = expr(0);
				setState(287); match(2);
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
				setState(290); ((ExprContext)_localctx).val = val(0);
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).val.v;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(380);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(295);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(296); match(O_CHENG);
						setState(297); ((ExprContext)_localctx).b = expr(20);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.MUL);
						}
						break;

					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(300);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(301); match(O_CHU);
						setState(302); ((ExprContext)_localctx).b = expr(19);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.DIV);
						}
						break;

					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(305);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(306); match(O_YU);
						setState(307); ((ExprContext)_localctx).b = expr(18);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.RMD);
						}
						break;

					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(310);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(311); match(O_JIA);
						setState(312); ((ExprContext)_localctx).b = expr(17);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.ADD);
						}
						break;

					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(315);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(316); match(O_JIAN);
						setState(317); ((ExprContext)_localctx).b = expr(16);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.SUB);
						}
						break;

					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(320);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(321); match(O_DA);
						setState(322); ((ExprContext)_localctx).b = expr(15);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.GT);
						}
						break;

					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(325);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(326); match(O_XIAO);
						setState(327); ((ExprContext)_localctx).b = expr(14);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.LT);
						}
						break;

					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(330);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(331); match(O_DENG);
						setState(332); ((ExprContext)_localctx).b = expr(13);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.EQ);
						}
						break;

					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(335);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(336); match(O_BDA);
						setState(337); ((ExprContext)_localctx).b = expr(12);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.NGT);
						}
						break;

					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(340);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(341); match(O_BXIAO);
						setState(342); ((ExprContext)_localctx).b = expr(11);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.NLT);
						}
						break;

					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(345);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(346); match(O_BDENG);
						setState(347); ((ExprContext)_localctx).b = expr(10);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.NEQ);
						}
						break;

					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(350);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(351); match(O_QIE);
						setState(352); ((ExprContext)_localctx).b = expr(9);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.AND);
						}
						break;

					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(355);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(356); match(O_HUO);
						setState(357); ((ExprContext)_localctx).b = expr(8);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.OR);
						}
						break;

					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(360);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(361); match(O_BHAN);
						setState(362); ((ExprContext)_localctx).b = expr(6);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).b.v,((ExprContext)_localctx).a.v, Exp.Eval.ISIN);
						}
						break;

					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(365);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(366); match(O_JZI);
						setState(367); ((ExprContext)_localctx).b = expr(5);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v,((ExprContext)_localctx).b.v, Exp.Eval.CUTL);
						}
						break;

					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(370);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(371); match(O_JZHI);
						setState(372); ((ExprContext)_localctx).b = expr(4);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v,((ExprContext)_localctx).b.v, Exp.Eval.CUTR);
						}
						break;

					case 17:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(375);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(376); match(O_BRU);
						setState(377); ((ExprContext)_localctx).b = expr(3);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v,((ExprContext)_localctx).b.v, Exp.Eval.JOIN);
						}
						break;
					}
					} 
				}
				setState(384);
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
		public VarContext b;
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode K_QI() { return getToken(XuyuParser.K_QI, 0); }
		public TerminalNode CNFRAC() { return getToken(XuyuParser.CNFRAC, 0); }
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_val, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			switch (_input.LA(1)) {
			case K_YI:
				{
				setState(386); match(K_YI);
				 xuyu.pushVals(); 
				setState(399);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << K_YI) | (1L << O_FEI) | (1L << CNFRAC) | (1L << CNNUM) | (1L << CNBOOL) | (1L << CNCHAR) | (1L << CNNOUN))) != 0)) {
					{
					setState(388); ((ValContext)_localctx).param = expr(0);
					 xuyu.putVal(((ValContext)_localctx).param.v);
					setState(396);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==K_DUN) {
						{
						{
						setState(390); match(K_DUN);
						setState(391); ((ValContext)_localctx).param = expr(0);
						 xuyu.putVal(((ValContext)_localctx).param.v);
						}
						}
						setState(398);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(401); match(K_QIU);
				setState(402); ((ValContext)_localctx).func = val(1);
				 ((ValContext)_localctx).v =  new Exp.Call(((ValContext)_localctx).func.v, xuyu.popVals());
				}
				break;
			case CNNUM:
				{
				setState(405); ((ValContext)_localctx).CNNUM = match(CNNUM);
				 ((ValContext)_localctx).v =  new Exp.Num(ParserUtil.parseInt((((ValContext)_localctx).CNNUM!=null?((ValContext)_localctx).CNNUM.getText():null)));
				}
				break;
			case CNFRAC:
				{
				setState(407); match(CNFRAC);
				}
				break;
			case CNBOOL:
				{
				setState(408); ((ValContext)_localctx).CNBOOL = match(CNBOOL);
				 ((ValContext)_localctx).v =  new Exp.Num( "阳".equals((((ValContext)_localctx).CNBOOL!=null?((ValContext)_localctx).CNBOOL.getText():null)) ? 1 : 0); 
				}
				break;
			case CNCHAR:
			case CNNOUN:
				{
				setState(410); ((ValContext)_localctx).var = var();
				 ((ValContext)_localctx).v =  new Exp.Var((((ValContext)_localctx).var!=null?_input.getText(((ValContext)_localctx).var.start,((ValContext)_localctx).var.stop):null), xuyu.currentBlock());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(424);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ValContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_val);
						setState(415);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(416); match(K_QI);
						setState(417); ((ValContext)_localctx).CNNUM = match(CNNUM);
						 ((ValContext)_localctx).v =  new Exp.Index( ((ValContext)_localctx).a.v, ParserUtil.parseInt((((ValContext)_localctx).CNNUM!=null?((ValContext)_localctx).CNNUM.getText():null)) - 1); 
						}
						break;

					case 2:
						{
						_localctx = new ValContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_val);
						setState(419);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(420); match(A_ZHI);
						setState(421); ((ValContext)_localctx).b = ((ValContext)_localctx).var = var();
						 ((ValContext)_localctx).v =  new Exp.Var((((ValContext)_localctx).b!=null?_input.getText(((ValContext)_localctx).b.start,((ValContext)_localctx).b.stop):null), ((ValContext)_localctx).a.v); 
						}
						break;
					}
					} 
				}
				setState(428);
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
		enterRule(_localctx, 34, RULE_var);
		try {
			int _alt;
			setState(435);
			switch (_input.LA(1)) {
			case CNCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(430); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(429); match(CNCHAR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(432); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
				}
				break;
			case CNNOUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(434); match(CNNOUN);
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
		case 15: return expr_sempred((ExprContext)_localctx, predIndex);

		case 16: return val_sempred((ValContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3A\u01b8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\6\3\66\n\3\r\3\16\3\67\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\6\4B\n\4\r"+
		"\4\16\4C\3\4\3\4\3\4\5\4I\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5m\n\5\3\5\7\5p\n\5\f\5\16\5s\13\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6{\n\6\3\7\5\7~\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a1\n\7\f\7\16\7\u00a4\13\7\5\7"+
		"\u00a6\n\7\3\7\3\7\3\7\3\7\5\7\u00ac\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00b4"+
		"\n\b\f\b\16\b\u00b7\13\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00bf\n\b\f\b\16"+
		"\b\u00c2\13\b\3\b\7\b\u00c5\n\b\f\b\16\b\u00c8\13\b\3\b\3\b\3\b\3\b\5"+
		"\b\u00ce\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\7\f\u00e3\n\f\f\f\16\f\u00e6\13\f\5\f\u00e8\n\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f6\n\r\3\r\6\r"+
		"\u00f9\n\r\r\r\16\r\u00fa\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\6\17\u0109\n\17\r\17\16\17\u010a\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u0116\n\20\f\20\16\20\u0119\13\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0128\n\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u017f\n\21\f\21\16\21\u0182\13\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u018d\n\22\f\22\16\22\u0190\13\22\5\22\u0192"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u01a0\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u01ab\n"+
		"\22\f\22\16\22\u01ae\13\22\3\23\6\23\u01b1\n\23\r\23\16\23\u01b2\3\23"+
		"\5\23\u01b6\n\23\3\23\2\4 \"\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$\2\2\u01e5\2)\3\2\2\2\4\60\3\2\2\2\6H\3\2\2\2\bl\3\2\2\2\nt\3\2\2"+
		"\2\f\u00ab\3\2\2\2\16\u00ad\3\2\2\2\20\u00cf\3\2\2\2\22\u00d5\3\2\2\2"+
		"\24\u00d8\3\2\2\2\26\u00db\3\2\2\2\30\u00ef\3\2\2\2\32\u00ff\3\2\2\2\34"+
		"\u0103\3\2\2\2\36\u010f\3\2\2\2 \u0127\3\2\2\2\"\u019f\3\2\2\2$\u01b5"+
		"\3\2\2\2&(\7@\2\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2"+
		"+)\3\2\2\2,-\5\4\3\2-.\7\2\2\3./\b\2\1\2/\3\3\2\2\2\60\61\7\64\2\2\61"+
		"\65\b\3\1\2\62\63\5\b\5\2\63\64\b\3\1\2\64\66\3\2\2\2\65\62\3\2\2\2\66"+
		"\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\289\3\2\2\29:\7\65\2\2:;\b\3\1\2;"+
		"\5\3\2\2\2<=\b\4\1\2=>\5\b\5\2>?\b\4\1\2?I\3\2\2\2@B\7@\2\2A@\3\2\2\2"+
		"BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\5\4\3\2FG\b\4\1\2GI\3\2\2\2"+
		"H<\3\2\2\2HA\3\2\2\2I\7\3\2\2\2JK\5\n\6\2KL\b\5\1\2Lm\3\2\2\2MN\5\f\7"+
		"\2NO\b\5\1\2Om\3\2\2\2PQ\5\16\b\2QR\b\5\1\2Rm\3\2\2\2ST\5\20\t\2TU\b\5"+
		"\1\2Um\3\2\2\2VW\5\22\n\2WX\b\5\1\2Xm\3\2\2\2YZ\5\24\13\2Z[\b\5\1\2[m"+
		"\3\2\2\2\\]\5\26\f\2]^\b\5\1\2^m\3\2\2\2_`\5\30\r\2`a\b\5\1\2am\3\2\2"+
		"\2bc\5\32\16\2cd\b\5\1\2dm\3\2\2\2ef\5\34\17\2fg\b\5\1\2gm\3\2\2\2hi\5"+
		" \21\2ij\b\5\1\2jm\3\2\2\2km\5\36\20\2lJ\3\2\2\2lM\3\2\2\2lP\3\2\2\2l"+
		"S\3\2\2\2lV\3\2\2\2lY\3\2\2\2l\\\3\2\2\2l_\3\2\2\2lb\3\2\2\2le\3\2\2\2"+
		"lh\3\2\2\2lk\3\2\2\2mq\3\2\2\2np\7@\2\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2"+
		"qr\3\2\2\2r\t\3\2\2\2sq\3\2\2\2tz\7\b\2\2uv\7\67\2\2v{\b\6\1\2wx\5 \21"+
		"\2xy\b\6\1\2y{\3\2\2\2zu\3\2\2\2zw\3\2\2\2{\13\3\2\2\2|~\7\6\2\2}|\3\2"+
		"\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\5 \21\2\u0080\u0081\7\7\2\2\u0081"+
		"\u0082\5$\23\2\u0082\u0083\b\7\1\2\u0083\u00ac\3\2\2\2\u0084\u0085\5$"+
		"\23\2\u0085\u0086\7\36\2\2\u0086\u0087\5 \21\2\u0087\u0088\b\7\1\2\u0088"+
		"\u00ac\3\2\2\2\u0089\u008a\5$\23\2\u008a\u008b\7\37\2\2\u008b\u008c\5"+
		" \21\2\u008c\u008d\b\7\1\2\u008d\u00ac\3\2\2\2\u008e\u008f\5$\23\2\u008f"+
		"\u0090\7 \2\2\u0090\u0091\5 \21\2\u0091\u0092\b\7\1\2\u0092\u00ac\3\2"+
		"\2\2\u0093\u0094\5$\23\2\u0094\u0095\7!\2\2\u0095\u0096\5 \21\2\u0096"+
		"\u0097\b\7\1\2\u0097\u00ac\3\2\2\2\u0098\u0099\7\31\2\2\u0099\u00a5\b"+
		"\7\1\2\u009a\u009b\5 \21\2\u009b\u00a2\b\7\1\2\u009c\u009d\7\25\2\2\u009d"+
		"\u009e\5 \21\2\u009e\u009f\b\7\1\2\u009f\u00a1\3\2\2\2\u00a0\u009c\3\2"+
		"\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u009a\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\32\2\2\u00a8\u00a9\5$\23\2\u00a9"+
		"\u00aa\b\7\1\2\u00aa\u00ac\3\2\2\2\u00ab}\3\2\2\2\u00ab\u0084\3\2\2\2"+
		"\u00ab\u0089\3\2\2\2\u00ab\u008e\3\2\2\2\u00ab\u0093\3\2\2\2\u00ab\u0098"+
		"\3\2\2\2\u00ac\r\3\2\2\2\u00ad\u00ae\7\n\2\2\u00ae\u00af\5 \21\2\u00af"+
		"\u00b0\7\f\2\2\u00b0\u00b1\5\6\4\2\u00b1\u00c0\b\b\1\2\u00b2\u00b4\7@"+
		"\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7\r"+
		"\2\2\u00b9\u00ba\5 \21\2\u00ba\u00bb\7\f\2\2\u00bb\u00bc\5\6\4\2\u00bc"+
		"\u00bd\b\b\1\2\u00bd\u00bf\3\2\2\2\u00be\u00b5\3\2\2\2\u00bf\u00c2\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00cd\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c5\7@\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c9\u00ca\7\13\2\2\u00ca\u00cb\5\6\4\2\u00cb\u00cc\b"+
		"\b\1\2\u00cc\u00ce\3\2\2\2\u00cd\u00c6\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\17\3\2\2\2\u00cf\u00d0\7\16\2\2\u00d0\u00d1\5 \21\2\u00d1\u00d2\7\f\2"+
		"\2\u00d2\u00d3\5\6\4\2\u00d3\u00d4\b\t\1\2\u00d4\21\3\2\2\2\u00d5\u00d6"+
		"\7\20\2\2\u00d6\u00d7\b\n\1\2\u00d7\23\3\2\2\2\u00d8\u00d9\7\17\2\2\u00d9"+
		"\u00da\b\13\1\2\u00da\25\3\2\2\2\u00db\u00e7\7\6\2\2\u00dc\u00dd\5$\23"+
		"\2\u00dd\u00e4\b\f\1\2\u00de\u00df\7\25\2\2\u00df\u00e0\5$\23\2\u00e0"+
		"\u00e1\b\f\1\2\u00e1\u00e3\3\2\2\2\u00e2\u00de\3\2\2\2\u00e3\u00e6\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00dc\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00ea\7\23\2\2\u00ea\u00eb\5$\23\2\u00eb\u00ec\7\22\2\2\u00ec"+
		"\u00ed\5\6\4\2\u00ed\u00ee\b\f\1\2\u00ee\27\3\2\2\2\u00ef\u00f0\5$\23"+
		"\2\u00f0\u00f5\7\34\2\2\u00f1\u00f2\7\35\2\2\u00f2\u00f3\5$\23\2\u00f3"+
		"\u00f4\7\34\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f5\u00f6\3"+
		"\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f9\7@\2\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc\u00fd\5\4\3\2\u00fd\u00fe\b\r\1\2\u00fe\31\3\2\2\2\u00ff\u0100"+
		"\7\23\2\2\u0100\u0101\5 \21\2\u0101\u0102\b\16\1\2\u0102\33\3\2\2\2\u0103"+
		"\u0104\7\26\2\2\u0104\u0105\5$\23\2\u0105\u0106\7\27\2\2\u0106\u0108\5"+
		" \21\2\u0107\u0109\7@\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\5\4"+
		"\3\2\u010d\u010e\b\17\1\2\u010e\35\3\2\2\2\u010f\u0110\7\30\2\2\u0110"+
		"\u0111\5$\23\2\u0111\u0112\7\5\2\2\u0112\u0117\5$\23\2\u0113\u0114\7\25"+
		"\2\2\u0114\u0116\5$\23\2\u0115\u0113\3\2\2\2\u0116\u0119\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\37\3\2\2\2\u0119\u0117\3\2\2"+
		"\2\u011a\u011b\b\21\1\2\u011b\u011c\7/\2\2\u011c\u011d\5 \21\b\u011d\u011e"+
		"\b\21\1\2\u011e\u0128\3\2\2\2\u011f\u0120\7\3\2\2\u0120\u0121\5 \21\2"+
		"\u0121\u0122\7\4\2\2\u0122\u0123\b\21\1\2\u0123\u0128\3\2\2\2\u0124\u0125"+
		"\5\"\22\2\u0125\u0126\b\21\1\2\u0126\u0128\3\2\2\2\u0127\u011a\3\2\2\2"+
		"\u0127\u011f\3\2\2\2\u0127\u0124\3\2\2\2\u0128\u0180\3\2\2\2\u0129\u012a"+
		"\f\25\2\2\u012a\u012b\7$\2\2\u012b\u012c\5 \21\26\u012c\u012d\b\21\1\2"+
		"\u012d\u017f\3\2\2\2\u012e\u012f\f\24\2\2\u012f\u0130\7%\2\2\u0130\u0131"+
		"\5 \21\25\u0131\u0132\b\21\1\2\u0132\u017f\3\2\2\2\u0133\u0134\f\23\2"+
		"\2\u0134\u0135\7&\2\2\u0135\u0136\5 \21\24\u0136\u0137\b\21\1\2\u0137"+
		"\u017f\3\2\2\2\u0138\u0139\f\22\2\2\u0139\u013a\7\"\2\2\u013a\u013b\5"+
		" \21\23\u013b\u013c\b\21\1\2\u013c\u017f\3\2\2\2\u013d\u013e\f\21\2\2"+
		"\u013e\u013f\7#\2\2\u013f\u0140\5 \21\22\u0140\u0141\b\21\1\2\u0141\u017f"+
		"\3\2\2\2\u0142\u0143\f\20\2\2\u0143\u0144\7\'\2\2\u0144\u0145\5 \21\21"+
		"\u0145\u0146\b\21\1\2\u0146\u017f\3\2\2\2\u0147\u0148\f\17\2\2\u0148\u0149"+
		"\7(\2\2\u0149\u014a\5 \21\20\u014a\u014b\b\21\1\2\u014b\u017f\3\2\2\2"+
		"\u014c\u014d\f\16\2\2\u014d\u014e\7)\2\2\u014e\u014f\5 \21\17\u014f\u0150"+
		"\b\21\1\2\u0150\u017f\3\2\2\2\u0151\u0152\f\r\2\2\u0152\u0153\7*\2\2\u0153"+
		"\u0154\5 \21\16\u0154\u0155\b\21\1\2\u0155\u017f\3\2\2\2\u0156\u0157\f"+
		"\f\2\2\u0157\u0158\7+\2\2\u0158\u0159\5 \21\r\u0159\u015a\b\21\1\2\u015a"+
		"\u017f\3\2\2\2\u015b\u015c\f\13\2\2\u015c\u015d\7,\2\2\u015d\u015e\5 "+
		"\21\f\u015e\u015f\b\21\1\2\u015f\u017f\3\2\2\2\u0160\u0161\f\n\2\2\u0161"+
		"\u0162\7-\2\2\u0162\u0163\5 \21\13\u0163\u0164\b\21\1\2\u0164\u017f\3"+
		"\2\2\2\u0165\u0166\f\t\2\2\u0166\u0167\7.\2\2\u0167\u0168\5 \21\n\u0168"+
		"\u0169\b\21\1\2\u0169\u017f\3\2\2\2\u016a\u016b\f\7\2\2\u016b\u016c\7"+
		"\60\2\2\u016c\u016d\5 \21\b\u016d\u016e\b\21\1\2\u016e\u017f\3\2\2\2\u016f"+
		"\u0170\f\6\2\2\u0170\u0171\7\61\2\2\u0171\u0172\5 \21\7\u0172\u0173\b"+
		"\21\1\2\u0173\u017f\3\2\2\2\u0174\u0175\f\5\2\2\u0175\u0176\7\62\2\2\u0176"+
		"\u0177\5 \21\6\u0177\u0178\b\21\1\2\u0178\u017f\3\2\2\2\u0179\u017a\f"+
		"\4\2\2\u017a\u017b\7\63\2\2\u017b\u017c\5 \21\5\u017c\u017d\b\21\1\2\u017d"+
		"\u017f\3\2\2\2\u017e\u0129\3\2\2\2\u017e\u012e\3\2\2\2\u017e\u0133\3\2"+
		"\2\2\u017e\u0138\3\2\2\2\u017e\u013d\3\2\2\2\u017e\u0142\3\2\2\2\u017e"+
		"\u0147\3\2\2\2\u017e\u014c\3\2\2\2\u017e\u0151\3\2\2\2\u017e\u0156\3\2"+
		"\2\2\u017e\u015b\3\2\2\2\u017e\u0160\3\2\2\2\u017e\u0165\3\2\2\2\u017e"+
		"\u016a\3\2\2\2\u017e\u016f\3\2\2\2\u017e\u0174\3\2\2\2\u017e\u0179\3\2"+
		"\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"!\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\b\22\1\2\u0184\u0185\7\6\2\2"+
		"\u0185\u0191\b\22\1\2\u0186\u0187\5 \21\2\u0187\u018e\b\22\1\2\u0188\u0189"+
		"\7\25\2\2\u0189\u018a\5 \21\2\u018a\u018b\b\22\1\2\u018b\u018d\3\2\2\2"+
		"\u018c\u0188\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f"+
		"\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0186\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\7\21\2\2\u0194\u0195\5"+
		"\"\22\3\u0195\u0196\b\22\1\2\u0196\u01a0\3\2\2\2\u0197\u0198\7<\2\2\u0198"+
		"\u01a0\b\22\1\2\u0199\u01a0\7;\2\2\u019a\u019b\7=\2\2\u019b\u01a0\b\22"+
		"\1\2\u019c\u019d\5$\23\2\u019d\u019e\b\22\1\2\u019e\u01a0\3\2\2\2\u019f"+
		"\u0183\3\2\2\2\u019f\u0197\3\2\2\2\u019f\u0199\3\2\2\2\u019f\u019a\3\2"+
		"\2\2\u019f\u019c\3\2\2\2\u01a0\u01ac\3\2\2\2\u01a1\u01a2\f\5\2\2\u01a2"+
		"\u01a3\7\24\2\2\u01a3\u01a4\7<\2\2\u01a4\u01ab\b\22\1\2\u01a5\u01a6\f"+
		"\4\2\2\u01a6\u01a7\7\33\2\2\u01a7\u01a8\5$\23\2\u01a8\u01a9\b\22\1\2\u01a9"+
		"\u01ab\3\2\2\2\u01aa\u01a1\3\2\2\2\u01aa\u01a5\3\2\2\2\u01ab\u01ae\3\2"+
		"\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad#\3\2\2\2\u01ae\u01ac"+
		"\3\2\2\2\u01af\u01b1\7>\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b6\7?"+
		"\2\2\u01b5\u01b0\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6%\3\2\2\2!)\67CHlqz"+
		"}\u00a2\u00a5\u00ab\u00b5\u00c0\u00c6\u00cd\u00e4\u00e7\u00f5\u00fa\u010a"+
		"\u0117\u0127\u017e\u0180\u018e\u0191\u019f\u01aa\u01ac\u01b2\u01b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}