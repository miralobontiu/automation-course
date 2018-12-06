
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int b = Integer.parseInt(reader.nextLine());

        double quotient = (double)a/b;
        String toPrint = a + " / " + b + " = " + quotient;
        System.out.println("Division: " + toPrint);

        // Implement your program here. Remember to ask the input from user.
    }
}
