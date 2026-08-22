class Solution {
    public boolean checkDivisibility(int n) {
        int m = n;
        int x = 0;
        int y = 1;
        while(n!=0)
        {
            int r = n%10;
            x = x+r;
            y = y*r;
            n = n/10;
        }
        return (m % (x+y))==0;
    }
}