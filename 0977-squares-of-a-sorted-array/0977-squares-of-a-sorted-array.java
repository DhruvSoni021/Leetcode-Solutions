class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] ans = new int[nums.length];

        int left = 0;
        int right = nums.length-1;
        int idx = nums.length-1;

        while(left <= right)
        {
            int lSquare = nums[left]*nums[left];
            int rSquare = nums[right]*nums[right];

            if(lSquare > rSquare)
            {
                ans[idx] = lSquare;
                left++;
            }
            else{
                ans[idx] = rSquare;
                right--;
            }
            idx--;
        }
        return ans;
    }
}