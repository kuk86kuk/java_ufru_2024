package LABORATORY_WORK_5;


import java.util.Arrays;


public class Example5 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evenNumbers = filterEvenNumbers(numbers);

        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        System.out.println("Массив с четными числами: " + Arrays.toString(evenNumbers));
    }


    private static int[] filterEvenNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(x -> x % 2 == 0)
                .toArray();
    }
}