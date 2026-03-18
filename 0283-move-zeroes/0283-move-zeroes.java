class Solution {
    public void moveZeroes(int[] nums) {
        
        // int j=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]!=0)
        //     {
        //         int temp=nums[i];
        //         nums[i]=nums[j];
        //         nums[j]=temp;
        //         j++;
        //     }
        // }
        

        // --------------------------------------------------------

        int j = 0; // position for next non-zero

        // Step 1: place all non-zero elements in front
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Step 2: fill remaining positions with zero
        while(j < nums.length) {
            nums[j] = 0;
            j++;
        }
    

        
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}