import java.util.Arrays;

public class ArrayAssign9 {
  public static void main(String[] args) {
    int arr[] = {10,34,10,10,3,10};
    int val = 10;
    // use one more array whith oreginal size array  where we will copy only the values not equal to 10
    int arr1[] = new int[arr.length];
      int j = 0;
      for (int i=0; i<arr.length; i++)
        if (arr[i] != val)
          arr1[j++] = arr[i];
    for (int i = 0; i <arr1.length ; i++) {
      System.out.println(arr1[i]);
    }
    }
    }



