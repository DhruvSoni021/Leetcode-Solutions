class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int minDis = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target) {
                int dist = abs(i-start); 
                if(dist < minDis) 
                {
                    minDis = dist;
                }                
            } 
        }
        return minDis;
    }
    public int abs(int ans)
    {
        if(ans>=0)
        {
            return ans;
        }
        else{
            return -ans;
        }
    }
}