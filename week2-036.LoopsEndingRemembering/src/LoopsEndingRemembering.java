import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);

        int a;
        int sum = 0;
        int count = 0;
        int even = 0;

        System.out.println("Type numbers: ");

        while (true) {
            a = Integer.parseInt(reader.nextLine());
            if (a % 2 == 0) {
                even++;
            }

            if (a != -1) {
                sum += a;
                count++;
            } else {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sum);
                System.out.println("How many numbers: " + count);
                double average = (double) sum / count;
                System.out.println("Average: " + average);
                System.out.println("Even numbers: " + even);
                System.out.println("Odd numbers: " + (count - even));
                break;

            }
        }
    }
}

