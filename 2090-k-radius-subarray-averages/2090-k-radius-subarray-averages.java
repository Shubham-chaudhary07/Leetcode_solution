import java.util.Arrays;

class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        
        
        Arrays.fill(ans, -1);
        int run = 2 * k + 1;
        if (n < run) {
            return ans;
        }
        long sum = 0;
        for (int i = 0; i < run; i++) {
            sum += nums[i];
        }
        ans[k] = (int) (sum / run);
        
        for (int i = run; i < n; i++) {
            sum = sum - nums[i - run] + nums[i];
            ans[i - k] = (int) (sum / run);
        }
        
        return ans;
    }
}