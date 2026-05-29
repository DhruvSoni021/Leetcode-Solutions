class Solution {
    public int minElement(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int r = 0;
            int rem = 0;
           while(nums[i]!=0)
           {
            r = nums[i] % 10;
            rem += r;
            nums[i] /= 10;
           }
           arr.add(rem); 
        }
       return Collections.min(arr);
    }
}