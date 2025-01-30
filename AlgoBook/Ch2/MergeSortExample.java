/*
 * Merge Sort (p 31.)
 * merge1() : use Integer.MAX_VALUE to Represent ∞ sentinels
 * merge2() : exercises 2.3-2, does not use sentinels, 
                copying the remainder of the other array when L or R had all its elements 
                copied back to A already.
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
        //int[] array = {5, 2, 4, 7, 1, 3, 2, 6};
        int[] array = {3, 41, 52, 26, 38, 57, 9, 49};
        System.out.println("Before merge: " + Arrays.toString(array));
        mergeSort(array, 0, array.length - 1);
        System.out.println("After Merge: " + Arrays.toString(array));
    }

    private void mergeSort( int[] array, int p, int r){
        if(p < r) {
            int q = (p + r) / 2; // middle
            mergeSort(array, p, q); // sort left
            mergeSort(array, q+1, r); // sort right
            //merge1(array, p, q, r); // sentinels 
            merge2(array, p, q, r); // copied the remainder array back into original
        }
    }

    private void merge1(int[] array, int p, int q, int r) {
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
        
        L[n1] = Integer.MAX_VALUE; // Represent ∞ sentinels
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

    private void merge2(int[] array, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q; // r - (q + 1) + 1
        int[] L = new int[n1];
        int[] R = new int[n2]; // no need to +1

        for(int i = 0 ; i < n1 ; i++) {
            L[i] = array[p + i];
        } 
        for(int j = 0 ; j < n2 ; j++) {
            R[j] = array[q + 1 + j];
        }

        int i = 0, j = 0, k = p;
        while(i < n1 && j < n2) {
            if(L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            }
            else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        // while(i < n1) {
        //     array[k] = L[i];
        //     i++;
        //     k++;
        // }

        // while(j < n2) {
        //     array[k] = R[j];
        //     j++;
        //     k++;
        // }
        
        while(i < n1) array[k++] = L[i++];
        while(j < n2) array[k++] = R[j++];

    }
}
