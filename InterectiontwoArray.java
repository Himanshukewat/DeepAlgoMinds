import java.util.ArrayList;
import java.util.Arrays;

public class InterectiontwoArray {
    
    public int[] intersection(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ans = new ArrayList<>();
        while(i < nums1.length && j < nums2.length){
            // jo chota h usse aage badhaoo
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums2[j] < nums1[i]){
                j++;
            }
            else{
                // handle duplicate , when previous element check to current element
                if(ans.size() == 0 || !ans.get(ans.size() - 1).equals(nums1[i]))
                ans.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] res = new int[ans.size()];
        for (int k=0; k<ans.size(); k++) {
            res[k] = ans.get(k);
        }

        return res;
    }
}