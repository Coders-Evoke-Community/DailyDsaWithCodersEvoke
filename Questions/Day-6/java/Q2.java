
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.print(series(n, 2));
    }

    private static int series(int n, int x) {
        int sum = 0;

        for (int i = 1,j=1; i <= n; ++i, j= j+2) {
            int num = (int) Math.pow(x, i)/j;

            if (i % 2 == 0) {
                num = num * -1;
            }

            sum += num;
        }

        return sum;
    }
}
