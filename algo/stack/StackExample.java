package algo.stack;

public class StackExample {
    private CustomStack<Integer> stack;

    public StackExample(int size) {
        stack = new CustomStack<>(size);
    }

    public void ShowStackExample() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Top element:" + stack.peek()); // 5
        System.out.println("Is stack full? " + stack.isFull()); // true
        stack.printStack();

        System.out.println("Popped element: " + stack.pop()); // 5
        System.out.println("Popped element: " + stack.pop()); // 4
        
        System.out.println("Top element:" + stack.peek()); // 3

        System.out.println("Stack size: " + stack.size()); // 3

        System.out.println("Is stack empty? " + stack.isEmpty()); // false

        stack.printStack();
    }
}
