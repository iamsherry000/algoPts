import algo.binaryTree.BTExample;
import algo.linkedList.LinkedListEx;
import algo.queue.QueueExample;
import algo.stack.StackExample;
import algo.array.StaticArrayEx;
import algo.sort.SortEx;

public class Main {
    public static void main(String[] args) {
        // runStackExample();
        // runQueueExample();
        // runBTExample(); // unfinished
        // runStaticArrayExample();
        // runLinkedListExample();
        runSortsExample();
    }

    public static void runStackExample() { // finished
        // stack example
        StackExample stackExample = new StackExample(5);
        stackExample.ShowStackExample();
    }

    public static void runQueueExample() { // finished
        // queue example
        QueueExample queueExample = new QueueExample(5);
        queueExample.ShowQueueExample();
    }

    public static void runBTExample() { // unfinished
        // Binary Tree example
        BTExample btExample = new BTExample();
        btExample.ShowBTExample_Array();
    }

    public static void runStaticArrayExample() {
        StaticArrayEx staticArray = new StaticArrayEx();
        staticArray.ShowStaticArrayExample();
    }

    public static void runLinkedListExample() {
        LinkedListEx listExample = new LinkedListEx();
        listExample.ShowLinkedListExample();
    }

    public static void runSortsExample() {
        SortEx sortExample = new SortEx();
        sortExample.ShowSortExample();
    }
}