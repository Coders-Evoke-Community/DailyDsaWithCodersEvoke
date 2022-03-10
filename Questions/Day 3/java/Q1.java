import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // brute force
        for (int i = 2; i <= 100; ++i) {
            boolean isPrime = true;
            for (int j = 2; j < i; ++j) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }

        // Optimized Approach
        for (int i = 2; i <= 100; ++i) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); ++j) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}