class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums)
        {
            set.add(ele);
        }
        int c=1;
        while(set.contains(k*c)){
            c++;
        }
        return k*c;

    }
}