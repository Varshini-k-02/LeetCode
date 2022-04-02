class Solution {
    public int maximalSquare(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int ans=0,side=0;
        HashMap<String,Integer> map = new HashMap<>();
        for(int currRow=0;currRow<m;currRow++){
            for(int currCol=0;currCol<n;currCol++){
                side = find(matrix,currRow,currCol,m,n,map);
                ans=Math.max(ans,side*side);
            }
        }
        return ans;
    }
    public int find(char[][] matrix,int currRow,int currCol,int m,int n,HashMap<String,Integer> map){
        if(currRow<0 ||currRow>=m|| currCol<0 || currCol>=n|| matrix[currRow][currCol]=='0')
            return 0;
        String key=currRow+"-"+currCol;
        if(map.containsKey(key))
            return map.get(key);
        int rgt= 1 + find(matrix,currRow,currCol+1, m, n, map);
        int below =  1 + find(matrix, currRow+1, currCol, m, n, map);
        int rightD = 1 + find(matrix, currRow+1, currCol+1, m, n, map);
        
        int  ans = Math.min(rgt, Math.min(below, rightD));
        
         map.put(key, ans);
        
        return map.get(key);
    }
}
