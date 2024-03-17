package LABORATORY_WORK_2.Example4;

public class Example4 {
    public static void main(String[] args) {
        // Создаем объект класса Person
        Person person = new Person("Питер", 30, "Мужина");

        // Используем геттеры для получения значений полей
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());

        // Используем сеттеры для изменения значений полей
        person.setName("Питер");
        person.setAge(30);
        person.setGender("Female");

        // Выводим обновленные значения полей
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
        System.out.println("Updated Gender: " + person.getGender());
    }
}
