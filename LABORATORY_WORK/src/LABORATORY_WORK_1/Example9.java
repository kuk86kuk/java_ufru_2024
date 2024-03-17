package LABORATORY_WORK_1;
import java.util.HashMap;
import java.util.Map;


public class Example9 extends Example6 {
    public static void main(String[] args) {
        String month = enteringValue("Введите месяц").trim();
        int date = Integer.parseInt(enteringValue("Введите количество дней в месяце").trim());
        checkDaysInMonth(month, date);
    }
    public static void checkDaysInMonth(String month, int date) {
        Map<String, Integer> monthDays = new HashMap<>();
        monthDays.put("Январь", 31);
        monthDays.put("Февраль", 28);
        monthDays.put("Март", 31);
        monthDays.put("Апрель", 30);
        monthDays.put("Май", 31);
        monthDays.put("Июнь", 30);
        monthDays.put("Июль", 31);
        monthDays.put("Август", 31);
        monthDays.put("Сентябрь", 30);
        monthDays.put("Октябрь", 31);
        monthDays.put("Ноябрь", 30);
        monthDays.put("Декабрь", 31);

        if (monthDays.containsKey(month) && monthDays.get(month) == date) {
            System.out.println("Количество дней в "+ month + " соответствует");
        } else {
            System.out.println("Количество дней в "+ month + " НЕ соответствует");
        }

    }
}
