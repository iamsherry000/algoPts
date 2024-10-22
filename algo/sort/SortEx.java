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
        sort.bubbleSort(bubbleArray);
        System.out.println("Bubble Sort: " + Arrays.toString(bubbleArray));

        // selection sort
        int[] selectionArray = originalArray.clone();
        sort.selectionSort(selectionArray);
        System.out.println("Selection Sort: " + Arrays.toString(selectionArray));

        // insertion sort 
        int[] insertionArray = originalArray.clone();
        sort.insertionSort(insertionArray);
        System.out.println("Insertion Sort: " + Arrays.toString(insertionArray));

        // merge sort
        int[] mergeArray = originalArray.clone();
        sort.mergeSort(mergeArray);
        System.out.println("Merge Sort: " + Arrays.toString(mergeArray));

        // quick sort
        int[] quickArray = originalArray.clone();
        sort.quickSort(quickArray);
        System.out.println("quick Sort: " + Arrays.toString(quickArray));
    }

}
