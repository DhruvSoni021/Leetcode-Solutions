class Solution {
    public int[] plusOne(int[] digits) {
    ArrayList<Integer> arr = new ArrayList<>();
     int n=digits.length;
     int carry=1;

     for(int i=n-1;i>=0;i--)
     {
        if(digits[i]+carry <= 9)
        {
            arr.add(digits[i]+carry);
            carry=0;
        }
        else    // digts[i]+carry=10
        {
            arr.add(0);
            carry=1;
        }

     }
     if(carry==1) arr.add(1);
     
     int i=0,j=arr.size()-1;
    while(i<j)
    {
        int temp=arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
        i++;
        j--;
    }

    int [] result= new int[arr.size()];
    for(i=0;i<arr.size();i++)
    {
        result[i]= arr.get(i);
    }

    return result;

    }
}