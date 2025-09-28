package Week9.tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> uniqueStrings;
    private int duplicateCount;

    public PersonalDuplicateRemover() {
        this.uniqueStrings = new HashSet<>();
        this.duplicateCount = 0;
    }

    /**
     * Stores a characterString if it's not a duplicate.
     * If it's a duplicate, increments the duplicate counter.
     */
    public void add(String characterString) {
        if (uniqueStrings.contains(characterString)) {
            duplicateCount++; // It's a duplicate, count it
        } else {
            uniqueStrings.add(characterString); // It's unique, store it
        }
    }

    /**
     * Returns the number of detected duplicates.
     */
    public int getNumberOfDetectedDuplicates() {
        return duplicateCount;
    }

    /**
     * Returns a Set with all unique characterStrings (no duplicates).
     * If there are no unique characterStrings, returns an empty set.
     */
    public Set<String> getUniqueCharacterStrings() {
        return new HashSet<>(uniqueStrings); // Return a copy to prevent external modification
    }

    /**
     * Removes stored characterStrings and resets the amount of detected duplicates.
     */
    public void empty() {
        uniqueStrings.clear();
        duplicateCount = 0;
    }
}
