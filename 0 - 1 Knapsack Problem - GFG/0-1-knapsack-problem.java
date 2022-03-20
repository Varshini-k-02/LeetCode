// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}



// } Driver Code Ends


class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int capacity, int wt[], int val[], int n) 
    { 
         // your code here 
         HashMap<String,Integer> map = new HashMap<String,Integer>();
         return maxProfit(wt,val,0,capacity,n,map);
    } 
    static int maxProfit(int wt[],int pro[], int currentItem,int capacity, int n, HashMap<String,Integer> map){
        if(currentItem==n){
            return 0;
        }
        int currentWt=wt[currentItem];
        int currentPro=pro[currentItem];
        String currentKey=Integer.toString(currentItem)+"-"+Integer.toString(capacity);
        if(map.containsKey(currentKey))
            return map.get(currentKey);
            
        int consider=0;
        if(currentWt<=capacity){
            consider = currentPro + maxProfit(wt,pro,currentItem+1,capacity-currentWt,n,map);
        }
        int notConsider = maxProfit(wt,pro,currentItem+1,capacity,n,map);
        map.put(currentKey,Math.max(consider,notConsider));
        return map.get(currentKey);
    }
}


