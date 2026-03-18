class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        int [] mrg = new int[nums1.length + nums2.length];
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j]) mrg[k++] = nums1[i++];
            else mrg[k++] = nums2[j++];
        }
        while(i<nums1.length) mrg[k++] = nums1[i++];
        while(j<nums2.length) mrg[k++] = nums2[j++];

        if(mrg.length % 2 !=0) return (double) mrg[mrg.length/2];
        else return (double)(mrg[mrg.length/2]+mrg[mrg.length/2 -1])/2;


    }
}