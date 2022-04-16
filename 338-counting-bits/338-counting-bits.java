class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int i=1;i<=n;i++){
            if( i%2 == 0 )      
                dp[i] = dp[i/2];  
            else       
                dp[i] = dp[i-1] + 1;
        }
        return dp;
    }
}