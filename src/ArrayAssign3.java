import java.util.Scanner;

public class ArrayAssign3 {
  public static void main(String[] args) {
    int arr[] = {4,56,7,32,9};
    int sval= new Scanner(System.in).nextInt();
    for (int i = 0; i <arr.length ; i++) {
      if(arr[i] == sval) {
        System.out.println(i);
        return;
      }
    }
    System.out.println("-1");
  }
}
