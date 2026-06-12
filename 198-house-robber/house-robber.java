class Solution {
    public static int solve(int i, int[] nums, int dp[]){
        int n = nums.length;
        if(i>=n)
        return 0;

        if(dp[i]!=-1){
            return dp[i];
        }
        int take = nums[i]+solve(i+2, nums, dp);
        int skip = solve(i+1, nums, dp);

        return dp[i] = Math.max(take, skip);

    }
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            dp[i] = -1;
        }
        return solve(0, nums, dp);
    }
}