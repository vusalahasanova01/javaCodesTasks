package algoExpert;

import java.util.Arrays;

public class SmallestDifference {
  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    // Write your code here.
    int min = Math.abs(arrayOne[0] - arrayTwo[0]);
    int[] result = new int[]{arrayOne[0], arrayOne[0]};
    for (int i = 0; i < arrayOne.length; i++) {
      for (int j = 0; j < arrayTwo.length; j++) {
        int answer = Math.abs(arrayOne[i] - arrayTwo[j]);
        if (min > answer) {
          min = answer;
          result[0] = arrayOne[i];
          result[1] = arrayTwo[j];
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] array1 = new int[]{-1, 5, 10, 20, 28, 3};
    int[] array2 = new int[]{26,134,135,15,17};
    int[] ints = smallestDifference(array1, array2);
    System.out.println(Arrays.toString(ints));
  }
}
