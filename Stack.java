
public class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (!isFull()) {
            top++;
            stackArray[top] = value;
            System.out.println(value + " pushed into stack");
        } else {
            System.out.println("Stack is full");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int topVal = stackArray[top];
            top--;
            System.out.println(topVal + " popped from stack");
            return topVal;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        System.out.println("Top item is " + stack.peek());
        System.out.println("Is the stack empty? " + stack.isEmpty());
        stack.push(40);
        System.out.println("Is the stack full? " + stack.isFull());
    }
}

