/*
write a java program to create an ArrayList, add all the months of
a year and print the same.
*/
package collectionAssignments;
import java.util.*;
public class ListAssign1 {
  public static void main(String[] args) {
    List<String > l = new LinkedList();
    l.add("January");
    l.add("February");
    l.add("March");
    l.add("April");
    l.add("May");
    l.add("June");
    l.add("July");
    l.add("August");
    l.add("September");
    l.add("October");
    l.add("November");
    l.add("December");

    // method 1 to print the values

    int size = l.size();
    for (int i = 0; i <size; i++) {
      System.out.println(l.get(i));
    }

 /*


    // method 2 to print the values
    for (Object str :l)
    {
      System.out.println((String)str);
    }

    //method 3
    Iterator i = l.iterator();
    String s ="" ;
    while(i.hasNext())
    {
     s=s.concat((String)i.next())+ " ";
    }
    System.out.println(s);

    // method 4
    ListIterator listite = l.listIterator();
    String str;
    while(listite.hasNext())
    {
      str = (String)listite.next();
      if(str.equals("March"))
      {
        listite.remove();
      }
    }
    for (String ss:l) {
      System.out.println(ss);
    }
  */


  } // end of the main method
} // end of the class

