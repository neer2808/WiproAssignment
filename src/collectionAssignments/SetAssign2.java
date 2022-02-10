package collectionAssignments;

/*
Write a program to store a group of employee names into a HashSet, retrieve the elements one by one using the iterator.

 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class Employee1
{
 private int rollno;
 private String name;
 private int sal;

  public int getRollno() {
    return rollno;
  }

  public String getName() {
    return name;
  }

  public int getSal() {
    return sal;
  }

  public Employee1() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter rollno, name and salary");
    rollno =s.nextInt();
    name = s.next();
    sal = s.nextInt();
  }
}
public class SetAssign2 {
  public static void main(String[] args) {
    HashSet <Employee1> hs = new HashSet<>();
    hs.add(new Employee1());
    hs.add(new Employee1());
    hs.add(new Employee1());
    Iterator<Employee1> i =  hs.iterator();
    while(i.hasNext())
    {
      Employee1 res= i.next();
      System.out.println(res.getRollno()+ "\t"+ res.getName()+ "\t"+res.getSal());

    }
  }
}
