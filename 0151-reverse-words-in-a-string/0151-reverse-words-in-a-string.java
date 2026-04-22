class Solution {
    public String reverseWords(String s) {

        s = s.trim().replaceAll("\\s+", " ");
        
        char[] arr = s.toCharArray();
        
        reverse(arr, 0, arr.length - 1);
        
        int start = 0;
        for (int end = 0; end <= arr.length; end++) {
            if (end == arr.length || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }
        
        return new String(arr);
    }
    
    private void reverse(char[] arr, int i, int j) {
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    
}