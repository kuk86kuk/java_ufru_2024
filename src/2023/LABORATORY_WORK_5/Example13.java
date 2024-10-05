package LABORATORY_WORK_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example13 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana123", "cherry", "date!", "elderberry", "fig", "grape5", "honey", "igloo", "jungle", "213");
        List<String> letterOnlyStrings = filterLetterOnlyStrings(strings);

        System.out.println("Исходный список: " + strings);
        System.out.println("Строки, содержащие только буквы: " + letterOnlyStrings);
    }

    public static List<String> filterLetterOnlyStrings(List<String> strings) {
        return strings.stream()
                .filter(s -> s.matches("[a-zA-Z]+"))
                .collect(Collectors.toList());
    }
}