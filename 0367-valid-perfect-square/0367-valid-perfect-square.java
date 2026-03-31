class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==0) return true;
        if(num==1) return true;
        int lo=1,hi=num;
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            long square = (long) mid * mid;
            if(square==num) return true ;
            else if(square>num) hi = mid-1;
            else lo = mid+1;
        }
        return false;
    }
}