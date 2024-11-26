/*
* Course: CSC1110 - 111
* Fall 2024
* Homework 5 - Phone Numbers
* Name: Ameera Syed
* Created: 9/30/2024
*/

package syeda;
import java.util.Scanner;

/**
 * This program asks the user to input the phone number.
 * This is done in a specified format, and then it is organized.
 * It is organized into country, area, and local codes and printed out.
 * The user continues inputting until they wish to opt out, using q.
 */
public class PhoneNumber {
    public static void main(String[] args) {
        String input = "";

        // Keeps asking for phone numbers until q entered
        while (!input.equals("q")) {
            System.out.println("\nEnter a phone number in the form cc-area-local,\n" +
                    "where cc = country code digits, area = area code digits,\n" +
                    "and local = local phone digits.\n" +
                    "Or enter q to quit:");
            Scanner in = new Scanner(System.in);
            input = in.nextLine();

            // Assumes phone numbers as digits and dashes and calculates indexes.
            // Only checks if there is an actual phone number inputted, not q.
            if (!input.equals("q")) {
                int countryIndex = input.indexOf("-");
                int areaIndex = input.indexOf("-", countryIndex + 1);
                System.out.print("country code = " + input.substring(0, countryIndex));
                System.out.print("\narea code = " + input.substring(countryIndex + 1, areaIndex));
                System.out.print("\nlocal phone number = " + input.substring(areaIndex + 1) + "\n");
            }
        }
    }
}