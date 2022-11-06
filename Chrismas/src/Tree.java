public class Tree {
    public  static void printStars(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public  static void printSquare(int num) {
        for (int i = 0; i < num; i++) {
            printStars(num);
        }
        System.out.println("");
    }

    public  static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
        System.out.println("");
    }

    public  static void printSpaces(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 0; i < size; i++) {
            printSpaces(size-(i+1));
            printStars(i+1);
        }
        System.out.println("");
    }

    public static void christmasTree(int height) {
        int stars = 0;
        for (int i = 0; i < height; i++, stars+=2) {
            printSpaces(height-(i+1));
            printStars(stars+1);
        }

        for (int i = 0; i < 2; i++) {
            printSpaces((stars-3) / 2);
            printStars(3);
        }

    }

















}
