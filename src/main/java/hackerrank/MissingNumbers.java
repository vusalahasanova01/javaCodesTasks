package hackerrank;

import java.util.HashSet;
import java.util.List;

public class MissingNumbers {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        HashSet <Integer> answer = new HashSet<>();
        int size;
        if(arr.size()>brr.size())  size = brr.size();
        else  size=arr.size();
        for (int i = 0; i <size; i++) {
             for(int j = 0; j<size;j++){
                 if(arr.get(i) == brr.get(j) && i<j){
                     arr.remove(i);
                     brr.remove(j);
                 }
             }

        }

           return arr;
    }

    public static void main(String[] args) {

    }
}
