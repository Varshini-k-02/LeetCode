class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(stack.isEmpty() || arr[i]>0){
                stack.push(arr[i]);
            }
            else{
                while(true){
                    int peek=stack.peek();
                    if(peek<0){
                        stack.push(arr[i]);
                        break;
                    }
                    else if(peek == -arr[i]){
                        stack.pop();
                        break;
                    }
                    else if(peek > -arr[i]){
                        break;
                    }
                    else{
                        stack.pop();
                        if(stack.isEmpty()){
                            stack.push(arr[i]);
                            break;
                        }
                    }
                }
            }
        }
        int output[] = new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            output[i]=stack.pop();
        }
        return output;
    }
}