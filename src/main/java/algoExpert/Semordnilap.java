package algoExpert;

import java.util.ArrayList;

public class Semordnilap {
  public static  ArrayList<ArrayList<String>> semordnilap(String[] words) {
    // Write your code here.
    ArrayList<ArrayList<String>> palindrome = new ArrayList<ArrayList<String>>();
    for (int i = 0; i < words.length; i++) {
      StringBuilder input1 = new StringBuilder(words[i]);
      input1.reverse();
      String answer = input1.toString();
      for (int j = i + 1; j < words.length; j++) {
        if (answer.contains(words[j]) && answer.length()== words[j].length()) {
          ArrayList<String> newList = new ArrayList<>();
          newList.add(words[i]);
          newList.add(words[j]);
          palindrome.add(newList);

        }

       // newList.removeAll(newList);
      }
    }
    return palindrome;
  }

  public static void main(String[] args) {
    String [] words =new String[]{"diaper","abc","test","cba","repaid"};
    ArrayList<ArrayList<String>> semordnilap = semordnilap(words);
    System.out.println(semordnilap.toString());
  }
}

