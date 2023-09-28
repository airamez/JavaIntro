/*
 * https://www.w3schools.com/java/java_conditions.asp
 * The if statement has the option to do something else if the expression is false
  if (LOGICAL_EXPRESSION)
  {
    CONTENT
  } else {
    CONTENT
  }
 */

import java.util.Random;

public class _01_if_02 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10);
        System.out.printf("Number = %d%n", number);
        boolean isEven = number % 2 == 0;
        // Prints the result of the expression
        System.out.printf("Number %% 2 = %b%n", isEven);
        // Print the result if the expression is true
        if (isEven) {
            System.out.printf("The number %d is Even", number);
        } else {
            System.out.printf("The number %d is Odd", number);
        }
    }
}
