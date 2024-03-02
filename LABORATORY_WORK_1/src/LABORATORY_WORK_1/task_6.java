public class task_6 extends  task_5{
    public static void main(String[] args) {
        String name = enteringValue("Введите ваше имя");
        String birthday = enteringValue("Введите год рождения (через точку)").trim();
        int years = calculateYearsCount(birthday);
        System.out.println("Привет " + name + "тебе " + years + " лет");
    }
}
