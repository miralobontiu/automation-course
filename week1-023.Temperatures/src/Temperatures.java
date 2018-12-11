
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);


        while (true) {
            System.out.println("Type the today`s temperature at 12.oo am: ");
            double temperature = Double.parseDouble(reader.nextLine());
            if (temperature < -30 || temperature > 40) {
                System.out.println("Type a value between -30 and +40 degrees.");

            } else {
                Graph.addNumber(temperature);
            }
        }
    }
}
        // Graph is used as follows:
        //Graph.addNumber(13.0);
        //double value = 13.5;
        //Graph.addNumber(value);
        //value = 3;
        //Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.


