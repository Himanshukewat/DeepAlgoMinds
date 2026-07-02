class Solution {
    int[][] dp;
    public int count(int coins[], int sum) {
        // code here.
        dp = new int[coins.length][sum + 1];
        for(int i=0; i<coins.length; i++){
            Arrays.fill(dp[i],-1);
        }
        return countWay(coins, 0, sum);
    }
    
    public int countWay(int coins[], int index, int sum){
        if(sum == 0){
            return 1;
        }
        if(sum < 0){
            return 0;
        }
        if(index == coins.length){
            return 0;
        }
        if(dp[index][sum] != -1){
            return dp[index][sum];
        }
        int join = countWay(coins, index , sum - coins[index]);
        int notJoin = countWay(coins, index + 1, sum);
        dp[index][sum] = join + notJoin;
        return dp[index][sum];
    }
}
