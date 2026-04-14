class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] arr1= word1.toCharArray();
        char[] arr2= word2.toCharArray();
        char[] ans = new char[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(k%2!=0)
            {
                ans[k++]=arr2[j++];
            }
            else{
                ans[k++]=arr1[i++];
            }
        }
        while(i<arr1.length)
        {
            ans[k++]=arr1[i++];
        }
        while(j<arr2.length)
        {
            ans[k++]=arr2[j++];
        }
        String s = new String(ans);
        return s;
    }
}