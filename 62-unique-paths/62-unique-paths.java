class Solution {
    public int uniquePaths(int m, int n) {
        return find(0,0,m,n,new HashMap<String,Integer>());
    }
    public int find(int currRow,int currCol,int m,int n, HashMap<String,Integer> map){
        if(currRow==m-1 && currCol==n-1){
            return 1;
        }
        if(currRow>m || currCol>n){
            return 0;
        }
        String key=currRow+"-"+currCol;
        if(map.containsKey(key))
            return map.get(key);
        int right=find(currRow,currCol+1,m,n,map);
        int left=find(currRow+1,currCol,m,n,map);
        map.put(key,right+left);
        return map.get(key);
    }
}