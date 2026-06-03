import java.util.HashMap;

class FindSumPairs {
    int nums1[];
    int nums2[];
    HashMap<Integer,Integer> map;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        map = new HashMap<>();
        for(int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], map.getOrDefault(nums2[i], 0) + 1);
        } 
    }
     // Update nums2[index] and maintain frequency map after addition
    public void add(int index, int val) {
        int old = nums2[index];
        map.put(old, map.get(old) - 1);
        nums2[index] += val;
        map.put(nums2[index],map.getOrDefault(nums2[index], 0) + 1);
    }
    
    // check the pair of n1[i] + n2[j] = tot
    public int count(int tot) {
        int ans = 0;
        for (int i=0; i<nums1.length; i++) {
            int need = tot - nums1[i];
            ans += map.getOrDefault(need, 0);
        }
        return ans;
    }
}
