import java.util.Arrays;

public class MaxProductOfThree {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;
        Arrays.sort(nums);
        int product = nums[n-1] * nums[n-2] * nums[n-3];
        // if array have a negitive number present
        int negProduct = nums[0] * nums[1] * nums[n-1];

        maxProduct = Math.max(product,negProduct);
        return maxProduct;
    }
}
