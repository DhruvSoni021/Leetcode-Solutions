class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int [] freq = new int[nums.length+1];
        for(int num:nums)
        {
            freq[num]++;
        }

        for(int i=1;i<freq.length;i++)
        {
            if(freq[i]==2) ans.add(i);
        }
        return ans;
    }
}