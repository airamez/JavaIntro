/*
 * The for stament is a specilized looping command to repeat the code a specific number of times
 * It consist of three parts
 * 1 - Initialization: Declaration and initialization of the variable used to control the loop
 * 2 - Logical expression: The content will be execute while it is true (until it is false)
 * 3 - Increment: The increment for each iteraction
 
 Sintaxe:
 for (INITIALIZATION; LOGICAL_EXPRESSIONS; INCREMENT) {
    CONTENT
 }

 Reference: https://www.w3schools.com/java/java_for_loop.asp
 */

public class _02_for {
    public static void main(String[] args) {

        // Example 1: Printing from 1 to 9
        System.out.print("Example 1: ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d, ", i);
        }
        System.out.println();

        // Example 2: Printing from start to end
        System.out.print("Example 2: ");
        int start = 10;
        int end = 35;
        for (int i = start; i <= end; i++) {
            System.out.printf("%d, ", i);
        }
        System.out.println();

        // Example 3: Printing from end to start
        System.out.print("Example 3: ");
        for (int i = end; i >= start; i--) {
            System.out.printf("%d, ", i);
        }
        System.out.println();

        // Example 4: Multiplation table
        System.out.println("Example 4");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d x %d = %d %n", i, j, i * j);
            }
        }
    }
}
