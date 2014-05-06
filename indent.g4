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
stat :  ( expr | print | assign | conditional | whiles | breaks | continues | deffunc | returnst) NEWLINE*;
	
print : K_TAN STRLIT;
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

expr : '��' expr '��'
	| expr O_JIA expr
	| expr O_JIAN expr
	| expr O_CHENG expr
	| expr O_CHU expr
	| expr O_YU expr
	
	| expr O_DA expr
	| expr O_XIAO expr
	| expr O_DENG expr
	| expr O_BDA expr
	| expr O_BXIAO expr
	| expr O_BDENG expr
	| val;	
val : CNNUM | CNFRAC | CNBOOL | var | K_YI (expr (K_DUN expr)*)? K_QIU var;
var : CNCHAR+;

//keywords

K_YI : [����];
K_WEI : 'Ϊ';
K_TAN : '̾';
K_ZHONG : '��';
K_RUO : '��' | '����' | '����';
K_ZE : '��';
K_FZE : '����';
K_YHUO : '�ֻ�';
K_MDANG : 'ÿ��';
K_FSHI : '��ʼ';
K_ZHI : 'ֹ';
K_QIU : '��';
K_YUE : 'Ի';
K_DE : '��';
K_DUN : '��';

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