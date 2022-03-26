class Solution {
    public int maxProfit(int[] prices,int fee) {
        return profit(prices,0,1,new HashMap<String,Integer>(),fee);
    }
    public int profit(int[] prices, int currDay, int canBuy, HashMap<String,Integer> map,int fee){
        if(currDay>=prices.length)
            return 0;
        
        String key=currDay+"-"+canBuy;
        
        if(map.containsKey(key))
            return map.get(key);
        int ans=0;
        if(canBuy==1){
            int idle = profit(prices,currDay+1,canBuy,map,fee);
            int buy=-prices[currDay]+profit(prices,currDay+1,0,map,fee);
            map.put(key,Math.max(idle,buy));
            return map.get(key);
        }
        else{
            int idle = profit(prices,currDay+1,canBuy,map,fee);
            int sell=-fee + prices[currDay]+profit(prices,currDay+1,1,map,fee);

            map.put(key,Math.max(idle,sell));
            return map.get(key);
        }
    }
}