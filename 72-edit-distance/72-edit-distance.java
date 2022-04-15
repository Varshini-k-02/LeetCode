class Solution {
    public int minDistance(String s1, String s2) {
        return find(s1,s2,0,0,s1.length(),s2.length(),new HashMap<String,Integer>());
    }
    public int find(String s1,String s2,int i,int j, int m,int n,HashMap<String,Integer> map){
        if(i>=m)
            return n-j;
        if(j>=n)
            return m-i;
        String key=i+"-"+j;
        if(map.containsKey(key)){
            return map.get(key);
        }
        int ans=5000;
        if(s1.charAt(i)==s2.charAt(j))
            ans=find(s1,s2,i+1,j+1,m,n,map);
        else{
            int ins = find(s1,s2,i,j+1,m,n,map);
            int del =find(s1,s2,i+1,j,m,n,map);
            int rep = find(s1,s2,i+1,j+1,m,n,map);
            ans=1+Math.min(ins,Math.min(del,rep));
        }   
        map.put(key,ans);
        return map.get(key);
        
    }
}