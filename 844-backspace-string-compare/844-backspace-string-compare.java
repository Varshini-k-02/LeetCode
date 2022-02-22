class Solution {
    public boolean backspaceCompare(String s, String t) {
        String ans1 = find(s);
        String ans2 = find(t);
        if(ans1.equals(ans2)){
            return true;
        }
        else{
            return false; 
        }
    }
    public static String find(String s){
        Stack<Character> s1 = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch != '#')
            {
                s1.push(ch);
            }
            else
            {
                if(s1.size() > 0)
                    s1.pop();
            }
        }
        String ans="";
        while(!s1.isEmpty()){
            ans+=s1.pop();
        }
        return ans;
    }
}