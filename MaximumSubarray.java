public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        // int maxSum = Integer.MIN_VALUE;
        // for(int i=0; i<nums.length; i++){
        //     int sum = 0;
        //     for(int j=i; j<nums.length; j++){
        //         sum += nums[j];
        //         maxSum = Math.max(maxSum,sum);
        //     }
        // }
        // return maxSum;

        int bestEnding = nums[0];
        int sum = nums[0];
        for(int i=1; i<nums.length; i++){
            int v1 = bestEnding + nums[i];
            int v2 = nums[i];
            bestEnding = Math.max(v1,v2);
            sum = Math.max(bestEnding,sum);
        }
        return sum;
    }
}
