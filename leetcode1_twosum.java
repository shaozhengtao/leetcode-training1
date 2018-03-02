
public class leetcode1_twosum {
	public static int[] twoSum(int[] nums, int target) {
	    int[] map=new int[20050];
	    int size=6;
	    for(int i=0;i<nums.length;i++){
	        map[nums[i]+size]=(i+1);
	        int diff=target-nums[i+1]+size;
	        if(diff<0) continue;
	        int d=map[diff];
	        if(d>0){
	            return new int[]{d-1,i+1};
	        }
	        
	    }
	        return null;
	}
	public static void main(String[] args) {
		int[] nums= {2,7,8,9};
		int target=15;
		int[] res=twoSum(nums,target);
		for(int i=0;i<res.length;i++) {
			System.out.println("index"+" "+(i+1)+" "+"is:"+res[i]);
		}
	}
}
