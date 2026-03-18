class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};



// not applicable as Arrays.srt changes the index of the current element and then at the time of returning the array index the indices are returned wrong 
        // Arrays.sort(nums);
        // int i=0,j=nums.length-1;
        // while(i<j)
        // {
        //     if(nums[i]+nums[j]==target) return new int[]{i,j};
        //     else if(nums[i]+nums[j]>target) j--;
        //     else if(nums[i]+nums[j]<target) i++;
        // }
        // return new int[]{-1,-1};
    }


}