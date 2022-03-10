import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        
        fibonnaciSeries(n);
    }

    private static void fibonnaciSeries(int n) {
        int a = 0, b = 1, c = 0;

        System.out.print(a + " " + b);
        while (n > 2) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
            n = n - 1;
        }
    }
}
