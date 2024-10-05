package LABORATORY_WORK_4;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int sum = 0;
        int count = 0;

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            try {
                array[i] = scanner.nextInt();
                if (array[i] > 0) {
                    sum += array[i];
                    count++;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введены некорректные данные. Повторите ввод.");
                scanner.next();
                i--;
            }
        }

        if (count == 0) {
            System.out.println("Ошибка: положительные элементы отсутствуют.");
        } else {
            double average = (double) sum / count;
            System.out.println("Среднее значение среди положительных элементов массива: " + average);
        }
    }
}