package assignmentFive;

import java.util.Scanner;

public class ArraySort {

    public static void main(String[] args) {
        int[] array;
        System.out.println("Please enter a number between 3 and 10: ");
        Scanner keyboard = new Scanner(System.in);
        array = new int[keyboard.nextInt()];

        if (array.length < 3 || array.length > 10) {

            System.out.println("Uh uh uh, that number is invalid");
            System.exit(0);
        } else if (array.length > 2 && array.length < 11) {
            System.out.println("Enter " + array.length + " values:");

        }

        fillArray(array);
        printArray(array);
        sortArray(array);
        printArray(array);
    }

    /*This method fills the parameter array with values. It creates a 
local Scanner object, loops once for each array element, prompts for a value, 
reads an integer value using the Scanner, and assigns it to the array element.*/
    
    public static void fillArray(int[] array) {

        Scanner input = new Scanner(System.in);

        for (int counter = 0; counter < array.length; counter++) {

            System.out.println("Enter value " + (counter + 1));

            array[counter] = input.nextInt();

        }

        input.close();
        System.out.println("The unsorted values...");

    }
//This method prints all the values in the parameter array.

    public static void printArray(int[] array) {

        for (int counter = 0; counter < array.length; counter++) {
            System.out.println(array[counter]);
        }
    }
// This method sorts the values in the parameter array into ascending order. 

    public static void sortArray(int[] array) {

        int temp;

        boolean sorted = false;
        while (sorted == false) {

            sorted = true;

            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    //store temp i
                    array[i + 1] = array[i];

                    array[i] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println("The sorted values...");
    }
}
