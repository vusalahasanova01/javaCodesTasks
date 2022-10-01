package algoExpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        List<Integer[]> arr = new ArrayList<>();
        for(int i = array.length-1; i > 0; i--) {
            for (int j = i-1 ; j >=0 ; j--){
                for (int k = j-1 ; k >= 0; k--){
                    if (array[i]+array[j]+array[k]==0 && i!=j && i!=k && j!=k){
                        Integer[] integers = {array[i], array[j], array[k]};
                        Arrays.sort(integers);
                        arr.add(integers);
                    }
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{12,3,1,2,-6,5,-8,6};
        List<Integer[]> array = threeNumberSum(arr,0);
       // System.out.println(array);
        for (Integer[] i: array){
            for (int j : i) {
                System.out.print(j +" ");
            }
            System.out.println();
        }


    }
}

