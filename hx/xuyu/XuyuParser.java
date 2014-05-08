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
		T__1=1, T__0=2, K_HWEI=3, K_YI=4, K_WEI=5, K_YYUN=6, K_ZHONG=7, K_RUO=8, 
		K_FZE=9, K_ZE=10, K_YHUO=11, K_MDANG=12, K_FSHI=13, K_ZHI=14, K_QIU=15, 
		K_YUE=16, K_DE=17, K_DUN=18, K_LSHU=19, K_WEN=20, A_ZHI=21, O_JIN=22, 
		O_TUI=23, O_JI=24, O_FEN=25, O_JIA=26, O_JIAN=27, O_CHENG=28, O_CHU=29, 
		O_YU=30, O_DA=31, O_XIAO=32, O_DENG=33, O_BDA=34, O_BXIAO=35, O_BDENG=36, 
		O_QIE=37, O_HUO=38, O_FEI=39, O_BHAN=40, O_CQU=41, O_BYU=42, INDENT=43, 
		DEDENT=44, COMMENT=45, STRLIT=46, DENT=47, WORD=48, NUM=49, CNFRAC=50, 
		CNNUM=51, CNBOOL=52, CNCHAR=53, NEWLINE=54, WS=55;
	public static final String[] tokenNames = {
		"<INVALID>", "'（'", "'）'", "'何为'", "K_YI", "'为'", "'有云'", "'众'", "K_RUO", 
		"'否则'", "'则'", "'抑或'", "'每当'", "'复始'", "'止'", "'求'", "'曰'", "'得'", "'、'", 
		"'历数'", "'问'", "'之'", "'进以'", "'退以'", "'积以'", "'分以'", "'加以'", "'减以'", 
		"'乘以'", "'除以'", "'余以'", "'大于'", "'小于'", "'等于'", "'不大于'", "'不小于'", "'不等于'", 
		"'且'", "'或'", "'非'", "'包含'", "'除去'", "'并于'", "INDENT", "DEDENT", "COMMENT", 
		"STRLIT", "DENT", "WORD", "NUM", "CNFRAC", "CNNUM", "CNBOOL", "CNCHAR", 
		"NEWLINE", "WS"
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
		public BlockContext block;
		public TerminalNode EOF() { return getToken(XuyuParser.EOF, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); ((FileContext)_localctx).block = block();
			setState(35); match(EOF);
			 ((FileContext)_localctx).block.b.exec();
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
			setState(38); match(INDENT);
			 ((BlockContext)_localctx).b =  xuyu.pushBlock();
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40); ((BlockContext)_localctx).stat = stat();
				 xuyu.addStat(((BlockContext)_localctx).stat.s);
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << K_YI) | (1L << K_YYUN) | (1L << K_RUO) | (1L << K_MDANG) | (1L << K_FSHI) | (1L << K_ZHI) | (1L << K_DE) | (1L << K_LSHU) | (1L << K_WEN) | (1L << O_FEI) | (1L << CNFRAC) | (1L << CNNUM) | (1L << CNBOOL) | (1L << CNCHAR))) != 0) );
			setState(47); match(DEDENT);
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
			setState(61);
			switch (_input.LA(1)) {
			case 1:
			case K_YI:
			case K_YYUN:
			case K_RUO:
			case K_MDANG:
			case K_FSHI:
			case K_ZHI:
			case K_DE:
			case K_LSHU:
			case K_WEN:
			case O_FEI:
			case CNFRAC:
			case CNNUM:
			case CNBOOL:
			case CNCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(50); ((InlineContext)_localctx).stat = stat();
				 ((InlineContext)_localctx).b =  xuyu.pushBlock(); xuyu.addStat( ((InlineContext)_localctx).stat.s); xuyu.popBlock();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(53); match(NEWLINE);
					}
					}
					setState(56); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(58); ((InlineContext)_localctx).block = block();
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
			setState(92);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(63); ((StatContext)_localctx).expr = expr(0);
				 ((StatContext)_localctx).s =  new Stat.EXP( ((StatContext)_localctx).expr.v); 
				}
				break;

			case 2:
				{
				setState(66); ((StatContext)_localctx).print = print();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).print.s; 
				}
				break;

			case 3:
				{
				setState(69); ((StatContext)_localctx).assign = assign();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).assign.s; 
				}
				break;

			case 4:
				{
				setState(72); ((StatContext)_localctx).conditional = conditional();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).conditional.s; 
				}
				break;

			case 5:
				{
				setState(75); ((StatContext)_localctx).whiles = whiles();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).whiles.s; 
				}
				break;

			case 6:
				{
				setState(78); ((StatContext)_localctx).breaks = breaks();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).breaks.s; 
				}
				break;

			case 7:
				{
				setState(81); ((StatContext)_localctx).continues = continues();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).continues.s; 
				}
				break;

			case 8:
				{
				setState(84); ((StatContext)_localctx).deffunc = deffunc();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).deffunc.s; 
				}
				break;

			case 9:
				{
				setState(87); ((StatContext)_localctx).returnst = returnst();
				 ((StatContext)_localctx).s =  ((StatContext)_localctx).returnst.s; 
				}
				break;

			case 10:
				{
				setState(90); iterate();
				}
				break;

			case 11:
				{
				setState(91); input();
				}
				break;
			}
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94); match(NEWLINE);
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		public TerminalNode K_YYUN() { return getToken(XuyuParser.K_YYUN, 0); }
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
			setState(100); match(K_YYUN);
			setState(106);
			switch (_input.LA(1)) {
			case STRLIT:
				{
				setState(101); ((PrintContext)_localctx).STRLIT = match(STRLIT);
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
				{
				setState(103); ((PrintContext)_localctx).expr = expr(0);
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
		public TerminalNode K_WEI() { return getToken(XuyuParser.K_WEI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode O_FEN() { return getToken(XuyuParser.O_FEN, 0); }
		public TerminalNode O_TUI() { return getToken(XuyuParser.O_TUI, 0); }
		public TerminalNode K_YI() { return getToken(XuyuParser.K_YI, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
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
		try {
			setState(136);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(108); match(K_YI);
					}
					break;
				}
				setState(111); ((AssignContext)_localctx).expr = expr(0);
				setState(112); match(K_WEI);
				setState(113); ((AssignContext)_localctx).var = var();
				 ((AssignContext)_localctx).s =  new Stat.ASSIGN( (((AssignContext)_localctx).var!=null?_input.getText(((AssignContext)_localctx).var.start,((AssignContext)_localctx).var.stop):null), ((AssignContext)_localctx).expr.v);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116); ((AssignContext)_localctx).var = var();
				setState(117); match(O_JIN);
				setState(118); ((AssignContext)_localctx).expr = expr(0);
				 ((AssignContext)_localctx).s =  Stat.ASSIGN.Inplace((((AssignContext)_localctx).var!=null?_input.getText(((AssignContext)_localctx).var.start,((AssignContext)_localctx).var.stop):null), ((AssignContext)_localctx).expr.v, xuyu.currentBlock(), Exp.Eval.ADD);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121); ((AssignContext)_localctx).var = var();
				setState(122); match(O_TUI);
				setState(123); ((AssignContext)_localctx).expr = expr(0);
				 ((AssignContext)_localctx).s =  Stat.ASSIGN.Inplace((((AssignContext)_localctx).var!=null?_input.getText(((AssignContext)_localctx).var.start,((AssignContext)_localctx).var.stop):null), ((AssignContext)_localctx).expr.v, xuyu.currentBlock(), Exp.Eval.SUB);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126); ((AssignContext)_localctx).var = var();
				setState(127); match(O_JI);
				setState(128); ((AssignContext)_localctx).expr = expr(0);
				 ((AssignContext)_localctx).s =  Stat.ASSIGN.Inplace((((AssignContext)_localctx).var!=null?_input.getText(((AssignContext)_localctx).var.start,((AssignContext)_localctx).var.stop):null), ((AssignContext)_localctx).expr.v, xuyu.currentBlock(), Exp.Eval.MUL);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(131); ((AssignContext)_localctx).var = var();
				setState(132); match(O_FEN);
				setState(133); ((AssignContext)_localctx).expr = expr(0);
				 ((AssignContext)_localctx).s =  Stat.ASSIGN.Inplace((((AssignContext)_localctx).var!=null?_input.getText(((AssignContext)_localctx).var.start,((AssignContext)_localctx).var.stop):null), ((AssignContext)_localctx).expr.v, xuyu.currentBlock(), Exp.Eval.DIV);
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
			setState(138); match(K_RUO);
			setState(139); ((ConditionalContext)_localctx).expr = expr(0);
			setState(140); match(K_ZE);
			setState(141); ((ConditionalContext)_localctx).inline = inline();
			 ((ConditionalContext)_localctx).s =  new Stat.IF (((ConditionalContext)_localctx).expr.v, ((ConditionalContext)_localctx).inline.b); Stat.IF head = _localctx.s; 
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(143); match(NEWLINE);
						}
						}
						setState(148);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(149); match(K_YHUO);
					setState(150); ((ConditionalContext)_localctx).expr = expr(0);
					setState(151); match(K_ZE);
					setState(152); ((ConditionalContext)_localctx).inline = inline();
					 Stat.IF nh = new Stat.IF (((ConditionalContext)_localctx).expr.v, ((ConditionalContext)_localctx).inline.b); head.setElif(nh); head = nh;
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(170);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(160); match(NEWLINE);
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166); match(K_FZE);
				setState(167); ((ConditionalContext)_localctx).inline = inline();
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
			setState(172); match(K_MDANG);
			setState(173); ((WhilesContext)_localctx).expr = expr(0);
			setState(174); match(K_ZE);
			setState(175); ((WhilesContext)_localctx).inline = inline();
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
			setState(178); match(K_ZHI);
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
			setState(181); match(K_FSHI);
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
		public List<TerminalNode> NEWLINE() { return getTokens(XuyuParser.NEWLINE); }
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode K_DE() { return getToken(XuyuParser.K_DE, 0); }
		public TerminalNode NEWLINE(int i) {
			return getToken(XuyuParser.NEWLINE, i);
		}
		public TerminalNode K_YUE() { return getToken(XuyuParser.K_YUE, 0); }
		public List<TerminalNode> K_DUN() { return getTokens(XuyuParser.K_DUN); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode K_YI() { return getToken(XuyuParser.K_YI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
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
			setState(184); match(K_YI);
			setState(193);
			_la = _input.LA(1);
			if (_la==CNCHAR) {
				{
				setState(185); var();
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_DUN) {
					{
					{
					setState(186); match(K_DUN);
					setState(187); var();
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(195); match(K_DE);
			setState(196); var();
			setState(205);
			switch (_input.LA(1)) {
			case K_YUE:
				{
				setState(197); match(K_YUE);
				setState(198); stat();
				}
				break;
			case NEWLINE:
				{
				setState(200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(199); match(NEWLINE);
					}
					}
					setState(202); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(204); block();
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

	public static class ReturnstContext extends ParserRuleContext {
		public Stat s;
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
			setState(207); match(K_DE);
			setState(208); expr(0);
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
		public List<TerminalNode> NEWLINE() { return getTokens(XuyuParser.NEWLINE); }
		public TerminalNode K_LSHU() { return getToken(XuyuParser.K_LSHU, 0); }
		public TerminalNode NEWLINE(int i) {
			return getToken(XuyuParser.NEWLINE, i);
		}
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
			setState(210); match(K_LSHU);
			setState(211); var();
			setState(213); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(212); match(NEWLINE);
				}
				}
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(217); block();
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
			setState(219); match(K_WEN);
			setState(220); var();
			setState(221); match(K_HWEI);
			setState(222); var();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_DUN) {
				{
				{
				setState(223); match(K_DUN);
				setState(224); var();
				}
				}
				setState(229);
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
		public ExprContext expr;
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
			setState(243);
			switch (_input.LA(1)) {
			case O_FEI:
				{
				setState(231); match(O_FEI);
				setState(232); ((ExprContext)_localctx).a = ((ExprContext)_localctx).expr = expr(5);
				 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,null, Exp.Eval.NOT);
				}
				break;
			case 1:
				{
				setState(235); match(1);
				setState(236); ((ExprContext)_localctx).expr = expr(0);
				setState(237); match(2);
				 ((ExprContext)_localctx).v =  _localctx.v; 
				}
				break;
			case K_YI:
			case CNFRAC:
			case CNNUM:
			case CNBOOL:
			case CNCHAR:
				{
				setState(240); ((ExprContext)_localctx).val = val();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).val.v;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(319);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(246); match(O_CHENG);
						setState(247); ((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(19);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.MUL);
						}
						break;

					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(250);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(251); match(O_CHU);
						setState(252); ((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(18);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.DIV);
						}
						break;

					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(255);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(256); match(O_YU);
						setState(257); ((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(17);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.RMD);
						}
						break;

					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(260);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(261); match(O_JIA);
						setState(262); ((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(16);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.ADD);
						}
						break;

					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(265);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(266); match(O_JIAN);
						setState(267); ((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(15);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.SUB);
						}
						break;

					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(270);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(271); match(O_DA);
						setState(272); ((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(14);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.GT);
						}
						break;

					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(275);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(276); match(O_XIAO);
						setState(277); ((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(13);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.LT);
						}
						break;

					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(280);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(281); match(O_DENG);
						setState(282); ((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(12);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.EQ);
						}
						break;

					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(285);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(286); match(O_BDA);
						setState(287); ((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(11);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.NGT);
						}
						break;

					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(290);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(291); match(O_BXIAO);
						setState(292); ((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(10);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.NLT);
						}
						break;

					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(295);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(296); match(O_BDENG);
						setState(297); ((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(9);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.NEQ);
						}
						break;

					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(300);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(301); match(O_QIE);
						setState(302); ((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(8);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.AND);
						}
						break;

					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(305);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(306); match(O_HUO);
						setState(307); ((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(7);
						 ((ExprContext)_localctx).v =  new Exp.Eval(((ExprContext)_localctx).a.v ,((ExprContext)_localctx).b.v, Exp.Eval.OR);
						}
						break;

					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(310);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(311); match(O_BHAN);
						setState(312); ((ExprContext)_localctx).expr = expr(5);
						}
						break;

					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(313);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(314); match(O_CQU);
						setState(315); ((ExprContext)_localctx).expr = expr(4);
						}
						break;

					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(316);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(317); match(O_BYU);
						setState(318); ((ExprContext)_localctx).expr = expr(3);
						}
						break;
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		public Token CNNUM;
		public VarContext var;
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
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_val);
		int _la;
		try {
			setState(344);
			switch (_input.LA(1)) {
			case CNNUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(324); ((ValContext)_localctx).CNNUM = match(CNNUM);
				 ((ValContext)_localctx).v =  new Exp.Num(ParserUtil.parseInt((((ValContext)_localctx).CNNUM!=null?((ValContext)_localctx).CNNUM.getText():null)));
				}
				break;
			case CNFRAC:
				enterOuterAlt(_localctx, 2);
				{
				setState(326); match(CNFRAC);
				}
				break;
			case CNBOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(327); match(CNBOOL);
				}
				break;
			case CNCHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(328); ((ValContext)_localctx).var = var();
				 ((ValContext)_localctx).v =  new Exp.Var((((ValContext)_localctx).var!=null?_input.getText(((ValContext)_localctx).var.start,((ValContext)_localctx).var.stop):null), xuyu.currentBlock());
				}
				break;
			case K_YI:
				enterOuterAlt(_localctx, 5);
				{
				setState(331); match(K_YI);
				setState(340);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << K_YI) | (1L << O_FEI) | (1L << CNFRAC) | (1L << CNNUM) | (1L << CNBOOL) | (1L << CNCHAR))) != 0)) {
					{
					setState(332); expr(0);
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==K_DUN) {
						{
						{
						setState(333); match(K_DUN);
						setState(334); expr(0);
						}
						}
						setState(339);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(342); match(K_QIU);
				setState(343); var();
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

	public static class VarContext extends ParserRuleContext {
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
			enterOuterAlt(_localctx, 1);
			{
			setState(347); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(346); match(CNCHAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(349); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\39\u0162\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\6\3.\n\3\r\3\16\3/\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\6\49\n\4\r\4\16\4:\3\4\3\4\3\4\5\4@\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5_\n\5\3\5\7\5b\n\5\f\5\16\5e\13\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6m\n\6\3\7\5\7p\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u008b\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0093\n\b\f\b\16\b\u0096"+
		"\13\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u009e\n\b\f\b\16\b\u00a1\13\b\3\b\7"+
		"\b\u00a4\n\b\f\b\16\b\u00a7\13\b\3\b\3\b\3\b\3\b\5\b\u00ad\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u00bf"+
		"\n\f\f\f\16\f\u00c2\13\f\5\f\u00c4\n\f\3\f\3\f\3\f\3\f\3\f\6\f\u00cb\n"+
		"\f\r\f\16\f\u00cc\3\f\5\f\u00d0\n\f\3\r\3\r\3\r\3\16\3\16\3\16\6\16\u00d8"+
		"\n\16\r\16\16\16\u00d9\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00e4"+
		"\n\17\f\17\16\17\u00e7\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u00f6\n\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0142"+
		"\n\20\f\20\16\20\u0145\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\7\21\u0152\n\21\f\21\16\21\u0155\13\21\5\21\u0157\n\21\3"+
		"\21\3\21\5\21\u015b\n\21\3\22\6\22\u015e\n\22\r\22\16\22\u015f\3\22\2"+
		"\3\36\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\2\u0187\2$\3\2\2"+
		"\2\4(\3\2\2\2\6?\3\2\2\2\b^\3\2\2\2\nf\3\2\2\2\f\u008a\3\2\2\2\16\u008c"+
		"\3\2\2\2\20\u00ae\3\2\2\2\22\u00b4\3\2\2\2\24\u00b7\3\2\2\2\26\u00ba\3"+
		"\2\2\2\30\u00d1\3\2\2\2\32\u00d4\3\2\2\2\34\u00dd\3\2\2\2\36\u00f5\3\2"+
		"\2\2 \u015a\3\2\2\2\"\u015d\3\2\2\2$%\5\4\3\2%&\7\2\2\3&\'\b\2\1\2\'\3"+
		"\3\2\2\2()\7-\2\2)-\b\3\1\2*+\5\b\5\2+,\b\3\1\2,.\3\2\2\2-*\3\2\2\2./"+
		"\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\7.\2\2\62\63\b\3\1"+
		"\2\63\5\3\2\2\2\64\65\5\b\5\2\65\66\b\4\1\2\66@\3\2\2\2\679\78\2\28\67"+
		"\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\5\4\3\2=>\b\4\1\2>"+
		"@\3\2\2\2?\64\3\2\2\2?8\3\2\2\2@\7\3\2\2\2AB\5\36\20\2BC\b\5\1\2C_\3\2"+
		"\2\2DE\5\n\6\2EF\b\5\1\2F_\3\2\2\2GH\5\f\7\2HI\b\5\1\2I_\3\2\2\2JK\5\16"+
		"\b\2KL\b\5\1\2L_\3\2\2\2MN\5\20\t\2NO\b\5\1\2O_\3\2\2\2PQ\5\22\n\2QR\b"+
		"\5\1\2R_\3\2\2\2ST\5\24\13\2TU\b\5\1\2U_\3\2\2\2VW\5\26\f\2WX\b\5\1\2"+
		"X_\3\2\2\2YZ\5\30\r\2Z[\b\5\1\2[_\3\2\2\2\\_\5\32\16\2]_\5\34\17\2^A\3"+
		"\2\2\2^D\3\2\2\2^G\3\2\2\2^J\3\2\2\2^M\3\2\2\2^P\3\2\2\2^S\3\2\2\2^V\3"+
		"\2\2\2^Y\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_c\3\2\2\2`b\78\2\2a`\3\2\2\2be\3"+
		"\2\2\2ca\3\2\2\2cd\3\2\2\2d\t\3\2\2\2ec\3\2\2\2fl\7\b\2\2gh\7\60\2\2h"+
		"m\b\6\1\2ij\5\36\20\2jk\b\6\1\2km\3\2\2\2lg\3\2\2\2li\3\2\2\2m\13\3\2"+
		"\2\2np\7\6\2\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\5\36\20\2rs\7\7\2\2st\5"+
		"\"\22\2tu\b\7\1\2u\u008b\3\2\2\2vw\5\"\22\2wx\7\30\2\2xy\5\36\20\2yz\b"+
		"\7\1\2z\u008b\3\2\2\2{|\5\"\22\2|}\7\31\2\2}~\5\36\20\2~\177\b\7\1\2\177"+
		"\u008b\3\2\2\2\u0080\u0081\5\"\22\2\u0081\u0082\7\32\2\2\u0082\u0083\5"+
		"\36\20\2\u0083\u0084\b\7\1\2\u0084\u008b\3\2\2\2\u0085\u0086\5\"\22\2"+
		"\u0086\u0087\7\33\2\2\u0087\u0088\5\36\20\2\u0088\u0089\b\7\1\2\u0089"+
		"\u008b\3\2\2\2\u008ao\3\2\2\2\u008av\3\2\2\2\u008a{\3\2\2\2\u008a\u0080"+
		"\3\2\2\2\u008a\u0085\3\2\2\2\u008b\r\3\2\2\2\u008c\u008d\7\n\2\2\u008d"+
		"\u008e\5\36\20\2\u008e\u008f\7\f\2\2\u008f\u0090\5\6\4\2\u0090\u009f\b"+
		"\b\1\2\u0091\u0093\78\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0097\u0098\7\r\2\2\u0098\u0099\5\36\20\2\u0099\u009a\7\f\2\2\u009a"+
		"\u009b\5\6\4\2\u009b\u009c\b\b\1\2\u009c\u009e\3\2\2\2\u009d\u0094\3\2"+
		"\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00ac\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\78\2\2\u00a3\u00a2\3\2"+
		"\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\13\2\2\u00a9\u00aa\5"+
		"\6\4\2\u00aa\u00ab\b\b\1\2\u00ab\u00ad\3\2\2\2\u00ac\u00a5\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\17\3\2\2\2\u00ae\u00af\7\16\2\2\u00af\u00b0\5\36"+
		"\20\2\u00b0\u00b1\7\f\2\2\u00b1\u00b2\5\6\4\2\u00b2\u00b3\b\t\1\2\u00b3"+
		"\21\3\2\2\2\u00b4\u00b5\7\20\2\2\u00b5\u00b6\b\n\1\2\u00b6\23\3\2\2\2"+
		"\u00b7\u00b8\7\17\2\2\u00b8\u00b9\b\13\1\2\u00b9\25\3\2\2\2\u00ba\u00c3"+
		"\7\6\2\2\u00bb\u00c0\5\"\22\2\u00bc\u00bd\7\24\2\2\u00bd\u00bf\5\"\22"+
		"\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00bb\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\7\23\2\2\u00c6\u00cf\5"+
		"\"\22\2\u00c7\u00c8\7\22\2\2\u00c8\u00d0\5\b\5\2\u00c9\u00cb\78\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\5\4\3\2\u00cf\u00c7\3\2\2\2\u00cf"+
		"\u00ca\3\2\2\2\u00d0\27\3\2\2\2\u00d1\u00d2\7\23\2\2\u00d2\u00d3\5\36"+
		"\20\2\u00d3\31\3\2\2\2\u00d4\u00d5\7\25\2\2\u00d5\u00d7\5\"\22\2\u00d6"+
		"\u00d8\78\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\5\4\3\2\u00dc"+
		"\33\3\2\2\2\u00dd\u00de\7\26\2\2\u00de\u00df\5\"\22\2\u00df\u00e0\7\5"+
		"\2\2\u00e0\u00e5\5\"\22\2\u00e1\u00e2\7\24\2\2\u00e2\u00e4\5\"\22\2\u00e3"+
		"\u00e1\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\35\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\b\20\1\2\u00e9\u00ea"+
		"\7)\2\2\u00ea\u00eb\5\36\20\7\u00eb\u00ec\b\20\1\2\u00ec\u00f6\3\2\2\2"+
		"\u00ed\u00ee\7\3\2\2\u00ee\u00ef\5\36\20\2\u00ef\u00f0\7\4\2\2\u00f0\u00f1"+
		"\b\20\1\2\u00f1\u00f6\3\2\2\2\u00f2\u00f3\5 \21\2\u00f3\u00f4\b\20\1\2"+
		"\u00f4\u00f6\3\2\2\2\u00f5\u00e8\3\2\2\2\u00f5\u00ed\3\2\2\2\u00f5\u00f2"+
		"\3\2\2\2\u00f6\u0143\3\2\2\2\u00f7\u00f8\f\24\2\2\u00f8\u00f9\7\36\2\2"+
		"\u00f9\u00fa\5\36\20\25\u00fa\u00fb\b\20\1\2\u00fb\u0142\3\2\2\2\u00fc"+
		"\u00fd\f\23\2\2\u00fd\u00fe\7\37\2\2\u00fe\u00ff\5\36\20\24\u00ff\u0100"+
		"\b\20\1\2\u0100\u0142\3\2\2\2\u0101\u0102\f\22\2\2\u0102\u0103\7 \2\2"+
		"\u0103\u0104\5\36\20\23\u0104\u0105\b\20\1\2\u0105\u0142\3\2\2\2\u0106"+
		"\u0107\f\21\2\2\u0107\u0108\7\34\2\2\u0108\u0109\5\36\20\22\u0109\u010a"+
		"\b\20\1\2\u010a\u0142\3\2\2\2\u010b\u010c\f\20\2\2\u010c\u010d\7\35\2"+
		"\2\u010d\u010e\5\36\20\21\u010e\u010f\b\20\1\2\u010f\u0142\3\2\2\2\u0110"+
		"\u0111\f\17\2\2\u0111\u0112\7!\2\2\u0112\u0113\5\36\20\20\u0113\u0114"+
		"\b\20\1\2\u0114\u0142\3\2\2\2\u0115\u0116\f\16\2\2\u0116\u0117\7\"\2\2"+
		"\u0117\u0118\5\36\20\17\u0118\u0119\b\20\1\2\u0119\u0142\3\2\2\2\u011a"+
		"\u011b\f\r\2\2\u011b\u011c\7#\2\2\u011c\u011d\5\36\20\16\u011d\u011e\b"+
		"\20\1\2\u011e\u0142\3\2\2\2\u011f\u0120\f\f\2\2\u0120\u0121\7$\2\2\u0121"+
		"\u0122\5\36\20\r\u0122\u0123\b\20\1\2\u0123\u0142\3\2\2\2\u0124\u0125"+
		"\f\13\2\2\u0125\u0126\7%\2\2\u0126\u0127\5\36\20\f\u0127\u0128\b\20\1"+
		"\2\u0128\u0142\3\2\2\2\u0129\u012a\f\n\2\2\u012a\u012b\7&\2\2\u012b\u012c"+
		"\5\36\20\13\u012c\u012d\b\20\1\2\u012d\u0142\3\2\2\2\u012e\u012f\f\t\2"+
		"\2\u012f\u0130\7\'\2\2\u0130\u0131\5\36\20\n\u0131\u0132\b\20\1\2\u0132"+
		"\u0142\3\2\2\2\u0133\u0134\f\b\2\2\u0134\u0135\7(\2\2\u0135\u0136\5\36"+
		"\20\t\u0136\u0137\b\20\1\2\u0137\u0142\3\2\2\2\u0138\u0139\f\6\2\2\u0139"+
		"\u013a\7*\2\2\u013a\u0142\5\36\20\7\u013b\u013c\f\5\2\2\u013c\u013d\7"+
		"+\2\2\u013d\u0142\5\36\20\6\u013e\u013f\f\4\2\2\u013f\u0140\7,\2\2\u0140"+
		"\u0142\5\36\20\5\u0141\u00f7\3\2\2\2\u0141\u00fc\3\2\2\2\u0141\u0101\3"+
		"\2\2\2\u0141\u0106\3\2\2\2\u0141\u010b\3\2\2\2\u0141\u0110\3\2\2\2\u0141"+
		"\u0115\3\2\2\2\u0141\u011a\3\2\2\2\u0141\u011f\3\2\2\2\u0141\u0124\3\2"+
		"\2\2\u0141\u0129\3\2\2\2\u0141\u012e\3\2\2\2\u0141\u0133\3\2\2\2\u0141"+
		"\u0138\3\2\2\2\u0141\u013b\3\2\2\2\u0141\u013e\3\2\2\2\u0142\u0145\3\2"+
		"\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\37\3\2\2\2\u0145\u0143"+
		"\3\2\2\2\u0146\u0147\7\65\2\2\u0147\u015b\b\21\1\2\u0148\u015b\7\64\2"+
		"\2\u0149\u015b\7\66\2\2\u014a\u014b\5\"\22\2\u014b\u014c\b\21\1\2\u014c"+
		"\u015b\3\2\2\2\u014d\u0156\7\6\2\2\u014e\u0153\5\36\20\2\u014f\u0150\7"+
		"\24\2\2\u0150\u0152\5\36\20\2\u0151\u014f\3\2\2\2\u0152\u0155\3\2\2\2"+
		"\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153"+
		"\3\2\2\2\u0156\u014e\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u0159\7\21\2\2\u0159\u015b\5\"\22\2\u015a\u0146\3\2\2\2\u015a\u0148\3"+
		"\2\2\2\u015a\u0149\3\2\2\2\u015a\u014a\3\2\2\2\u015a\u014d\3\2\2\2\u015b"+
		"!\3\2\2\2\u015c\u015e\7\67\2\2\u015d\u015c\3\2\2\2\u015e\u015f\3\2\2\2"+
		"\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160#\3\2\2\2\33/:?^clo\u008a"+
		"\u0094\u009f\u00a5\u00ac\u00c0\u00c3\u00cc\u00cf\u00d9\u00e5\u00f5\u0141"+
		"\u0143\u0153\u0156\u015a\u015f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}