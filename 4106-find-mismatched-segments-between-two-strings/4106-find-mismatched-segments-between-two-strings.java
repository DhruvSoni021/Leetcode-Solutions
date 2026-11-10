class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> ans = new ArrayList<>();
        int i=0;
        while(i<s1.length())
            {
                List<String> arr = new ArrayList<>();
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                if(s1.charAt(i)!=s2.charAt(i))
                {
                    int k = i;
                    int j = i;
                    while(j<s1.length() && s1.charAt(j)!=s2.charAt(j)) 
                    {
                        sb1.append(s1.charAt(j));
                        sb2.append(s2.charAt(j));
                        j++;
                    }
                    i=j;
                    String sbb1 = sb1.toString();
                    String sbb2 = sb2.toString();
                    arr.add(sbb1);
                    arr.add(sbb2);
                    ans.add(arr);
                }
                else{
                    i++;
                }     
            }
        return ans;
    }
}