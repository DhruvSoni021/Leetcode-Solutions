class Solution {
    public int findDuplicate(int[] nums) {
     int [] freq = new int[nums.length+1];
     int duplicate=-1;

     for(int num:nums)
     {
        freq[num]++;
     }
    
    for(int i=1;i<=nums.length;i++)
    {
        if(freq[i]>1) duplicate=i;
        
    }
        return duplicate;
    }
}