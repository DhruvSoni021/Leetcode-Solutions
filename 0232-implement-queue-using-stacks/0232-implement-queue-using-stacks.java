class MyQueue {
    Stack<Integer> input;
    Stack<Integer> output;
    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }
    public void push(int x) {      //O(n)  push at bottom apporach
        while(input.size()>0)
        {
            output.push(input.pop());
        }
        input.push(x);
        while(output.size()>0)
        {
            input.push(output.pop());
        }
    }
    
    public int pop() {      //O(1)
        return input.pop();
    }
    
    public int peek() {             //O(1)
       return input.peek();
    }



    // public void push(int x) {
    //     input.push(x);           // O(1)
    // }
    
    // public int pop() {
    //     peek();                  //O(n)
    //     return output.pop();
    // }
    
    // public int peek() {             // O(n)
    //    if(output.isEmpty())
    //    {
    //         while(!input.isEmpty())
    //         {
    //             output.push(input.pop());
    //         }
    //    }
    //    return output.peek();
    // }
    
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
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