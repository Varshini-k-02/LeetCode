// { Driver Code Starts


import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.cutRod(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution{
    public int cutRod(int price[], int n) {
        //code here
        return maxProfit(price,0,n,new HashMap<String,Integer>());
    }
    public int maxProfit(int[] prices, int currItem, int l, HashMap<String,Integer> map){
        if(l==0)
            return 0;
        if(currItem==prices.length)
            return 0;
        
        String key = currItem+"-"+l;
        if(map.containsKey(key))
            return map.get(key);
        
        int consider=0;
        if(currItem+1 <= l)
            consider = prices[currItem] + maxProfit(prices,currItem,l-(currItem+1),map);
        
        int notConsider = maxProfit(prices,currItem+1,l,map);
        map.put(key,Math.max(consider,notConsider));
        return map.get(key);
    }
}