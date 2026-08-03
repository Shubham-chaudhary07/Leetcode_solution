class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int num=(int)Math.log10(nums[i]);
            num=num+1;
            if(num%2==0){
                count++;
            }

        }
        return count;
    }
}