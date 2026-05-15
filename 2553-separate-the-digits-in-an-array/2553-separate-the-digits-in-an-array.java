class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<nums.length;i++)
        {
            String s = String.valueOf(nums[i]);
            for(int j=0; j<s.length(); j++)
            {
                ans.add(s.charAt(j)-'0');
            }
        }
        int [] arr = new int[ans.size()];
        for(int i=0; i<ans.size(); i++)
        {
            arr[i] = ans.get(i);
        }
        return arr;
    }
}