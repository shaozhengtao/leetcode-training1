
public class leetcode13_RomantoInteger {
	public static int RomantoInteger(String s) {
		if(s.length()<1) return 0;
		int result=0;
		int current=0;
		int pre=romanInt(s.charAt(0));
		int temp=pre;
		for(int i=1;i<s.length();i++) {
			current=romanInt(s.charAt(i));
			if(pre==current) {
				temp=temp+current;
			}else if(pre<current) {
				temp=current-temp;
			}else {
				result=result+temp;
				temp=current;
			}
			pre=current;
		}
		result=result+temp;
		return result;
	}
	public static int romanInt(char c) {
		switch(c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}
	public static void main(String[] args) {
		String s="DLXIV";
		int res=RomantoInteger(s);
		System.out.println(res);
	}
}
