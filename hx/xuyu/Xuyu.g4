grammar Xuyu;

@header{
	package hx.xuyu;
}

@lexer::members{

	private LexerIndent li = new LexerIndent(INDENT, DEDENT, DENT, NEWLINE, EOF);
		
	@Override public Token nextToken(){
		Token t = li.getPending();
		while(t == null)t = li.newToken(super.nextToken());
		return t;
	}

}

@parser::members{

	private XuyuCompiler xuyu = new XuyuCompiler();
}

file returns [Block content]
	: NEWLINE* block EOF					{ $content = $block.b;}
	;
block returns [Block b] 
	: INDENT 					{ $b = xuyu.pushBlock();}
	(stat						{ xuyu.addStat($stat.s);}
	)+ DEDENT					{ $b = xuyu.popBlock(); }
	;
inline returns [Block b]
	: { $b = xuyu.pushBlock();} stat { xuyu.addStat( $stat.s); xuyu.popBlock();}
	| NEWLINE+ block			{ $b = $block.b;}
	;
stat returns [Stat s] 
	:  
	( print 					{ $s = $print.s; }
	| assign 					{ $s = $assign.s; }
	| conditional 				{ $s = $conditional.s; }
	| whiles 					{ $s = $whiles.s; }
	| breaks 					{ $s = $breaks.s; }
	| continues 				{ $s = $continues.s; }
	| deffunc 					{ $s = $deffunc.s; }
	| defobj					{ $s = $defobj.s;}
	| returnst 					{ $s = $returnst.s; }
	| iterate					{ $s = $iterate.s; }
	| declare					{ $s = $declare.s; }
	| expr 						{ $s = new Stat.EXP( $expr.v); } 					
	| input
	) NEWLINE*
	;
	
print returns [Stat s]
	: K_YAN (STRLIT 			{ $s = new Stat.PRINT($STRLIT.text);}
	| expr 						{ $s = new Stat.PRINT($expr.v);}
	);
assign returns [Stat s]
	: K_YI? expr K_WEI val		{ $s = new Stat.SETPROP( $val.v, $expr.v);} 
	| val O_JIN expr 			{ $s = new Stat.SETPROP( $val.v, new Exp.Eval($val.v, $expr.v, Exp.Eval.ADD));}
	| val O_TUI expr			{ $s = new Stat.SETPROP( $val.v, new Exp.Eval($val.v, $expr.v, Exp.Eval.SUB));}
	| val O_JI expr				{ $s = new Stat.SETPROP( $val.v, new Exp.Eval($val.v, $expr.v, Exp.Eval.MUL));}
	| val O_FEN expr			{ $s = new Stat.SETPROP( $val.v, new Exp.Eval($val.v, $expr.v, Exp.Eval.DIV));}
	| K_JU 						{ xuyu.pushVals(); }
	(expr						{ xuyu.putVal($expr.v);}
	(K_DUN expr					{ xuyu.putVal($expr.v);}
	)*)? K_CHENG val			{ $s = new Stat.SETPROP( $val.v, new Exp.Lst(xuyu.popVals()));}
	;
conditional returns [Stat.IF s]
	: K_RUO expr K_ZE inline	{ $s = new Stat.IF ($expr.v, $inline.b); Stat.IF head = $s; }
	(NEWLINE* 
	K_YHUO expr K_ZE inline		{ Stat.IF nh = new Stat.IF ($expr.v, $inline.b); head.setElif(nh); head = nh;} 
	)*
	(NEWLINE* K_FZE inline		{ head.setElif( new Stat.IF($inline.b));}
	)?;
whiles returns [Stat s]
	: K_MDANG expr K_ZE inline	{ $s = new Stat.WHILE ( $expr.v, $inline.b); }
	;
breaks returns [Stat s]
	: K_ZHI						{ $s = new Stat.BREAK();}
	;
continues returns [Stat s]
	: K_FSHI					{ $s = new Stat.CONTINUE();}
	;
deffunc returns [Stat s]
	: K_YI 	(param=var 			{ xuyu.putId($param.text);}
	(K_DUN param=var			{ xuyu.putId($param.text);}
	)*)? K_DE func=var 				
	K_YUE inline				{ $s = new Stat.ASSIGN( $func.text, new Exp.Func($inline.b, xuyu.getIds()));} 
	;
defobj returns [Stat s]
	: a=var K_PIAN 				
	( K_XU c=var K_PIAN) ? 
	NEWLINE+ b=block			{ $s = new Stat.DEFOBJ( $a.text, $b.b, $c.text == null ? null : new Exp.Var( $c.text, xuyu.currentBlock()));}
	;
returnst returns [Stat s]  		
	: K_DE expr					{ $s = new Stat.RETURN( $expr.v); }
	;
iterate returns [Stat s]
	: K_JU2 var K_YZHU expr
	NEWLINE+ block				{ $s = new Stat.ITERATE($var.text, $expr.v , $block.b ); }
	;
input : K_WEN var K_HWEI var (K_DUN var)*;

declare returns [Stat s]
	: K_YYOU var				{ $s = new Stat.DEFLOC( $var.text);}
	;

