class Solution {
    public void solveSudoku(char[][] board) {
        sudokuSolver(board,0,0,board.length);
        return;
    }
    public static boolean sudokuSolver(char[][] board,int currRow,int currCol,int n){
        if(currRow==n)
            return true;
        int nextRow=-1;
        int nextCol=-1;
        if(currCol!=n-1){
            nextRow=currRow;
            nextCol=currCol+1;
        }
        else{
            nextRow=currRow+1;
            nextCol=0;
        }
        if(board[currRow][currCol]!='.'){
            return sudokuSolver(board,nextRow,nextCol,n);
        }
        for(char currVal = '1';currVal<='9';currVal++){
            if(isValid(board,currRow,currCol,currVal,n)){
                board[currRow][currCol]=currVal;
                if(sudokuSolver(board,nextRow,nextCol,n))
                    return true;
                board[currRow][currCol]='.';
            }
        }
        return false;

    }
    private static boolean isValid(char[][] board,int currRow,int currCol,char currVal,int n){
        return (isRow(board,currRow,n,currVal) && isCol(board,currCol,currVal,n) && isSubGrid(board,currRow,currCol,currVal,n));
    }

    private static boolean isRow(char[][] board,int currRow,int n,char currVal){
        for(int c=0;c<n;c++){
            if(board[currRow][c]==currVal)
                return false;
        }
        return true;
    }
    private static boolean isCol(char[][] board,int currCol,char currVal,int n){
        for(int c=0;c<n;c++){
            if(board[c][currCol]==currVal)
                return false;
        }
        return true;
    }
    private static boolean isSubGrid(char[][] board,int currRow,int currCol,char currVal,int n){
        int r=3*(currRow/3);
        int c=3*(currCol/3);
        for(int i=r;i<=r+2;i++){
            for(int j=c;j<=c+2;j++){
                if(board[i][j]==currVal)
                    return false;
            }
        }
        return true;
    }
}
