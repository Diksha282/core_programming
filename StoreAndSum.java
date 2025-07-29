import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[10]; 
        double total = 0.0;                
        int index = 0;                     

        System.out.println("Enter up to 10 positive numbers. Enter 0 or a negative number to stop:");

        // Infinite loop
        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double input = scanner.nextDouble();

            if (input <= 0) {
                System.out.println("Stopping input as 0 or negative number was entered.");
                break;
            }

            if (index == 10) {
                System.out.println("Maximum limit of 10 numbers reached.");
                break;
            }

            numbers[index] = input;
            index++;
        }

        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        System.out.println("\nYou entered:");
        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }

        System.out.println("\nTotal sum of all numbers = " + total);

        scanner.close();
    }
}
