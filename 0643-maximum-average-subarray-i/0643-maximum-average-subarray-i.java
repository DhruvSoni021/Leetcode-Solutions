class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int sum = 0;
       for(int i=0;i<k;i++)
       {
            sum += nums[i];
       }
       int maxSum = sum;

       int startIdx = 0;
       int endIdx = k;
       for(int i = endIdx; i<nums.length; i++)
       {    
            sum -= nums[startIdx];
            startIdx++;

            sum += nums[endIdx];
            endIdx++;

            if(sum > maxSum)
            {
                maxSum = sum;
            }
       }
       return (double) maxSum/k;
    }
}