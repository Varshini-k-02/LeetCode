// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().infixToPostfix(br.readLine().trim()));
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to convert an infix expression to a postfix expression.
	public static String infixToPostfix(String exp) 
	{
		// Your code here
		String res="";
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<exp.length();i++){
		    char c=exp.charAt(i);
		    if(Character.isLetterOrDigit(c)){
		        res+=c;
		    }
		    else if(c=='('){
		        stack.push(c);
		    }
		    else if(c==')'){
		        while(!stack.isEmpty() && stack.peek()!='('){
		            res+=stack.pop();
		        }
		        stack.pop();
		    }
		    else{
		        while(!stack.isEmpty() && pre(c)<=pre(stack.peek()) && c!='^'){
		            res+=stack.pop();
		        }
		        stack.push(c);
		    }
		    }
		    while(!stack.isEmpty()){
		        res+=stack.pop();
		    }
		    return res;
	}
	static int pre(char ch){
	    switch(ch){
            case '+':
	        case '-':
	            return 1;
	        case '*':
	        case '/':
	            return 2;
            case '^':
                return 3;
	    }
	    return -1;
	}
}