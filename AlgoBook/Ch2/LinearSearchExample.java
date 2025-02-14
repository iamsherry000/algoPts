/*
 * p 22. 2.1-3 exercises.
 */


public class LinearSearchExample {
    public static void main(String[] args) {
        LinearSearchExample example = new LinearSearchExample();
        example.runTestCases();
    }

    public void runTestCases() {
        int[] A = {5, 2, 4, 6, 1, 3};
        int v = 4;
        int result = linearSearch(A, v);
        System.out.println("Search: " + v + " index: " + (result != -1 ? result : "NIL"));
    }

    private static int linearSearch(int[] array, int v) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == v) {
                return i; // 找到則返回索引
            }
        }
        return -1; // 未找到返回 -1 作為 NIL
    }
}
