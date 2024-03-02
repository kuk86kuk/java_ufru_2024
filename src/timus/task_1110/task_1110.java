package timus.task_1110;
import java.util.Scanner;

/*
    Даны целые числа N, M и Y. Напишите программу, которая найдёт все целые числа
X в диапазоне [0, M – 1], такие что XN mod M = Y.
    Исходные данные
Ввод содержит единственную строку с числами N, M и Y (0 < N < 999, 1 < M < 999, 0 < Y < 999),
записанными через пробел.
    Результат
Выведите все числа X через пробел в одной строке. Числа должны идти в порядке возрастания.
Если искомых чисел нет, выведите −1.
 */

public class task_1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int y = scanner.nextInt();

        boolean found = false;
        for (int x = 0; x < m; x++) {
            if (power(x, n, m) == y) {
                System.out.print(x + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println(-1);
        }
    }

    private static int power(int x, int n, int m) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = (result * x) % m;
        }
        return result;
    }

}
