import java.util.Scanner;
import java.util.Set;

public class Q1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // double d = in.nextDouble();
        // float f = in.nextFloat();
        // int i = in.nextInt();

        /*
            Here we didnt use functions like nextDouble(), nextInt() etc. because of nextLine() function in the next line. 

            Refer this article for the better understanding -> https://www.geeksforgeeks.org/why-is-scanner-skipping-nextline-after-use-of-other-next-functions/ 
        */
        
        double d = Double.parseDouble(in.nextLine());
        float f = Float.parseFloat(in.nextLine());
        int i = Integer.parseInt(in.nextLine());
        String s = in.nextLine();
        char c = in.next().charAt(0);

        System.out.println(i);
        System.out.println(d);
        System.out.println(f);
        System.out.println(s);
        System.out.println(c);
    }
}