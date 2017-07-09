/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentSeven;

/**
 *
 * @author BenMorrisRains
 */
public class ArrayUtils extends BadArrayException {
    
    /*minValue will find the lowest value of the array of integers determined
    by its perameter and return that lowest value */

    public static int minValue(int[] list)
            throws BadArrayException {
        int minValue = list[0];
        if (list == null) {
            throw new BadArrayException("Array is null");
        } else if (list.length == 0) {
            throw new BadArrayException("Array is empty");

        } else {
            for (int i = 0; i < list.length; i++) {

                if (list[i] < minValue) {
                    minValue = list[i];
                }

            }
            return minValue;

        }
    }
    /*copyRange will duplicate an array at a specific starting point determined
    by the startIndex parameter. It returns the new array. */

    public static int[] copyRange(int[] list, int startIndex)
            throws BadArrayException {

        if (list == null) {
            throw new BadArrayException("Arary is null");
        } else if (startIndex < 0 || startIndex > list.length) {
            throw new ArrayIndexOutOfBoundsException(startIndex);
        } else {
            int range = list.length - startIndex;
            int[] copyArray = new int[range];
            int n = 0;
            for (int i = 0; i < range; i++) {
                copyArray[n] = list[i + startIndex];
                n++;
            }
            return copyArray;
        }

    }
    /* indexOf will return the specficied int value from the parameter searchValue, 
    but only its first occraunce.*/

    public static int indexOf(int[] list, int searchValue)
            throws BadArrayException {
        int returnValue = 0;
        if (list == null) {
            throw new BadArrayException("Array is null");
        } else if (list.length == 0) {
            return -1;
        } else {
            for (int i = 0; i < list.length; i++) {
                if (list[i] == searchValue) {
                    return returnValue;
                }

            }

        }
        return -1;

    }
    /* lastIndexOf is the opposite of indexOf in that it returns the value 
    from the parameter searchValue, but only the last occurance of that value */
    public static int lastIndexOf(int[] list, int searchValue)
            throws BadArrayException {
        int returnValue = -1;
        if (list == null) {
            throw new BadArrayException("Array is null");
        } else if (list.length == 0) {
            return -1;
        } else {
            for (int i = 0; i < list.length; i++) {
                if (list[i] == searchValue) {
                    returnValue = i;
                }

            }
        }
        return returnValue;

    }
}
