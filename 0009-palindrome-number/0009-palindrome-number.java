class Solution {
    public boolean isPalindrome(int x){
     int y,remainder,reversedno=0;
     y=x;

    while(x>0)
      {
        remainder=x%10;
        reversedno = reversedno *10 +remainder;
        x=x/10;
        
      }
        if(y==reversedno)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
    