import java.util.HashMap;
import java.util.Map;

public class MapLab {

    public static void main(String[] args) {
        System.out.println("=== WORD FREQUENCY COUNTER ===");
        System.out.println("Learning HashMap operations through text analysis\n");

        String text = """
                      Java is a versatile, object-oriented programming language widely used for building web,
                      desktop, and mobile applications. Its syntax is similar to C++, making it familiar to
                      many developers. Java runs on the Java Virtual Machine (JVM), which allows code to be
                      compiled once and run anywhere. It supports features like encapsulation, inheritance,
                      and polymorphism, making it ideal for large-scale software development. Common Java tools
                      include Eclipse, IntelliJ, and Maven. Developers often use Java for Android app development,
                      backend services, and enterprise applications. Its vast library support and strong community
                      make Java a reliable choice for both beginners and professionals alike.
                      """;

        System.out.println("Text to analyze: \"" + text + "\"");
        System.out.println();

        // ========== SECTION 1 ==========
        System.out.println("1. Creating a word frequency map...");

        Map<String, Integer> wordFrequency = new HashMap<String, Integer>();

        System.out.println("   HashMap created successfully!");
        System.out.println("   Map size: " + wordFrequency.size());
        System.out.println("   Is empty: " + wordFrequency.isEmpty());
        System.out.println();

        // ========== SECTION 2 ==========
        System.out.println("2. Processing text into individual words...");

        String[] words = text.toLowerCase().split(" ");

        System.out.println("   Total words found: " + words.length);
        System.out.println("   Words array: ");
        for (String word : words) {
            System.out.print("'" + word + "' ");
        }
        System.out.println("\n");

        // ========== SECTION 3 ==========
        System.out.println("3. Counting word frequencies...");

        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        System.out.println("   Word frequencies calculated!");
        System.out.println("   Map size: " + wordFrequency.size());
        System.out.println("   Current map: " + wordFrequency);
        System.out.println();

        // ========== SECTION 4 ==========
        System.out.println("4. Checking frequencies of specific words...");

        String searchWord = "java";

        Integer javaCount = wordFrequency.get("java");
        Integer unknownCount = wordFrequency.get("unknown");
        Integer programmingCount = wordFrequency.getOrDefault("programming", 0);

        System.out.println("   Frequency of '" + searchWord + "': " + javaCount);
        System.out.println("   Frequency of 'unknown': " + unknownCount);
        System.out.println("   Frequency of 'programming' (using getOrDefault): " + programmingCount);
        System.out.println();

        // ========== SECTION 5 ==========
        System.out.println("5. Checking if map contains specific keys and values...");

        boolean hasJava = wordFrequency.containsKey("java");
        boolean hasCount5 = wordFrequency.containsValue(5);
        boolean hasCount2 = wordFrequency.containsValue(2);

        System.out.println("   Contains key 'java': " + hasJava);
        System.out.println("   Contains value 5: " + hasCount5);
        System.out.println("   Contains value 2: " + hasCount2);
        System.out.println();

        // ========== SECTION 6 ==========
        System.out.println("6. Manually updating a word frequency...");

        System.out.println("   Before update - 'applications' frequency: " + wordFrequency.get("applications"));

        wordFrequency.put("applications", 10);

        System.out.println("   After update - 'applications' frequency: " + wordFrequency.get("applications"));
        System.out.println();

        // ========== SECTION 7 ==========
        System.out.println("7. Displaying all word frequencies...");

        System.out.println("   Method 1: Iterating through keys");

        for (String word : wordFrequency.keySet()) {
            System.out.println("     '" + word + "' appears " + wordFrequency.get(word) + " times");
        }

        System.out.println();

        System.out.println("   Method 2: Iterating through entries");

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println("     '" + entry.getKey() + "' appears " + entry.getValue() + " times");
        }

        System.out.println();

        // ========== SECTION 8 ==========
        System.out.println("8. Finding most and least frequent words...");

        String mostFrequent = "";
        String leastFrequent = "";
        int maxCount = 0;
        int minCount = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }

            if (entry.getValue() < minCount) {
                minCount = entry.getValue();
                leastFrequent = entry.getKey();
            }
        }

        System.out.println("   Most frequent word: '" + mostFrequent + "' (" + maxCount + " times)");
        System.out.println("   Least frequent word: '" + leastFrequent + "' (" + minCount + " times)");
        System.out.println();

        // ========== SECTION 9 ==========
        System.out.println("9. Final statistics...");

        System.out.println("   Total unique words: " + wordFrequency.size());
        System.out.println("   All unique words: " + wordFrequency.keySet());
        System.out.println("   All frequency values: " + wordFrequency.values());
        System.out.println("   Final map: " + wordFrequency);

        System.out.println("\n=== LAB COMPLETE ===");
    }
}