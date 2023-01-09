import java.util.*;
class Main {  
  public static void main(String args[]) { 
    int arr[]={1,2,3,2,4};
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i:arr){
      map.put(i,map.getOrDefault((i),0)+1);
    }
    Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
    for(Map.Entry<Integer,Integer> x : entrySet){
      if(x.getValue()>1){
        System.out.println("Duplicate element is "+x.getKey()+"found "+x.getValue()+" times");
      }
    }
  } 
}
