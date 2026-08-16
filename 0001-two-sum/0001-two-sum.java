class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
       
        
       
        
        for (int i = 0; i < nums.length; i++) {
                for (int idx = i+1; idx < nums.length; idx++) {
                        if(target==(nums[i]+nums[idx])) {
                            sum[0]=i;
                            sum[1]=idx;

                        }
        
                }
        }
        
        return sum;
        
        
    }
}