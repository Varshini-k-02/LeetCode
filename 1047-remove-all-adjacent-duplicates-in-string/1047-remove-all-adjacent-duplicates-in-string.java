class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans=new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && stack.peek()==s.charAt(i)){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        for(char ch:stack){
            ans.append(ch);
        }
        return ans.toString();
    }
}