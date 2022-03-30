class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return find(0,0,obstacleGrid.length,obstacleGrid[0].length,obstacleGrid,new HashMap<String,Integer>());
    }
    public int find(int currRow,int currCol,int m,int n,int[][] grid ,HashMap<String,Integer> map){
        if(currRow>=m || currCol>=n || grid[currRow][currCol]==1){
            return 0;
        }
        if(currRow==m-1 && currCol==n-1 ){
            return 1;
        }
        String key=currRow+"-"+currCol;
        if(map.containsKey(key))
            return map.get(key);
        int right=find(currRow,currCol+1,m,n,grid,map);
        int left=find(currRow+1,currCol,m,n,grid,map);
        map.put(key,right+left);
        return map.get(key);
    }
}