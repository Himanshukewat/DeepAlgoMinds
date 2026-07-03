class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] mat = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = '.';
            }
        }
        placeQ(mat,0,ans);
        return ans;
    }

    public void placeQ(char[][] mat, int row, List<List<String>> ans){
        if(mat.length == row){
            List<String> res = new ArrayList<>();
            for(int i=0; i<mat.length; i++){
                res.add(new String(mat[i]));
            }
            ans.add(res);
            return;
        }
        for(int col = 0; col<mat.length; col++){
            if(check(mat,row,col)){
                mat[row][col] = 'Q';
                placeQ(mat,row+1,ans);
                // if all column not place then remove queen , go to previous by recursion
                mat[row][col] = '.';
            }
        }
    }

    public static boolean check(char[][] mat, int row, int col){
        //current col
        for (int i = 0; i < row; i++) {
            if (mat[i][col] == 'Q') {
                return false;
            }
        }
        // upper leftt 
        int i = row - 1;
        int j = col - 1;

        while (i >= 0 && j >= 0) {
            if (mat[i][j] == 'Q') {
                return false;
            }
            i--;
            j--;
        }

        // Upper Right
        i = row - 1;
        j = col + 1;

        while (i >= 0 && j < mat.length) {
            if (mat[i][j] == 'Q') {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
    
}
