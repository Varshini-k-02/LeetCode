class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[1+n];
        Arrays.fill(dp,-1);
        return stair(0,n,dp);
    }
    public static int stair(int currStair, int targetStair, int[] dp){
        if(currStair==targetStair){
            return 1;
        }
        if(currStair>targetStair){
            return 0;
        }
        if(dp[currStair]!=-1){
            return dp[currStair];
        }
        int oneStep = stair(currStair+1,targetStair,dp);
        int twoStep = stair(currStair+2,targetStair,dp);
        dp[currStair]=oneStep + twoStep;
        return dp[currStair];
    }
}