class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        for(int i=1;i<nums.length;i++)
        {
            int j=i;
            while(j>0 && nums[j]<nums[j-1])
            {
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
                j--;
            }
        }
        return nums;

    }
}