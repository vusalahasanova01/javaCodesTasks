package hackerrank.diagonalDifference;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
  class DiagonalDifference {
     /*
      * Complete the 'diagonalDifference' function below.
      *
      * The function is expected to return an INTEGER.
      * The function accepts 2D_INTEGER_ARRAY arr as parameter.
      */

     public static int diagonalDifference(List<List<Integer>> arr) {
         // Write your code here
         int sum1 = 0;
         int sum2 = 0;

         for (int i = 0; i < arr.size(); i++) {
             for (int j = 0; j < arr.size(); j++) {
                 if (i == j) {
                     sum1 = sum1 + arr.get(i).get(j);
                 }
                 if (i + j == arr.size() - 1) {
                     sum2 = sum2 + arr.get(i).get(j);
                 }
             }
         }
         int result = Math.abs(sum1 - sum2);
         return result;
     }
 }


     public class Solution {
         public static void main(String[] args) throws IOException {
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

             int n = Integer.parseInt(bufferedReader.readLine().trim());

             List<List<Integer>> arr = new ArrayList<>();

             IntStream.range(0, n).forEach(i -> {
                 try {
                     arr.add(
                             Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                     .map(Integer::parseInt)
                                     .collect(toList())
                     );
                 } catch (IOException ex) {
                     throw new RuntimeException(ex);
                 }
             });

             int result = DiagonalDifference.diagonalDifference(arr);

             bufferedWriter.write(String.valueOf(result));
             bufferedWriter.newLine();

             bufferedReader.close();
             bufferedWriter.close();
         }
     }

