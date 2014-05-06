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
	: '��' expr '��'			{ $v = $expr.v; }
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

K_HWEI : '��Ϊ';
K_YI : [����];
K_WEI : 'Ϊ';
K_TAN : '̾';
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
K_DUN : '��';
K_LSHU : '����';
K_WEN : '��';

A_ZHI : '֮';

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

O_BHAN : '����';
O_CQU : '��ȥ';
O_BYU : '����';

//lexer
	
INDENT : ;
DEDENT : ;

COMMENT : ('����' .*? NEWLINE)->skip;
STRLIT : '��' .*? '��';

DENT : [\t ];

WORD : [a-zA-Z_]+;
NUM : [1-9] [0-9]*;

CNFRAC : (CNNUM '��')? CNNUM '��֮' CNNUM;
CNNUM : [��һ�����������߰˾�ʮ��ǧ����]+;
CNBOOL : [Ȼ��];
CNCHAR : '\u4E00'..'\u9FFF';

NEWLINE : '\r' ? '\n';
WS : [ \r\n\t]->skip;