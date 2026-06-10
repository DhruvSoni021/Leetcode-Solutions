class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int l=1;l<=n/2;l++)
        {
            if(n%l != 0) continue;
            
            String pattern = s.substring(0,l);
            StringBuilder sb = new StringBuilder();                
            while(sb.length()<n)
            {
                sb.append(pattern);
            
            }
            if(sb.toString().equals(s)) return true;
            
        }
        return false;
    }
}