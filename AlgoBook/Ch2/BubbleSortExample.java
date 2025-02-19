/*
 * Problem 2.2 
 * bubble sort 幾乎不會用到(僅練習 swap)，insertion sort 通常比較有效
 */

import java.util.Arrays;

public class BubbleSortExample {
    
    public static void main(String[] args) {
        runTestCase();
    }

    public static void runTestCase() {
        int[] array = {4, 12, 10, 8, 13, 7};
        System.out.println("Before: " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("After: " + Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        int n = array.length;

        for(int i = 0 ; i < n - 1; i++) {
            for(int j = n - 1 ; j > i ; j--) {
                if(array[j] < array[j-1]) {
                    swap(array, j, j-1);
                    System.out.println("swaped: " + Arrays.toString(array));
                }
            }
        }
    }

    private static void swap(int[] array, int i, int j) { 
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
