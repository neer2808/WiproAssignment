package collectionAssignments;

import com.sun.codemodel.internal.JForEach;

import java.util.ArrayList;

/*
1) create an application for employee managemment with the foloowing classes:

a) create an Employee class with following attributes and behaviour
  1) int empId
  2) String empName
  3) String email
  4) String gender
  5) float salary
  6) void GetEmployeeDetails() -> print employee Details

b) Create one more class EmployeeDB with the following attributes and behaviour

I) ArrayList list;
II) boolean addEmployee(Employee e) -> adds the employee object to the collection
III) boolean deleteEmployee(int empId)-> delete the employee object from the collection with the given empid
IV) String showPaySlip( int empId) -> returns the payslip of the employee with the given empId

 provide implementation for all the methods and test your program
 */
class Employee
{
  int empId;
  String empName;
  String email;
  String gender;
  float salary;

  public Employee(int empId, String empName, String email, String gender, float salary) {
    this.empId = empId;
    this.empName = empName;
    this.email = email;
    this.gender = gender;
    this.salary = salary;
  }

  void GetEmployeeDetails()
  {
    System.out.println("Empid = "+ empId);
    System.out.println("Empname = "+ empName);
    System.out.println("Email = " + email);
    System.out.println("Gender = " + gender);
    System.out.println( "Salary = " + salary);
  }
}
class EmployeeDB {
  ArrayList<Employee> list;



  public EmployeeDB() {
    list = new ArrayList<>();
  }
  public void displayrecord()
  {
    for (Employee obj:list) {
      obj.GetEmployeeDetails();

    }
  }

  boolean addEmployee(Employee newemp) {
    list.add(newemp);
    return true;
  }

  public boolean isEmpty() {
    return list.size() == 0;
  }

  boolean deleteEmployee(int empid) {
    if (isEmpty()) {
      System.out.println("list is empty ");
      return false;
    } else {
      for (Employee e : list) {
        if (e.empId == empid) {
          list.remove(e);
          return true;
        }
      }
      return false;
    }
  }

  String showPlayslip(int empid) {
   String str ="";
    if (isEmpty()) {
      str = "list is empty ";

    } else {
      for (Employee e : list) {
        if (e.empId == empid) {
        str =   "the paySlip of the Empid : " + e.empId + "  Salary is : "+ e.salary;
        return str;
        }
        else
        {
          str = "no record found";
        }

      }

    }
return str;
  }
}
public class ListAssign2 {
  public static void main(String[] args) {
    EmployeeDB obj = new EmployeeDB();
    obj.addEmployee(new Employee(1,"aa","aa@gmail.com","M",50000));
    obj.addEmployee(new Employee(2,"bb","bb@gmail.com","M",60000));
    obj.addEmployee(new Employee(3,"cc","aa@gmail.com","F",70000));
    //obj.displayrecord();
    System.out.println(obj.showPlayslip(2));
    obj.deleteEmployee(2);
    obj.displayrecord();
  }

}
