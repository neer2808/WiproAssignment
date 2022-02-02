public class ArrayAssign8 {

  public static void main(String[] args) {
    int arr[] = {10, 3,6,1,2,7,9};
    int sum=0;
    int flag = 0;
    for (int i = 0; i <arr.length ; i++) {
      if(arr[i]== 6)
      {
        flag =1;
      }
      else if(arr[i]==7) {
        flag = 0;
        i++;
      }
      if (flag != 1)
      {
        sum = sum+arr[i];
      }

    }
    System.out.println(" the sum is = " +sum);
  }
}
