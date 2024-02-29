import java.util.Scanner;

public class TerrainTable {

    public static void main(String[] args) {
        String[][] terrainModifiers = {
                {"Open", "Infantry", "Wheeled", "Tracked"}, // Open
                {"Rough", "Half", "Half", "Half"}, // Rough
                {"Hill", "Half", "Half", "Half"}, // Hill
                {"Swamp", "Half", "Not Allowed", "Not Allowed"}, // Swamp
                {"Forest", "Full", "Half", "Quarter"} // Forest
        };

        Scanner scanner = new Scanner(System.in);

        // Show available terrain types
        System.out.println("Available terrain types:");
        for (int i = 0; i < terrainModifiers.length; i++) {
            System.out.println(i + 1 + ". " + terrainModifiers[i][0]); // Print first element of each row
        }

        // Get user input for terrain type
        int terrainChoice;
        do {
            System.out.print("Enter terrain type (1-" + terrainModifiers.length + "): ");
            terrainChoice = scanner.nextInt() - 1; // Adjust for array indexing
        } while (terrainChoice < 0 || terrainChoice >= terrainModifiers.length);

        // Show available unit types
        System.out.println("\nAvailable unit types:");
        for (int i = 0; i < terrainModifiers[0].length; i++) {
            System.out.println(i + 1 + ". " + terrainModifiers[0][i]); // Print first row
        }

        // Get user input for unit type
        int unitChoice;
        do {
            System.out.print("Enter unit type (1-" + terrainModifiers[0].length + "): ");
            unitChoice = scanner.nextInt() - 1; // Adjust for array indexing
        } while (unitChoice < 0 || unitChoice >= terrainModifiers[0].length);

        // Return movement modifier
        String modifier = terrainModifiers[terrainChoice][unitChoice];
        System.out.println("\nMovement modifier: " + modifier);
    }
}
