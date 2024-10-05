package LABORATORY_WORK_5;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example14 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 25, 30, 47, 55, 60, 72, 88, 99, 105);
        int threshold = 50;
        List<Integer> lesserNumbers = filterLesserNumbers(numbers, threshold);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Числа меньше " + threshold + ": " + lesserNumbers);
    }

    public static List<Integer> filterLesserNumbers(List<Integer> numbers, int threshold) {
        return numbers.stream()
                .filter(n -> n < threshold)
                .collect(Collectors.toList());
    }
}