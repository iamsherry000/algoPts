package algo.linkedList;

public class CsLinkedList<T> {
    private Node<T> head;
    private Node<T> tail; // record tail for get_last from O(n)-> O(1)
    private int size;

    // Node class for linked list
    private static class Node<T> {
        T item;
        Node<T> next;

        Node(T item) {
            this.item = item;
            this.next = null;
        }
    }

    public CsLinkedList() { // build
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // len(): Return the number of elements (size) of the list
    public int len() { 
        return size;
    }

    // iter_seq(): Output items in sequence order
    public void iter_seq() {
        Node<T> current = head;
        while(current != null) {
            System.out.print(current.item + " ");
            current = current.next;
        }
        System.out.println();
    }

    // get_at(i): Return the item at index i
    public T get_at(int i) {
        if( i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds.");
        }
        Node<T> current = head;
        for (int index = 0; index < i; index++) {
            current = current.next;
        }
        return current.item;
    }

    // set_at(i, x): Set the item at index i to x
    public void set_at(int i, T x) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds.");
        }
        Node<T> current = head;
        for (int index = 0; index < i; index++) {
            current = current.next;
        }
        current.item = x;
    }

    // get_first(): Return the first item
    public T get_first() {
        if (head == null) {
            throw new IllegalStateException("List is empty.");
        }
        return head.item;
    }

    // get_last(): Return the last item
    public T get_last() {
        if (tail == null) {
            throw new IllegalStateException("List is empty.");
        }
        return tail.item;
    }

    // set_first(x): Set the first item to x
    public void set_first(T x) {
        if (head == null) {
            throw new IllegalStateException("List is empty.");
        }
        head.item = x;
    }

    // set_last(x): Set the last item to x
    public void set_last(T x) {
        if (tail == null) {
            throw new IllegalStateException("List is empty.");
        }
        tail.item = x;
    }

    // insert_first(x): Insert an item at the beginning
    public void insert_first(T x) {
        Node<T> newNode = new Node<>(x);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // insert_last(x): Insert an item at the end
    public void insert_last(T x) {
        Node<T> newNode = new Node<>(x);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    
    // delete_first(): Remove the first item
    public T delete_first() {
        if (head == null) {
            throw new IllegalStateException("List is empty.");
        }
        T data = head.item;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return data;
    }

    // delete_last(): Remove the last item
    public T delete_last() {
        if (head == null) { // no item
            throw new IllegalStateException("List is empty.");
        }
        if (head == tail) { // one item
            T data = head.item;
            head = tail = null;
            size--;
            return data;
        } else { // more than one item
            Node<T> current = head;
            while (current.next != tail) {
                current = current.next;
            }
            T item = tail.item;
            tail = current;
            tail.next = null;
            size--;
            return item;
        }
    }

    // insert(i, x): Insert an item at index i
    public void insert(int i, T x) {
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds.");
        }

        if (i == 0) {
            insert_first(x);
        } else if (i == size) {
            insert_last(x);
        } else {
            Node<T> newNode = new Node<>(x);
            Node<T> current = head;
            for(int index = 0 ; index < i-1; index++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    // delete_at(i): Remove the item at index i
    public T delete_at(int i) {
        if(i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds.");
        }

        if(i == 0) {
            return delete_first();
        }
        else if (i == size-1) {
            return delete_last();
        }
        else{
            Node<T> current = head;
            for(int index = 0 ; index < i-1; index++) {
                current = current.next;
            }
            T item = current.next.item;
            current.next = current.next.next;
            size--;
            return item;
        }
    }
}


