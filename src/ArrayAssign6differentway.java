import java.util.Arrays;

public class ArrayAssign6differentway {
  public static void main(String[] args) {
    int arr[]= {12,3,44,56,2,67};
    // sorting of array by using the Arrays.sort() method
    // which is a predefined method
    Arrays.sort(arr);
    for (int i = 0; i <arr.length ; i++) {
      System.out.println(arr[i]);
    };
  }
}
