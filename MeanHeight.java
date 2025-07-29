import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Create array to store heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter the height (in cm or meters) of 11 football players:");

        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];  // Add to total sum
        }

        double mean = sum / 11;

        System.out.printf("\nMean height of the football team = %.2f\n", mean);

        scanner.close();
    }
}
