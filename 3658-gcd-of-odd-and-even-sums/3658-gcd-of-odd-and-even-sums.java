class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0,sumEven=0;
        for(int i=1;i<=2*n;i++)
        {
            if(i%2==0) sumEven += i;
            else sumOdd += i;
        }   
        return findgcd(sumEven,sumOdd);
    }
    public int findgcd(int a,int b)  //recursion
    {
        if(a==0) return b;
        return findgcd(b%a,a);
    }

}