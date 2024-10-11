package algo.sort;

public class CsSort {
    
    public void bubble(int [] array) {
        int size = array.length;
        for(int i = 0 ; i < size - 1 ; i++) {
            for(int j = 0; j < size - i - 1 ; j++) {
                if(array[j] > array[j+1]) 
                    swap(array, j, j + 1);
            }
        }
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
