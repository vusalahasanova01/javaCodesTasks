package solidPrinciples.SingleResponsibility;

import java.util.List;

public class SingleResponsibility {


  public static void main(String[] args) {
    List<Integer> nums = AcceptValue.givenList();
    AcceptValue.sortList(nums);
    AcceptValue.showList(nums);


  }
}
