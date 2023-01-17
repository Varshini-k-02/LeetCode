//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ans = new ArrayList<>();
        int r=0,c=0;
        if(m[m.length-1][m.length-1] == 0){
            ans.add(""+(-1));
            return ans;
        }
        find(ans,"",m,r,c);
        
        return ans;
    }
    static void find(ArrayList<String> ans, String p, int[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            ans.add(p);
            return;
        }
        if(maze[r][c]==0){
            return;
        }
        maze[r][c]=0;
        if(r<maze.length-1){
            find(ans,p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            find(ans,p+'R',maze,r,c+1);
        }
        if(r>0)
            find(ans,p+'U',maze,r-1,c);
        if(c>0)
            find(ans,p+'L',maze,r,c-1);
        maze[r][c]=1;
    }
}