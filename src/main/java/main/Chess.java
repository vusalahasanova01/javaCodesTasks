package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Chess {
    public static List<String> chessGame(String selectedCordinate) {
        List<String> answer = new ArrayList<>();  //e4

        for (int i = 1; i <= 8; i++) {
            if (!String.valueOf(selectedCordinate.charAt(1)).equals(String.valueOf(i))) {
                answer.add(selectedCordinate.charAt(0) + String.valueOf(i));
            }
        }
        for (char letter = 'a'; letter <= 'h'; letter++) {
            if (selectedCordinate.charAt(0) != letter) {
                answer.add(letter + String.valueOf(selectedCordinate.charAt(1)));
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(chessGame("e4"));
    }
}
