
class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
         int start = 0;
        int last = 0;
        boolean flag=false;
        int currsum=0;
        ArrayList<Integer> res = new ArrayList<Integer>();
     
        for(int i=0;i<n;i++)
        {
            currsum+= arr[i];
            if(currsum>=s)
            {
                last=i;
                
                while(s<currsum && start<last)
                {
                    currsum-= arr[start];
                    ++start;
                }
               
                if(currsum==s)
                {
                    res.add(start + 1);
                    res.add(last + 1);
                  
                    flag = true;
                    break;
                }
            }
        }
        
        if (flag==false) {
            res.add(-1);
        } 
        //returning the result.
        return res;
}
}
