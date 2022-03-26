class Solution {
    public int maxProfit(int[] prices) {
        return profit(prices,0,1,new HashMap<String,Integer>());
    }
    public int profit(int[] prices, int currDay, int canBuy, HashMap<String,Integer> map){
        if(currDay>=prices.length)
            return 0;
        
        String key=currDay+"-"+canBuy;
        
        if(map.containsKey(key))
            return map.get(key);
        int ans=0;
        if(canBuy==1){
            int idle = profit(prices,currDay+1,canBuy,map);
            int buy=-prices[currDay]+profit(prices,currDay+1,0,map);
            map.put(key,Math.max(idle,buy));
            return map.get(key);
        }
        else{
            int idle = profit(prices,currDay+1,canBuy,map);
            int sell=prices[currDay]+profit(prices,currDay+2,1,map);

            map.put(key,Math.max(idle,sell));
            return map.get(key);
        }
    }
}