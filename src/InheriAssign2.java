class Person
{
  String name;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}

class Employee extends Person
{
  private double salary;
  private int startyear;
  private String insuranceno;

  public Employee(String name, double salary, int startyear, String insuranceno) {
    super(name);
    this.salary = salary;
    this.startyear = startyear;
    this.insuranceno = insuranceno;
  }
  public double getSalary() {
    return salary;
  }

  public int getStartyear() {
    return startyear;
  }

  public String getInsuranceno() {
    return insuranceno;
  }
}
class TestEmployee
{
  public static void main(String[] args) {
    Employee obj = new Employee("neeraj",50000,2018,"1234567");
    System.out.println(obj.getName());
    System.out.println(obj.getSalary());
    System.out.println(obj.getStartyear());
    System.out.println(obj.getInsuranceno());

  }
}





public class InheriAssign2 {
}
