import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.print(series(n));
    }

    private static int series(int n) {
        int sum = 0;

        for (int i = 1; i <= n; ++i) {
            int numerator = ((i + 1) * (i + 2)) / 2;
            int denominator = fact(i + 1);

            sum = sum + (numerator / denominator);
        }

        return sum;
    }

    private static int fact(int n) {
        if (n == 1) {
            return 1;
        }

        int fact = 1;
        for (int i = n; i > 0; i--) {
            fact = fact * i;
        }
        return fact;
    }
}
