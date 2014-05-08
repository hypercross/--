package hx.xuyu;
import java.util.LinkedList;


public class XuyuCompiler {

	LinkedList<Block> blocks = new LinkedList<>();
	LinkedList<Stat> statements = new LinkedList<>();
	LinkedList<Integer> stc = new LinkedList<>();
	LinkedList<String> ids = new LinkedList<>();
//	LinkedList<Exp.Value> values = new LinkedList<>();
	LinkedList<LinkedList<Exp.Value>> values = new LinkedList<>();
	int stchead = 0;
	
	public Block pushBlock(){
		Block b = new Block(blocks.isEmpty() ? null : blocks.getLast());
		blocks.add(b);
		stc.add(stchead);
		stchead = 0;
		return b;
	}
	
	public Block popBlock(){
		currentBlock().statements = dumpStats();
		stchead = stc.removeLast();
		return blocks.removeLast();
	}
	
	public void popAllBlock(){
		while(!blocks.isEmpty())popBlock();
	}
	
	private Stat[] dumpStats(){
		Stat[] stats = new Stat[stchead];
		while(stchead-->0){
			stats[stchead] = statements.removeLast();
		}
		return stats;
	}
	
	public Block currentBlock(){
		return blocks.getLast();
	}
	
	public void addStat(Stat s){
		statements.add(s);
		stchead++;
	}
	
	public void putId(String str){
		ids.add(str);
	}
	
	public String[] getIds(){
		String[] result = ids.toArray(new String[ids.size()]);
		ids.clear();
		return result;
	}
	
	public void pushVals(){
		values.add(new LinkedList<Exp.Value>());
	}
	
	public void putVal(Exp.Value value){
		values.getLast().add(value);
	}
	
	public Exp.Value[] popVals(){
		Exp.Value[] result = values.getLast().toArray(new Exp.Value[values.getLast().size()]);
		values.removeLast();
		return result;
	}
}
