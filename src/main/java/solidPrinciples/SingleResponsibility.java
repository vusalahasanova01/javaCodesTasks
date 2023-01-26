package solidPrinciples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SingleResponsibility {


  public static void main(String[] args) {
    List<Integer> nums = AcceptValue.givenList();
    AcceptValue.sortList(nums);
    AcceptValue.showList(nums);


  }
}
