class CustomStack {
    public int[] data;
    public int max;
    public static final int size=1000;
    int top=-1;
    public CustomStack(int maxSize) {
        this.max=maxSize;
        this.data=new int[maxSize];
    }
    
    public void push(int x) {
        if(top==data.length-1){
            return ;
        }
        top++;
        data[top]=x;
    }
    
    public int pop() {
        if(top==-1){
            return -1;
        }
        return data[top--];
    }
    
    public void increment(int k, int val) {
            if(k>max){
                k=max;
            }
        for(int i=0;i<k;i++){
            data[i]=val+data[i];
            
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */