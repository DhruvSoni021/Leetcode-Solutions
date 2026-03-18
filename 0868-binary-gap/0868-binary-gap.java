class Solution {
    public int binaryGap(int n) {
    
        String str="";
        while(n>0)
        {
            int rem=n%2;
            str=rem+str;
            n=n/2;
        }

        int max=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1')
            {
                for(int j=i+1;j<str.length();j++)
                {
                    if(str.charAt(j)=='1')
                    {
                        int dis=j-i;
                        max= Math.max(max,dis);
                        break;
                    }
                }
            }
        }
return max;
    }
}