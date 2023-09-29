import java.io.Console;
import java.util.Arrays;

/*
 * The Arrays class provide several operations for arrays
 */

public class _06_array_2_operations {
    public static void main (String[] args) {
        int[] array = {7, 1, 8, 9, 3, 0, 4, 2, 6, 5};
        _06_array_1_intro.printArray(array);

        // WARNING: Array is a reference type, so becareful when assigning an array,
        // because both referecences will point to the same array object
        int[] array2 = array;
        // Printing both arrays
        System.out.print("array: ");
        _06_array_1_intro.printArray(array);
        System.out.print("array2: ");
        _06_array_1_intro.printArray(array2);

        // Modifying the first element using array2 reference
        array2[0] = 100;
        System.out.print("array: ");
        // Printing both arrays
        _06_array_1_intro.printArray(array);
        System.out.print("array2: ");
        _06_array_1_intro.printArray(array2);

        array[0] = 7;
        System.out.print("array: ");
        _06_array_1_intro.printArray(array);
        System.out.print("array2: ");
        _06_array_1_intro.printArray(array2);

        // Clone
        int[] arrayClone = array.clone(); // Cloning array
        // Printing both arrays
        System.out.print("array: ");
        _06_array_1_intro.printArray(array);
        System.out.print("arrayClone: ");
        _06_array_1_intro.printArray(arrayClone);

        // Modifying the arrayClone
        arrayClone[0] = 500;
        // Printing both arrays
        System.out.print("array: ");
        _06_array_1_intro.printArray(array);
        System.out.print("arrayClone: ");
        _06_array_1_intro.printArray(arrayClone);
        
        // Copy
        int[] arrayCopy = Arrays.copyOf(array, 5);
        System.out.print("arrayCopy: ");
        _06_array_1_intro.printArray(arrayCopy);

        // Copy Range
        int[] arrayCopyRange = Arrays.copyOfRange(array, 3, 7);
        System.out.print("arrayCopyRange: ");
        _06_array_1_intro.printArray(arrayCopyRange);

        // equals
        System.out.print("array: ");
        _06_array_1_intro.printArray(array);
        System.out.print("arrayClone: ");
        _06_array_1_intro.printArray(arrayClone);
        System.out.printf("Equals: %b%n", Arrays.equals(array, arrayClone));

        arrayClone[0] = 7;
        System.out.printf("Equals: %b%n", Arrays.equals(array, arrayClone));

        // Sort
        Arrays.sort(array);
        System.out.print("Array sorted: ");
        _06_array_1_intro.printArray(array);

        // fill
        Arrays.fill(arrayClone, 3, 7, 0);
        System.out.print("Array filled: ");
        _06_array_1_intro.printArray(arrayClone);
       
        // toString.
        // This could replace our printArray method :)
        String arrayAString = Arrays.toString(array);
        System.out.println(arrayAString);
    }
}
