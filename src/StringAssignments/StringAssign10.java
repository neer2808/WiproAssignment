/*given a string and an integer n, print a new string made of n repetitions of the last n
characters of the string.
you may assume that n is between zero and the length of the string inclusive
imput : wipro ,3
output propropro
*/

package StringAssignments;

import java.util.Scanner;
public class StringAssign10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter String = ");
    String str= s.next();
    System.out.println("Enter n ");
    int n = s.nextInt();
    String resultString= "";
    for (int i = 0; i <n ; i++) {
      resultString =resultString.concat( str.substring(str.length()-n));
    }
    System.out.println(resultString);

    };

  }
