/*
Write a class MathOperation which accepts 5 integers through command line. create
an array using these parameters. loop through the array and obtain the sum and average of all the
elements and display the result.
various exceptions that may arise like ArithmeticException, NumberFormatException
and so on should be handled
 */
package ExceptionAssignments;
import java.util.InputMismatchException;
import java.util.Scanner;

class MathOperation {
  public static void main(String[] args) {
    int arr[] = new int[args.length];
    int sum = 0;
    try {
      for (int i = 0; i < arr.length; i++) {
         arr[i] = Integer.parseInt(args[i]);
        sum = sum + arr[i];
      }
      System.out.println("Sum is = "+ sum);
      System.out.println("Average is = "+ sum/arr.length);
    } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException | InputMismatchException e) {
      System.out.println(e);
    }
  } // end of the main Method
} // end of the MathOperation


public class ExceptionAssign2 {
}
