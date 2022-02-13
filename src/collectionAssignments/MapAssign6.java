package collectionAssignments;
import java.util.*;
import java.util.Map.Entry;

/*
1) develop a java class with an instance variable M1( HashMap)
create a method saveCountryCapital(String CountryName, String capital),
the method should add the passed country and capital as key/value in the map M1 and
return the Map (M1).
key  country      value  Capital
India             Delhi
japan             Tokya

2) Develop  a method getCapital( String CountryName) with returns the capital
for the contry passed, from the Map M1 created in step 1

3) Develop a method getCountry (String capitalName) which returns the country for the capital name, passed from the Map
M1 created in step 1
4) Develop a method which iterates through the map M1 and creates another map M2 with
Capital as the key and value as Country and returns the Map  m2.
key    capital      value   country
delhi                 India
Tokya                 Japan

5) Develop a method which iterates through the map M1 and creates and ArrayList with all
the Country names stored as keys. This method should return the ArrayList
Node - you can test the methods using a main method.
 */
public class MapAssign6 {
  Map<String, String>M1 = new Hashtable<>();

  public Map saveCountryCapital(String CountryName, String capital)
  {
    M1.put(CountryName,capital);
    return M1;
  }
  public String getCapital(String CountryName)
  {
    String result="" ;
    for (Map.Entry m : M1.entrySet()) {
      //System.out.println(m.getKey() + " "+ m.getValue());
      //System.out.println(m.getKey().toString().equals(CountryName));
      if(m.getKey().equals(CountryName)) {
        result = m.getValue().toString();
        break;
      }

    }
    return result;
  }
  public String getCountry(String capitalname)
  {
    String result= "";
    for (Map.Entry m:M1.entrySet()) {
      if(m.getValue().equals(capitalname)) {
        result = m.getKey().toString();
        break;
      }

    }
    return result;
  }
  public Map copyEntry()
  {
    Map<String, String> M2= new Hashtable<>();
    for(Map.Entry e : M1.entrySet())
    {
      M2.put(e.getValue().toString(),e.getKey().toString());
    }
    return M2;
  }
  public List convertIntoList()
  {
    List<String> l1 = new ArrayList<>();
    for (String str:M1.keySet())
    {
      l1.add(str);

    }
    return l1;
  }
}
class TestAssignment6
{
  public static void main(String[] args) {
    MapAssign1 obj = new MapAssign1();
    obj.saveCountryCapital("India","Delhi");
    obj.saveCountryCapital("Japan","Tokyo");
    System.out.println(obj.getCapital("India"));
    System.out.println(obj.getCountry("Tokyo"));
    Map<String, String>result = new Hashtable<>();
    result = obj.copyEntry();

    // map.keySet() and map.values() method
    for (Map.Entry e:result.entrySet()) {
      System.out.println(e.getKey()+ "   "+ e.getValue());
    }

    // getting values into list

    List rlist = new ArrayList();
    rlist = obj.convertIntoList();
    Iterator i = rlist.iterator();
    while(i.hasNext())
    {
      System.out.println(i.next());

    }
  }
}


