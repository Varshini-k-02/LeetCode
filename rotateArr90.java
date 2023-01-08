class Solution {
    public void rotate(int[][] matrix) {
        List<List<Integer>> list = new ArrayList<>();
        int row=matrix[0].length;
        int inc=0;
        for(int i=0;i<row;i++){
            List<Integer> sub = new ArrayList<>();
            for(int j=row-1;j>=0;j--){
                sub.add(matrix[j][i]);
            }
            list.add(sub);   
       }
       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length; j++){
               matrix[i][j]=list.get(i).get(j);
           }
       }
    }
}
