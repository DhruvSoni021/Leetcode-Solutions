class Solution {
    public int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max1)
            {
                max2 = max1;
                max1 = nums[i];
            }
            else if(nums[i]<=max1 && nums[i]>max2)
            {
                max2 = nums[i];
            }
        }
        return (max1 - 1) * (max2 -1);


        // Arrays.sort(nums);  
        // return (nums[nums.length-1]-1) * (nums[nums.length-2]-1);
     

        
        // int max=0;
        // for(int i=0;i<nums.length-1;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //        max = Math.max(max,((nums[i]-1)*(nums[j]-1)));
        //     }
        // }
        // return max;
    }
}