package collectionAssignments;


/*
Create an ArrayList that can store only Strings.
Crete a printAll method that will print all the elements of the ArrayList using an Iterator

 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListAssign3 {
    List<String> obj;
    ListAssign3()
    {
      obj = new ArrayList<>();
    }
    public static void main(String[] args)
    {
      ListAssign3  tobj = new ListAssign3();
      Scanner s = new Scanner(System.in);
      char ans ;
      while(true)
      {
        System.out.println("Enter the String value which you want to add");
        tobj.obj.add(s.next());
        System.out.println("Do you want to continue enter Y or N");
        ans = s.next().charAt(0);
        if(ans == 'n' || ans =='N')
          break;
      }
      tobj.printall();
    }
    public void printall()
    {
      Iterator i = obj.iterator();
      while(i.hasNext())
      {
        System.out.println(i.next());
      }
    }
  }

