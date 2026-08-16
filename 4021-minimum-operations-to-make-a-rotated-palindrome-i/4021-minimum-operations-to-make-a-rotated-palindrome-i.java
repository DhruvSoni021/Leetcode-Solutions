class Solution {
    public int minOperations(String s) {
       int n = s.length();
        int ans = Integer.MAX_VALUE;
        for(int r=0;r<n;r++)
            {
                String str = s.substring(r)+s.substring(0,r);
                int i = 0;
                int j = n-1;
                int operations = r;
                while(i<j)
                    {
                        int a = str.charAt(i);
                        int b = str.charAt(j);
                        if(a!=b) {
                            int diff = Math.abs(a-b);
                            operations += Math.min(diff,26-diff);
                        }
                        i++;
                        j--;
                    }
                ans = Math.min(ans,operations);
            }
        return ans;
    }
}