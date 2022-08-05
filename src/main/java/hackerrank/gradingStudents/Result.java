package hackerrank.gradingStudents;

import java.io.*;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class GradingStudents {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     * https://www.hackerrank.com/challenges/grading/problem?isFullScreen=true
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        for(int i = 0; i < grades.size(); i++){
            if(grades.get(i)%5!=0){
                if(5-(grades.get(i)%5)<3)
                {
                    if(grades.get(i)+(5-grades.get(i)%5)>=40){
                        grades.set(i,(grades.get(i)+(5-grades.get(i)%5)));
                    }
                }
                else{
                    grades.set(i,grades.get(i));
                }
            }
        }
        return grades;
    }

}
public class Result {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = GradingStudents.gradingStudents(grades);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
