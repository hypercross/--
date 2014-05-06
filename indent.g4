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
stat :  ( print | assign | conditional) NEWLINE*;
	
print : K_TAN STRLIT;
assign : K_YI? expr K_WEI var 
	| var O_JIN expr 
	| var O_TUI expr
	| var O_JI expr
	| var O_FEN expr;
conditional : K_RUO expr K_ZE (stat | NEWLINE+ block);

expr : '（' expr '）'
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
val : CNNUM | CNFRAC | CNBOOL | var;
var : CNCHAR+;

//keywords

K_YI : [以有];
K_WEI : '为';
K_TAN : '叹';
K_ZHONG : '众';
K_RUO : '若' | '如若' | '倘若';
K_ZE : '则';

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