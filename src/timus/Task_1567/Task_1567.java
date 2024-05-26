package timus.Task_1567;

import java.util.*;

public class Task_1567 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<Character, Integer> keyboard = new HashMap<>();
        keyboard.put('a', 1);
        keyboard.put('b', 2);
        keyboard.put('c', 3);
        keyboard.put('d', 1);
        keyboard.put('e', 2);
        keyboard.put('f', 3);
        keyboard.put('g', 1);
        keyboard.put('h', 2);
        keyboard.put('i', 3);
        keyboard.put('j', 1);
        keyboard.put('k', 2);
        keyboard.put('l', 3);
        keyboard.put('m', 1);
        keyboard.put('n', 2);
        keyboard.put('o', 3);
        keyboard.put('p', 1);
        keyboard.put('q', 2);
        keyboard.put('r', 3);
        keyboard.put('s', 1);
        keyboard.put('t', 2);
        keyboard.put('u', 3);
        keyboard.put('v', 1);
        keyboard.put('w', 2);
        keyboard.put('x', 3);
        keyboard.put('y', 1);
        keyboard.put('z', 2);
        keyboard.put(' ', 1);
        keyboard.put('.', 1);
        keyboard.put(',', 2);
        keyboard.put('!', 3);

        int cost = 0;
        for (int i = 0; i < input.length(); i++) {
            cost += keyboard.get(input.charAt(i));
        }

        System.out.println(cost);
    }
}