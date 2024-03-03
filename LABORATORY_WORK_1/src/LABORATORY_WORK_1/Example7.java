package LABORATORY_WORK_1;



public class Example7 extends Example6 {
    public static void main(String[] args) {
        String name = enteringValue("Введите ваше имя");
        String age = enteringValue(name + "сколько вам лет");
        System.out.println("Привет, " + name + "которому " + age + "лет");
    }
}
