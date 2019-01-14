
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        int score = 0;
        int a = 0;

        while (true) {
            System.out.println("Guess a number: ");
            a = reader.nextInt();

            if (a == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (a < numberDrawn) {
                score++;
                System.out.println("The number is greater, guesses made: " + score);
            } else {
                score++;
                System.out.println("The number is lesser, guesses made: " + score);
            }
        }
    }
    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
