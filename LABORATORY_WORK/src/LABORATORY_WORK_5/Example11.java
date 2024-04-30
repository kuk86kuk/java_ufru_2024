package LABORATORY_WORK_5;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example11 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("cat", "elephant", "giraffe", "kangaroo", "lion", "rhinoceros", "tiger", "whale", "zebra");
        int minLength = 7;
        List<String> longStrings = filterLongStrings(strings, minLength);

        System.out.println("Исходный список: " + strings);
        System.out.println("Строки длиной больше " + minLength + ": " + longStrings);
    }

    public static List<String> filterLongStrings(List<String> strings, int minLength) {
        return strings.stream()
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());
    }
}
