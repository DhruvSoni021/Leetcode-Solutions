class Solution {
    public int mirrorDistance(int n) {
        int x =reverse(n);
        int ans =abs(n,x);
        return ans;
    }
    public int abs(int n,int x)
    {
         if((n-x)>0)
        {
            return n-x;
        }
        else{
            return -(n-x);
        }
    }
    public int reverse(int n)
    {
        int r =0, rev = 0;
        while(n!=0)
        {
            r = n % 10;
            rev = rev*10+r;
            n/=10;
        }
        return rev;
    }
}