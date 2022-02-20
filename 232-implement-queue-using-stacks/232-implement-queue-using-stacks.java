class MyQueue {
    static Stack<Integer> s1 = new Stack<Integer>();
    static Stack<Integer> q;
    public MyQueue() {
        q=new Stack<>();
    }
    
    public void push(int x) {
        while(!q.isEmpty()){
            s1.push(q.pop());
        }
        q.push(x);
        while(!s1.isEmpty()){
            q.push(s1.pop());
        }
    }
    
    public int pop() {
        while(!q.isEmpty()){
            int x=q.peek();
            q.pop();
            return x;
        }
        return -1;
    }
    
    public int peek() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.size()==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */