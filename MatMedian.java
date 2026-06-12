import java.util.Arrays;

public class MatMedian {
    public int median(int[][] mat) {
        // code here
        int n = mat.length , m = mat[0].length;
        int ans[] = new int[m*n];
        int index = 0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                ans[index++] = mat[i][j];
            }
        }
        
        Arrays.sort(ans);
        
        int median = ans[ans.length/2];
        return median;
    }
}