package algoExpert;

import java.util.ArrayList;
import java.util.List;

public class MoveElementToTheEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        for (int i = 0, lengthOfArray = array.size() - 1; i < lengthOfArray; ) {
            if (array.get(i) == toMove) {
                array.remove(i);
                array.add(toMove);
                lengthOfArray--;
            } else {
                i++;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        moveElementToEnd(list,2);
        for (int i: list){
            System.out.println(i);
        }
    }
}
