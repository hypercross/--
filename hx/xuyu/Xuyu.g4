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
	| expr 						{ $s = new Stat.EXP( $expr.v); } 					
	| input
	) NEWLINE*
	;
	
print returns [Stat s]
	: K_YAN (STRLIT 			{ $s = new Stat.PRINT($STRLIT.text);}
	| expr 						{ $s = new Stat.PRINT($expr.v);}
	);
assign returns [Stat s]
	: K_YI? expr K_WEI var		{ $s = new Stat.ASSIGN( $var.text, $expr.v);} 
	| var O_JIN expr 			{ $s = Stat.ASSIGN.Inplace($var.text, $expr.v, xuyu.currentBlock(), Exp.Eval.ADD);}
	| var O_TUI expr			{ $s = Stat.ASSIGN.Inplace($var.text, $expr.v, xuyu.currentBlock(), Exp.Eval.SUB);}
	| var O_JI expr				{ $s = Stat.ASSIGN.Inplace($var.text, $expr.v, xuyu.currentBlock(), Exp.Eval.MUL);}
	| var O_FEN expr			{ $s = Stat.ASSIGN.Inplace($var.text, $expr.v, xuyu.currentBlock(), Exp.Eval.DIV);}
	| K_JU 						{ xuyu.pushVals(); }
	(expr						{ xuyu.putVal($expr.v);}
	(K_DUN expr					{ xuyu.putVal($expr.v);}
	)*)? K_CHENG var			{ $s = new Stat.ASSIGN( $var.text, new Exp.Lst(xuyu.popVals()));}
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

expr returns [Exp.Value v]
	: '��' a=expr '��'				{ $v = $a.v; }
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
	| CNBOOL 					{ $v = new Exp.Num( "��".equals($CNBOOL.text) ? 1 : 0); }
	| var						{ $v = new Exp.Var($var.text, xuyu.currentBlock());}
	| a=val K_QI CNNUM			{ $v = new Exp.Index( $a.v, ParserUtil.parseInt($CNNUM.text) - 1); }
	| a=val A_ZHI b=var 		{ $v = new Exp.Var($b.text, $a.v); } 
	| K_YI						{ xuyu.pushVals(); } 
	(param=expr					{ xuyu.putVal($param.v);} 
	(K_DUN param=expr			{ xuyu.putVal($param.v);}
	)*)? K_QIU func=val			{ $v = new Exp.Call($func.v, xuyu.popVals());}				
	;
var : CNCHAR+ | CNNOUN;

//keywords

K_HWEI : '��Ϊ';
K_YI : [����];
K_WEI : 'Ϊ';
K_YAN : '��';
K_ZHONG : '��';
K_RUO : '��' | '����' | '����';
K_FZE : '����';
K_ZE : '��';
K_YHUO : '�ֻ�';
K_MDANG : 'ÿ��';
K_FSHI : '��ʼ';
K_ZHI : 'ֹ';
K_QIU : '��';
K_YUE : 'Ի';
K_DE : '��';
K_QI : '��';
K_DUN : '��';
K_JU2 : '��';
K_YZHU : '����';
K_WEN : '��';
K_JU : '��';
K_CHENG : '��';
A_ZHI : '֮';
K_PIAN : 'ƪ';
K_XU : '��';

O_JIN : '����';
O_TUI : '����';
O_JI : '����';
O_FEN : '����';

O_JIA : '����';
O_JIAN : '����';
O_CHENG : '����';
O_CHU : '����';
O_YU : '����';

O_DA : '����';
O_XIAO : 'С��';
O_DENG : '����';
O_BDA : '������';
O_BXIAO : '��С��';
O_BDENG : '������';

O_QIE : '��';
O_HUO : '��';
O_FEI : '��';

O_BHAN : '����';
O_JZI : '����';
O_JZHI : '����';
O_BRU : '����';

//lexer
	
INDENT : ;
DEDENT : ;

COMMENT : (DENT* '����' .*? NEWLINE+)->skip;
STRLIT : '��' .*? '��';

DENT : [\t ];

WORD : [a-zA-Z_]+;
NUM : [1-9] [0-9]*;

CNFRAC : (CNNUM '��')? CNNUM '��֮' CNNUM;
CNNUM : [��һ�����������߰˾�ʮ��ǧ����]+;
CNBOOL : [����];
CNCHAR : '\u4E00'..'\u9FFF';
CNNOUN : '��' ~[��]*? '��';

NEWLINE : '\r' ? '\n';
WS : [ \r\n\t]->skip;