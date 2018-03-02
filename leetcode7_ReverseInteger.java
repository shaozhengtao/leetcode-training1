
public class leetcode7_ReverseInteger {
public static int ReverseInteger(int num) {
	int res=0;
	while(num!=0) {
		if(Math.abs(res)>Integer.MAX_VALUE/10) return 0; 
		res=res*10+num%10;
		num=num/10;
	}
	return res;
}
public static void main(String[] args) {
	int n=-123;
	int result=ReverseInteger(n);
	System.out.println(result);
}
}
