class Solution {
    public boolean findSubarrays(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        for(int i=0;i<2;i++)
        {
            sum+=nums[i];
        }
        boolean flag = false;
        arr.add(sum);
 
        for(int j=2;j<nums.length;j++)
        {
            sum-= nums[j-2];
            sum+= nums[j];
            if(!arr.contains(sum)) arr.add(sum); 
            else {
                flag = true;
                break;
            }
        }
        return flag;
    }
}