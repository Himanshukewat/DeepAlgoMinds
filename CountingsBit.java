class CountingsBit {
    public int[] countBits(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp, 0); 

        int track_2 = 1;

        for(int i = 1; i<n+1; i++){
            if( track_2 * 2 == i){
                dp[i] = 1;
                track_2 = i;
            } else{
                dp[i] = dp[i - track_2] + 1 ;
            }
        }
        return dp;
    }
}