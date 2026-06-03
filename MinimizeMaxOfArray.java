class MinimizeMaxOfArray {
    public int minimizeArrayValue(int[] nums) {
       long sum = 0;
       long ans = 0; 
       for(int i=0; i<nums.length; i++){
            sum += nums[i];
            long required = sum / (i + 1);
                if (sum % (i + 1) != 0) {
                    required++;
                }
            ans = Math.max(ans,required);
        }
        return (int)ans;
    }
}


//brute force 

// public int minimizeArrayValue(int[] nums) {
//         boolean changed = true;
//             while (changed) {
//                 changed = false;
//                 for (int i = 1; i < nums.length; i++) {
//                     if (nums[i - 1] < nums[i]) {
//                         nums[i]--;
//                         nums[i - 1]++;
//                         changed = true;
//                     }
//                 }
//             }

//             int max = 0;
//             for (int num : nums) {        
//                 max = Math.max(max, num);
//             }

//         return max;
//     }