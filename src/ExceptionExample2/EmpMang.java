package ExceptionExample2;

public class EmpMang {

  Employee[] employees = new Employee[3];
  static int ecount=0;
  public boolean addEmp(Employee e)
  {
    boolean sts = false;
    try {

      if (e != null) {
        if(e.getSal()>=10000) {
          employees[ecount] = e;
          ecount++;
          sts = true;
        }
        else
          throw new SalException("sal is less then 10000");

      } else

        throw new NullPointerException("emp object is null ");
    }
    catch(NullPointerException | SalException e1)
    {
      System.out.println(e1.getMessage());
    }
    return sts;
  }
}
class TestEmp
{
  public static void main(String[] args) {
      EmpMang obj = new EmpMang();
      Employee em = new Employee();
      em.setId(10);
      em.setName("neeraj");
      em.setSal(5000);
      Employee em1 = null;
      boolean sts = obj.addEmp(em);
      if(sts)
      {
        System.out.println("Employ ee details execution ");
      }
      else
      {
        System.out.println("employee details could not be added ");
      }
  }
}