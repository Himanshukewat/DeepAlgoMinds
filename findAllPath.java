class Solution {
    public static ArrayList<ArrayList<Integer>> findAllPossiblePaths(int n, int m,
                                                                     int[][] mat) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        solve(0, 0, mat, new ArrayList<>(), ans);
        return ans;
        
    }
    
    static void solve(int i, int j, int[][] mat,ArrayList<Integer> currPath, ArrayList<ArrayList<Integer>> ans) {

        ArrayList<Integer> path = new ArrayList<>(currPath);
        path.add(mat[i][j]);

        if (i == mat.length - 1 && j == mat[0].length - 1) {
            ans.add(path);
            return;
        }

        if (i + 1 < mat.length)
            solve(i + 1, j, mat, path, ans);

        if (j + 1 < mat[0].length)
            solve(i, j + 1, mat, path, ans);
    }

}
