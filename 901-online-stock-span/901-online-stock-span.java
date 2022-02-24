class StockSpanner {
    List<Integer> stocks = null;
    Stack<Integer> stack = null;
    int index = -1;

    public StockSpanner() {        
        stocks = new ArrayList<>();
        stack = new Stack<>();        
    }
    
    public int next(int price) {
        
        int result = 1;
        stocks.add(price);
        index++;
        
        while((stack.size() > 0) && (stocks.get(stack.peek()) <= price)){
            stack.pop();
        }
        
        if(stack.size() == 0){
            result = index + 1;
        }
        else{                
            result = index - stack.peek();
        }
        stack.push(index);
        
        return result;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */