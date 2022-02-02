import java.util.Scanner;
public class ArrayAssign2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int arr[]= new int[5];
    for (int i = 0; i <arr.length ; i++) {
      arr[i]= s.nextInt();
    }
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for(int i =0;i<arr.length;i++)
    {
      if(arr[i]< min)
        min = arr[i];
      if(arr[i]>max)
          max = arr[i];
    }
    System.out.println("minimum value = "+ min);
    System.out.println(("max value = " + max));
  }
}
