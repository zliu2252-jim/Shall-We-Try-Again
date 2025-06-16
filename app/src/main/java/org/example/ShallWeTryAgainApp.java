package org.example;

import java.util.Scanner;

/**
 * ShallWeTryAgainApp provides a method to prompt the user
 * for an integer within the range, repeatedly asking
 * until a valid input is entered.
 */
public class ShallWeTryAgainApp {

    /**
     * Prompt the user for an integer between lower and upper (inclusive).
     * Repeats until a valid integer is entered.
     *
     * @param lower the minimum acceptable integer (inclusive)
     * @param upper the maximum acceptable integer (inclusive)
     * @param prompt the message to display before input attempt
     * @param errorMessage the message to display after invalid input
     * @return the valid integer entered by the user
     */
    public static int getInput(int lower, int upper, String prompt, String errorMessage) {
        //Create the Scanner to read input
        Scanner scnr = new Scanner(System.in);
        int value;

        //Display the initial prompt to the user
        System.out.println(prompt);

        //Loop until the valid integer within the range is entered
        while (true) {
            if (!scnr.hasNextInt()) {
                scnr.next();
                System.out.println(errorMessage);
                System.out.println(prompt);
                continue;
            }

            //Read the integer value
            value = scnr.nextInt();

            //Check if the integer is within the specified range
            if (value < lower || value > upper) {
                System.out.println(errorMessage);
                System.out.println(prompt);
            } else {
                break;
            }
        }

        //return the valid integer
        return value;
    }

    /**
     * Entry point for the application to perform the manual test.
     * Prompts the user for a number between 0 and 100 and displays the chosen value.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Manual test: prompt for a number between 0 and 100
        int result = getInput(
                0,
                100,
                "Please enter a value",
                "Your value is invalid"
        );

        System.out.println();
        //Display the chosen value
        System.out.println("The value chosen by the user is " + result);
    }
}
