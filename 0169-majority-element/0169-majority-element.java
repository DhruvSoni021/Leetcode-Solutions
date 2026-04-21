class Solution {
    public int majorityElement(int[] nums) {
        int count =0, candidate =0;
         for(int ele:nums)
         {
            if(count==0) candidate=ele;

            count+=(ele==candidate)?1:-1;
         }
         return candidate;
}
}