class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<students.length;i++){
            queue.add(students[i]);
        }
        for(int i=sandwiches.length-1;i>=0;i--){
            stack.push(sandwiches[i]);
        }
        int n=students.length;
        while(!stack.isEmpty()){
            if(stack.peek()==queue.peek()){
                stack.pop();
                queue.remove();
            }
            else{
                if(!queue.contains(stack.peek())){ 
                    break; 
                }
                else{
                queue.add(queue.poll());
                }
            }
           
        }
        return queue.size();
    }
}