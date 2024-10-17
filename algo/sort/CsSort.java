package algo.sort;

public class CsSort {
    
    public void bubbleSort(int[] bubbleArray) {
        int size = bubbleArray.length;
        for(int i = 0 ; i < size - 1 ; i++) {
            for(int j = 0; j < size - i - 1 ; j++) {
                if(bubbleArray[j] > bubbleArray[j+1]) 
                    swap(bubbleArray, j, j + 1);
            }
        }
    }

    public void selectionSort(int[] selectionArray) {
        int size = selectionArray.length;
        for(int i = 0; i < size ; i++) {
            int min = i;
            for(int j = i + 1 ; j < size ; j++) {
                if(selectionArray[j] < selectionArray[min]) {
                    min = j;
                }
            }
            swap(selectionArray, i, min);
        }
    }

    public void insertionSort(int[] insertionArray) {
        int size = insertionArray.length;
        for(int i = 1; i < size ; i++) {
            int insertKey = insertionArray[i];
            int j = i - 1;

            while(j>=0 && insertionArray[j] > insertKey) {
                insertionArray[j + 1] = insertionArray[j];
                j--;
            }

            insertionArray[j + 1] = insertKey;
        }
    }

    public void mergeSort(int[] mergeArray) {
        int size = mergeArray.length;
        if(size < 2) return; // 1 or 2 means already sorted
        int mid = size / 2;
        int[] left = new int[mid]; // left size should be 0 - mid
        int[] right = new int[size - mid]; // right size should be size - mid

        // Divide the array into two halves
        //System.arraycopy(來源array, 來源起始索引, 目的array, 目的起始索引, 複製長度)
        System.arraycopy(mergeArray, 0, left, 0, mid);
        System.arraycopy(mergeArray, mid, right, 0, size - mid);

        // Recursively split and sort each half
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(mergeArray, left, right);

    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public void merge(int[] finalArray, int[] left, int[] right) {
        int tempLeft = 0, tempRight = 0, tempFinal = 0;

        // Merge elements from left and right arrays into the final array
        while(tempLeft < left.length && tempRight < right.length) {
            if(left[tempLeft] <= right[tempRight]) {
                finalArray[tempFinal++] = left[tempLeft++];
            }
            else { 
                finalArray[tempFinal++] = right[tempRight++];
            }
        }

        // Copy any remaining elements from the left and right array (if any)
        while (tempLeft < left.length) {
            finalArray[tempFinal++] = left[tempLeft++];
        }
        while (tempRight < right.length) {
            finalArray[tempFinal++] = right[tempRight++];
        }
    }
    
}
