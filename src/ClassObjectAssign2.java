class Calculator
{
  public static int powerInt(int num1, int num2)
  {
    return (int) Math.pow(num1,num2);
  }
  public static double powerDouble(Double num1, int num2)
  {
    return Math.pow(num1,num2);

  }
}
public class ClassObjectAssign2 {

  public static void main(String[] args) {
    System.out.println(Calculator.powerInt(12,2));
    System.out.println(Calculator.powerDouble(5.6,4));
    // print the value with
    System.out.format("%.2f", Calculator.powerDouble(5.6,4));


  }
}
