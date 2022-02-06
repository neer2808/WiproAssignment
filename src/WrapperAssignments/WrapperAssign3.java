package WrapperAssignments;

import java.util.Scanner;

public class WrapperAssign3 {
  public static void main(String[] args) {
    int num = new Scanner(System.in).nextInt();
    if(num>=1 && num<=255)
    {
      int res = Integer.parseInt(Integer.toBinaryString(num));
      String result = String.format("%08d",res);
      System.out.println(result);

    }

  }
}
