class Solution {
    public String frequencySort(String s) {
         int n=s.length();
        int [] freq= new int[128];
        for(int i=0;i<n;i++)
        {
            freq[s.charAt(i)]++;
        }
        int maxFreq = -1;
        for(int i=0;i<n;i++){
            if(freq[s.charAt(i)] > maxFreq) {
                maxFreq = freq[s.charAt(i)];
            }
        }

        StringBuilder ans= new StringBuilder();

        for(int f=maxFreq;f>=1;f--)
        {
            for(int i=0;i<128;i++)
            {
                if(f==freq[i])
                {
                    for(int k=0;k<f;k++)
                    {
                        ans.append((char)i);
                    }
                }
            }
        }
        return ans.toString();
    }
}