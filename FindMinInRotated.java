class FindMinInRotated {
    public int findMin(int[] nums) {
      int n = nums.length;
      int start = 0, end = n-1;
      int ans = 0;
      while(start <= end){
        int mid = start + (end - start)/2;
        if(nums[mid] > nums[n-1]){
            start = mid + 1;
        } else{
            ans = mid;
            end = mid - 1;
        }
      }
      return nums[ans];

    }
}