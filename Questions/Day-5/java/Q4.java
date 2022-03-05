public class Q4 {
    public static void main(String[] args) {
        pascalTriangle();
    }

    private static void pascalTriangle() {
        int n = 4, i, j;

        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(" " + factorial(i) / (factorial(i - j) * factorial(j)));
            }
            System.out.println();
        }
    }

    private static int factorial(int n) {
        if (n == 0)
            return 1;

        int fact = 1;
        for (int i = n; i > 1; --i) {
            fact = fact * i;
        }
        return fact;
    }
}
