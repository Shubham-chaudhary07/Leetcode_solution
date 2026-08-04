class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        int currele=nums[0];
        for(int i=0;i<nums.length;currele++,i++){
            if(currele<nums[i]){
                ans.add(currele);
                i--;
            }

        }
        return ans;

    }
}