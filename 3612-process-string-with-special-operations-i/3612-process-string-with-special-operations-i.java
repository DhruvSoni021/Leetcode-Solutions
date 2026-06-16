class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder res = new StringBuilder();
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)>='a' && sb.charAt(i)<='z') res.append(sb.charAt(i));
            else if(sb.charAt(i)=='*') 
            {
                if(res.length() > 0) 
                {
                    res.deleteCharAt(res.length()-1);
                }
            }
            else if(sb.charAt(i)=='#')
            {
                res.append(new StringBuilder(res));
            }
            else if(sb.charAt(i)=='%')
            {
                res.reverse();
            }
        }
        return res.toString();
    }
}