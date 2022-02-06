  package WrapperAssignments;
  class Employee implements  Cloneable
  {
    int id;
    String name;

    public Employee(int id, String name) {
      this.id = id;
      this.name = name;
    }

    Employee cloneTest() throws CloneNotSupportedException {
     Employee e= (Employee)super.clone();
     return e;
    }

    @Override
    public String toString() {
      return "Employee{" +
              "id=" + id +
              ", name='" + name + '\'' +
              '}';
    }
  }
  public class WrapperAssign4 {
    public static void main(String[] args) throws CloneNotSupportedException {
      Employee obj1 = new Employee(12, "neer");
      Employee obj2;
      obj2 = obj1.cloneTest();
      System.out.println(obj2.id + " " + obj2.name);
      System.out.println(obj1.id + " " + obj2.name);
      obj1.id = 90;
      System.out.println(obj2.id + " " + obj2.name);
      System.out.println(obj1.id + " " + obj2.name);
      System.out.println(obj1);
      System.out.println(obj2);
    }




    }

