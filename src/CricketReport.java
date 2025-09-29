
// CricketReport class to generate runs scored report for batsmen in different stadiums
public class CricketReport {
    public static void main(String[] args) {
        // Define the stadiums and batsmen
        String[] stadiums = {"Kingsmead", "St Georges", "Wanderers"}; // Array of stadium names
        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB De Villiers"}; // Array of batsman names

        // Define the 2D array for runs scored by batsmen in each stadium
        int[][] runsScored = {
            {5000, 3800, 4200},  // Kingsmead: Runs scored by each batsman
            {3500, 3700, 3900},  // St Georges: Runs scored by each batsman
            {6200, 5000, 5200}   // Wanderers: Runs scored by each batsman
        };

        // Calculate and display the highest runs scored per stadium
        System.out.println("Highest Runs Scored Per Stadium:");
        for (int i = 0; i < stadiums.length; i++) { // Iterate over each stadium
            int maxRuns = Integer.MIN_VALUE; // Initialize max runs to the smallest possible value
            String topBatsman = ""; // Variable to store the name of the batsman with the highest runs
            for (int j = 0; j < batsmen.length; j++) { // Iterate over each batsman
                if (runsScored[i][j] > maxRuns) { // Check if the current batsman has more runs than the max
                    maxRuns = runsScored[i][j]; // Update max runs
                    topBatsman = batsmen[j]; // Update the top batsman
                }
            }
            System.out.println(stadiums[i] + ": " + maxRuns + " by " + topBatsman); // Display the highest runs scored per stadium
        }

        // Calculate and display the total runs scored by each batsman
        System.out.println("\nTotal Runs Scored by Each Batsman:");
        for (int j = 0; j < batsmen.length; j++) { // Iterate over each batsman
            int total = 0; // Variable to store the total runs scored by the batsman
            for (int i = 0; i < stadiums.length; i++) { // Iterate over each stadium
                total += runsScored[i][j]; // Accumulate runs scored by the batsman across all stadiums
            }
            System.out.println(batsmen[j] + ": " + total); // Display the total runs scored by each batsman
        }

        // Find and display the stadium with the most runs scored
        int maxTotalRuns = Integer.MIN_VALUE; // Initialize max total runs to the smallest possible value
        String topStadium = ""; // Variable to store the name of the stadium with the most runs
        for (int i = 0; i < stadiums.length; i++) { // Iterate over each stadium
            int total = 0; // Variable to store the total runs scored in the stadium
            for (int j = 0; j < batsmen.length; j++) { // Iterate over each batsman
                total += runsScored[i][j]; // Accumulate runs scored in the stadium
            }
            if (total > maxTotalRuns) { // Check if the current stadium has more runs than the max
                maxTotalRuns = total; // Update max total runs
                topStadium = stadiums[i]; // Update the top stadium
            }
        }
        System.out.println("\nStadium with the most runs scored: " + topStadium + " (" + maxTotalRuns + ")"); // Display the stadium with the most runs
    }
}
