package Week2;

public class Ex39 {
    public static void printStars(int amount) {
        int star = 1;
        while (star <= amount) {
            System.out.print("*");
            star++;
        }
        System.out.println();
    }

    public static void printSquare (int sideSize){
        for (int i = 0; i <= sideSize; i++) {
            printStars(sideSize);
        }
    }

    public static void printRectangle(int width, int height){
        for (int i = 0; i <= height; i++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size){
        for (int i = 0; i <= size; i++) {
            printStars(i);
        }
    }
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        printSquare(4);
        printRectangle(17,  3);
        printTriangle(4);

    }
}
