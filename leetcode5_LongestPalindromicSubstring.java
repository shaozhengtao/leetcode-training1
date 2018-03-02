
public class leetcode5_LongestPalindromicSubstring {
	static char[] ss;
    static int left=0, max=1;
    public static String longestPalindrome(String s) {
        ss=s.toCharArray();
        if(ss.length<1) return "";
        for(int i=0; i<ss.length; i++){
            i=update(i);
        }
        return s.substring(left, left+max);
    }
    public static int update(int index){
        int ll=index, rr=index;
        while(rr+1<ss.length && ss[rr]==ss[rr+1]){
            rr++;
        }
        int temp=rr;
        while(rr+1<ss.length && ll-1>=0 && ss[rr+1]==ss[ll-1]){
            rr++;
            ll--;
        }
        if(rr-ll+1>max){
            max=rr-ll+1;
            left=ll;
        }
        return temp;
    }
    public static void main(String[] args) {
		String s="babad";
		String res=longestPalindrome(s);
		System.out.println(res);
	}
}
