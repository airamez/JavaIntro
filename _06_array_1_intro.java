/*
 * Array is the most basic data structure and in Java consists of a collection of fixed length with elements of the same type
 * Declaration: TYPE[] name
 * Initialization: name = new TYPE[LENGTH];
 * The elements of the array are accessed by an index, starting with 0
 * The length of the array is stored in the property length :)
 * 
 * Reference: https://www.w3schools.com/java/java_arrays.asp
 * 
 * ATTENTION: Try these questions https://github.com/airamez/IntroToCode_CSharp01/blob/main/_05_Array/_04_ArrayPractices.txt
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