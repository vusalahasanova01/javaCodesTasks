package algoExpert;

import java.util.Arrays;

public class findThreeLargestNumber {
  public static int[] findThreeLargestNumbers(int[] array) {
    int[] result = new int[3];
    int i, first, second, third;
    if (array.length < 3) {
      return null;
    }

    third = first = second = Integer.MIN_VALUE;
    for (i = 0; i < array.length; i++) {

      if (array[i] > first) {
        third = second;
        second = first;
        first = array[i];
      }
      else if (array[i] > second) {
        third = second;
        second = array[i];
      } else if (array[i] > third)
        third = array[i];
    }


    result[0] = first;
    result[1] = second;
    result[2] = third;
    return result;
  }

  public static void main(String[] args) {
    int[] arr = new int[]{141, 1, 17, -17, -7, -27, 18, 541, 8, 8, 7};
    System.out.println(Arrays.toString(findThreeLargestNumbers(arr)));
  }
}
