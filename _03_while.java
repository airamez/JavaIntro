/*
 * The while statement is a generic looping command
 * It consist of a expression logic
 * The content is executed while the logical expression is true (or until it is false)

 Sintaxe:
 whie (LOGICAL_EXPRESSIONS) {
    CONTENT
 }

 Reference: https://www.w3schools.com/java/java_while_loop.asp
 */

import java.io.Console;

public class _03_while {
    public static void main(String[] args) {
        Console console = System.console();

        String numberAsString = console.readLine("Type a integer number (0 to stop): ");
        int number = Integer.parseInt(numberAsString);
        int sum = 0;
        while (number != 0) {
            sum += number;
            System.out.printf("Sum: %d%n", sum);
            numberAsString = console.readLine("Type a integer number (0 to stop): ");
            number = Integer.parseInt(numberAsString);
        }
    }
}
