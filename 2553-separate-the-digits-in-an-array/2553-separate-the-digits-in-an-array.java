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

        // more space
        // for(int num : nums)
        // {
        //     Stack<Integer> s = new Stack<>();
        //     while(num > 0)
        //     {
        //         s.push(num % 10);
        //         num /= 10;
        //     }

        //     while(!s.isEmpty())
        //     {
        //         ans.add(s.pop());
        //     }
        // }

        int [] arr = new int[ans.size()];
        for(int i=0; i<ans.size(); i++)
        {
            arr[i] = ans.get(i);
        }
        return arr;
    }
}