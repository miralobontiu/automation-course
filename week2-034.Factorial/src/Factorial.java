import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());

        int factorial = 1;
        int number = 1;

        while(number <= a) {
            factorial *= number;
            number++;
        }
        System.out.println("Factorial is " + factorial);
    }
}
