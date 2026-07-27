class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);  
        return (nums[nums.length-1]-1) * (nums[nums.length-2]-1);
     


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