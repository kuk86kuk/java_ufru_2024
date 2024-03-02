package LABORATORY_WORK_1;

import java.util.Scanner;



public class task_1 {
    public static void main(String[] args) {
        String lastName = enteringValue("Введите вашу фамилию");
        String firstName = enteringValue("Введите ваше имя");
        String middleName = enteringValue("Введите ваше отчество");
        System.out.println("Hello, " + lastName + firstName + middleName);
    }
    public static String enteringValue(String stringName) {
        // Этот метод позволяет ввести значение с клавиатуры и возвращает его,
        // сделав первую букву заглавной.
        // Если введенное значение является числом, то преобразует число в строку,
        // делает первую букву заглавной и возвращает новую строку.
        // Если введенное значение не является числом, то делает первую букву
        // введенной строки заглавной и возвращает новую строку.
        Scanner in = new Scanner(System.in);
        System.out.print(stringName + ": ");
        if (in.hasNextInt()) {
            int numInput = in.nextInt();
            String input = Integer.toString(numInput);
            String capitalizedInput = input.substring(0, 1).toUpperCase() + input.substring(1);
            in.nextLine(); // consume remaining newline character
            return capitalizedInput + " ";
        } else {
            String input = in.nextLine();
            String capitalizedInput = input.substring(0, 1).toUpperCase() + input.substring(1);
            return capitalizedInput + " ";
        }
    }
}
