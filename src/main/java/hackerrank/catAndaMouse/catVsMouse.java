package hackerrank.catAndaMouse;
import java.io.*;
import java.util.*;
public class catVsMouse {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      String [] answer = mouse();
      for(String str:  answer){
          System.out.println(str);
      }
    }

    public static String[] mouse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity for task");
        int quantity = sc.nextInt();
        int numbers[] = new int[3];
        String name[] = new String[quantity];
        for (int i = 0; i < quantity; i++) {
            for (int j = 0; j < 3; j++) {
                numbers[j] = sc.nextInt();
            }
            if ((Math.abs(numbers[2] - numbers[1]) > (Math.abs(numbers[2] - numbers[0])))) {
                name[i] = "Cat A";
            } else if ((Math.abs(numbers[2] - numbers[1]) < (Math.abs(numbers[2] - numbers[0])))) {
                name[i] = "Cat B";
            } else name[i] = "Mouse C";
        }
        return name;
    }
}

