package Week7;

import java.util.Scanner;

public class TextUserInterface {
        private Scanner reader;
        private Dictionary dictionary;

        public TextUserInterface(Scanner reader, Dictionary dictionary) {
            this.reader = reader;
            this.dictionary = dictionary;
    }

        public void start() {
            System.out.println("Statement: ");
            System.out.println(" quit - quit the text user interface");
            System.out.println();

            while (true) {
                System.out.print("Statement: ");
                String input = reader.nextLine();

                if (input.equals("quit")) {
                    System.out.println("Bye!");
                    break;
                    // 7.5 Adding and translating words
                } else if (input.equals("add")) {
                        System.out.print("In Estonian: ");
                        String word = reader.nextLine();
                        System.out.print("Translation: ");
                        String translation = reader.nextLine();
                        dictionary.add(word, translation);
                    } else if (input.equals("translate")) {
                        System.out.print("Give a word: ");
                        String word = reader.nextLine();
                        String translation = dictionary.translate(word);
                        if (translation == null) {
                            System.out.println("Word " + word + " was not found");
                        } else {
                            System.out.println("Translation: " + translation);
                        }
                    } else {
                        System.out.println("Unknown statement");
                    }
                    System.out.println();
                }
            }

        }



