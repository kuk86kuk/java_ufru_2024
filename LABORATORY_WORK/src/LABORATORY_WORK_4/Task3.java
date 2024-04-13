package LABORATORY_WORK_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        byte[] array = new byte[size];
        int sum = 0;

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            try {
                array[i] = scanner.nextByte();
                sum += array[i];
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введены некорректные данные. Повторите ввод.");
                scanner.next();
                i--;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введенное значение за пределами диапазона типа byte.");
                scanner.next();
                i--;
            }
        }

        System.out.println("Сумма элементов массива: " + sum);
    }
}