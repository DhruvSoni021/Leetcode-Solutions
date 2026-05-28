class Solution {
    public boolean checkPerfectNumber(int num) {
        // my solution
        
        // int i=1;
        // int sum = 0;
        // while(i<num)
        // {
        //     if(num % i == 0) sum += i;
        //     i++;
        // }
        // if(sum == num) return true;
        // else return false;


        // optimal 
          if (num <= 1) return false;

        int sum = 1;

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) {

                sum += i;

                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }
}