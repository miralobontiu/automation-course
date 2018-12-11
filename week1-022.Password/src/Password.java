
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        while (true) {
            System.out.println("Type the password: ");
            String text = reader.nextLine();
            if (!(text.equals(password))) {
                System.out.println("Wrong!");
            } else if (text.equals(password)) {
                System.out.println("Right!");

                System.out.println("The secret is: WELL DONE!");
                break;
            }

        }
    }
}
