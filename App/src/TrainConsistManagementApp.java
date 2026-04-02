import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("=====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=====================================\n");

        // Create a dynamic list to store train bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial consist information
        System.out.println("Train initialized successfully...");

        // Initial bogie count
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // Current train consist
        System.out.println("Current Train Consist : " + trainConsist);

        // System ready
        System.out.println("\nSystem ready for operations...");
    }
}