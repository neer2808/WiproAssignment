package collectionAssignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

/*
Implement the assignment 1 using TreeSet

 */
public class SetAssign4 {

  TreeSet<String> obj;
  SetAssign4()
  {
    obj = new TreeSet<>();
  }
  public TreeSet<String> saveCountryNames (String CountryName)
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
    SetAssign4 obj = new SetAssign4();
    obj.saveCountryNames("India");
    obj.saveCountryNames("china");
    obj.saveCountryNames(("japan"));
    obj.saveCountryNames("USA");

    System.out.println(obj.getcountry("qqq"));

  }

}
