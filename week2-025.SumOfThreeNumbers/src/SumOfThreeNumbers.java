
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // store numbers read form user in this variable
        System.out.println("Type the first number: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        int b = Integer.parseInt(reader.nextLine());
        System.out.println("Type the third number: ");
        int c = Integer.parseInt(reader.nextLine());
        int read = a+b+c;
        int sum = read;


        //System.out.println(sum);
        //sum = read;

        System.out.println("Sum: " + sum);
    }
}
