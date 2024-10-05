package LABORATORY_WORK_3;
import java.util.Scanner;



public class Example3 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = createArray();

        System.out.println("Введите элементы массива:");
        inputArray(array, 0);

        System.out.println("Массив:");
        outputArray(array, 0);
    }
    private static int[] createArray() {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        return new int[size];
    }
    private static void inputArray(int[] array, int index) {
        if (index < array.length) {
            System.out.print("Элемент " + index + ": ");
            array[index] = scanner.nextInt();
            inputArray(array, index + 1);
        }
    }

    private static void outputArray(int[] array, int index) {
        if (index < array.length) {
            System.out.println("Элемент " + index + ": " + array[index]);
            outputArray(array, index + 1);
        }
    }
}
