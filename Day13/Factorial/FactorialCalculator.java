package Day13.Factorial;

public class FactorialCalculator {
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long fact = 1;  // Use long for larger results
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
