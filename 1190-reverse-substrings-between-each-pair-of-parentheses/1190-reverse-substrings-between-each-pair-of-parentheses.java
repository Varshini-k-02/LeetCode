class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=')'){
                stack.push(ch);
            }
            else{
                List<Character> list=new ArrayList<>();
                while(!stack.isEmpty() && stack.peek()!='('){
                    list.add(stack.pop());
                }
                stack.pop();
                for(Character c: list){
                    stack.push(c);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            if(stack.peek()!='('){
                sb.insert(0,stack.pop());
            }
            else{
                stack.pop();
            }
        }
        return sb.toString();
    }
}