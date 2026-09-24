class Solution {
    public int smallestIndex(int[] nums) {
        int idx = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int x = nums[i];
            int r=0;
            int sum=0;
            while(x!=0)
            {
                r = x%10;
                sum = sum+r;
                x=x/10;
            }
            if(sum==i)
            {
                idx = Math.min(i,idx);
            }
        }
        if(idx == Integer.MAX_VALUE) return -1;
        else return idx;
    }
}