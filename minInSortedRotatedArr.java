import java.util.*;
class Main {  
  public static void main(String args[]) { 
    Scanner scan = new Scanner(System.in);
    int n=scan.nextInt();
    
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=scan.nextInt();
    }
    int i;
    int pos=-1;
    for(i=0;i<n-1;i++){
      if(arr[i]>arr[i+1]){
        pos=i+1;
      }
      if(pos==-1){
        pos=0;
      }
  }
    System.out.print(pos);
  }
  }
