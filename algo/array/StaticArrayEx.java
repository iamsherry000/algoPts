package algo.array;

public class StaticArrayEx {
    CsStaticArray<Integer> staticArray;
    
    public StaticArrayEx() {
        staticArray = new CsStaticArray<>(5);
    }

    public void ShowStaticArrayExample() {
        staticArray.set_at(0, 10);
        staticArray.set_at(1, 20);
        staticArray.set_at(2, 30);
        staticArray.set_at(3, 40);
        staticArray.set_at(4, 50);

        System.out.println("Array length: " + staticArray.len());
        
        System.out.print("Array contents: ");
        staticArray.iter_seq();

        System.out.println("First element: " + staticArray.get_first());
        System.out.println("Last element: " + staticArray.get_last());

        staticArray.set_first(100);
        staticArray.set_last(500);

        System.out.print("Array after modifications: ");
        staticArray.iter_seq();
    }
}
