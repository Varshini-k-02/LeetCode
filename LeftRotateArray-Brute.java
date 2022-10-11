import java.util.*;
class Main {  
  public static void main(String args[]) { 
    Scanner scan = new Scanner(System.in);
    int n=scan.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=scan.nextInt();
    }
    int d=2;
    d=d%n;
    int a;
    int newArr[]=new int[n];
    for(int i=0;i<n;i++){
      a=(i+n-d)%n;
      newArr[a]=arr[i];
    }
    for(int i=0;i<n;i++){
      System.out.print(newArr[i]+" ");
    }
  } 
}
