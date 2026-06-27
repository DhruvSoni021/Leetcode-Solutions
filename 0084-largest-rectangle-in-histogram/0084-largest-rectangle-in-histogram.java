class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        int [] nse = new int[n];
        nse[n-1] = n;
        st.push(n-1);
        for(int i=n-2;i>=0;i--)
        {
            while(st.size()>0 && arr[st.peek()]>=arr[i]) st.pop();
            if(st.size()==0) nse[i] = n;
            else nse[i] = st.peek();    
            st.push(i);
        }
        while(st.size()>0) st.pop();

        int [] pse = new int[n];
        pse[0] = -1;
        st.push(0);
        for(int i=1;i<n;i++)
        {
            while(st.size()>0 && arr[st.peek()]>=arr[i]) st.pop();
            if(st.size()==0) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }

        int maxArea = 0;
        for(int i=0; i<n; i++)
        {
            int area = arr[i] * (nse[i]-pse[i]-1);
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;

    }
    //     Stack<Integer> st = new Stack<>();
    //     int n = heights.length;
    //     int maxArea = 0;

    //     for (int i = 0; i <= n; i++) 
    //     {
    //         int currHeight = (i == n) ? 0 : heights[i];

    //         while (!st.isEmpty() && heights[st.peek()] > currHeight) 
    //         {
    //                int height = heights[st.pop()];

    //             int right = i;
    //             int left = st.isEmpty() ? -1 : st.peek();

    //             int width = right - left - 1;

    //             maxArea = Math.max(maxArea, height * width);
    //         }

    //         st.push(i);
    //     }

    //     return maxArea;
    // }
}