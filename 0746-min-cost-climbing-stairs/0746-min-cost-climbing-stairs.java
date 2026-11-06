class Solution {
    static int[] dp;
    public int minCostClimbingStairs(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return Math.min(cost(0,nums),cost(1,nums));
    }
    private int cost(int i,int[] nums)
    {
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        return dp[i] = nums[i]+ Math.min(cost(i+1,nums),cost(i+2,nums));
    }
}