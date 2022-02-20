class MyStack {
    static Queue<Integer> q1=new LinkedList<>();
    static Queue<Integer> q2;
    int curr_size=0;
    public MyStack() {
        q2=new LinkedList<>();
    }
    
    public void push(int x) {
        q2.add(x);
        curr_size++;
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
        
    }
    
    public int pop() {
        while(!q1.isEmpty()){
            int x=q1.peek();
            q1.remove();
            curr_size--;
            return x;
            
        }
        return -1;
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return curr_size==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */