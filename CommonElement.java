import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        // code here
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> ansSet = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set1.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            if (set1.contains(b[i])) {
                set2.add(b[i]);
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (set2.contains(c[i])) {
                ansSet.add(c[i]);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>(ansSet);
        Collections.sort(ans);

        return ans;
    }
}
