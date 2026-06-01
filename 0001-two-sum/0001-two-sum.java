class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> m = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            int partner = target - nums[i];

            if(m.containsKey(partner))
            {
                return new int[]{m.get(partner),i};
            } 
            m.put(nums[i],i);
        }
        return new int[]{};




        // Time Complexity = O(n^2)
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[i]+nums[j]==target)
        //         {
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{-1, -1};

    }


}