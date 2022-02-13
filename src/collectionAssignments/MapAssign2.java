package collectionAssignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Create a collection called HashMap which is capable of storing String objects.
The program should have the following abilities
a) Check if a particular key exists or not
b) Check if a particular value exists or not
c) use Iterator to loop through the map

 */
public class MapAssign2 {
  public static void main(String[] args) {
    HashMap<String, String>  hm = new HashMap<String, String>();
   // inserting Empid as key and name as value
    hm.put("EMP101","Neeraj");
    hm.put("EMP102","Ajay");
    hm.put("EMP103","Sunil");
    hm.put("EMP104","Pawan");
    // By using contains key method
    System.out.println(hm.containsKey("EMP103"));
    System.out.println(hm.containsValue("Ajay"));
    Iterator i = hm.entrySet().iterator();
    while(i.hasNext()) {
      Map.Entry mapen = (Map.Entry) i.next();
      System.out.println(mapen.getKey() + "  "+ mapen.getValue());

    }
    }
  }

