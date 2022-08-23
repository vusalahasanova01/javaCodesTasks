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
        return answer;
    }
}
