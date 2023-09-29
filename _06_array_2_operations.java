import java.util.Arrays;

/*
 * The Arrays class provide several operations for arrays
 */

public class _06_array_2_operations {
    public static void main (String[] args) {
        int[] array = {7, 1, 8, 9, 3, 0, 4, 2, 6, 5};
        _06_array_1_intro.printArray("array", array);

        // WARNING: Array is a reference type, so becareful when assigning an array,
        // because both referecences will point to the same array object
        int[] array2 = array;
        // Printing both arrays
        _06_array_1_intro.printArray("array", array);
        _06_array_1_intro.printArray("array2", array2);

        // Modifying the first element using array2 reference
        array2[0] = 100;
        // Printing both arrays
        _06_array_1_intro.printArray("array: ", array);
        _06_array_1_intro.printArray("array2: ", array2);

        array[0] = 7;
        _06_array_1_intro.printArray("array: ", array);
        _06_array_1_intro.printArray("array2: ", array2);

        // Clone
        int[] arrayClone = array.clone(); // Cloning array
        // Printing both arrays
        _06_array_1_intro.printArray("array", array);
        _06_array_1_intro.printArray("arrayClone", arrayClone);

        // Modifying the arrayClone
        arrayClone[0] = 500;
        // Printing both arrays
        _06_array_1_intro.printArray("array", array);
        _06_array_1_intro.printArray("arrayClone", arrayClone);
        
        // Copy
        int[] arrayCopy = Arrays.copyOf(array, 5);
        _06_array_1_intro.printArray("arrayCopy", arrayCopy);

        // Copy Range
        int[] arrayCopyRange = Arrays.copyOfRange(array, 3, 7);
        _06_array_1_intro.printArray("arrayCopyRange", arrayCopyRange);

        // equals
        _06_array_1_intro.printArray("array", array);
        _06_array_1_intro.printArray("arrayClone", arrayClone);
        System.out.printf("Equals: %b%n", Arrays.equals(array, arrayClone));

        arrayClone[0] = 7;
        System.out.printf("Equals: %b%n", Arrays.equals(array, arrayClone));

        // Sort
        Arrays.sort(array);
        _06_array_1_intro.printArray("Array sorted", array);

        // fill
        Arrays.fill(arrayClone, 3, 7, 0);
        _06_array_1_intro.printArray("Array filled", arrayClone);
       
        // toString.
        // This could replace or be used on our printArray method :)
        String arrayAString = Arrays.toString(array);
        System.out.println(arrayAString);
    }
}
