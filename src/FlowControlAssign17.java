public class FlowControlAssign17 {
  public static void main(String[] args) {
    int num =Integer.parseInt(args[0]);
    int tnum= num;
    int sum =0;
    int rem =0;
    while(num>=1)
    {
      rem = num%10;
      sum = sum*10+rem;
      num=num/10;
    }
    System.out.println(sum);
  }
}
