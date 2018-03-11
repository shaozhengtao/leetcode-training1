import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode18_4Sum {
	public static List<List<Integer>> FourSum(int[] nums,int target) {
		List<List<Integer>> res=new ArrayList<>();
		Arrays.sort(nums);
		int len=nums.length;
		if(len<4) return res;
		for(int i=0;i<len-3;i++) {
			if(nums[i]+nums[i+1]+nums[i+2]+nums[i+3]>target) break;
			if(nums[i]+nums[len-1]+nums[len-2]+nums[len-3]<target) continue;
			if(i>0 && nums[i]==nums[i-1]) continue;
			for(int j=i+1;j<len-2;j++) {
				if(nums[i]+nums[j]+nums[j+1]+nums[j+2]>target) break;
				if(nums[i]+nums[j]+nums[len-1]+nums[len-2]<target) continue;
				if(j>i+1 && nums[j]==nums[j-1]) continue;
				int l=j+1, r=len-1;
				while(l<r) {
					int sum=nums[i]+nums[j]+nums[l]+nums[r];
					if(sum==target) {
						List<Integer> temp=new ArrayList<>();
						temp.add(nums[i]);
						temp.add(nums[j]);
						temp.add(nums[l]);
						temp.add(nums[r]);
						res.add(temp);
						while(l<r && nums[l]==nums[l+1]) l++;
						while(l<r && nums[r]==nums[r-1]) r--;
						l++;
						r--;
					}else if(sum<target) l++;
					else {
						r--;
					}
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] nums= {1, 0, -1, 0, -2, 2};
		int target=0;
		List<List<Integer>> res=FourSum(nums,target);
		System.out.println(res);
	}
}
