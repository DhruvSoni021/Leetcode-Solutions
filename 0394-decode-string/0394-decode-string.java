class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder currentString = new StringBuilder();
        int repeatCount = 0;

        for(char ch : s.toCharArray())
        {
            if(Character.isDigit(ch)) 
            {
                repeatCount = repeatCount * 10 + (ch - '0');
            }
            else if(ch == '[') 
            {
                countStack.push(repeatCount);
                stringStack.push(currentString);

                repeatCount = 0;
                currentString = new StringBuilder();
            }
            else if(ch == ']') 
            {
                int times = countStack.pop();
                StringBuilder previousString = stringStack.pop();

                for (int i = 0; i < times; i++) {
                    previousString.append(currentString);
                }

                currentString = previousString;
            }

            else 
            {
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }
}