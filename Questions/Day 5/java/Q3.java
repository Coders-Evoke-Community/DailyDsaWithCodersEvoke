public class Q3 {
    public static void main(String[] args) {
        hollowDiamond();
    }

    private static void hollowDiamond() {
        for (int i = 1; i <= 5; ++i) {
            for (int j = 5; j > i; --j) {
                System.out.print(" ");
            }
            if (i != 1)
                System.out.print("*");
            for (int j = 1; j < (i - 1) * 2; ++j) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 5; i > 0; --i) {
            for (int j = 5; j > i; --j) {
                System.out.print(" ");
            }
            if (i != 1)
                System.out.print("*");
            for (int j = 1; j < (i - 1) * 2; ++j) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
