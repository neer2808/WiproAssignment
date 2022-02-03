package ExceptionExample;
 class calc
{
  int div(int n1, int n2)
  {
    int res =0;
    try
    {
      if(n2== 0)
        throw new ArithmeticException("n2 is having zero");
        res = n1 / n2;
    }
    catch(ArithmeticException  e)
    {
      System.out.println(e.getMessage());
    }
    return res;
  }
}
public class ClassExample1 {
  public static void main(String[] args) {
    calc obj = new calc();
    System.out.println(obj.div(12,0));

  }
}
