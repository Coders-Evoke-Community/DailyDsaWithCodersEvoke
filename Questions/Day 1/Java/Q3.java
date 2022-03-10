import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        int a = in.nextInt();

        System.out.print("Enter b: ");
        int b = in.nextInt();

        System.out.println("\nAddition of a and b is "+ (a+b));
        System.out.println("\nSubtraction of a and b is "+ (a-b));
        System.out.println("\nDivision of a and b is "+ (a/b));
        System.out.println("\nMultiplication of a and b is "+ (a*b));
    }
}
