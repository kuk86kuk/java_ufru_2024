package LABORATORY_WORK_1;

public class Example14 extends Example6 {
    public static void main(String[] args) {
        int number = Integer.parseInt(enteringValue("Введите 1 число").trim());
        int n2, n3, n4;
        n2 = number - 1;
        n3 = number + 1;
        n4 = (number + n2 + n3)*(number + n2 + n3);
        System.out.println("Последовательность: ");
        System.out.println("1. Число на ед. меньше " + n2);
        System.out.println("2. Число " + number);
        System.out.println("3. Число на ед. больше " + n3);
        System.out.println("4. Число, квадрат суммы первых трех чисел " + n4);
    }
}
