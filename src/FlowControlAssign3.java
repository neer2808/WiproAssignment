public class FlowControlAssign3 {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("No Values");
    } else {
      for (int i = 0; i < args.length; i++)
      {
        if (i != args.length - 1)
        {
          System.out.print(args[i] + " , ");
        }
        else
        {
          System.out.println(args[i]);
        }
      }
    }
  }
}
