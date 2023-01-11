//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.sequence(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long sequence(int N){
        // code here
        return find(N,1,1);
    }
    static long find(int n,int c,int x){
        if(n<=0)
            return 0;
        long p=1;
        for(int i=c;i<c+x;i++){
            p=p*i;
        }
        return p+find(n-1,c+x,x+1);
    }
}