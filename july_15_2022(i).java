// Time Complexity ==> O(n)
class MyQueue {

    private Stack<Integer> pushStack;
    private Stack<Integer> popStack;
    
    public MyQueue() {
        this.pushStack = new Stack<>();
        this.popStack = new Stack<>();
        
    }
     
    public void push(int x) {
        pushStack.push(x);
    }
    
    public int pop() {
       if(!popStack.isEmpty()) {
           return popStack.pop();
       }
       while(!pushStack.isEmpty()) {
           popStack.push(pushStack.pop());
       }
        return popStack.pop();
    }
    
    public int peek() {
        if(!popStack.isEmpty()) {
           return popStack.peek();
       }
       while(!pushStack.isEmpty()) {
           popStack.push(pushStack.pop());
       }
        return popStack.peek();
    }
    
    public boolean empty() {
        return popStack.isEmpty() && pushStack.isEmpty();
    }
}
