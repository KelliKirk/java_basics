package Week3;

import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a word:");
        String word = scanner.nextLine();

        System.out.print("Length of the first part: ");
        int length = scanner.nextInt();

        String result = word.substring(0, length);
        System.out.print("Result: " + result);

        scanner.close();
    }
}
