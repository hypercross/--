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

stat : 'рт' expr W_WEI WORD NEWLINE+;

expr : W_YI (expr W_JIA expr
	| expr W_JIAN expr
	| expr W_CHEN expr
	| expr W_CHU expr)
	| WORD;

//dict

W_YI : '\u4EE5';
W_JIA : '\u52A0';
W_JIAN : '\u51CF';
W_CHEN : '\u4E58';
W_CHU : '\u9664';
W_WEI : '\u4E3A';
	
// N_JIA : '\u7532';
// N_YI : '\u4E59';
	
INDENT : ;
DEDENT : ;
DENT : [\t ];
ENG : [a-zA-Z_]+;
WORD : '\u4E00'..'\u9FFF';
NUM : [1-9] [0-9]*;
NEWLINE : '\r' ? '\n';
WS : [ \r\n\t]->skip;

