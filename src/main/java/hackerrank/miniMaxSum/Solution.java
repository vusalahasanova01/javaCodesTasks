package hackerrank.miniMaxSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class MiniMaxSum {

    /* Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     * https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true
     */

    public static void miniMaxSum(List<Integer> arr) {
        int sumOfMin = 0;
        int sumOfMax = 0;

        int max = arr.get(0);
        int min = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (max < arr.get(i)) {
                max = arr.get(i);
            }
            if (min > arr.get(i)) {
                min = arr.get(i);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != max) {
                sumOfMin = sumOfMin + arr.get(i);
            }
            if (arr.get(i) != min) {
                sumOfMax = sumOfMax + arr.get(i);
            }
        }


        System.out.println(sumOfMin + " " + sumOfMax);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        MiniMaxSum.miniMaxSum(arr);

        bufferedReader.close();
    }
}





