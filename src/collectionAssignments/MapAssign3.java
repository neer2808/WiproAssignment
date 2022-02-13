package collectionAssignments;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/*
Write a program that will have a properties class object which is
capable of storing some states of  India and their Capital.
use iterator to list out all the elements stored in the Properties.
 */
public class MapAssign3 {
  public static void main(String[] args) {
    Properties p = new Properties();
    p.put("Goa","Panji");
    p.put("Haryana", "Chandigarh");
    p.put("Punjab","Chanidgarh");
    p.put("Uttar Pradesh", "Lucknow");
    Iterator i = p.entrySet().iterator();
    while(i.hasNext())
    {
      Map.Entry me = (Map.Entry) i.next();
      System.out.printf("%-15s %-15s \n",me.getKey(),me.getValue());
    }


  }
}
