package hx.xuyu;

import hx.xuyu.Exp.Eval;
import hx.xuyu.Exp.Value;
import hx.xuyu.Exp.Var;

public interface Stat {

	public void exec(Block context);
	
	public static class BreakException extends RuntimeException{};
	public static class ContinueException extends RuntimeException{};
	
	public static class PRINT implements Stat{
		String content;
		Exp.Value v;
		
		public PRINT(String c){
			content = c.substring(1, c.length() - 1);
			content = content.replaceAll("¡¾»Ø¡¿", "\n");
		}
		
		public PRINT(Exp.Value v){
			this.v = v;
		}
		
		@Override
		public void exec(Block context) {
			if(v != null)content = v.deepCopy().toString();
			System.out.print(content);
		}
		
	}
	
	public static class IF implements Stat{
		Exp.Value condition;
		Block thenBlock;		
		IF elif;
		
		public IF(Block thenBlock){this.thenBlock = thenBlock;}
		
		public IF(Exp.Value exp, Block b){condition = exp; thenBlock = b;}
		
		public IF(Exp.Value exp, Block b, IF elif){ this(exp,b); this.elif = elif;}
		
		public void setElif(IF elif){
			this.elif = elif;
		}
		
		@Override public void exec(Block context){
			if(condition == null || condition.asBool())
				thenBlock.exec();
			else if(elif != null)elif.exec(context);
		}
	}
	
	public static class WHILE implements Stat{
		Exp.Value condition;
		Block loop;
		
		public WHILE(Exp.Value exp, Block loop){
			this.condition = exp;
			this.loop = loop;
		}
		
		@Override public void exec(Block context) {
			while(condition.asBool()){
				try{
					loop.exec();
				}catch(BreakException e){
					break;
				}catch(ContinueException e){
					continue;
				}
			}
		}
	}
	
	public static class BREAK implements Stat{
		@Override public void exec(Block context){
			throw new BreakException();
		}
	}
	
	public static class CONTINUE implements Stat{
		@Override public void exec(Block context){
			throw new ContinueException();
		}
	}
	
	public static class ASSIGN implements Stat{
		String id;
		Exp.Value value;
		public ASSIGN(String id, Value v){
			this.id = id;
			this.value = v;
		}
		@Override
		public void exec(Block context) {
			context.set(id, value);
		}
		
		public static ASSIGN Inplace(String id, Value v, Block b, int op){
			return new ASSIGN(id, new Exp.Eval(new Exp.Var(id, b), v.deepCopy(), op));
		}
	}
	
	public static class RETURN implements Stat{
		Exp.Value value;
		
		public RETURN(Exp.Value value){
			this.value = value;
		}
		
		@Override
		public void exec(Block context) {
			throw new Exp.ReturnValueException(value.deepCopy()); 
		}
		
	}
	
	public static class ITERATE implements Stat{
		Block block;
		Exp.Value value;
		String iterator;
		
		public ITERATE(String iterator, Exp.Value value, Block block){
			this.block = block;
			this.value = value;
			this.iterator = iterator;
		}
		
		@Override
		public void exec(Block context) {
			Exp.Lst lst ;
			try{
				lst = (Exp.Lst)(this.value.deepCopy());
			}catch(RuntimeException e){
				throw new Exp.IllegalCastException();
			}
			
			for(Value v : lst.asList()){
				block.set(iterator, v);
				block.exec();
			}
		}
		
	}
	
	public static class EXP implements Stat{
		Exp.Value value;
		public EXP(Exp.Value exp){
			value = exp;
	}
		@Override
		public void exec(Block context) {
			value.deepCopy();
		}
	}
}
