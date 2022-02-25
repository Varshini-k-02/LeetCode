class Solution {
    public int longestValidParentheses(String s) {
        int ans=0;
        Stack<Integer> stack = new Stack<>();
         stack.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }
            else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
                
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    ans=Math.max(ans,i-stack.peek());
                }
            }
        }
        return ans;
    }
}