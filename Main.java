import algo.queue.QueueExample;
import algo.stack.StackExample;

public class Main {
    public static void main(String[] args) {
        // runStackExample();
        // runQueueExample();
        
    }

    public static void runStackExample() {
        // stack example
        StackExample stackExample = new StackExample(5);
        stackExample.ShowStackExample();
    }

    public static void runQueueExample() {
        // queue example
        QueueExample queueExample = new QueueExample(5);
        queueExample.ShowQueueExample();
    }
}