/*
 * Problem 2.3 Horner's rule
 * Horner's rule (O(n)) is more effective than naive polynomial evalution (O(n^2))
 */
public class HornerRuleExample {
    
    public static void main(String[] args) {
        runTestCase();
    }

    public static void runTestCase() {
        // Example coefficients: P(x) = 3x^3 + 2x^2 + x + 5
        int[] coefficients = {5, 1, 2, 3}; // a0 = 5, a1 = 1, a2 = 2, a3 = 3
        int x = 2; // Evaluate P(2)


        System.out.println("Using Horner's Rule:");
        int hornerResult = horner(coefficients, x);
        System.out.println("P(2) = " + hornerResult);

        System.out.println("\nUsing Naive Polynomial Evaluation:");
        int naiveResult = naivePolynomialEvaluation(coefficients, x);
        System.out.println("P(2) = " + naiveResult);
    }

    private static int horner(int[] coefficients, int x) {
        int result = 0 ;
        for(int i = coefficients.length - 1; i >= 0; i--) {
            result = coefficients[i] + x * result;
        }
        return result;
    }

    private static int naivePolynomialEvaluation(int[] coefficients, int x) {
        int result = 0;
        for (int i = 0; i < coefficients.length; i++) {
            int term = coefficients[i];
            for (int j = 0; j < i; j++) {
                term *= x;
            }
            result += term;
        }
        return result;
    }
}
