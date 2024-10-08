package algo.linkedList;

public class LinkedListEx {
    CsLinkedList<Integer> linkedList;

    public LinkedListEx() {
        linkedList = new CsLinkedList<>();
    }

    public void ShowLinkedListExample() {
        linkedList.insert_first(10);
        linkedList.insert_last(20);
        linkedList.insert_last(30);
        linkedList.insert(1, 15);  // 在索引 1 插入 15

        System.out.println("List length: " + linkedList.len());
        
        System.out.print("List contents: ");
        linkedList.iter_seq();

        System.out.println("First element: " + linkedList.get_first());
        System.out.println("Last element: " + linkedList.get_last());

        linkedList.set_first(100);
        linkedList.set_last(500);

        System.out.print("List after modifications: ");
        linkedList.iter_seq();

        linkedList.delete_first();
        System.out.println("Delete first.");
        linkedList.delete_last();
        System.out.println("Delete last.");

        System.out.print("List after deletions: ");
        linkedList.iter_seq();
    }
}
