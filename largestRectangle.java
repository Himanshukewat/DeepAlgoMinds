class Result {

    /*
     * Complete the 'largestRectangle' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY h as parameter.
     */

    public static long largestRectangle(List<Integer> h) {
    // Write your code here
    long ans = 0;
    for(int i=0; i<h.size(); i++){
        int left = i - 1;
        while(left >= 0 && h.get(left) >= h.get(i)){
            left--;
        }
        int right = i + 1;
        while(right < h.size() && h.get(right) >= h.get(i)){
            right++;
        }
        int width = right - left - 1;
        int area = h.get(i) * width;
        ans = Math.max(ans,area);
    }
    return ans;

    }

}
