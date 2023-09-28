/*
 * https://www.w3schools.com/java/java_conditions.asp
 * - The ability to control the flow of a program (making decision) is one of the fundations
 *   of coding
 * - Making decisions is how a program can adjust the steps to solve a problem based on
 *   the input
 * - All the decision in coding are made by using logical expression
 *   A logical expression is translated to true or false
 *  if statement sintaxe
    if (LOGICAL_EXPRESSION)
    {
      CONTENT
    }
 * References:
 * - printf: https://www.digitalocean.com/community/tutorials/java-printf-method
 */

import java.util.Random;

public class _01_if_01 {
    public static void main(String[] args) {
        Random random = new Random(); // Component to generate random numbers
        /*
         * The simplest way to make a decision is by evaluating a logical expression
         * and do something if the expression is true
         * The if statement in the most basic format works perfectly for this
         */
        // Generating a random number from 0 to 9
        int number = random.nextInt(10);
        // Prints the number using the format: "Number = [NUMBER][NE_LINE]"
        System.out.printf("Number = %d%n", number);
        // Expression to indicate if the number integer division by 2 is equal to zero
        // Meaning the number is Even
        boolean isEven = number % 2 == 0;
        // Prints the result of the expression
        System.out.printf("Number %% 2 = %b%n", isEven);
        // Print the result if the expression is true
        if (isEven) {
            System.out.printf("The number %d is Even", number);
        }
        // ATTENTION: Does nothing if it is false
    }
}
