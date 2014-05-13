package hx.xuyu;
import hx.xuyu.Exp.Num;

import java.util.HashMap;
import java.util.Map;


public class Block {
	
	public static class NotDefinedException extends RuntimeException{};
	
	Block parent;
	Map<String, Exp.Value> vars = new HashMap<>();	
	Stat[] statements;
	
	public Block(Block p){
		parent = p;
	}
	
	public Exp.Value get(String key){
		if(!has(key))return new Exp.Num(0);//should throw new NotDefinedException() ? 
		if(vars.containsKey(key))return vars.get(key);
		return parent.get(key);
	}
	
	public void set(String key, Exp.Value value){
		value = value.deepCopy();
		if(!has(key))vars.put(key, value);
		else if(vars.containsKey(key))vars.put(key, value);
		else parent.set(key, value);
	}
	
	public void setLocal(String key, Exp.Value value){
		value = value.deepCopy();
		vars.put(key, value);
	}
	
	public boolean has(String key){
		if(vars.containsKey(key))return true;
		if(parent == null)return false;
		return parent.has(key);
	}
	
	public void exec(){
		for(Stat s : statements)s.exec(this);
	}
}
