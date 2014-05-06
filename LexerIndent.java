import java.util.LinkedList;

import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Token;

public class LexerIndent {

	int indent, dedent;
	int empty, linebreak, eof;
	
	public LexerIndent(int indent,int dedent, int empty,int linebreak,int eof){
		this.indent = indent;
		this.dedent = dedent;
		this.empty = empty;
		this.linebreak = linebreak;
		this.eof = eof;
	}
	
	private LinkedList<Token> pending = new LinkedList<>();
	private LinkedList<Integer> dents = new LinkedList<>();
	
	private int currentDent = 0;
	
	public Token newToken(Token t){
		
		if(t.getType() == empty){			
			if(currentDent >= 0)currentDent ++;
			i(0 + " " + currentDent);
			return null;
		}else if(t.getType() == linebreak){			
			pending.offer(t);
			i(1 + " " + currentDent);
			currentDent = 0;
			return pending.poll();
		}else if(t.getType() == eof){
			updateDents(-1);
			pending.offer(t);
			i(-1);
			return pending.poll();
		}else {
			if(currentDent >= 0)updateDents(currentDent);
			pending.offer(t);
			i(2 + " " + currentDent);
			currentDent = -1;
			return pending.poll();
		}
	}
	
	public Token getPending(){
		return pending.poll();
	}

	private void updateDents(int dent) {
		if(dents.isEmpty() || dents.getLast() < dent){
			dents.add(dent);
			pending.offer(new CommonToken(indent, "indent"));
		}else while(!dents.isEmpty() && dents.getLast() > dent){
			dents.removeLast();
			pending.offer(new CommonToken(dedent, "dedent"));
		}
	}
	
	private void i(int integer){
		i(integer + "");
	}
	
	private void i(String blah){
		System.out.println(blah);
	}
}
