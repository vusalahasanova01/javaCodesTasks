package algoExpert;

public class Palindromecheck {
  /* https://www.algoexpert.io/questions/palindrome-check */
  public static boolean isPalindrome(String str) {
    StringBuilder input1 = new StringBuilder(str);
    input1.reverse();
    String answer = input1.toString();
    return answer.equals(str);
  }

  public static void main(String[] args) {
    String str = "abcdcba";
    boolean answer = isPalindrome(str);
    System.out.println(answer);
  }
}
