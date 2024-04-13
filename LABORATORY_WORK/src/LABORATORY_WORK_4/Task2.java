package LABORATORY_WORK_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы: ");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];

        System.out.println("Введите элементы матрицы: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Введите номер столбца, который нужно вывести: ");
        int columnNumber = 0;
        try {
            columnNumber = scanner.nextInt();
            if (columnNumber < 0 || columnNumber >= size) {
                throw new IllegalArgumentException("Ошибка: столбец с таким номером отсутствует.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введены некорректные данные. Повторите ввод.");
            scanner.next();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Элементы столбца " + columnNumber + ":");
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][columnNumber] + " ");
        }
    }
}