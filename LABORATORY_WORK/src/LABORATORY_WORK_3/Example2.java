package LABORATORY_WORK_3;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        String binaryNumber = recursionConvertToBinary(number);
        System.out.println("Двоичное представление: " + binaryNumber);
    }

    public static String recursionConvertToBinary(int n) {
        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        } else {
            return recursionConvertToBinary(n / 2) + (n % 2);
        }
    }
}
