package algoExpert;

public class SelectionSort {
  public static int[] selectionSort(int[] array) {
    // Write your code here.
    //int [] arr = new int[array.length];
    int max = 0;
    for (int i = 0; i < array.length ; i++) {
      for(int j = i+1 ; j < array.length; j++) {
        if (array[i]>array[j]){
          max = array[i];
          array[i]=array[j];
          array[j] = max;
      }

      }

    }
    return array;
  }

  public static void main(String[] args) {
    int [] arr = new int[]{8,5,2,9,5,6,3};
    int[] answer = selectionSort(arr);
    for(int i=0; i<answer.length-1;i++){
      System.out.println(answer[i]);
    }
  }
}
