package hackerrank;
import java.util.ArrayDeque;
import java.util.Deque;

public class BracketsApp {
    public static void main(String[] args) {
        BracketsApp br = new BracketsApp();
        System.out.println(br.isValid("{{<<>()>}}"));
    }

    public boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<Character>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == '(' ||  x == '[' || x == '{' || x == '<')
            {

                deque.push(x);
                continue;
            }

            if (deque.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = deque.pop();
                    if (check == '{'||  check == '['||  check == '<')
                    return false;
                break;
                case '}':
                    check = deque.pop();
                    if (check == '('||  check == '[' || check == '<')
                    return false;
                break;

                case ']':
                    check = deque.pop();
                    if (check == '('  || check == '{' || check == '<')
                    return false;
                break;
                case '>':
                    check = deque.pop();
                    if (check == '(' || check == '{'  || check == '[')
                    return false;
                break;
            }
        }

        return (deque.isEmpty());
    }

}
