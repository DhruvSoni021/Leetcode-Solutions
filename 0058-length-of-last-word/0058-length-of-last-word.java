class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        // char[] arr = s.toCharArray();

        int count=0;
        for(int i=s.length()-1;i>=0;i--)
        {
           if(s.charAt(i)==' ') break;
           
           count++;
        }
        return count;
    }
}