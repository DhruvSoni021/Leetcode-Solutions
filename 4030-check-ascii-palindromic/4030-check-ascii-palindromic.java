class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray())
            {
                int as = (int)ch;
                String x = Integer.toBinaryString(as);

                while(x.length()<8)
                    {
                        x = "0"+x;
                    }
                sb.append(x);
            }
        int i = 0, j = sb.length()-1;
        while(i<j)
            {
                if(sb.charAt(i)!=sb.charAt(j)) return false;
                i++;
                j--;
            }
        return true;
    }
}