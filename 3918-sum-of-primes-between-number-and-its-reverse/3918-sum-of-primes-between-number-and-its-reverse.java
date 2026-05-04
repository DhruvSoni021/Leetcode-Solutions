class Solution {
    public int sumOfPrimesInRange(int n) {
        int rev=0,r=0;
        int m =n;
        int sum=0;
        while(m!=0)
        {
            r = m%10;
            rev = rev*10 + r;
            m/=10; 
        }
        int min = Math.min(n,rev);
        int max = Math.max(n,rev);

        for(int i=min; i<=max; i++)
        {
            if(isPrime(i))
            {
                sum+=i;
            }
        }
        return sum;

    }
    public boolean isPrime(int n)
    {
        if(n<=1) return false;

        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n % i == 0) return false;
        }
        return true;
    }
}