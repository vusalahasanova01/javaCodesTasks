package solidPrinciples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AcceptValue {
  public static final int THRESHOLD = 5;

  public static String acceptInt(String message) {
    System.out.println(message);
    Scanner sc = new Scanner(System.in);
    return sc.nextLine();

  }

  public static List<Integer> givenList() {
    List<Integer> nums = new ArrayList<>();

    System.out.println("Enter 5 valid integers in the range [0, 10]");

    while (nums.size() < THRESHOLD) {
      String s = AcceptValue.acceptInt("Enter  valid integer: ");
      if (!CheckValue.checkInteger(s)) {
        continue;
      }
      nums.add(Integer.valueOf(s));
    }
    return nums;
  }

  public static void sortList(List<Integer> list){
    Collections.sort(list);
  }

  public static void showList(List<Integer> list){
    for (int num : list)
      System.out.print(num + " ");
  }

}
