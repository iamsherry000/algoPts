package algo.stack;

public class CustomStack<T> {
    private int maxSize;
    private T[] stackArray;
    private int top;

    public CustomStack(int size) {
        this.maxSize = size;
        this.stackArray = (T[]) new Object[maxSize];
        this.top = -1; // no items in the stack
    }
    
    // add an item to the top of the stack
    public void push(T item) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        stackArray[++top] = item;
    }
    
    // remove the top element of the stack
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop elements.");
        }
        return stackArray[top--];
    }

    // return the top element of the stack, but do not remove it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek elements.");
        }
        return stackArray[top];
    }
    
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stackArray[i]);
        }
    }

    // 缺少動態堆疊
}