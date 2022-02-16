import java.util.Stack;

public class ImplementQueueUsingStacks {

}
class MyQueue {

    private Stack<Integer> stack;
    private Stack<Integer> queue;

    public MyQueue() {
        stack = new Stack<>();
        queue = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        if(queue.empty()) {
            while (!stack.empty()) {
                queue.push(stack.pop());
            }
        }
        return queue.pop();
    }

    public int peek() {
        if(queue.empty()) {
            while (!stack.empty()) {
                queue.push(stack.pop());
            }
        }
        return queue.peek();
    }

    public boolean empty() {
        return stack.isEmpty() && queue.isEmpty();
    }
}
