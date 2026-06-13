class Solution {
    public boolean palinDrome(String sub)
    {
        int i=0,j=sub.length()-1;

        while(i<j)
        {
            if(sub.charAt(i) != sub.charAt(j))
            {
                return false;   
            }
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        if(s.length()<=1) return s;

        String res ="";

        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                String sub = s.substring(i,j+1);

                if(palinDrome(sub) && res.length()<sub.length())
                {
                    res = sub; 
                }
            }
        }
        return res;
    }
}