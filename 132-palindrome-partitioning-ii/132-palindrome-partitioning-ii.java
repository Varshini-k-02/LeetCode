class Solution {
    public int minCut(String s) {
        return find(s, 0, s.length()-1, new HashMap<>());
    }
    public int find(String s,int st,int e,HashMap<Integer,Integer> map){
        if(isPalindrome(s,st,e))
            return 0;
        int key=st;
        if(map.containsKey(st))
            return map.get(key);
        int ways=100000;
        for(int i=st;i<e;i++){
            if(isPalindrome(s,st,i)){
                int temp=1+find(s,i+1,e,map);
                ways=Math.min(ways,temp);
            }
        }
        map.put(key,ways);
        return map.get(key);
    }
    public boolean isPalindrome(String s,int start, int e)
    {
        while(start<=e)
        {
            if(s.charAt(start)!= s.charAt(e)) return false;
            start++;
            e--;
        }
        
        return true;
}
}