/*
 * https://www.w3schools.com/java/java_conditions.asp
 * Very often we need to evaluate multiple conditions
 * The if statement allow the sequencing of if statement at part of the else clause
 * When one of the logical expression is false the content of the if executed and everything else is ignored
 * The flow continue until a logical expression is true or the flow lands on the else statement at the bottom,
 * if it is present
 */

 import java.io.Console;

public class _01_if_03 {
    public static void main(String[] args) {
      // Component to read from the console (keyboard)
      Console console = System.console();
      // Reading the age as string
      String ageAsString = console.readLine("Type your age: ");
      // Parsing the age to integer
      int age = Integer.parseInt(ageAsString);
      // Printing the corresponding age classification
      if (age < 13) {
        System.out.println("You are a child");
      } else if (age < 17) {
        System.out.println("You are an adolescent");
      } else if (age < 55) {
        System.out.println("You are an adult");
      } else if (age < 75) {
        System.out.println("You are an senior");
      } else {
        System.out.println("You are an elderly");
      }
    }
}
