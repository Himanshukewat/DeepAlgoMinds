public class NextPermutation {
    public void nextPermutation(int[] nums) {

        int index = -1;

        // Find pivot from right (breakingPoint 2 1 5 4 3 0 0) 1 is breakpoint 
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // If no pivot found
        if (index == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        // swap btw n-1 to index slightly greater element , swap
        for (int i = nums.length - 1; i > index; i--) {
            if (nums[i] > nums[index]) {  
                swap(nums, i, index);
                break;
            }
        }
        reverse(nums, index + 1, nums.length - 1); // then reverse 
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
