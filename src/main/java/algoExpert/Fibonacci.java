package algoExpert;

public class Fibonacci {
  public static int getNthFib(int n) {
    int a = 0, b = 1, c;
    if (n == 1) return 0;
   // if (n == 2) return 1;

    for (int i = 3; i <= n; i++) {
      c = a + b;
      a = b;
      b = c;
    }

    return b;
  }

  public static void main(String[] args) {
    int answer = getNthFib(6);
    System.out.println(answer);
  }
}
