class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        return find(n,k,target,new HashMap<>());
    }
    public int find(int n,int k,int target, HashMap<String,Integer> map){
        if(n==0 && target==0)
            return 1;
        if(n==0 || target<=0)
            return 0;
        String key=n+"-"+target;
        if(map.containsKey(key))
            return map.get(key);
        int ways=0;
        int MOD=1000000007;
        for(int i = 1;i<=k;i++)
        {
            int totalWays = find(n-1 , k, target-i, map) % MOD ;
            ways = ways%MOD;
            ways = (totalWays + ways) % MOD;            
        }
        
        map.put(key, ways);
        
        return map.get(key);
    }
}