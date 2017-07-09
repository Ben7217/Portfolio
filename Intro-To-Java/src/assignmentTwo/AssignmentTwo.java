package AssignmentTwo;

import java.util.Scanner;

public class AssignmentTwo {

    public static void main(String[] args) {

        //Intialize userInput
        String userInput;

        //Intialize string variable to encode loop information onto
        String sourceChar = " ";

        // User is prompted to enter a sentence .
        System.out.println("Enter a sentence to be encoded: ");
        Scanner keyboard = new Scanner(System.in);
        userInput = keyboard.nextLine();

        // Prints the sentence the user entered 
        System.out.println("The string read is: " + userInput);

        //Prints the length of the characters in the sentence
        System.out.println("Length in chars is: " + userInput.length());

        //Iterates through each character in the user entered sentence
        for (int i = 0; i < userInput.length(); i++) {

            // Assigns iterated characters to a variable 
            char n = userInput.charAt(i);

            //String of acceptable ASCII characters
            String acceptable;
            acceptable = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890-"
                    + "_.*";

            /* Loop that runs through each character and replaces spaces with 
            '+' and adds '%' + the correct ASCII character for the characters 
            that aren't included in the String of acceptable characters. */
            if (acceptable.indexOf(n) != -1) {

                sourceChar += n;

            } else if (n == ' ') {
                sourceChar += "+";
            } else {
                String hexValue = Integer.toHexString(n);
                sourceChar += '%' + hexValue;

            }

        }
        //Prints url (userInput): 
        System.out.println("The encoded string: " + sourceChar);
    }

}
