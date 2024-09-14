package algo.queue;

public class QueueExample {
    private CustomQueue<Integer> custom_queue;

    public QueueExample(int size) {
        custom_queue = new CustomQueue<>(size);
    }

    public void ShowQueueExample() {
        custom_queue.enqueue(1);
        custom_queue.enqueue(2);
        custom_queue.enqueue(3);
        custom_queue.enqueue(4);
        custom_queue.enqueue(5);

        custom_queue.printQueue();
        System.out.println("Front element: " + custom_queue.peekFront());
        System.out.println("Is queue full? " + custom_queue.isFull()); 
               
        System.out.println("Remove element: " + custom_queue.dequeue());
        System.out.println("Remove element: " + custom_queue.dequeue());

        System.out.println("Front element: " + custom_queue.peekFront());
        custom_queue.printQueue();
    }
}
