/*
 * Tomsort : Merge Sort + Insertion Sort 
 * can be seen in python sort() or java Arrays.sort()
 */


import java.util.Arrays;

public class HybridMergeInsertionSort {
    private static final int SUBLIST_SIZE = 10; // K = O(log n) 
    // int K = (int) Math.max(16, Math.log(n) / Math.log(2)); // 保證 K 至少是 16

    public static void main(String[] args) {
        HybridMergeInsertionSort example = new HybridMergeInsertionSort();
        example.runTestCase();
    }
        
    private void runTestCase() {
        int[] array = {38, 27, 43, 3, 9, 82, 10, 15, 24, 5, 1, 77};
        System.out.println("Before sorting: " + Arrays.toString(array));
        hybrid(array, 0, array.length - 1); 
        System.out.println("After sorting: " + Arrays.toString(array));
    }

    private static void hybrid(int[] array, int left, int right) {  // static case 4.
        if(right - left + 1 <= SUBLIST_SIZE) { // 足夠小可以用 insertion sort 會更有效率
            insertionSort(array, left, right);
            return;
        }

        int mid = left + (right - left) / 2;
        hybrid(array, left, mid);
        hybrid(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    private static void insertionSort(int[] array, int left, int right) { // incremental approach
        for(int i = left + 1; i <= right; i++) { // need to have prev
            int key = array[i];
            int prevIndex = i - 1;
            while(prevIndex >= left && array[prevIndex] > key) { 
                array[prevIndex + 1] = array[prevIndex];
                prevIndex--; 
            }
            array[prevIndex + 1] = key;
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        System.arraycopy(array, left, leftArray, 0, n1); // 取代原先MergeSortExample寫 for 的地方 (line72)
        System.arraycopy(array, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = left;
        while(i < n1 && j < n2) {
            if(leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            }
            else{
                array[k++] = rightArray[j++];
            }
        }
        while (i < n1) array[k++] = leftArray[i++];
        while (j < n2) array[k++] = rightArray[j++];
    }
}
