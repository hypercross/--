package hx.xuyu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exp {

	public static class IllegalCastException extends RuntimeException{}
	public static class ReturnValueException extends RuntimeException{
		Value value;
		public ReturnValueException(Value v){
			value = v;
		}
	}
	
	public static interface Value{
		int asInt();
		boolean asBool();
		List<Value> asList();
		public Value deepCopy();
	}
	
	public static class Object implements Value{

		public Block def;
		
		public Object(Block b){
			def = b;
		}
		
		@Override public int asInt() {throw new IllegalCastException();}
		@Override public boolean asBool() {throw new IllegalCastException();}
		@Override public List<Value> asList() {throw new IllegalCastException();}
		@Override public Value deepCopy(){ return this;}
		
	}
	
	public static class Lst implements Value{
		private ArrayList<Value> content = new ArrayList<>();

		public Lst(Value[] vals){
			for(Value v : vals)content.add(v);
		}
		
		@Override public int asInt() {return content.size();}

		@Override public boolean asBool() {return content.isEmpty();}

		@Override public List<Value> asList(){ return content;}
		
		@Override public Value deepCopy() {
			Lst lst = new Lst(content.toArray(new Value[content.size()]));
			return lst;
		}
	}
	
	public static class Index implements Value{
		Value val;
		Value i;
		
		public Index(Value val, Value ind){this.val = val; i = ind;}
		
		Value get(){
			Value got = val.deepCopy();
			if(got instanceof Lst){
				return ((Lst)got).content.get(i.asInt()-1);
			}throw new IllegalCastException();
		}
		
		public void set(Value v){
			Value got = val.deepCopy();
			if(got instanceof Lst){
				((Lst)got).content.set(i.asInt()-1, v);
			}else throw new IllegalCastException();
		}
		
		@Override public int asInt() { return get().asInt();}

		@Override public boolean asBool() { return get().asBool();}
		
		@Override public List<Value> asList(){ return get().asList();}

		@Override public Value deepCopy() {return get().deepCopy();}
		
	}
	
	public static class Func implements Value{
		Block block;
		String[] params;
		
		public Func(Block b, String... params){
			this.params = params.clone();
			this.block = b;
		}
		
		public Value call(Value[] values){
			Block stack = new Block(block.parent);
			for(int i = 0; i < params.length;i++)
				stack.setLocal(params[i], values[i]);
			block.parent = stack;
			
			Value ret = new Num(0);
			try{
				block.exec();
			}catch(ReturnValueException v){
				ret = v.value;
			}
			
			block.parent = stack.parent;			
			return ret;
		}

		@Override public int asInt() { throw new IllegalCastException();}

		@Override public boolean asBool() {throw new IllegalCastException();}

		@Override public Value deepCopy() {return this;}
		
		@Override public List<Value> asList() { throw new IllegalCastException();}
		
	}
	
	public static class Call implements Value{
		Value[] params;
		Value f;

		public Call(Value f, Value... params){
			this.f = f; 
			this.params = params.clone();
		}
		
		Value get(){
			try{
				Func func = (Func) f.deepCopy();
//				System.out.println("calling " + this);
				return func.call(params); 
			}catch(ClassCastException e){
				throw new IllegalCastException();
			}
		}
		
		@Override
		public int asInt() {return get().asInt();}

		@Override
		public boolean asBool() {return get().asBool();}

		@Override
		public Value deepCopy() {return get().deepCopy();}
		
		@Override 
		public List<Value> asList(){return get().asList();}
		
		@Override public String toString(){
			StringBuilder sb = new StringBuilder();
//			sb.append(f.name + "(");
			for(Value v : params)sb.append(v + ",");
			return sb.toString() + ")";
		}
	}
	
	public static class Num implements Value{
		int value;
		
		public Num(int v){
			value = v;
		}

		@Override public int asInt() {return value;}

		@Override public boolean asBool() {return value != 0;}

		@Override public Value deepCopy() {return new Num(value);}
		
		@Override public String toString(){return ParserUtil.fromInt(value);}
		
		@Override 
		public List<Value> asList(){throw new IllegalCastException();}
	}
	
	public static class Var implements Value{
		String name;
		Block context;
		Value obj;
		
		public Var(String name, Block context){
			this.name = name;
			this.context = context;
		}
		
		public Var(String name, Value obj){
			this.name = name;
			this.obj = obj;
		}
		
		public void updateContext(){
			if(obj != null)context = ((Object)obj.deepCopy()).def;
		}
		
		public Value value(){ updateContext(); return context.get(name);}
		
		@Override public int asInt() {return value().asInt();}

		@Override public boolean asBool() {return value().asBool();}

		@Override public Value deepCopy() {return value().deepCopy();}
		
		@Override public String toString(){return value().toString();}
		
		@Override 
		public List<Value> asList(){ return value().asList();}
	}
	
	public static class Eval implements Value{
		public static int ADD = 0;
		public static int SUB = 1;
		public static int MUL = 2;
		public static int DIV = 3;
		public static int RMD = 4;
		
		public static int GT = 5;
		public static int LT = 6;
		public static int NGT = 7;
		public static int NLT = 8;
		public static int EQ = 9;
		public static int NEQ = 10;
		public static int AND = 11;
		public static int OR = 12;
		public static int NOT = 13;
		
		public static int ISIN = 14;
		public static int JOIN = 15;
		public static int CUTR = 16;
		public static int CUTL = 17;
		
		public static String opchars = "+ - * / % > < <=>===!=&&||! ";
		
		Value a, b;
		int opcode;
		
		public Eval(Value a, Value b, int op){
			this.a = a;
			this.b = b;
			opcode = op;
		}
		
		@Override public int asInt() {
			if(opcode == ADD)return a.asInt() + b.asInt();
			else if(opcode == SUB)return a.asInt() - b.asInt();
			else if(opcode == MUL)return a.asInt() * b.asInt();
			else if(opcode == DIV)return a.asInt() / b.asInt();
			else if(opcode == RMD)return a.asInt() % b.asInt();
			throw new IllegalCastException();
		}

		@Override public boolean asBool() {
			if(opcode == GT)return a.asInt() > b.asInt();
			else if(opcode == LT)return a.asInt() < b.asInt();
			else if(opcode == NGT)return a.asInt() <= b.asInt();
			else if(opcode == NLT)return a.asInt() >= b.asInt();
			else if(opcode == EQ)return a.asInt() == b.asInt();
			else if(opcode == NEQ)return a.asInt() != b.asInt();
			else if(opcode == AND)return a.asBool() && b.asBool();
			else if(opcode == OR)return a.asBool() || b.asBool();
			else if(opcode == NOT)return !a.asBool();
			else if(opcode == ISIN){
				for(Value v : b.asList())if(v.asInt() == a.asInt())return true;
				return false;
			}
			throw new IllegalCastException();
		}
		
		@Override 
		public List<Value> asList(){
			if(opcode == ADD){
				List<Value> la = a.asList();
				la.add(b.deepCopy());
				return la;
			}
			else if(opcode == JOIN){
				List<Value> l = new ArrayList<Value>(a.asList());
				l.addAll(b.asList());
				return l;
			}else if(opcode == CUTR){
				List<Value> l = new ArrayList<Value>();
				List<Value> o = a.asList();
				for(int i = 0; i < b.asInt();i++)l.add(o.get(i));
				return l;
			}else if(opcode == CUTL){
				List<Value> l = new ArrayList<Value>();
				List<Value> o = a.asList();
				for(int i = b.asInt()-1;i < o.size(); i++)l.add(o.get(i));
				return l;
			}
			throw new IllegalCastException();
		}

		@Override public Value deepCopy() {
			try{
				List<Value> vals = asList();
				return new Lst(vals.toArray(new Value[vals.size()]));
			}catch(IllegalCastException e){}
			try{
				int i = asInt();
				return new Num(i);
			}catch(IllegalCastException e){}
			try{
				boolean i = asBool();
				return new Num(i ? 1 : 0);
			}catch(IllegalCastException e){}
			throw new IllegalCastException();
		}
		
		@Override public String toString(){return a.toString() + " " + opchars.substring(opcode*2, opcode*2+2) + " " + b.toString();}
		
		
	}
	
	private Exp(){};
}
