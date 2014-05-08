package hx.xuyu;
public class ParserUtil {
	private static String nums = "��һ�����������߰˾�";
	private static String bits = "��ʮ��ǧ����";
	public static int parseInt(String str){
		int s = 0;
		String current = "";
		CharSequence zi;
		for(int i = 0; i < str.length(); i ++){
			zi = str.subSequence(i, i+1);
			if(str.charAt(i) == '��'){
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
	
	public static String fromInt(int thing){
		if(thing == 0)return "��";
		else return fromInt(thing, false);
	}
	
	public static String fromInt(int thing,boolean prepend){
		if(thing >= 100000000){
			return fromInt(thing / 100000000, prepend) +"��" + fromInt(thing % 100000000, true);
		}else if(thing >= 10000){
			return fromInt(thing / 10000, prepend) + "��" + fromInt(thing % 10000, true);
		}else{
			int qian = thing / 1000;
			int bai = (thing % 1000) / 100;
			int shi = (thing % 100) / 10;
			int ge  = thing % 10; 
			String result = "";
			
			if(qian > 0){
				result += nums.substring(qian, qian+1) + "ǧ";
				prepend = true;
			}
			else if(prepend){
				result += "��";
				prepend = false;
			}
			if(bai > 0){
				result += nums.substring(bai, bai+1) + "��";
				prepend = true;
			}
			else if(prepend){
				result += "��";
				prepend = false;
			}
			if(shi > 0){
				result += nums.substring(shi, shi+1) + "ʮ";
				prepend = true;
			}else if(prepend){
				result += "��";
				prepend = false;
			}
			if(ge > 0)result += nums.substring(ge, ge+1);
			return result;
		}
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
}
