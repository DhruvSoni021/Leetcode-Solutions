class Solution {
    public int[] sortArray(int[] nums) {
        
        for(int i=1;i<nums.length;i++)
         {  // if(nums[i]>=nums[i-1]) continue;   // already sorted
            
            int key = nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>key)
            {
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }
        return nums;
    } 
}