class Solution {
    public int maxProfit(int k, int[] prices) {
        return profit(prices,0,1,k,new HashMap<String,Integer>());
    }
    public int profit(int[] prices, int currDay, int canBuy, int transCount, HashMap<String,Integer> map){
        if(currDay>=prices.length || transCount==0)
            return 0;
        
        String key=currDay+"-"+canBuy+"-"+transCount;
        
        if(map.containsKey(key))
            return map.get(key);
        int ans=0;
        if(canBuy==1){
            int idle = profit(prices,currDay+1,canBuy,transCount,map);
            int buy=-prices[currDay]+profit(prices,currDay+1,0,transCount,map);
            map.put(key,Math.max(idle,buy));
            return map.get(key);
        }
        else{
            int idle = profit(prices,currDay+1,canBuy,transCount,map);
            int sell=prices[currDay]+profit(prices,currDay+1,1,transCount-1,map);

            map.put(key,Math.max(idle,sell));
            return map.get(key);
        }
    }
}