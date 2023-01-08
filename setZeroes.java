class Solution {
    public void setZeroes(int[][] matrix) {
        
        Set<Integer> setRow = new HashSet<>();
        Set<Integer> setCol = new HashSet<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    setRow.add(i);
                    setCol.add(j);
                }
            }
        }
        for(int row : setRow){
            for(int i = 0; i < matrix[0].length; i++){
                matrix[row][i] = 0;
            }
        }
        for(int col: setCol){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][col] = 0;
            }
        }
    }
}
