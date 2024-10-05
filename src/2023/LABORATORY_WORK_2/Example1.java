package LABORATORY_WORK_2;

import java.util.Random;
import java.util.Scanner;



public class Example1 {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода пользователя из консоли
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        System.out.println("Размер массива равен: " + size);

        // Создаем массив заданного размера
        int[] nums = new int[size];
        // Создаем объект Random для генерации случайных чисел
        Random random = new Random();

        System.out.println("Заполняем массив случайными числами:");
        // Заполняем массив случайными числами от 0 до 199
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            System.out.printf("Элемент массива [%d] = %d%n", i, nums[i]);
        }

        System.out.println("\nНачинается поиск минимума...");
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        System.out.println("Поиск минимума закончен.\nМинимальное значение = " + min);
        System.out.println("\nПоиск всех индексов элементов с минимальным значением:");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == min) {
                System.out.printf("Индекс элемента с минимальным значением: %d%n", i);
            }
        }

        scanner.close();
    }
}