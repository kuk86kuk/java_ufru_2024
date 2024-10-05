package LABORATORY_WORK_1;


public class Example8 extends Example6 {
    public static void main(String[] args) {
        String weekday = enteringValue("Введите текущий день недели");
        String month = enteringValue("Введите месяц");
        String date = enteringValue("Введите дату");
        System.out.println("Сегодня " + weekday + "месяц " + month + "день " + date);
    }
}
