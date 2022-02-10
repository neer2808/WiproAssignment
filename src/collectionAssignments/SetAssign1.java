package collectionAssignments;
/*
Develop a java class with a instance variable H1 (HashSet)
add a method  saveCountryNames(StringCountryName), the method should add the passed
country to a HashSet (H1) and return the added HashSet (H1).
develop a method getCountry(String CountryName) which iterates through the HashSet and returns the country
if exist else return null.
Note: - you can test the methods using a main method.
 */

import java.util.HashSet;
import java.util.Iterator;

public class SetAssign1 {
  HashSet<String> obj;
  SetAssign1()
  {
    obj = new HashSet<>();
  }
  public HashSet<String> saveCountryNames (String CountryName)
  {
    obj.add(CountryName);
    return obj;
  }
  public String getcountry(String countryname)
  {
    if(obj.isEmpty())
    {
      return "empty";
    }
    else
    {
      Iterator i = obj.iterator();
      while(i.hasNext())
      {
        String s = (String) i.next();
        if(s.equals(countryname))
        {
          return countryname;
        }
      }
      return null;
    }
  }
  public static void main(String[] args) {
    SetAssign1 obj = new SetAssign1();
    obj.saveCountryNames("India");
    obj.saveCountryNames("china");
    obj.saveCountryNames(("japan"));
    obj.saveCountryNames("USA");
    System.out.println(obj.getcountry("USA"));

  }


}
