package algoExpert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstDublicateValue {
  public  int firstDuplicateValue(int[] array) {
    if (array.length==0){ return -1;}
    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int i = 0; i < array.length-1 ; i++) {
      for (int j = 0; j <array.length; j++) {
        if (array[i]==array[j]&& i!=j && i<j){
          arrayList.add(j);
        }
      }
    }
    if(arrayList.size()==0){
      return -1;
    }
    else {
      Collections.sort(arrayList);
      return array[arrayList.get(0)];
    }
  }
  public int firstDuplicateValue1(int[] array) {
    List<Integer> list = new ArrayList<>();


    for(int i: array){
      if(list.contains(i))  return i;
      else  list.add(i);
    }
    return -1;
  }

  public static void main(String[] args) {
    int [] arr = new int[]{2,1,5,2,3,3,4};
    FirstDublicateValue firstDublicateValue = new FirstDublicateValue();
    int answer = firstDublicateValue.firstDuplicateValue(arr);
    System.out.println(answer);
  }
}
