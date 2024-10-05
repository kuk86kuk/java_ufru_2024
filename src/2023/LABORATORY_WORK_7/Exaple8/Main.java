package LABORATORY_WORK_7.Exaple8;



import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Создание объекта Person
        Person person = new Person("Alice", 30);

        // Путь к файлу
        String filePath = "person.json";

        // Сериализация объекта в файл
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(person);
            System.out.println("Объект сериализован и сохранен в файл: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Десериализация объекта из файла
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Person restoredPerson = (Person) ois.readObject();
            System.out.println("Объект десериализован из файла:");
            System.out.println(restoredPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}