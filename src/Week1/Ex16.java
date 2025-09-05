package Week1;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Type a number:");
        int number =  reader.nextInt();
        if (number % 2 == 0){
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
