package algoExpert;

import java.util.Arrays;

public class SortedSquaredArray {
    public int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int [] answer = new int[array.length];
        for(int i = 0; i < array.length; i++){
            answer[i] = array[i]* array[i];
        }
        Arrays.sort(answer);
        for(int j = 0; j< array.length; j++){
            for (int k = j+1; k < array.length ; k++) {
                int temp = 0;
                if(answer[j]>answer[k]){
                    temp = answer[j];
                    answer[j]=answer[k];
                    answer[k]= temp;

                }
            }
        }
        return answer;
    }
}
