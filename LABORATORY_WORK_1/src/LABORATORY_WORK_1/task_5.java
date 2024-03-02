import LABORATORY_WORK_1.task_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class task_5 extends task_1 {
    public static void main(String[] args) {
        String birthday = enteringValue("Введите год рождения (через точку)").trim();
        int years = calculateYearsCount(birthday);
        System.out.println("Вам " + years + " года");
    }

    public static int calculateYearsCount(String birthday) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate birthDate = LocalDate.parse(birthday, formatter);
        LocalDate currentDate = LocalDate.now();

        return currentDate.getYear() - birthDate.getYear();
    }
}
