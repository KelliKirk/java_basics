package Week7;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add("ahv", "monkey");
        dictionary.add("banaan", "banana");
        dictionary.add("harf", "harp");

        System.out.println(dictionary.translate("ahv"));
        System.out.println(dictionary.translate("banaan"));
        System.out.println(dictionary.translate("harf"));

        // 7.2 Amount of Words
        System.out.println(dictionary.amountOfWords());

        // 7.3 Listing all words
        ArrayList<String> translations = dictionary.translationList();
        for(String translation: translations) {
            System.out.println(translation);
        }

        // 7.4 User Interface
        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.start();
    }
}





