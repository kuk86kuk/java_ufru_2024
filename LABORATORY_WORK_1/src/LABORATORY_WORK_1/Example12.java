package LABORATORY_WORK_1;

public class Example12 extends Example6 {
    public static void main(String[] args) {
        String birthday = enteringValue("Введите сколько вам лет").trim();
        System.out.println("Ваш год рождения " + getBirthYearByAge(birthday));
    }
    public static int getBirthYearByAge(String birthday) {
        return 2024 - Integer.parseInt(birthday);
    }
}
