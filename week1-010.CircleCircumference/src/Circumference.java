
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the radius: ");
        int a = Integer.parseInt(reader.nextLine());

        double pi = Math.PI;
        double result = (double)2*pi*a;
        System.out.println("Circumference of the circle: " + result);// Program your solution here
    }
}
