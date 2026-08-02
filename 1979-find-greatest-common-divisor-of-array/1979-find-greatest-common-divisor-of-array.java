class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int x:nums){
            max=Math.max(max,x);
            min=Math.min(min,x);
        }
        while(max>0&&min>0){
            if(max>min){
                max=max%min;

            }
            else{
                min=min%max;
            }
        }
        if(max==0){
            return min;
        }
        return max;
    }
}