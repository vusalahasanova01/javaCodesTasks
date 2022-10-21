package streams;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("book", "flowers", "moon", "java");
    words.forEach(System.out::println);
    words.stream().forEach(s -> System.out.println(s));
    words.forEach(s -> System.out.println(s));


    List<String> upperWords = words.stream()
        .map(s -> s.toUpperCase())
        .collect(Collectors.toList());
    System.out.println(upperWords);


    words.stream()
        .map((s) -> s + "s")
        .forEach(System.out::println);

    String result = words.stream()
        .filter(s -> s.equals("book")).findAny()
        .orElse("Not found");
    System.out.println(result);

    String result2 = words.stream()
        .filter(s -> s.equals("book2")).findAny()
        .orElseThrow(()-> new IllegalArgumentException("not found"));
    System.out.println(result2);
  }


  private static Optional<String> find(List<String> words, String word) {
    return words.stream().filter(s -> s.equals(word)).findFirst();
  }
}

