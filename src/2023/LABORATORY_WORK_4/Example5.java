package LABORATORY_WORK_4;

public class Example5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (RuntimeException /* NullPointerException */ e) {
            System.out.println("1");
        }
        System.out.println("2");
    }
}
