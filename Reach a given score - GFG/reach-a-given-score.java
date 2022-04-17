// { Driver Code Starts
// Driver Code
import static java.lang.System.out;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int T = in.nextInt(); T-->0;) {
            int n = in.nextInt();
            
            Geeks obj = new Geeks();
            out.println(obj.count(n));
        }
    }
}// } Driver Code Ends


// Complete this function!

class Geeks {
    public long count(int n) {
        int dp[]=new int[n+1];
        dp[0] = 1;
    	for (int i = 3; i <= n; i++)
    	    dp[i] += dp[i - 3];
    	for (int i = 5; i <= n; i++)
    	    dp[i] += dp[i - 5];
    	for (int i = 10; i <= n; i++)
    	    dp[i] += dp[i - 10];
        return dp[n];

    }
}