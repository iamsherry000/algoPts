package algo.sort;

import java.util.Arrays;

public class SortEx {
    int[] originalArray = {3,5,9,2,4};
    CsSort sort;

    public SortEx() {
        sort = new CsSort();
    }

    public void ShowSortExample() {
        // print the original
        System.out.println("Original Array: " + Arrays.toString(originalArray));

        // bubble sort
        int[] bubbleArray = originalArray.clone();
        sort.bubble(bubbleArray);
        System.out.println("Bubble Sort: " + Arrays.toString(bubbleArray));
    }

}
