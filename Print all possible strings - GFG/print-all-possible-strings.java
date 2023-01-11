//{ Driver Code Starts
import java.util.*;


class Find_All_Possible_Strings
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t =  sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			GfG g = new GfG();
			ArrayList<String> arr = g.spaceString(str);
			for(String s : arr){
			    System.out.print(s+"$");
			}
            System.out.println();
			t--;
		}
	}
}
// } Driver Code Ends


/*You have to complete this function*/
class GfG
{
    ArrayList<String> spaceString(String str)
    {
        // Your code here
        ArrayList<String> ans = new ArrayList<>();
        find(ans,str,0,"");
        return ans;
    }
    static void find(ArrayList<String> ans, String s, int i, String temp){
        if(i==s.length()){
            ans.add(temp);
            return;
        }
        char ch = s.charAt(i);
        if(i==0)
            find(ans,s,i+1,temp+ch);
        else{
            find(ans,s,i+1,temp+ch);
            find(ans,s,i+1,temp+" "+ch);
        }
        
    }
}
