public class Q1 {
    public static void main(String[] args) {
        for (int i = 1; i<=500; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isArmstrong(int n) {
        int temp = n;
        int rem = 0, sum = 0;

        while (n > 0) {
            rem = n % 10;
            sum += rem * rem * rem;
            n = n / 10;
        }

        if (sum == temp) {
            return true;
        }
        return false;
    }
}