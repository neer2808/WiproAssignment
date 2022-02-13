package collectionAssignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Create a Collection "ContactList" using HashMap to store name and phoneno of contacts added.
The program should use appropriage generics (String, Integer) and have the following abilities:
a) Check if a particular key exists or not
b) Check if a particular value exists or not
C) use Iterator to loop through the map
 */
public class MapAssign4 {
  public static void main(String[] args) {
    HashMap<String ,Integer> hp = new HashMap<>();
    hp.put("neeraj", 123456789);
    hp.put("ajay", 987654321);
    hp.put("sunil", 1767676767);
    System.out.println(hp.containsKey("ajay"));
    System.out.println(hp.containsValue(123456789));
    Iterator i = hp.entrySet().iterator();
    while(i.hasNext())
    {
      Map.Entry e = (Map.Entry) i.next();
      System.out.println(e.getKey() + "\t\t" +e.getValue());
    }
  }
}
