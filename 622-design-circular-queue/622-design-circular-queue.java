class MyCircularQueue {
    public int[] data;
    
    public int end=0,front=0,size=0;
    public MyCircularQueue(int k) {
        
        this.data=new int[k];
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        data[end++]=value;
        end=end%data.length;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        int removed=data[front++];
        front=front%data.length;
        size--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return data[front];
    }
    
    public int Rear() {
        
        if(isEmpty()){
             return -1;
        }
        else if(end==0){
            return data[data.length-1];
        }
        return data[end-1];
    }
    
    public boolean isEmpty() {
        if(size==0){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        return size==data.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */