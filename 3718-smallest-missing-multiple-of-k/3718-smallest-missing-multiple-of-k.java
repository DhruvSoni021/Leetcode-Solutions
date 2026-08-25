class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums)
        {
            if(ele%k==0)set.add(ele);
        }
        int c=1;
        while(set.contains(k*c)){
            c++;
        }
        return k*c;

    }
}