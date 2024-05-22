package LABORATORY_WORK_2.Example6;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c; // sides

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Геттеры и сеттеры для сторон треугольника

    @Override
    public double calculateArea() {
        // Формула Герона для вычисления площади треугольника
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}