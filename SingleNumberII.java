class SingleNumberII{
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        long arrSum = 0;
        long setSum = 0;

        for(int i=0; i<nums.length; i++){
            arrSum += nums[i];
            set.add(nums[i]);
        }

        for(int n : set){
            setSum += n;
        }

        long single = (3*setSum - arrSum) / 2;
        return (int) single;
    }
}