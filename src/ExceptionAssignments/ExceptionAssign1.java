package ExceptionAssignments;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionAssign1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array");
    int n = s.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements in the array");
    for (int i = 0; i <arr.length ; i++) {
      arr[i]= s.nextInt();
    }
    System.out.println("Enter the index of the array element you want to access");
    try {
      int index = s.nextInt();
      if(index>arr.length-1)
      {
        throw new ArrayIndexOutOfBoundsException("");
      }
      System.out.println("The array element at index "+ index +" = "+ arr[index]);
      System.out.println("The Array element successfully Accessed");
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println(e);
      //System.out.println(e.getClass().getName());
    }
    catch(NumberFormatException | InputMismatchException e)
    {
      System.out.println(e);
    }


  }
}
