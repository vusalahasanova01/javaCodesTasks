package algoExpert;

import java.util.Arrays;

public class zeroSumSubarray {
  public static boolean zeroSumSubarray(int[] nums) {

    //-5,5,2,3,-2
    if (nums.length == 1 && nums[0] == 0) return true;
    for (int i = 0; i < nums.length; i++) {
      int sum = 0;
      for (int j = i; j < nums.length; j++) {
        sum = sum + nums[j];
        if (sum == 0) {
          return true;
        }

      }

    }
    return false;
  }

  public static void main(String[] args) {
    int[] array = new int[]{5, -5, 2, 3, -2};
    System.out.println((zeroSumSubarray(array)));
  }

}
