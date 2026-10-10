class MyQueue {
    Stack<Integer> SQ1=new Stack<>();
    Stack<Integer> s2=new Stack<>();

    public MyQueue() {

    }
    
    public void push(int x) {
        while(!SQ1.isEmpty()){
            s2.push(SQ1.pop());
        }

        SQ1.push(x);
        while(!s2.isEmpty()){
            SQ1.push(s2.pop());
        }
    }
    
    public int pop() {
        return SQ1.pop();
    }
    
    public int peek() {
        int n=SQ1.pop();
        SQ1.push(n);
        return n;
    }
    
    public boolean empty() {
        if(SQ1.isEmpty()){
            return true;
        }
        return false;
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