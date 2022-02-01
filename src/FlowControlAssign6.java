public class FlowControlAssign6 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[1]);
    if(args[0].equals("Female")&& age>=1 && age<=58)
    {
      System.out.println("8.2%");
    }
    else if(args[0].equals("Male")&& age>=1 && age<=58)
    {
      System.out.println("8.4%");
    }
    else if(args[0].equals("Female")&& age>=59 && age<=100)
    {
      System.out.println("9.2%");
    }
    else if(args[0].equals("Male")&& age>=59 && age<=100)
      System.out.println("10.5");
  }
}
