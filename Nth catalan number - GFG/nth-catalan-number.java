// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.math.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total count of testcases
		int t=sc.nextInt();
		while(t-->0){
		    
		    //taking number of elements
		    int n=sc.nextInt();
		   
		    //calling findCatalan() method
		    System.out.println(new Solution().findCatalan(n));
		}
	}
}// } Driver Code Ends



class Solution
{
    //Function to find the nth catalan number.
    public static BigInteger findCatalan(int n)
    {
        //Your code here
        return nthCatalan(n, new HashMap<>());
        
    }
    public static BigInteger nthCatalan(int n, HashMap<Integer,BigInteger> map){
        if(n==0 || n==1)
            return BigInteger.valueOf(1);
            
        if(map.containsKey(n)) 
            return map.get(n);
        
        BigInteger ways = BigInteger.valueOf(0);
        
        for(int i = 0;i<n;i++)
        {
        BigInteger a =  nthCatalan(i,map) ;
        BigInteger b = nthCatalan(n-i-1, map);
        BigInteger c = a.multiply(b);
         ways = ways.add(c);
        }
        
        map.put(n, ways);
    return map.get(n);
    }
}