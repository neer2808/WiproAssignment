package collectionAssignments;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/*
write a java program to create an ArrayList, and all the months of
a year and print the same.

implement it by using Linked List
 */
public class ListAssign5 {

  public static void main(String[] args) {
    LinkedList<String> obj = new LinkedList<>();
    obj.add("January");
    obj.add("February");
    obj.add("March");
    obj.add("April");
    obj.add("May");
    obj.add("June");
    obj.add("July");
    obj.add("August");
    obj.add("September");
    obj.add("October");
    obj.add("November");
    obj.add("December");
/* print values in reverse order
    ListIterator itr = obj.listIterator(obj.size());
    while(itr.hasPrevious())
    {
      System.out.println(itr.previous());
    }
*/
ListIterator itr = obj.listIterator();
while(itr.hasNext())
{
  System.out.println(itr.next());
}
  }
}
