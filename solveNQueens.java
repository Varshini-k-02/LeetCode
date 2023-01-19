class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nQueens(board,0,n,ans);
        return ans;
    }
    public static void nQueens(char[][] board, int cr,int n,List<List<String>> ans){
        if(cr==n){
            ans.add(construct(board,n));
            return;
        }
        for(int cc=0;cc<n;cc++){
            if(isValid(board,cr,cc,n)){
                board[cr][cc]='Q';
                nQueens(board,cr+1,n,ans);
                board[cr][cc]='.';
            }
            
        }
        return;
    }
    public static List<String> construct(char[][] board,int n){
        List<String> curr = new ArrayList<>();
        for(int i=0;i<n;i++){
            String str="";
            for(int j=0;j<n;j++){
                str+=board[i][j];
            }
            curr.add(str);
        }
        return curr;
    }
    public static boolean isValid(char[][] board,int cr,int cc,int n){
        return isRow(board,cr,n) && isCol(board,cc,n) && isDiagonal(board,cr,cc,n);
    }
    public static boolean isRow(char[][] board,int cr,int n){
        for(int cc=0;cc<n;cc++){
            if(board[cr][cc]=='Q')
                return false;
        }
        return true;
    }
    public static boolean isCol(char[][] board,int cc,int n){
        for(int cr=0;cr<n;cr++){
            if(board[cr][cc]=='Q')
                return false;
        }
        return true;
    }
    public static boolean isDiagonal(char[][] board,int cr,int cc,int n){
        int x=cr;
        int y=cc;
        while(x>=0 && y>=0){
            if(board[x][y]=='Q')
                return false;
            x-=1;
            y-=1;
        }
        x=cr;
        y=cc;
        while(x>=0 && y<n){
            if(board[x][y]=='Q')
                return false;
            x-=1;
            y+=1;
        }
        return true;
    }
}
