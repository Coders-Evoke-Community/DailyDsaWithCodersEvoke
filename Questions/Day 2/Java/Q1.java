import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = in.nextInt();

        System.out.print("Enter b: ");
        int b = in.nextInt();

        System.out.print("Enter c: ");
        int c = in.nextInt();

        int max = Integer.MIN_VALUE;
        if (a >= max)
            max = a;
        if (b >= max)
            max = b;
        if (c >= max)
            max = c;

        System.out.print("\nMax Value: " + max);

        int min = Integer.MAX_VALUE;
        if (a <= min)
            min = a;
        if (b <= min)
            min = b;
        if (c <= min)
            min = c;

        System.out.print("\nMin Value: " + min);
    }
}