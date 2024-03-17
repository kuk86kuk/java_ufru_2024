package LABORATORY_WORK_1;

public class Example13 extends Example6 {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(enteringValue("Введите 1 число").trim());
        int number2 = Integer.parseInt(enteringValue("Введите 2 число").trim());
        System.out.println(number1 + number2);
    }
}
