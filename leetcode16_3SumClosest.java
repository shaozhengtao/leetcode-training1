import java.util.Arrays;

public class leetcode16_3SumClosest {
 public static int ThreeSumClosest(int[] nums,int target) {
	 Arrays.sort(nums);
	 int diff=nums[0]+nums[1]+nums[2];
	 int res=Math.abs(diff-target);
	 for(int i=0;i<nums.length-2;i++) {
		 int l=i+1;
		 int r=nums.length-1;
		 while(l<r) {
			 int temp=nums[i]+nums[l]+nums[r];
			if(Math.abs(temp-target)<res) {
				res=Math.abs(temp-target);
				diff=temp;
				r--;
			}else {
				l++;
			}
			
		 }
	 }
	 return diff;
 }
 public static void main(String[] args) {
	int[] nums= {-1,2,1,4};
	int target=1;
	int res=ThreeSumClosest(nums,target);
	System.out.println(res);
}
}
