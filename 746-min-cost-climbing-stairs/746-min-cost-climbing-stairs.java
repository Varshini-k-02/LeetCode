class Solution {
    public int minCostClimbingStairs(int[] cost) {
        HashMap<Integer,Integer> memo = new HashMap<>();
        int a=minCost(cost,0,cost.length,memo);
        int b=minCost(cost,1,cost.length,memo);
        return Math.min(a,b);
    }
    public static int minCost(int[] cost,int currStair,int targetStair,HashMap<Integer,Integer> memo){
        if(currStair==targetStair){
            return 0;
        }
        if(currStair>targetStair){
            return 1001;
        }
        if(memo.containsKey(currStair)){
            return memo.get(currStair);
        }
        int oneStep=cost[currStair] + minCost(cost,currStair+1,targetStair,memo);
        int twoStep=cost[currStair] + minCost(cost,currStair+2,targetStair,memo);
        memo.put(currStair,Math.min(oneStep,twoStep));
        return Math.min(oneStep,twoStep);
    }
}