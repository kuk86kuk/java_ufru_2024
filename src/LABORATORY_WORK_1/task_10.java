import LABORATORY_WORK_1.task_1;

public class task_10 extends task_1 {
    public static void main(String[] args) {
        int number_1 = Integer.parseInt(enteringValue("Введите 1 число").trim());
        int number_2 = Integer.parseInt(enteringValue("Введите 2 число").trim());
        System.out.println("Сумма чисел: " + (number_1 + number_2));
        System.out.println("Разность чисел: " + (number_1 - number_2));
    }
}
