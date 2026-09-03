class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        if(nums1.length <= nums2.length)
        {
            for(int num:nums2) set.add(num);

            for(int ele:nums1) 
            {
                if(set.contains(ele)) 
                {
                    if(!arr.contains(ele)) arr.add(ele);
                }
            } 
        }
        else if(nums1.length > nums2.length)
        {
            for(int num:nums1) set.add(num);

            for(int ele:nums2) 
            {
                if(set.contains(ele)) 
                {
                    if(!arr.contains(ele)) arr.add(ele);
                }
            } 
        }
        int[] ans = new int[arr.size()];
        for(int i=0;i<arr.size();i++)
        {
            ans[i] = arr.get(i);
        }
        return ans;

    }
}