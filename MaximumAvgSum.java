class MaximumAvgSum {
    public double findMaxAverage(int[] nums, int k) {
        int winSum = 0;
        for(int i=0; i<k; i++){
            winSum += nums[i];
        }
        int sum = winSum;
        for(int i=k; i<nums.length; i++){
            winSum += nums[i];
            winSum -= nums[i-k];
            sum = Math.max(sum,winSum);
        }
        return (double) sum/k;
    }
}