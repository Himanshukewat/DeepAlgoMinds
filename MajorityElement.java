public class MajorityElement {
    public int majorityElement(int[] nums) {
        int element = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(count == 0){
                element = nums[i];
            }
            if(nums[i] == element){
                count++;
            }else{
                count--;
            }
        }
        return element;
    }
}



//solve using hashing , in map we check which key freq equal or more than n/2 times

