class Solution {
    public List<String> fizzBuzz(int n) {
        String a="FizzBuzz";
        String b="Fizz";
        String c="Buzz";

        ArrayList<String> s = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0) s.add(a);
            else if(i%3 == 0) s.add(b);
            else if(i%5 == 0) s.add(c);
            else s.add(String.valueOf(i));
        }
        return s;
    }
}