/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodsassignmentjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodsAssignmentJava {

    public static void main(String[] args) {
        // Call the number method to get user input and process it
        number();
    }

    public static void number() {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Enter a number larger than 1,000: ");
        try {
            String raw = reader.readLine();
            double number = Double.parseDouble(raw);
            double minimum = 1000;

            if (number >= minimum) {
                // TODO: Format logic
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
