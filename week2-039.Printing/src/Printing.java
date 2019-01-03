public class Printing {

    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void printSquare(int sideSize) {
        int i = 0;
        while (i < sideSize) {
            printStars(sideSize);
            i++;
        }
        System.out.println();
    }

    public static void printRectangle(int width, int height) {
        int i = 0;
        while (i < height) {
            printStars(width);
            i++;
        }
        System.out.println();
    }

    public static void printTriangle(int size) {
        int i = 0;
        while (i <= size) {
            printStars(i);
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");
        printSquare(5);
        System.out.println("\n---");
        printRectangle(27, 6);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
    }

}

