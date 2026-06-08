public class FirstLastIndex {
    public int[] searchRange(int[] nums, int target) {
        int first = firstIndex(nums,target);
        int last = lastIndex(nums,target);
        return new int[]{first,last};
        
    }

    public int firstIndex(int[] nums, int target){
        int position = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] < target){
                start = mid + 1;
            } else if(nums[mid] > target){
                end = mid - 1;
            } else {
                position = mid;
                end = mid - 1;
            } 
        }
        return position;
    }

        public int lastIndex(int[] nums, int target){
        int position = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] < target){
                start = mid + 1;
            } else if(nums[mid] > target){
                end = mid - 1;
            } else {
                position = mid;
                start = mid + 1;
            }  
        }
        return position;
    }
}
