import java.util.Scanner;
public class FlowControlAssign14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int sum, rem;
    sum =rem =0;
    System.out.println("Enter the number");
    int num = s.nextInt();
    while(num>0)
    {
      rem = num%10;
      sum = sum +rem;
      num = num/10;
    }
    System.out.println(sum);
  }
}
