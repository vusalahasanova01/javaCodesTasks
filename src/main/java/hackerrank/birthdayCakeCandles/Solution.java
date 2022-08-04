package hackerrank.birthdayCakeCandles;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
 class BirthdayCakeCandles {
     /*
      * Complete the 'birthdayCakeCandles' function below.
      *
      * The function is expected to return an INTEGER.
      * The function accepts INTEGER_ARRAY candles as parameter.
      * https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true
      */

     public static int birthdayCakeCandles(List<Integer> candles) {
         // Write your code here
         int number = 0;
         int max = candles.get(0);
         for (int i = 1; i < candles.size(); i++) {
             if (max < candles.get(i)) {
                 max = candles.get(i);
             }
         }
         for (int j = 0; j < candles.size(); j++) {
             if (candles.get(j) == max) {

                 number++;
             }
         }
         return number;
     }
 }

     public class Solution {
         public static void main(String[] args) throws IOException {
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

             int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

             List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                     .map(Integer::parseInt)
                     .collect(toList());

             int result = BirthdayCakeCandles.birthdayCakeCandles(candles);

             bufferedWriter.write(String.valueOf(result));
             bufferedWriter.newLine();

             bufferedReader.close();
             bufferedWriter.close();
         }
     }
