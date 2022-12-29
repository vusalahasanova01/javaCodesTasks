package algoExpert;

import java.util.Arrays;

public class ArrayofProducts {
  public static int[] arrayOfProducts(int[] array) {
    // Write your code here.
    int[] products = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      int product = 1;
      for (int j = 0; j < array.length; j++) {
        if (i != j) {
          product = product * array[j];

        }
      }
      products[i] = product;
    }
    return products;

  }

  public static void main(String[] args) {
    int [] array = new int[]{5,1,4,2};
    System.out.println(Arrays.toString(arrayOfProducts( array)));
  }
}
