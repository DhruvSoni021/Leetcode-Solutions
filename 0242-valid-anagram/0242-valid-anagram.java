class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int [] freq = new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++)
        {
            if(freq[i] != 0) return false;
        }
        return true;




        // if(s.length()!=t.length()) return false;
               
        // char [] arr1 = s.toCharArray();
        // char [] arr2 = t.toCharArray();
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // for(int i=0;i<arr1.length;i++)
        // {
        //     if(arr1[i]!=arr2[i]) return false;
        // }
        // return true;
    }
}