import LABORATORY_WORK_1.task_1;

public class task_3 extends task_1 {
    public static void main(String[] args) {
        String weekday = enteringValue("Введите текущий день недели");
        String month = enteringValue("Введите месяц");
        String date = enteringValue("Введите дату");
        System.out.println("Сегодня " + weekday + "месяц " + month + "день " + date);
    }
}
