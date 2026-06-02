class MaxAbsoluteSum {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = nums[0];
        int minSum = nums[0];
        int maxEnding = nums[0];
        int minEnding = nums[0];
        for(int i=1; i<nums.length; i++){
            // minimum subarray sum
            int minV1 = minEnding + nums[i];
            int minV2 = nums[i];
            minEnding = Math.min(minV1, minV2);
            minSum = Math.min(minSum , minEnding);

            // maximum subarray
            int maxV1 = maxEnding + nums[i];
            int maxV2 = nums[i];
            maxEnding = Math.max(maxV1, maxV2);
            maxSum = Math.max(maxEnding, maxSum);

        }
        int ans = Math.max(maxSum,Math.abs(minSum));
        return ans;
    }
}