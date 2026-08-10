class Solution {
    public int findDuplicate(int[] nums) {
    //  int [] freq = new int[nums.length+1];
    //  int duplicate=-1;

    //  for(int num:nums)
    //  {
    //     freq[num]++;
    //  }
    
    // for(int i=1;i<=nums.length;i++)
    // {
    //     if(freq[i]>1) duplicate=i;
        
    // }
    //     return duplicate;

        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);

        fast = nums[0];
        while(slow!=fast)
        {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;

    }
}