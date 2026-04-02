import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("========================================\n");

        // Create Set (HashSet for uniqueness)
        Set<String> bogies = new HashSet<>();

        // Add IDs (including duplicates)
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        bogies.add("BG101");
        bogies.add("BG102");


        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies + "\n");

        System.out.println("Note:");
        System.out.println("Duplicates are automatically ignored by HashSet.\n");

        System.out.println("UC3 uniqueness validation completed...");
    }
}