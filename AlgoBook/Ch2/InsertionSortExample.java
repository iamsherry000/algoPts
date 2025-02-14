/*
 * Insertion Sort (p 18.)
 * An efficient algorithm for sorting a small number of element, 
 * for example: playing cards, empty left hand and remove one card at a time from the table 
 * and insert it into the correct position in the left hand.
 */



import java.util.Arrays;

public class InsertionSortExample {
    public static void main(String[] args) {
        InsertionSortExample example = new InsertionSortExample();
        example.runTestCases();
    }

    public void runTestCases() {
        int[] A = {5, 2, 4, 6, 1, 3};
        System.out.println("排序前: " + Arrays.toString(A));
        insertionSort(A, true);
        System.out.println("小到大排序: " + Arrays.toString(A));
        insertionSort(A, false);
        System.out.println("大到小排序: " + Arrays.toString(A));
    }

    private void insertionSort(int[] array, boolean ascending) {
        for(int j = 0 ; j < array.length; j++) {
            int key = array[j]; 
            int i = j - 1;

            // ascending true : 小到大排, array[i] > key, 大的向右移動
            while(i >= 0 && (ascending ? array[i] > key : array[i] < key)) { 
                array[i+1] = array[i];
                i = i - 1;
            }
            array[i + 1] = key; 
        }
    }
}