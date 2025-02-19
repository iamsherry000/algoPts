/*
 * problem 2.4 inversion pair : An array is a pair (i, j) such that i < j and A[i] > A[j]
 * bruce solution: O(n^2)
 * efficient: merge sort, O(n log n)
 * finished: 2025/02/19
 */
// package AlgoBook.Ch2;

public class InversionPairExample {
    
    public static void main(String[] args) {
        runTestCase();
    }
    
    public static void runTestCase() {
        int[] array = {2, 3, 8, 6, 1};
        System.out.println("Number of inversions: " + countInversions(array));
        }
    
        private static int countInversions(int[] array) {
            int[] temp = new int[array.length];
            return mergeSortAndCount(array, temp, 0, array.length - 1);
        }

        private static int mergeSortAndCount(int[] array, int[] temp, int left, int right) {
            if(left >= right) return 0;
            int mid = (left + right) / 2;
            int count = 0;

            count += mergeSortAndCount(array, temp, left, mid);
            count += mergeSortAndCount(array, temp, mid + 1, right);
            count += addCount(array, temp, left, mid, right);

            return count;
        }

        private static int addCount(int[] array, int[] temp, int left, int mid, int right) {
            int i = left, j = mid + 1, k = left, count = 0;
            // use merge2 (copied the remainder array back into the original) not sentinels 
            while(i <= mid && j <= right) {
                if(array[i] <= array[j]) {
                    temp[k++] = array[i++];
                }
                else{
                    temp[k++] = array[j++];
                    count += (mid - i + 1); // inversions count
                }
            }

            while(i <= mid) temp[k++] = array[i++];
            while(j <= right) temp[k++] = array[j++];

            System.arraycopy(temp, left, array, left, right - left + 1);
            return count;
        }

        
}
