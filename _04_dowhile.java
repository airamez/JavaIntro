/*
 * The do while statement is a variation of the while statement
 * The difference is that the do while first execute its content before check the logical expression
 * It consist of a expression logic
 * The content is executed while the logical expression is true (or until it is false)

 Sintaxe:
 do {
    CONTENT
 } whie (LOGICAL_EXPRESSIONS);

 Reference: https://www.w3schools.com/java/java_while_loop.asp

 ATTENTION: Try these questions https://github.com/airamez/IntroToCode_CSharp01/blob/main/_03_RepetitionCommands/_05_RepetionCommandPractice.txt

 */

import java.io.Console;

public class _04_dowhile {
    public static void main(String[] args) {
        Console console = System.console();

        int sum = 0;
        int number;
        do {
            String numberAsString = console.readLine("Type a integer number (0 to stop): ");
            number = Integer.parseInt(numberAsString);
            sum += number;
            System.out.printf("Sum: %d%n", sum);
        } while (number != 0);
    }
}