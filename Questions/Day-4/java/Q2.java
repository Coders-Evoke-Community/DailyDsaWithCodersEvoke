import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        if (isPalindrome(n)) {
            System.out.print("Palindrome number");
        } else {
            System.out.print("Not Palindrome");
        }
    }

    private static boolean isPalindrome(int n) {
        int temp = n;
        int rem = 0, sum = 0;
        while (n > 0) {
            rem = n % 10;
            sum = (sum * 10) + rem;
            n = n / 10;
        }
        if (temp == sum)
            return true;
        return false;
    }
}
