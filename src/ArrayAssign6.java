import java.util.Scanner;

public class ArrayAssign6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int temp=0;
    int size = s.nextInt();
    int arr[] = new int[size];
    for (int i = 0; i <arr.length ; i++) {
      arr[i] = s.nextInt();
    }
    for (int i = 0; i <arr.length ; i++) {
      for (int j = i+1; j <arr.length; j++) {
          if(arr[i]>arr[j])
          {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          }
      }
    }
    // loop to print the values of the array
    for (int i = 0; i <arr.length ; i++) {
      System.out.println(arr[i]);
    }
  }
}
