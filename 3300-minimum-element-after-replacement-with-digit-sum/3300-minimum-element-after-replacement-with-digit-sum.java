class Solution {
    public int minElement(int[] nums) {
        // mine
    //     ArrayList<Integer> arr = new ArrayList<>();
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         int r = 0;
    //         int rem = 0;
    //        while(nums[i]!=0)
    //        {
    //         r = nums[i] % 10;
    //         rem += r;
    //         nums[i] /= 10;
    //        }
    //        arr.add(rem); 
    //     }
    //    return Collections.min(arr);


    // optimal 
          int min = Integer.MAX_VALUE;

        for (int num : nums) {

            int sum = 0;
            int temp = num;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if(sum < min)
            {
                min = sum;
            }
        }
        return min;
    }
}