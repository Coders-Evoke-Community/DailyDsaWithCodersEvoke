public class Q2 {
    public static void main(String[] args) {
        sandglass();   
    }

    private static void sandglass() {
        for (int i=5; i>0; --i) {
            for (int j=i; j<5; ++j) {
                System.out.print(" ");
            }
            for(int j=i; j> 0; --j) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1; i<=5; ++i) {
            for (int j=i; j<5; ++j) {
                System.out.print(" ");
            }
            for(int j=i; j> 0; --j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
