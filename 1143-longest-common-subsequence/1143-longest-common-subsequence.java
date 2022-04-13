class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        return find(s1,s2,0,0,s1.length(),s2.length(),new HashMap<String,Integer>());
    }
    public int find(String s1, String s2, int i,int j, int m,int n, HashMap<String,Integer> map){
        if(i>=m || j>=n){
            return 0;
        }
        int ans=0;
        String key=i+"-"+j;
         if(map.containsKey(key))
            return map.get(key);
        if(s1.charAt(i)==s2.charAt(j))
            ans=1+find(s1,s2,i+1,j+1,m,n,map);
        else{
            int a=find(s1,s2,i,j+1,m,n,map);
            int b=find(s1,s2,i+1,j,m,n,map);
            ans=Math.max(a,b);
        }
       
        map.put(key,ans);
        return map.get(key);
    }
}