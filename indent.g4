grammar indent;

@lexer::members{

	private LexerIndent li = new LexerIndent(INDENT, DEDENT, DENT, NEWLINE, EOF);
		
	@Override public Token nextToken(){
		Token t = li.getPending();
		while(t == null)t = li.newToken(super.nextToken());
		return t;
	}

}

file : INDENT stat+ DEDENT EOF;
block : INDENT stat+ DEDENT;
stat :  ( expr | print | assign | conditional | whiles | breaks | continues | deffunc | returnst | iterate | input) NEWLINE*;
	
print : K_TAN (STRLIT 			{ Xuyu.print($STRLIT.text);}
	| expr 						{ Xuyu.print($expr.v);}
	);
assign : K_YI? expr K_WEI var 
	| var O_JIN expr 
	| var O_TUI expr
	| var O_JI expr
	| var O_FEN expr;
conditional : K_RUO expr K_ZE (stat | NEWLINE+ block) 
	(NEWLINE* K_YHUO expr K_ZE (stat | NEWLINE+ block))*
	(NEWLINE* K_FZE (stat | NEWLINE+ block))?;
whiles : K_MDANG expr K_ZE (stat | NEWLINE+ block);
breaks : K_ZHI;
continues : K_FSHI;
deffunc : K_YI (var (K_DUN var)*)? K_DE var (K_YUE stat | NEWLINE+ block);
returnst : K_DE expr;
iterate : K_LSHU var NEWLINE+ block;
input : K_WEN var K_HWEI var (K_DUN var)*;

expr returns [Xuyu.Value v]
	: '（' expr '）'			{ $v = $expr.v; }
	| a=expr O_CHENG b=expr		{ $v = Xuyu.eval($a.v ,$b.v, 2);}
	| a=expr O_CHU 	b=expr		{ $v = Xuyu.eval($a.v ,$b.v, 3);}
	| a=expr O_YU 	b=expr		{ $v = Xuyu.eval($a.v ,$b.v, 4);}
	| a=expr O_JIA 	b=expr 		{ $v = Xuyu.eval($a.v ,$b.v, 0);}
	| a=expr O_JIAN b=expr		{ $v = Xuyu.eval($a.v ,$b.v, 1);}
	
	| a=expr O_DA b=expr		{ $v = Xuyu.eval($a.v ,$b.v, 5);}
	| a=expr O_XIAO b=expr		{ $v = Xuyu.eval($a.v ,$b.v, 6);}
	| a=expr O_DENG b=expr		{ $v = Xuyu.eval($a.v ,$b.v, 7);}
	| a=expr O_BDA b=expr		{ $v = Xuyu.eval($a.v ,$b.v, 8);}
	| a=expr O_BXIAO b=expr		{ $v = Xuyu.eval($a.v ,$b.v, 9);}
	| a=expr O_BDENG b=expr		{ $v = Xuyu.eval($a.v ,$b.v, 10);}
	
	| expr O_BHAN expr
	| expr O_CQU expr
	| expr O_BYU expr
	
	| val 						{ $v = $val.v;};	
val returns [Xuyu.Value v] 
	: CNNUM { $v = Xuyu.getInt($CNNUM.text);}
	| CNFRAC | CNBOOL | (var A_ZHI)* var | K_YI (expr (K_DUN expr)*)? K_QIU var;
var : CNCHAR+;

//keywords

K_HWEI : '何为';
K_YI : [以有];
K_WEI : '为';
K_TAN : '叹';
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
K_DUN : '、';
K_LSHU : '历数';
K_WEN : '问';

A_ZHI : '之';

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

O_BHAN : '包含';
O_CQU : '除去';
O_BYU : '并于';

//lexer
	
INDENT : ;
DEDENT : ;

COMMENT : ('……' .*? NEWLINE)->skip;
STRLIT : '「' .*? '」';

DENT : [\t ];

WORD : [a-zA-Z_]+;
NUM : [1-9] [0-9]*;

CNFRAC : (CNNUM '又')? CNNUM '分之' CNNUM;
CNNUM : [零一二三四五六七八九十百千万亿]+;
CNBOOL : [然否];
CNCHAR : '\u4E00'..'\u9FFF';

NEWLINE : '\r' ? '\n';
WS : [ \r\n\t]->skip;