import java.util.*;
class Main {  
  public static void main(String args[]) { 
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=scan.nextInt();
    }
    find(arr);
   
  } 
  static void find(int arr[]){
    int n=arr.length;
    List<Integer> list = new ArrayList<>();
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<n;i++){
      if (map.containsKey(arr[i])){
        int x=map.get(arr[i]);
        map.put(arr[i],x+1);
      }
      else{
        map.put(arr[i],1);
      }
    }
    for(Map.Entry<Integer,Integer> x : map.entrySet()){
      
      if(x.getValue()>1){
        list.add(x.getKey());
      }
    }
    System.out.println("Repeated elements are:");
    for(int j=0;j<list.size();j++){
      System.out.println(list.get(j));
    }
  }
}
