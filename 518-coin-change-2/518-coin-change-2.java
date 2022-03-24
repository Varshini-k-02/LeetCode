class Solution {
    public int change(int amount, int[] coins) {
        return maxCount(coins,amount,0, new HashMap<String,Integer>());
    }
    static int maxCount(int[] coins, int amt,int currItem, HashMap<String,Integer> map){
        if(amt==0)
            return 1;
        if(currItem==coins.length)
            return 0;
        String currentKey=currItem+"-"+amt;
        if(map.containsKey(currentKey))
            return map.get(currentKey);
        int pick=0;
        if(coins[currItem]<=amt)
            pick=maxCount(coins,amt-coins[currItem],currItem,map);
        
        int notPick=maxCount(coins,amt,currItem+1,map);
        map.put(currentKey,pick+notPick);
        return map.get(currentKey);
    }
}