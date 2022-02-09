package collectionAssignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Create an ArrayList that can store only numbers like
int, float,, double, etc, but not any other data type.
 */
public class ListAssign4 {
  public static void main(String[] args) {
    List<Number> obj = new ArrayList<Number>();
    System.out.println("adding Integer "+ obj.add(12));
    System.out.println("adding Float "+ obj.add(12.467f));
    System.out.println("adding Double " + obj.add(12.32));
   // System.out.println("adding String "+ obj.add("aaa"));
    Iterator itr = obj.iterator();
    while(itr.hasNext())
    {
      System.out.println(itr.next());
    }
  }
}
