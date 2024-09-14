package algo.queue;

public class CustomQueue<T> {
    private int maxSize;
    private T[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public CustomQueue(int size) {
        this.maxSize = size;
        this.queueArray = (T[]) new Object[maxSize];
        this.front = 0; 
        this.rear = -1; // for circular queue
        this.nItems = 0; 
    }

    public void enqueue(T item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = item;
        nItems++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T item = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return item;
    }

    public T peekFront() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }   
    
    public boolean isFull() {
        return nItems == maxSize;
    }

    public int size() {
        return nItems;
    }

    public void printQueue() {
        System.out.println("Queue elements:");
        for (int i = 0; i < queueArray.length; i++) {
            System.out.println(queueArray[i]);
        }
    }
}
