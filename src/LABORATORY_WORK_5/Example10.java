package LABORATORY_WORK_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Example10  {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(15, 21, 32, 48, 55, 66, 77, 84, 99, 105);
        int divisor = 7;
        List<Integer> divisibleNumbers = filterDivisibleNumbers(numbers, divisor);

        System.out.println("Исходный список чисел: " + numbers);
        System.out.println("Числа, делящиеся на " + divisor + " без остатка: " + divisibleNumbers);
    }

    public static List<Integer> filterDivisibleNumbers(List<Integer> numbers, int divisor) {
        return numbers.stream()
                .filter(n -> n % divisor == 0)
                .collect(Collectors.toList());
    }
}