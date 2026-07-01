class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int[] ans = solve(arr, 0, arr.length - 1);
        ArrayList<Integer> res = new ArrayList<>();
        res.add(ans[0]); 
        res.add(ans[1]); 
        return res;
    }

    static int[] solve(int[] arr, int start, int end) {

        if (start == end) {
            return new int[]{arr[start], arr[start]};
        }

        int[] ans = solve(arr, start + 1, end);

        ans[0] = Math.min(ans[0], arr[start]);
        ans[1] = Math.max(ans[1], arr[start]);

        return ans;
    }
}
