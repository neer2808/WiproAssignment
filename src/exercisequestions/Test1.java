package exercisequestions;

public class Test1 {
  public static void main(String[] args) {
    String x = args[0];
    int i = x.length();
    char ch[] = new char[i];
    for(int j =0;j<i;j++)
    {
      ch[j] = x.charAt(i-j-1);
    }
    String s= new String(ch);
    System.out.println(s);

  }
}
