import java.util.Scanner;

// Class to calculate total runs scored by batsmen in different stadiums
public class BatsmenRuns {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of batsmen
        System.out.print("Enter name of cricketer: ");
        int numcricketer= scanner.nextInt();

        //Prompt user to enter the number of batsmen
        System.out.print(" Enter number of batsmen: ");
        int numbatsmen= scanner.nextInt();
        // Prompt user to enter the number of stadiums
        System.out.print("Enter number of stadiums: ");
        int numStadiums = scanner.nextInt();
        int numBatsmen = 0;

        // Initialize arrays to store batsmen names, stadium names, and runs scored
        String[] batsmen = new String[numBatsmen];
        String[] stadiums = new String[numStadiums];
        int[][] runsScored = new int[numBatsmen][numStadiums];

        // Get batsmen names from user
        System.out.println("Enter batsmen names:");
        for (int i = 0; i < numBatsmen; i++) {
            System.out.print("Batsman " + (i + 1) + ": ");
            batsmen[i] = scanner.next();
        }

        // Get stadium names from user
        System.out.println("Enter stadium names:");
        for (int i = 0; i < numStadiums; i++) {
            System.out.print("Stadium " + (i + 1) + ": ");
            stadiums[i] = scanner.next();
        }

        // Get runs scored by each batsman in each stadium
        System.out.println("Enter runs scored:");
        for (int i = 0; i < numBatsmen; i++) {
            for (int j = 0; j < numStadiums; j++) {
                System.out.print(batsmen[i] + " at " + stadiums[j] + ": ");
                runsScored[i][j] = scanner.nextInt();
            }
        }

        // Calculate total runs scored by each batsman
        int[] totalRuns = new int[numBatsmen];
        for (int i = 0; i < numBatsmen; i++) {
            for (int j = 0; j < numStadiums; j++) {
                totalRuns[i] += runsScored[i][j];
            }
        }

        // Display total runs scored by each batsman
        System.out.println("Total Runs Scored by Batsmen:");
        for (int i = 0; i < numBatsmen; i++) {
            System.out.println(batsmen[i] + ": " + totalRuns[i]);
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}


