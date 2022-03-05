public class Q1 {
    public static void main(String[] args) {
        diamond();
    }

    private static void diamond() {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 4; i > 0; --i) {
            for (int j = i; j <= 4; ++j) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}