package algo.array;

public class CsStaticArray<T> {
    private T[] array;
    private int n; // number of elements in the array

    @SuppressWarnings("unchecked")
    public CsStaticArray(int item) {
        // 可以選擇不立即初始化，build 再初始化
        this.array = (T[])new Object[item]; // Creating an array of generic type
        this.n = item;
    }

    // build(x): Create a new data structure for items in x
    // @SuppressWarnings("unchecked")
    // public void build(int capacity) {
    //     this.array = (T[]) new Object[capacity];
    // }

    // len(): Return the number of elements (size) of the array
    public int len() {
        return n;
    }

    // iter_seq(): Output items in sequence order
    public void iter_seq() {
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // get_at(i): Return the item at index i
    public T get_at(int i) {
        if (i < 0 || i >= n) {
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds.");
        }
        return array[i];
    }

    // set_at(i, x): Set the item at index i to x
    public void set_at(int i, T x) {
        if (i < 0 || i >= n) {
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds.");
        }
        array[i] = x;
    }

    // get_first(): Return the first item
    public T get_first() {
        return get_at(0);  // Reuse get_at to get the first element
    }

    // get_last(): Return the last item
    public T get_last() {
        return get_at(n - 1);  // Reuse get_at to get the last element
    }

    // set_first(x): Set the first item to x
    public void set_first(T x) {
        set_at(0, x);  // Reuse set_at to set the first element
    }

    // set_last(x): Set the last item to x
    public void set_last(T x) {
        set_at(n - 1, x);  // Reuse set_at to set the last element
    }

}
