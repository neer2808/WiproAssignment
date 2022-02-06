/*Write a program to accept name and age of a person from the command prompt(Passed as
arguments when you execute the class) and ensure that the age entered is >=18 and <60

display proper  error message

The program must exit gracefully after displaying the error message in cast the arguments passed are not proper.

*/

package ExceptionAssignments;
import java.util.InputMismatchException;
class InvalidAgeException extends  Exception{
  public InvalidAgeException(String s)
  {
    super(s);
  }
}

class person
{
  int age;
  String name;
}

public class ExceptionAssign5 {
  public static void main(String[] args) {
    person p = new person();
    p.name= args[0];
    try {
      p.age = Integer.parseInt(args[1]);
      if (!(p.age >= 18 && p.age <= 60)) {
        throw new InvalidAgeException("age is invalid ");
      }
      else
      {
        System.out.println(p.name + " "+ p.age);
      }
    }
    catch(InvalidAgeException e)
    {
      System.out.println(e);
    }
    catch(InputMismatchException e)
    {
      System.out.println(e);
    }
  }

}
