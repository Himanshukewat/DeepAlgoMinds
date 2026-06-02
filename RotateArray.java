class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        // int temp[] = new int[n];
        // for(int i=0; i<n; i++){
        //     temp[(i+k) % n] = nums[i];
        // }  

        // for(int i=0; i<n; i++){
        //     nums[i] = temp[i];
        // }
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }

    public void reverse(int nums[], int st, int end){

        while(st <= end){
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }
    }
}