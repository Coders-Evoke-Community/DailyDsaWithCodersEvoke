import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.print(series(n, 2));
    }

    private static int series(int n, int x) {
        int sum = 0;

        for (int i = 1; i <= n; ++i) {
            int numerator = (i - 1) * x + i;
            int denominator = fact(i);

            sum = sum + (numerator / denominator);
        }

        return sum;
    }

    private static int fact(int n) {
        int fact = 1;
        for (int i = n; i > 0; i--) {
            fact = fact * i;
        }
        return fact;
    }
}
