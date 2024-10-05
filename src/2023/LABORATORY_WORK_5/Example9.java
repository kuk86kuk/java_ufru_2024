package LABORATORY_WORK_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("cat", "dog", "elephant", "lion", "tiger");
        String substring = "ele";
        List<String> filteredStrings = filterStringsContainingSubstring(strings, substring);

        System.out.println("Исходный список: " + strings);
        System.out.println("Отфильтрованные строки: " + filteredStrings);
    }

    public static List<String> filterStringsContainingSubstring(List<String> strings, String substring) {
        return strings.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }
}