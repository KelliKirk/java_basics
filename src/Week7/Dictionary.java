package Week7;
import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> translations;

    public Dictionary() {
        this.translations = new HashMap<>();
    }

    public String translate(String word) {
        return translations.get(word);
    }

    public void add(String word, String translation) {
        translations.put(word, translation);
    }

    // 7.2 Amount of Words

    public int amountOfWords() {
        return translations.size();
    }

    // 7.3 Listing all words
    public ArrayList<String> translationList() {
        ArrayList<String> list = new ArrayList<>();
        for (String key : translations.keySet()) {
            list.add(key + " = " + translations.get(key));
        }
        return list;
    }
}
