package hackerrank.findTheMedian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindTheMedian {
    public static int findMedian(List<Integer> arr) {
        // Write your code here
        int median;
        List<Integer> arr1 = new ArrayList<>();
        Collections.sort(arr);
        if(arr.size()%2==0){
            median = (arr.get(arr.size()/2)+arr.get((arr.size()/2)-1))/2;
        }
        else
            median = arr.get((arr.size()/2));
        return median;
    }


    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(5);
        arr.add(3);
        System.out.println(findMedian(arr));

    }

}
