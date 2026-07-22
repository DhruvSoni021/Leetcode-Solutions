class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        for(int i = n-1;i>=0;i--)
        {   
            if(i==0) leftSum[i] = 0;
            else 
            {
                int sum=0;
                for(int j = i-1;j>=0;j--)
                {
                    sum += nums[j];
                }
                leftSum[i]=sum;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(i==n-1) rightSum[i]=0;
            else
            {
                int sum=0;
                for(int j=i+1;j<n;j++)
                {
                    sum+=nums[j];
                }
                rightSum[i]=sum;
            }
        }
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = abs(leftSum[i],rightSum[i]);
        }
        return arr;
    }
    public int abs(int left,int right)
    {
        if(left-right < 0) return -(left-right);
        else return left-right;
    }
}