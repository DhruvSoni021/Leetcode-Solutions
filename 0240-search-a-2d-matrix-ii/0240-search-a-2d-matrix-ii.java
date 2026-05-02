class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
            // for(int i=0;i<matrix.length;i++)
            // {
            //     for(int j=0;j<matrix[0].length;j++)
            //     {
            //         if(matrix[i][j]==target) return true;
            //     }
            // }
            // return false;

            int m=matrix.length;
            int n= matrix[0].length;
            int i=0,j=n-1;
            while(i<m && j>=0)
            {
                if(matrix[i][j] > target) j--;
                else if(matrix[i][j] < target) i++;
                else return true;
            }
            return false;
    }
}