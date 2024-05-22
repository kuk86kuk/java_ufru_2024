package LABORATORY_WORK_3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example5 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Map<Integer, String> map = fillHashMap(10);
        findStringsWithKeyGreaterThanFive(map);
        printCommaSeparatedValuesIfKeyZeroExists(map);
        int product = multiplyKeysWhereLengthGreaterThanFive(map);
        System.out.println("Произведение ключев, где длина строки > 5: " + product);
    }

    private static Map<Integer, String> fillHashMap(int size) {
        Map<Integer, String> map = new HashMap<>();
        System.out.println("Введите " + size + " пар ключ-значение:");
        for (int i = 0; i < size; i++) {
            System.out.print("Значение: ");
            String value = scanner.next();
            map.put(i, value);
        }
        return map;
    }

    private static void findStringsWithKeyGreaterThanFive(Map<Integer, String> map) {
        System.out.println("Строки, у которых ключ > 5:");
        map.entrySet().stream()
                .filter(entry -> entry.getKey() > 5)
                .forEach(entry -> System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue()));
    }

    private static void printCommaSeparatedValuesIfKeyZeroExists(Map<Integer, String> map) {
        if (map.containsKey(0)) {
            String commaSeparatedValues = String.join(", ", map.values());
            System.out.println("Строки с ключом 0: " + commaSeparatedValues);
        }
    }

    private static int multiplyKeysWhereLengthGreaterThanFive(Map<Integer, String> map) {
        return map.entrySet().stream()
                .filter(entry -> entry.getValue().length() > 5)
                .mapToInt(Map.Entry::getKey)
                .reduce(1, (a, b) -> a * b);
    }
}