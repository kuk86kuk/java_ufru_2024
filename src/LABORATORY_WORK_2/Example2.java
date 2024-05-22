import java.util.Random;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода пользователя из консоли
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int cols = scanner.nextInt();

        // Создаем двумерный массив заданного размера
        int[][] nums = new int[rows][cols];
        Random random = new Random();

        // Заполняем массив числами
        for (int i = 0; i < rows; i++) {
            // Если строка четная, заполняем слева направо
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    nums[i][j] = random.nextInt(200);
                }
            } else {
                // Если строка нечетная, заполняем справа налево
                for (int j = cols - 1; j >= 0; j--) {
                    nums[i][j] = random.nextInt(200);
                }
            }
        }

        // Выводим массив на экран
        System.out.println("\nИтоговый массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%d\t", nums[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}