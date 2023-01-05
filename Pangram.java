import java.util.*;
class Main {  
  public static void main(String args[]) { 
    Scanner scan=new Scanner(System.in);
    String s = scan.nextLine();
    s=s.replaceAll("\\s","");
    s=s.toLowerCase();
    // System.out.println(s);
    boolean isPangram=false;
    HashMap<Character,Integer> map = new HashMap<>();
    for(int i=0;i<s.length();i++){
             map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
    }
    // 
    
    
    for (int count : map.values()) {
      if(count>=1 && map.size()==26){
         isPangram = true;
      }
      
    }
    
    System.out.println(isPangram); 
  } 
}
//put(t, getCount.getOrDefault(t, 0) + 1);
