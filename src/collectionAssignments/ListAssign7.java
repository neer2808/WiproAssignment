package collectionAssignments;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
/*
Write a program that will have a Vector which is capable of storing Employee objects. Use an Iterator and enumeration to list all the elements of the Vector
 */
 class Emp
        {
          int empid;
          String empname;
          int salary;

          public Emp(int empid, String empname, int salary) {
            this.empid = empid;
            this.empname = empname;
            this.salary = salary;
          }

          @Override
          public String toString() {
            return "Emp{" +
                    "empid=" + empid +
                    ", empname='" + empname + '\'' +
                    ", salary=" + salary +
                    '}';
          }
        }

public class ListAssign7 {
  public static void main(String[] args) {
    Vector<Emp> obj = new Vector<>();
    obj.add(new Emp(10,"aaa",20000));
    obj.add(new Emp(20,"bbb",30000));
    obj.add(new Emp(30,"ccc",40000));
    obj.add(new Emp(40,"ddd",50000));
    obj.add(new Emp(50,"eee",60000));
    Enumeration<Emp>  enum1 = obj.elements();
    while(enum1.hasMoreElements())
    {
      Emp tobj = enum1.nextElement();
      System.out.println(tobj.empid + "  "+ tobj.salary + "  "+ tobj.empname);
    }
    // by using iterator
/*
    Iterator i = obj.iterator();
    while(i.hasNext())
    {
     Emp tobj = (Emp) i.next();
     System.out.println(tobj.empid + "  "+ tobj.salary + "  "+ tobj.empname);
    }
*/
  }
}
