package collectionAssignments;
import java.util.Enumeration;
import java.util.Vector;

/*
write a java program to create an ArrayList, and all the months of a year and print the same.
Implement it by using vector
*/
public class ListAssign6 {
  public static void main(String[] args) {
 Vector<String> obj = new Vector<>();

    obj.addElement("January");
    obj.addElement("February");
    obj.addElement("March");
    obj.addElement("April");
    obj.addElement("May");
    obj.addElement("June");
    obj.addElement("July");
    obj.addElement("August");
    obj.addElement("September");
    obj.addElement("October");
    obj.addElement("November");
    obj.addElement("December");
    Enumeration enum1 = obj.elements();
    while(enum1.hasMoreElements())
    {
      System.out.println(enum1.nextElement());
    }
  }
}
