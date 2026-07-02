class Solution {
    static int dp[][];
    static int lcs(String s1, String s2) {
        // code here
        int n = s1.length();
        int m = s2.length();
        dp = new int[n + 1][m + 1];

        for(int i = 0; i <= n; i++){
            Arrays.fill(dp[i], -1);
        }
        return maxSubSeq(s1,s2,n,m);
        
    }
    public static int maxSubSeq(String s1, String s2, int n, int m){
        if(n == 0 || m == 0){
            return 0;
        }
        if(dp[n][m] != -1){
            return dp[n][m];
        }
        if(s1.charAt(n-1) == s2.charAt(m-1)){
            return dp[n][m] =  1 + maxSubSeq(s1,s2,n-1,m-1);
        }
        
        return dp[n][m] = Math.max(maxSubSeq(s1,s2,n-1,m),maxSubSeq(s1,s2,n,m-1));
    }
}
