// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}// } Driver Code Ends


/*Complete the function below*/
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		if(!s.isEmpty()){
		    int temp=s.pop();
		    sort(s);
		    sortedStack(s,temp);
		    return s;
		}
		else{
		    return null;
		}
	}
	public void sortedStack(Stack<Integer> s,int temp){
	    if(s.isEmpty() || temp > s.peek()){
	        s.push(temp);
	        return;
	    }
	    int x=s.pop();
	    sortedStack(s,temp);
	    s.push(x);
	}
}