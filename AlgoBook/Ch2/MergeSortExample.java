/*
 * Merge Sort (p 31.)
 * 
 */
package AlgoBook.Ch2;

import java.util.Arrays;

public class MergeSortExample {
    public static void main(String[] args) {
        MergeSortExample example = new MergeSortExample();
        example.runTestCases();
    }

    public void runTestCases() {
        int[] array = {2, 4, 5, 7, 1, 2, 3, 6};
        System.out.println("Before merge: " + Arrays.toString(array));
        mergeSort(array, 0, array.length - 1);
        System.out.println("After Merge: " + Arrays.toString(array));
    }

    private void mergeSort( int[] array, int p, int r){
        if(p < r) {
            int q = (p + r) / 2; // middle
            mergeSort(array, p, q); // sort left
            mergeSort(array, q+1, r); // sort right
            merge(array, p, q, r);
        }
    }

    private void merge(int[] array, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];
        
        for(int i = 0 ; i < n1 ; i++) {
            L[i] = array[p + i];
        }
        for(int j = 0 ; j < n2 ; j++) {
            R[j] = array[q + j + 1];
        }
        
        L[n1] = Integer.MAX_VALUE; // Represent ∞
        R[n2] = Integer.MAX_VALUE;
        
        int i = 0, j = 0;
        for(int k = p ; k <= r ; k++) {
            if(L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            }
            else{
                array[k] = R[j];
                j++;
            }
        }
    }
}
