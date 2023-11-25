import java.util.Arrays;

/*
 * The Arrays class provide several operations for arrays
 */

public class _06_array_2_operations {
    public static void main (String[] args) {
        int[] array1 = {7, 1, 8, 9, 3, 0, 4, 2, 6, 5};
        _06_array_1_intro.printArray("array", array1);

        // WARNING: Array is a reference type, so becareful when assigning an array,
        // because both referecences will point to the same array object
        int[] array2 = array1;
        // Printing both arrays
        _06_array_1_intro.printArray("array1", array1);
        _06_array_1_intro.printArray("array2", array2);

        // Modifying the first element using array2 reference
        array2[0] = 100;
        // Printing both arrays
        _06_array_1_intro.printArray("array1", array1);
        _06_array_1_intro.printArray("array2", array2);

        array1[0] = 7;
        _06_array_1_intro.printArray("array1", array1);
        _06_array_1_intro.printArray("array2", array2);

        // Clone
        int[] clonnedArray = array1.clone(); // Cloning an array
        // Printing both arrays
        _06_array_1_intro.printArray("array1", array1);
        _06_array_1_intro.printArray("clone", clonnedArray);

        // Modifying the cloned array
        clonnedArray[0] = 500;
        // Printing both arrays
        _06_array_1_intro.printArray("array1", array1);
        _06_array_1_intro.printArray("clone", clonnedArray);
        
        // Copy
        int[] arrayCopy = Arrays.copyOf(array1, 15);
        _06_array_1_intro.printArray("copy", arrayCopy);

        // Copy Range
        int[] arrayCopyRange = Arrays.copyOfRange(array1, 3, 7);
        _06_array_1_intro.printArray("copy range", arrayCopyRange);

        // equals
        _06_array_1_intro.printArray("array1", array1);
        _06_array_1_intro.printArray("clone", clonnedArray);
        System.out.printf("Equals: %b%n", Arrays.equals(array1, clonnedArray));

        clonnedArray[0] = 7;
        System.out.printf("Equals: %b%n", Arrays.equals(array1, clonnedArray));

        // sort
        Arrays.sort(array1);
        _06_array_1_intro.printArray("Sorted array", array1);

        // fill
        Arrays.fill(clonnedArray, 3, 7, 0);
        _06_array_1_intro.printArray("Filled Array", clonnedArray);
       
        // toString.
        // This could replace or be used on our printArray method :)
        String arrayAString = Arrays.toString(array1); // static method from Arrays
        System.out.println(arrayAString);

        // Attention, toString method is from Arrays class, not from the array instance
        System.out.println(array1.toString()); // Prints its hashCode in hex
        int hashCode = array1.hashCode();
        System.out.println(hashCode);
        System.out.println(Integer.toHexString(hashCode));
    }
}
