#Brute Force
import java.util.*;
class Main {  
  public static void main(String args[]) { 
    Scanner scan = new Scanner(System.in);
    int n=scan.nextInt();
    int times=scan.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=scan.nextInt();
    }
    while(times>0){
      
    int temp=arr[n-1];
    
    arr[n-1]=arr[0];
    
    int j;
    for(j=0;j<=n-2;j++){
      arr[j]=arr[j+1];
    }
    arr[n-2]=temp;
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
      System.out.println();
      times--;
    }
  } 
}
