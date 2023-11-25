/*
* Array
  * Definition
    * Collection of "variables" of the same type
    * It is the most basic "data structure"
  * Properties
    * All elements are of the same type
    * Static size/length
    * Elements accessed by index (zero based)
    * The size (length) is stored in a property called length
    * Dynamic type (like a class/object)
  * Declaration
    TYPE[] name
  * Initialization
     name = new TYPE[LENGTH];
  * Reference: https://www.w3schools.com/java/java_arrays.asp
*/

public class _06_array_1_intro {
    public static void main (String[] args) {
        // Declaring and initializing an array of integers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.printf("Length = %d%n", numbers.length);

        printArray("numbers",numbers);

        // Accesing the 6th element (index = 5)
        System.out.printf("numbers[5] = %d%n", numbers[5]);

        // Setting the value of the 6th element
        numbers[5] = 10;
        System.out.printf("numbers[5] = %d%n", numbers[5]);
        printArray("numbers",numbers);

        // Re-initializing the array
        numbers = new int[5];
        // Assigning values
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        printArray("numbers", numbers);
    }

   /**
    * Print all elements of the array
    * @param array array of integers
    */
    public static void printArray(String label,  int[] array) {
        System.out.printf("%s: [", label);
        // Printing in-line all elements but the last, followed by comman and space
        for (int i = 0; i < array.length - 1; i++) {
            System.out.printf("%d, ", array[i]);
        }
        // Printing the last element and new line
        System.out.print(array[array.length - 1]);
        System.out.println("]");
    }
}