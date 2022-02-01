import java.util.Scanner;
public class FlowControlAssign12 {
  public static void main(String[] args) {
    int n = new Scanner(System.in).nextInt();
    if (n <= 1) {
      System.out.println("Not prime");
      return;
    }
    for (int i = 2; i < n; i++)
      if (n % i == 0) {
        System.out.println("Not Prime");
        return;
      }
    System.out.println("prime");
  }
}
