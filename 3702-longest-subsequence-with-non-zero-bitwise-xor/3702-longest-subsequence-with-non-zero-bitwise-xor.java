class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int xor=0;
        boolean check=false;
        for(int i=0;i<n;i++){
            check|=nums[i]>0;
            xor^=nums[i];
        }
        if(!check){
            return 0;
        }
        return xor==0? n-1:n;
    }
}