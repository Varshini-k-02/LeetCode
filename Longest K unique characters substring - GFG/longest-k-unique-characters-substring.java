//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        int size=s.length();
        int answer=-1,i=0,j=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(j<size){
            char ch=s.charAt(j);
            int chfreq=map.getOrDefault(ch,0);
            map.put(ch,chfreq+1);
            if(map.size()>k){
                while(map.size()>k){
                    char c=s.charAt(i);
                    int cfreq=map.get(c);
                    map.put(c,cfreq-1);
                    if(map.get(c)==0)
                        map.remove(c);
                    i++;
                }
            }
            if(map.size()==k){
                int currAns=j-i+1;
                answer=Math.max(answer,currAns);
            }
            j++;
        }
        return answer;
    }
}