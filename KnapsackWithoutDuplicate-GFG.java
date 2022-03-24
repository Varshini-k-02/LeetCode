class Solution{
    static int knapSack(int N, int capacity, int val[], int wt[])
    {
        // code here
        return unboundKnap(capacity,wt,val,0,N,new HashMap<String,Integer>());
        
    }
    public static int unboundKnap(int capacity, int[] weight, int[] profit, int currIndex, int n, HashMap<String, Integer> map) {
       
          if(capacity == 0) 
           return 0;

          
        if (currIndex >= n) return 0;

        int currItemWeight = weight[currIndex];
        int currItemProfit = profit[currIndex];
        
        String key = currIndex + "-" + capacity;

        if (map.containsKey(key))
            return map.get(key);
        
        int pickItem = 0;
        
        
        if (currItemWeight <= capacity)
            pickItem = currItemProfit + unboundKnap(capacity - currItemWeight, weight, profit, currIndex, n, map);
        
        int nonPickItem = unboundKnap(capacity, weight, profit, currIndex + 1, n, map);
        
       
        map.put(key, Math.max(pickItem, nonPickItem));
        return map.get(key);

    }
}
