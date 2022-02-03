public class ArrayAssign10 {
  public static int[] evenodd(int[] nums) {
    // if there are only two elements in the array then return the array
    if (nums.length < 2) return nums;
    // result array with same length
    int[] result = new int[nums.length];
    // here use two variables using which i am arranging even values at left side and
    // odd values at right side
    // even values will arrange from index o and odd values will arrange from
    int even = 0;
    int odd = nums.length - 1;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 == 0)
        result[even++] = nums[i];
      else
        result[odd--] = nums[i];
    }
    return result;
  }
  public static void main(String[] args) {
    int arr[] = {10,30,23,5,6};
   int rarr[]=  evenodd(arr);
    for (int i = 0; i <rarr.length ; i++) {
      System.out.println(rarr[i]);
    }
  }
}
