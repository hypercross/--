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
print : '̾��' '.'* '��'


stat : [����]? expr 'Ϊ' CNWORD NEWLINE+;

expr : CNNUM;
	
INDENT : ;
DEDENT : ;
COMMENT : '����' '.'*? NEWLINE->skip;
DENT : [\t ];
WORD : [a-zA-Z_]+;
CNWORD : ('\u4E00'..'\u9FFF')+;
NUM : [1-9] [0-9]*;
CNFRAC : (CNNUM '��')? CNNUM '��֮' CNNUM;
CNNUM : [��һ�����������߰˾�ʮ��ǧ����]+;
NEWLINE : '\r' ? '\n';
WS : [ \r\n\t]->skip;