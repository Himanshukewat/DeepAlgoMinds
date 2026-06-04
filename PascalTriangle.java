import java.util.ArrayList;
import java.util.List;

class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j == 0 || j == i){
                    row.add(1);
                }
                // addition of prevrow = res[j-1] + res[j] = row(add)
                else {
                    row.add(
                        ans.get(i-1).get(j-1) + ans.get(i-1).get(j)
                    ); 
                }
            }
            ans.add(row);
        }
        return ans;
    }
}