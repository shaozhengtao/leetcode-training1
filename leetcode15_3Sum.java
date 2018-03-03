import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode15_3Sum {
	static List<List<Integer>> res=new ArrayList<List<Integer>>();
	public static List<List<Integer>> threeSum(int[] nums){
		if(nums==null || nums.length<3) return res;
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			if(i>0 && nums[i]==nums[i-1]) continue;
			addSum(nums,i+1,nums.length-1,nums[i]);
		}
		return res;
	}
	public static void addSum(int[] nums,int l,int r,int target) {
		while(l<r) {
			if(nums[l]+nums[r]+target==0) {
				List<Integer> temp=new ArrayList<Integer>();
				temp.add(target);
				temp.add(nums[l]);
				temp.add(nums[r]);
				res.add(temp);
				if(l<r && nums[l]==nums[l+1]) l++;
				if(l<r && nums[r]==nums[r-1]) r--;
				l++;
				r--;
			}else if(nums[l]+nums[r]+target<0) {
				l++;
			}else {
				r--;
			}
		}
	}
	public static void main(String[] args) {
		int[] nums= {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> res=threeSum(nums);
		System.out.println(res);
	}
}
