package LABORATORY_WORK_2.Example8;

public class Example8 {
    public static void main(String[] args) {
        Dog dog = new Dog("Рекс", 3, "Лабрадор");
        Cat cat = new Cat("Васька", 2, true);
        Bird bird = new Bird("Твитти", 1, true);

        dog.makeSound();
        System.out.println("Имя собаки: " + dog.getName());
        System.out.println("Возраст собаки: " + dog.getAge());
        System.out.println("Порода собаки: " + dog.getBreed());

        cat.makeSound();
        System.out.println("Имя кошки: " + cat.getName());
        System.out.println("Возраст кошки: " + cat.getAge());
        System.out.println("Кошка домашняя? " + (cat.isIndoor() ? "Да" : "Нет"));

        bird.makeSound();
        System.out.println("Имя птицы: " + bird.getName());
        System.out.println("Возраст птицы: " + bird.getAge());
        System.out.println("Птица умеет летать? " + (bird.canFly() ? "Да" : "Нет"));

    }
}
