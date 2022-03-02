import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = in.nextInt();

        System.out.print("Enter b: ");
        int b = in.nextInt();

        System.out.println("Calculator\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");

        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\nAddition: " + (a + b));
                break;
            case 2:
                System.out.println("\nSubtraction: " + (a - b));
                break;
            case 3:
                System.out.println("\nMultiplication: " + (a * b));
                break;
            case 4:
                System.out.println("\nDivision: " + (a / b));
                break;
            default:
                System.out.print("Invalid Operation");
                break;
        }
    }
}
