import java.util.Arrays;

public class leetcode3_LongestSubstring {
	public static int lengthOfLongestSubstring(String s) {
        char[] str = s.toCharArray();
        // #1-使用滑动窗口[l...r]记录当前的子数组
        int l = 0, r = 0, max = 0;
        // #2-使用大小为256的数组记录每个元素最近一次遍历的下标
        int[] memo = new int[256];
        Arrays.fill(memo, -1);
        while (r < str.length) {
            int index = memo[str[r]];
            // #3-如果当前元素不是第一次遍历且存在于滑动窗口[l...r]中，则更新l
            // #4-否则将当前元素记录在滑动窗口中
            if (index >= l){
                l = index + 1;
            } else {
                max = max < r - l + 1 ? r - l + 1 : max;
            }
            // #5-记录最新下标，且滑动窗口右移一位
            memo[str[r]] = r;
            r++;
        }
        return max;
    }
	public static void main(String[] args) {
		String s="pwwkew";
		int res=lengthOfLongestSubstring(s);
		System.out.println(res);
	}
}
