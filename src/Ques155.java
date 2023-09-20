import java.util.Stack;

class Ques155 {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    int minElement = Integer.MAX_VALUE;

    public Ques155() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.add(val);
        val = Math.min(val, minStack.isEmpty()? val : minStack.peek());
        minStack.push(val);

    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}