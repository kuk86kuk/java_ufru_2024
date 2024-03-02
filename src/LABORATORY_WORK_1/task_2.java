package LABORATORY_WORK_1;

import LABORATORY_WORK_1.task_1;

public class task_2 extends task_1 {
    public static void main(String[] args) {
        String name = enteringValue("Введите ваше имя");
        String age = enteringValue(name + "сколько вам лет");
        System.out.println("Привет, " + name + "которому " + age + "лет");
    }
}
