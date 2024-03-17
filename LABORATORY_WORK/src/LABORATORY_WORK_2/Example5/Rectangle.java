package LABORATORY_WORK_2.Example5;

public class Rectangle {
    private double length;
    private double width;

    // Конструктор класса
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Геттеры (методы для получения значений полей)
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Сеттеры (методы для установки значений полей)
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Метод для вычисления площади прямоугольника
    public double calculateArea() {
        return length * width;
    }

    // Метод для вычисления периметра прямоугольника
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}