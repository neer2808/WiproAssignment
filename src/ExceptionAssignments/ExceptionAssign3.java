
/*
Write a program to take care of NumberFormatException if user enters values
other then integer for calculating average marks of 2 Students.
The name of the students and marks in 3 subjects are taken from the user while executing
the program. In the same program write your own Exception Classes to take care
of Negative values and values out of range (i.e other than in the range of 0-100)

 */
package ExceptionAssignments;
import java.util.Scanner;


class OutOfRangeException extends Exception
{
  OutOfRangeException (String str)
  {
    super(str);
  }
}
class NegativeException extends Exception
{
  NegativeException(String str)
  {
    super(str);
  }
}
class Student
{
  String name;
  int marks[];
  Student() {
    Scanner s = new Scanner(System.in);
    System.out.println("enter student name ");
    name = s.next();
    System.out.println("Enter three subject marks ");
    marks = new int[3];

    try {
      int val;
      for (int i = 0; i < marks.length; i++) {
        val =Integer.parseInt(s.next());
        if(val<0)
          throw new NegativeException("value in negative");
        if(val>100)
          throw new OutOfRangeException("value greater then 100");
        marks[i] = val;
      }
      average();
    }
    catch(NegativeException e)
    {
      System.out.println(e);
    }
    catch(NumberFormatException e )
    {
      System.out.println(e);
    }
    catch (OutOfRangeException e) {
      System.out.println(e);
    }

  }
  public void average()
  {
    int sum=0;
    for (int i = 0; i <marks.length ; i++) {
        sum = sum +marks[i];
    }
    System.out.println("Average Marks = " + sum);
  }
}
public class ExceptionAssign3 {
  public static void main(String[] args) {
    Student obj1 = new Student();
    Student obj2 = new Student();

  }

}
