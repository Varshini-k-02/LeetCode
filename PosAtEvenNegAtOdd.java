import java.util.*;
class Main {  
  public static void main(String args[]) { 
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    int arr[] = new int[size];
    for(int i=0;i<size;i++){
      arr[i]=scan.nextInt();
    }
    int p=0,n=1,temp;
    while(true){
      while(p<size && arr[p]>=0){
        p+=2;
      }
      while(n<size && arr[n]<=0){
        n+=2;
      }
      if(p<size && n<size){
        temp=arr[p];
        arr[p]=arr[n];
        arr[n]=temp;
      }
      else
        break;
    }
    for(int i=0;i<size;i++){
      System.out.print(arr[i]+" ");
    }
    }
  }
