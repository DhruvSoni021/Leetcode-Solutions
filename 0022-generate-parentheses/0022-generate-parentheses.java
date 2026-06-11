class Solution {
    public void addParenthesis(int n,int open,int close,String s, List<String> arr){
        if(close==n)
        {
            arr.add(s);
            return;
        }
        if(open<n) addParenthesis(n,open+1,close,s+"(",arr);
        if(close<open) addParenthesis(n,open,close+1,s+")",arr);
    }

    public List<String> generateParenthesis(int n)
    {
        ArrayList<String> arr = new ArrayList<>();
        addParenthesis(n,0,0,"",arr);
        return arr;
    }
    
}