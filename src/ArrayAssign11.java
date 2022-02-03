import java.util.Scanner;

public class ArrayAssign11 {

  public static void only14(int[] arr)
  {
    int count=0;
    for(int i=0;i<arr.length;i++)
      if(arr[i]==1 || arr[i]==4)
        count+=1;
    if(count==arr.length)
      System.out.println("true");
    else
      System.out.println("false");
  }
  public static void main(String[] args) {
    int a[] = new int[5];
    Scanner s=new Scanner(System.in);
    for(int i=0;i<a.length;i++)
    {
      a[i]=s.nextInt();
    }
    only14(a);
  }
}
