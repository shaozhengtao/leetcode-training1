
public class leetcode9_PalindromeNumber {
	public static boolean isPalindrome(int x) {   
        int result=0;
        int intial=x;
        if(x<0) return false;
        while(x!=0){
            result=result*10+x%10;
            x=x/10;
        }
      return intial==result;
    }
	public static void main(String[] args) {
		int num=121;
		boolean res=isPalindrome(num);
		System.out.println(res);
	}
}
