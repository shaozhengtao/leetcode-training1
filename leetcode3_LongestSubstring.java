import java.util.Arrays;

public class leetcode3_LongestSubstring {
	public static int lengthOfLongestSubstring(String s) {
        char[] str = s.toCharArray();
        // #1-ʹ�û�������[l...r]��¼��ǰ��������
        int l = 0, r = 0, max = 0;
        // #2-ʹ�ô�СΪ256�������¼ÿ��Ԫ�����һ�α������±�
        int[] memo = new int[256];
        Arrays.fill(memo, -1);
        while (r < str.length) {
            int index = memo[str[r]];
            // #3-�����ǰԪ�ز��ǵ�һ�α����Ҵ����ڻ�������[l...r]�У������l
            // #4-���򽫵�ǰԪ�ؼ�¼�ڻ���������
            if (index >= l){
                l = index + 1;
            } else {
                max = max < r - l + 1 ? r - l + 1 : max;
            }
            // #5-��¼�����±꣬�һ�����������һλ
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
