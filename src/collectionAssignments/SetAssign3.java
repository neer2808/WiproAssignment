package collectionAssignments;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
Create a Collection called TreeSet which is capable of storing String objects.
They try these following operations:
a) Reverse the elements of the Collection.
b) Iterate the elements of the TreeSet using Iterator.
c) Check if a particular element exists or not.

 */

// use this class to do  customize sorting
class MyComparatorSorting  implements Comparator
{
  @Override
  public int compare(Object o1, Object o2) {
    String i1 = (String) o1;
    String i2 = (String) o2;
    return - i1.compareTo(i2);
  }
}
public class SetAssign3 {
  TreeSet<String> st = new TreeSet<>(new MyComparatorSorting());    // instance variable declared inside the class
  public void traverse() {
    Iterator i1 = st.iterator();
    while (i1.hasNext()) {
      System.out.println(i1.next());
    }
  }
    public void search(String str)
    {
      Iterator i = st.iterator();
      boolean result =false;
      while(i.hasNext())
      {
        String res = (String) i.next();

        if(res.equals(str))
        {
          result = true;
          break;
        }
      }
      System.out.println(result);
    }
  public static void main(String[] args) {
    SetAssign3 obj  = new SetAssign3();
    obj.st.add("neeraj");
    obj.st.add("kamal");
    obj.st.add("sunil");
    obj.st.add("mohan");
    obj.traverse();
    obj.search("neer");
  }
}
