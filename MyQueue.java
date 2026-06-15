class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> str = new Stack<>();

    public MyQueue() {
        st = new Stack<>();
        str = new Stack<>();
        
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        if (str.isEmpty()) {
            while (!st.isEmpty()) {
                str.push(st.pop());
            }
        }
        return str.pop();
    }
    
    public int peek() {
         if (str.isEmpty()) {
            while (!st.isEmpty()) {
                str.push(st.pop());
            }
        }
        return str.peek();
    }
    
    public boolean empty() {
        return st.isEmpty() && str.isEmpty();
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