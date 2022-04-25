class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            char y=t.charAt(i);
            if(map.containsKey(x)==false){
                if(map.containsValue(y)==true){
                    return false;
                }
                map.put(x,y);
            }
            else{
                if(map.get(x)!=y){
                    return false;
                }
            }
        }
        return true;
    }
}