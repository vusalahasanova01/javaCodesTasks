package algoExpert;

import java.util.List;

public class ValidateSubsequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int iArray = 0;
        int jSequence = 0;
        while(iArray < array.size() && jSequence < sequence.size()){
            if(array.get(iArray)==sequence.get(jSequence)){
                jSequence++;
            }
            iArray++;
        }
        return jSequence == sequence.size();
    }
}
