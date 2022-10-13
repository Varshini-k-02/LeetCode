import java.util.*;
class Main {  
  public static void main(String args[]) { 
    Scanner scan = new Scanner(System.in);
    int n=scan.nextInt();
    int x=scan.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=scan.nextInt();
    }
    boolean ans = part(arr,n,x);
    System.out.print(ans);
  }
  static boolean part(int arr[],int n,int x){
    int i;
    for(i=0;i<n-1;i++){
      if(arr[i]>arr[i+1]){
        break;
      }
    int left=(i+1)%n;
    int right=i;
    
    while(left!=right){
      if(arr[left]+arr[right]==x){
        return true;
      }
      else if(arr[left]+arr[right]<x){
        left=(left+1)%n;
      }
      else{
        right=(n+right-1)%n;
      }
  }
       
  }
    return false; 
  }
}