expr returns [Exp.Value v]
	: '（' a=expr '）'				{ $v = $a.v; }
	| a=expr O_CHENG b=expr		{ $v = new Exp.Eval($a.v ,$b.v, Exp.Eval.MUL);}
	| a=expr O_CHU 	b=expr		{ $v = new Exp.Eval($a.v ,$b.v, Exp.Eval.DIV);}
	| a=expr O_YU 	b=expr		{ $v = new Exp.Eval($a.v ,$b.v, Exp.Eval.RMD);}
	| a=expr O_JIA 	b=expr 		{ $v = new Exp.Eval($a.v ,$b.v, Exp.Eval.ADD);}
	| a=expr O_JIAN b=expr		{ $v = new Exp.Eval($a.v ,$b.v, Exp.Eval.SUB);}
	
	| a=expr O_DA b=expr		{ $v = new Exp.Eval($a.v ,$b.v, Exp.Eval.GT);}
	| a=expr O_XIAO b=expr		{ $v = new Exp.Eval($a.v ,$b.v, Exp.Eval.LT);}
	| a=expr O_DENG b=expr		{ $v = new Exp.Eval($a.v ,$b.v, Exp.Eval.EQ);}
	| a=expr O_BDA b=expr		{ $v = new Exp.Eval($a.v ,$b.v, Exp.Eval.NGT);}
	| a=expr O_BXIAO b=expr		{ $v = new Exp.Eval($a.v ,$b.v, Exp.Eval.NLT);}
	| a=expr O_BDENG b=expr		{ $v = new Exp.Eval($a.v ,$b.v, Exp.Eval.NEQ);}
	
	| a=expr O_QIE b=expr		{ $v = new Exp.Eval($a.v ,$b.v, Exp.Eval.AND);}
	| a=expr O_HUO b=expr		{ $v = new Exp.Eval($a.v ,$b.v, Exp.Eval.OR);}
	| O_FEI a=expr				{ $v = new Exp.Eval($a.v ,null, Exp.Eval.NOT);}
	
	| a=expr O_BHAN b=expr			{ $v = new Exp.Eval($b.v,$a.v, Exp.Eval.ISIN);}
	| a=expr O_JZI b=expr			{ $v = new Exp.Eval($a.v,$b.v, Exp.Eval.CUTL);}
	| a=expr O_JZHI b=expr			{ $v = new Exp.Eval($a.v,$b.v, Exp.Eval.CUTR);}
	| a=expr O_BRU b=expr			{ $v = new Exp.Eval($a.v,$b.v, Exp.Eval.JOIN);}
	
	| val 						{ $v = $val.v;};	
val returns [Exp.Value v] 
	: CNNUM 					{ $v = new Exp.Num(ParserUtil.parseInt($CNNUM.text));}
	| CNFRAC 
	| CNBOOL 					{ $v = new Exp.Num( "阳".equals($CNBOOL.text) ? 1 : 0); }
	| var						{ $v = new Exp.Var($var.text, xuyu.currentBlock());}
	| a=val K_QI i=val			{ $v = new Exp.Index( $a.v, $i.v); }
	| a=val A_ZHI b=var 		{ $v = new Exp.Var($b.text, $a.v); } 
	| K_YI						{ xuyu.pushVals(); } 
	(param=expr					{ xuyu.putVal($param.v);} 
	(K_DUN param=expr			{ xuyu.putVal($param.v);}
	)*)? K_QIU func=val			{ $v = new Exp.Call($func.v, xuyu.popVals());}				
	;
var : CNCHAR+ | CNNOUN;

//keywords

K_HWEI : '何为';
K_YI : [以有];
K_WEI : '为';
K_YAN : '言';
K_ZHONG : '众';
K_RUO : '若' | '如若' | '倘若';
K_FZE : '否则';
K_ZE : '则';
K_YHUO : '抑或';
K_MDANG : '每当';
K_FSHI : '复始';
K_ZHI : '止';
K_QIU : '求';
K_YUE : '曰';
K_DE : '得';
K_QI : '其';
K_DUN : '、';
K_JU2 : '举';
K_YZHU : '于诸';
K_WEN : '问';
K_JU : '聚';
K_CHENG : '成';
A_ZHI : '之';
K_PIAN : '篇';
K_XU : '续';
K_YYOU : '又有';

O_JIN : '进以';
O_TUI : '退以';
O_JI : '积以';
O_FEN : '分以';

O_JIA : '加以';
O_JIAN : '减以';
O_CHENG : '乘以';
O_CHU : '除以';
O_YU : '余以';

O_DA : '大于';
O_XIAO : '小于';
O_DENG : '等于';
O_BDA : '不大于';
O_BXIAO : '不小于';
O_BDENG : '不等于';

O_QIE : '且';
O_HUO : '或';
O_FEI : '非';

O_BHAN : '包含';
O_JZI : '截自';
O_JZHI : '截至';
O_BRU : '并入';

//lexer
	
INDENT : ;
DEDENT : ;

COMMENT : (DENT* '……' ~[\n]* )->skip;
STRLIT : '「' .*? '」';

DENT : [\t ];

WORD : [a-zA-Z_]+;
NUM : [1-9] [0-9]*;

CNFRAC : (CNNUM '又')? CNNUM '分之' CNNUM;
CNNUM : [零一二三四五六七八九十百千万亿]+;
CNBOOL : [阴阳];
CNCHAR : '\u4E00'..'\u9FFF';
CNNOUN : '【' ~[】]*? '】';

NEWLINE : '\r' ? '\n';
WS : [ \r\n\t]->skip;