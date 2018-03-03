
public class leetcode11_ContainerWithMostWater {
	public static int maxArea(int[] height) {
		if(height==null || height.length<2) return 0;
		int l=0;
		int r=height.length-1;
		int res=0;
		while(l<r) {
			int area=Math.min(height[l], height[r])*(r-l);
			res=Math.max(res, area);
			if(height[l]>height[r]) {
				r--;
			}else {
				l++;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] height= {2,3,4,6,9,10};
		int result=maxArea(height);
		System.out.println(result);
	}
}
