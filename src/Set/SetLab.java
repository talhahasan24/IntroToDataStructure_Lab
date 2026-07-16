import java.util.HashSet;
import java.util.Set;

public class SetLab {

    public static void main(String[] args) {
        System.out.println("=== STUDENT EXAM RESULTS ANALYSIS ===");
        System.out.println("Learning HashSet operations through exam result analysis\n");

        // SECTION 1
        Set<String> mathPassers = new HashSet<>();
        Set<String> englishPassers = new HashSet<>();
        Set<String> sciencePassers = new HashSet<>();

        System.out.println("   Three subject sets created!");
        System.out.println("   Math passers size: " + mathPassers.size());
        System.out.println("   English passers size: " + englishPassers.size());
        System.out.println("   Science passers size: " + sciencePassers.size());
        System.out.println();

        // SECTION 2
        mathPassers.add("Alice");
        mathPassers.add("Bob");
        mathPassers.add("Charlie");
        mathPassers.add("Diana");
        mathPassers.add("Eve");

        englishPassers.add("Alice");
        englishPassers.add("Bob");
        englishPassers.add("Frank");
        englishPassers.add("Grace");
        englishPassers.add("Diana");

        sciencePassers.add("Charlie");
        sciencePassers.add("Diana");
        sciencePassers.add("Eve");
        sciencePassers.add("Frank");
        sciencePassers.add("Henry");

        System.out.println("   Students added to all sets!");
        System.out.println("   Math passers: " + mathPassers);
        System.out.println("   English passers: " + englishPassers);
        System.out.println("   Science passers: " + sciencePassers);
        System.out.println();

        // SECTION 3
        boolean alicePassedMath = mathPassers.contains("Alice");
        boolean johnPassedEnglish = englishPassers.contains("John");

        System.out.println("   Did Alice pass Math? " + alicePassedMath);
        System.out.println("   Did John pass English? " + johnPassedEnglish);
        System.out.println();

        // SECTION 4
        boolean addedAlice = mathPassers.add("Alice");
        boolean addedNewStudent = mathPassers.add("Zoe");

        System.out.println("   Adding Alice again returned: " + addedAlice);
        System.out.println("   Adding Zoe returned: " + addedNewStudent);
        System.out.println();

        // SECTION 5
        Set<String> allThreePassers = new HashSet<>(mathPassers);
        allThreePassers.retainAll(englishPassers);
        allThreePassers.retainAll(sciencePassers);

        System.out.println("Students who passed all three: " + allThreePassers);
        System.out.println();

        // SECTION 6
        Set<String> atLeastOnePassers = new HashSet<>(mathPassers);
        atLeastOnePassers.addAll(englishPassers);
        atLeastOnePassers.addAll(sciencePassers);

        System.out.println("Students who passed at least one: " + atLeastOnePassers);
        System.out.println();

        // SECTION 7
        Set<String> onlyMath = new HashSet<>(mathPassers);
        onlyMath.removeAll(englishPassers);
        onlyMath.removeAll(sciencePassers);

        Set<String> onlyEnglish = new HashSet<>(englishPassers);
        onlyEnglish.removeAll(mathPassers);
        onlyEnglish.removeAll(sciencePassers);

        Set<String> onlyScience = new HashSet<>(sciencePassers);
        onlyScience.removeAll(mathPassers);
        onlyScience.removeAll(englishPassers);

        Set<String> exactlyTwoPassers = new HashSet<>(atLeastOnePassers);
        exactlyTwoPassers.removeAll(allThreePassers);
        exactlyTwoPassers.removeAll(onlyMath);
        exactlyTwoPassers.removeAll(onlyEnglish);
        exactlyTwoPassers.removeAll(onlyScience);

        System.out.println("Students who passed exactly two exams: " + exactlyTwoPassers);
        System.out.println();

        // SECTION 9
        for (String student : atLeastOnePassers) {
            System.out.print(student + " passed: ");

            if (mathPassers.contains(student))
                System.out.print("Math ");

            if (englishPassers.contains(student))
                System.out.print("English ");

            if (sciencePassers.contains(student))
                System.out.print("Science ");

            System.out.println();
        }

        System.out.println();

        // SECTION 11
        Set<String> testSet = new HashSet<>(mathPassers);

        System.out.println("Test set before removal: " + testSet);

        boolean removed = testSet.remove("Alice");
        boolean removedAgain = testSet.remove("Alice");

        System.out.println("Removed Alice: " + removed);
        System.out.println("Test set after removing Alice: " + testSet);
        System.out.println("Tried to remove Alice again: " + removedAgain);
        System.out.println();

        // SECTION 12
        int exactlyOneCount = atLeastOnePassers.size()
                - allThreePassers.size()
                - exactlyTwoPassers.size();

        System.out.println("Total unique students: " + atLeastOnePassers.size());
        System.out.println("Students who passed all three: " + allThreePassers.size());
        System.out.println("Students who passed exactly two: " + exactlyTwoPassers.size());
        System.out.println("Students who passed exactly one: " + exactlyOneCount);

        System.out.println("\n=== LAB COMPLETE ===");
    }
}