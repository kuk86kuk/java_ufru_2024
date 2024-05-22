package LABORATORY_WORK_2.Example5;

public class Example5 {
    public static void main(String[] args) {
        // Создаем объект класса Rectangle
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Вычисляем и выводим площадь и периметр прямоугольника
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        // Используем сеттеры для изменения размеров прямоугольника
        rectangle.setLength(6.0);
        rectangle.setWidth(4.0);

        // Выводим обновленные значения площади и периметра
        System.out.println("Updated Area: " + rectangle.calculateArea());
        System.out.println("Updated Perimeter: " + rectangle.calculatePerimeter());
    }
}
