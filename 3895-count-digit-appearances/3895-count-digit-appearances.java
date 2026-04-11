class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            // if(nums[i]%10==digit) count++;
            int rem=0;
            while(nums[i]!=0)
            {
                rem = nums[i]%10;
                if(rem==digit) count++;
                nums[i]=nums[i]/10;
                     
            }
        }
        return count;
    }
}