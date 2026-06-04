class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int [][] reshape = new int[r][c];
        if(m*n != r*c)
        {
            return mat;
        } 
        int row = 0;
        int col = 0;
        for(int i=0; i<m; i++)
        {   
           for(int j=0; j<n; j++)
           {
                reshape[row][col] = mat[i][j];
                col++;

                if(col==c)
                {
                    row++;
                    col=0;
                }   
           }
        }
        return reshape;
    }
}