class Solution {
    public int[] searchRange(int[] nums, int tar) {
         int lo=0,hi=nums.length-1;
        int idx1=-1;
        int idx2=-1;

        // first occurrence
        while(lo<=hi)
        {
            int mid = lo+(hi-lo)/2;
            if(nums[mid]==tar)
            {
                idx1 = mid;
                hi = mid-1;
            }
            else if(nums[mid]>tar)
            {
                hi = mid-1;
            }
            else {
                lo = mid +1;
            }
        }
        //last occurrence
        lo=0;
        hi=nums.length-1;
        while(lo<=hi)
        {
            int mid = lo+(hi-lo)/2;
            if(nums[mid]==tar)
            {
                idx2 = mid;
                lo = mid+1;
            }
            else if(nums[mid]>tar)
            {
                hi = mid-1;
            }
            else {
                lo = mid +1;
            }
        }
        return new int[]{idx1,idx2};
    }
}