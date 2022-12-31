package algoExpert;

import java.util.ArrayList;
import java.util.Stack;

public class SortStack {
  public static Stack<Integer> sortStack(Stack<Integer> stack) {
    Stack<Integer> answer = new Stack<Integer>();
    // Write your code here.
    while (!stack.isEmpty()) {
      //34,3,31,98,92,23
      int checkNumber = stack.pop();
      while (!answer.isEmpty() && answer.peek()
          < checkNumber) {
        stack.push(answer.pop());
      }
      answer.push(checkNumber);

    }
    return answer;
  }

  public static void main(String[] args) {
    Stack<Integer> input = new Stack<Integer>();
    input.add(34);
    input.add(3);
    input.add(31);
    input.add(98);
    input.add(92);
    input.add(23);
    Stack<Integer> integers = sortStack(input);
    while (!integers.empty()) {
      System.out.println(integers.pop());
    }
  }
}
