/*
 * This is a simple program that reads a number from the user and prints it if it's larger than 1,000,
 * otherwise it prints a message indicating that the number is less than 1,000.
 */
package methodsassignmentjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class contains the main method to execute the program.
 */
public class MethodsAssignmentJava {

    /**
     * The main method of the program.
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Call the number method to get user input and process it
        number();
    }

    /**
     * This method reads a number from the user and prints it if it's larger than 1,000,
     * otherwise it prints a message indicating that the number is less than 1,000.
     */
    public static void number() {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Enter a number larger than 1,000: ");
        try {
            String raw = reader.readLine();
            double number = Double.parseDouble(raw);
            double minimum = 1000;

            if (number >= minimum) {
                // Format the number with comma for thousands separator
                System.out.println( String.format("%,.2f", number));
            } else {
                System.out.println("The number entered is less than 1,000.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}
