//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long arr[], int N, int K)
    {
        int i=0,j=0;
        List<Long> l=new ArrayList<>();
        List<Long> ans = new ArrayList<>();
        while(j<arr.length){
            if(arr[j]<0)
                l.add(arr[j]);
            if(j-i+1<K)
                j++;
            else if(j-i+1==K){
                if(l.size()==0){
                    Long x=Long.valueOf(0);
                    ans.add(x);
                }
                
                    
                else{
                    ans.add(l.get(0));
                    if(arr[i]==l.get(0))
                        l.remove(0);
                }
                i++;
                j++;
            }
        }
        long[] res = new long[ans.size()];
        for(int k=0;k<ans.size();k++){
            res[k]=ans.get(k);
        }
        return res;
    }
}