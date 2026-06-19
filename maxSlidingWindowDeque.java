class Solution {
    /**
    dq.offerLast(i) -> add at backside
    dq.offerFirst(i) -> add at frontside
    dq.pollLast() -> remove from back
    dq.pollFirst() -> remove from front
    dq.peekFirst() -> first element from front
    dq.peekLast() -> first element from back
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> dq = new ArrayDeque<>();
        int ans[] = new int[n-k+1];
        int idx = 0;
        for(int i=0; i<n; i++){
            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);

            if(i >= k-1){
                ans[idx++] = nums[dq.peekFirst()];
            }
        }
        return ans;
    }
}


/**
int n = nums.length;
        int ans[] = new int[n-k+1];
        int idx = 0;
        int low = 0;
        int high = k-1;
        while(high < n){
            int max = nums[low];
            for(int i=low; i<=high; i++){
                max = Math.max(max,nums[i]);
            }
            ans[idx++] = max;
            low++;
            high++;
        }
        return ans;
 */
