class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ')') {
                st.push(s.charAt(i));
            } 
            else {
                StringBuilder sb = new StringBuilder();

                // Pop until '('
                while (st.peek() != '(') {
                    sb.append(st.pop());
                }

                // Remove '('
                st.pop();

            
                for (int j = 0; j < sb.length(); j++) {
                    st.push(sb.charAt(j));
                }
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }
}


// class Solution {
//     public String reverseParentheses(String s) {
//         Stack<Character> st = new Stack<>();
//         StringBuilder ans = new StringBuilder();
//         for(int i=0;i<s.length();i++)
//         {
//             st.push(s.charAt(i));
//             if(i!=s.length()-1 && s.charAt(i)==')')
//             {
//                 StringBuilder sb = new StringBuilder();
//                 while(st.peek()!='(')
//                 {
//                     sb.append(st.pop());
//                 }
//                 st.pop();
//                 for(int j=0;j<sb.length();j++)
//                 {
//                     if(sb.charAt(j)>='a' && sb.charAt(j)<='z') st.push(sb.charAt(j));
//                 }
//             }
//             else{
//                 while(st.size()>0)
//                 {
//                     if(st.peek()>='a' && st.peek()<='z') ans.append(st.pop());
//                     else st.pop();
//                 }
//             }
//         }
//         return new String(ans);
//     }
// }