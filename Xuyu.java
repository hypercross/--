
public class Xuyu {

	public static interface Value{
	}
	
	public static class Num implements Value{
		int val;
	}
	
	public static class Var implements Value{
		Value val;
	}
	
	public static class List implements Value{
		java.util.List<Object> val;
	}
	
	public static void print(String str){
		str = str.substring(1, str.length() - 1);
		str = str.replaceAll("【回】", "\n");
		System.out.print(str);
	}
	
	public static void print(Value v){
		if(v instanceof Num){
			System.out.print(((Num)v).val + "");
		}
	}
	
	public static Value getInt(String str){
		Num v = new Num();
		v.val = parseInt(str);
		return v;
	}
	
	public static Value eval(Value a, Value b,int method){
		Num na = (Num)a;
		Num nb = (Num)b;
		if(a==null || b ==null)return new Num();
		Num nc = new Num();
		if(method == 0)nc.val = na.val + nb.val;
		else if(method == 1)nc.val = na.val - nb.val;
		else if(method == 2)nc.val = na.val * nb.val;
		else if(method == 3)nc.val = na.val / nb.val;
		else if(method == 4)nc.val = na.val % nb.val;
		else if(method == 5)nc.val = na.val > nb.val ? 1 : 0 ;
		else if(method == 6)nc.val = na.val < nb.val ? 1 : 0 ;
		else if(method == 7)nc.val = na.val == nb.val ? 1 : 0;
		else if(method == 8)nc.val = na.val <= nb.val ? 1 : 0;
		else if(method == 9)nc.val = na.val >= nb.val ? 1 : 0;
		else if(method == 10)nc.val = na.val != nb.val ? 1 : 0;
		return nc;
	}
	
	private static String nums = "零一二三四五六七八九";
	private static String bits = "个十百千万亿";
	public static int parseInt(String str){
		int s = 0;
		String current = "";
		CharSequence zi;
		for(int i = 0; i < str.length(); i ++){
			zi = str.subSequence(i, i+1);
			if(str.charAt(i) == '万'){
				s+= getVal(current);
				s = s * 10000;								
				current = "";
				continue;
			}
				
			if(nums.contains(zi)){
				s+= getVal(current);				
				current = "";
			}
			current += zi;
		}
		s+= getVal(current);
		return s;
	}
	
	private static int getVal(String current) {
		String zi;
		int val = 0;
		for(int i = 0;i<current.length();i++){
			zi = current.substring(i, i+1);
			
			if(nums.contains(zi))val += nums.indexOf(zi);
			else if(bits.contains(zi)){
				int count = bits.indexOf(zi);
				while(count-->0)val*=10;
			}
		}
		
		return val;
	}
	
	public static void main(String[] arg){
		print("「" +parseInt("九千一百零八万四千") + "」");
	}
}
