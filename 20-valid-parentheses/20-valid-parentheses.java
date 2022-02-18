class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int len=s.length();
        char ch[]=new char[len];
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else if(s.charAt(i)==')'){
                    if(stack.peek()=='('){
                        stack.pop();
                    }
                     else{
                        return false;
                    }
                 }
                else if(s.charAt(i)=='}'){
                    if(stack.peek()=='{'){
                        stack.pop();
                    }
                     else{
                        return false;
                    }
                 }
                else if(s.charAt(i)==']'){
                    if(stack.peek()=='['){
                        stack.pop();
                    }
                     else{
                        return false;
                    }
                 }
            }
        }
       return stack.isEmpty();
    }
}