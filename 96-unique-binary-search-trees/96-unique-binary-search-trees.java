class Solution {
    public int numTrees(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return possibleTrees(n,dp);
    }
    public static int possibleTrees(int n, int[] dp){
        if(n==0||n==1){
            return 1;
        }
        if(dp[n]!=-1)
            return dp[n];
        int ways=0;
        for(int i=0;i<n;i++){
            ways+=possibleTrees(i,dp)*possibleTrees(n-i-1,dp);
        }
        dp[n]=ways;
        return dp[n];
    }
}