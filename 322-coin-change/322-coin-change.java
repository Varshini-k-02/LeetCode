class Solution {
    public int coinChange(int[] coins, int amount) {
        int ans= maxCount(coins,amount,0, new HashMap<String,Integer>());
        if(ans==10001)
            return -1;
        return ans;
    }
    static int maxCount(int[] coins, int amt,int currItem, HashMap<String,Integer> map){
        if(amt==0)
            return 0;
        if(currItem==coins.length)
            return 10001;
        String currentKey=currItem+"-"+amt;
        if(map.containsKey(currentKey))
            return map.get(currentKey);
        int pick=10001;
        if(coins[currItem]<=amt)
            pick=1+maxCount(coins,amt-coins[currItem],currItem,map);
        
        int notPick=maxCount(coins,amt,currItem+1,map);
        map.put(currentKey,Math.min(pick,notPick));
        return map.get(currentKey);
    }
}