// { Driver Code Starts
//Initial Template for Java

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String X[] = br.readLine().trim().split(" ");
	            int k = Integer.parseInt(X[0]);
	            String s = br.readLine();
    	    	Node root = buildTree(s);
        	    Tree g = new Tree();
			    ArrayList<Integer> nodes = g.Kdistance(root,k);
			    for(int i = 0;i<nodes.size();i++){
			        System.out.print(nodes.get(i)+ " ");
			    }
			    System.out.println();
                t--;
            
        }
    }
  
}

// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree
{
     // Recursive function to print right view of a binary tree.
     ArrayList<Integer> Kdistance(Node root, int k)
     {
         ArrayList<Integer> ans=new ArrayList<>();
         int level=0;
         check(root,0,k,ans);
         return ans;
     }
     public void check(Node root,int level, int k, ArrayList<Integer> ans){
         if(level==k){
             ans.add(root.data);
         }
         if(root.left!=null){
             check(root.left,level+1,k,ans);
         }
         if(root.right!=null){
             check(root.right,level+1,k,ans);
         }
     }
}
