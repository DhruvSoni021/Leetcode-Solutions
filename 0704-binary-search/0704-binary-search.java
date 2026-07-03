class Solution {
    public int helper(int[] nums,int target, int lo,int hi)
    {   
        if(lo>hi) return -1;
        int mid = lo+(hi-lo)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]>target) return helper(nums,target,lo,mid-1);
        else return helper(nums,target,mid+1,hi);
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        return helper(nums,target,0,n-1);



        // int low=0;
        // int high= nums.length-1;
  
        // while(low<=high)
        // {
        //    int mid=low+(high-low)/2;
        //     if(nums[mid]==target)
        //     {
        //         return mid;
        //     }
        //     else if(target<nums[mid])
        //     {
        //         high = mid -1;
        //     }
        //     else
        //     {
        //         low = mid +1;
        //     }
        // }
        // return -1;
    }
}