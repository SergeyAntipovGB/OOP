package work.seminar7_patterns.doctest;

/**
 * Класс, представляющий круг.
 */
public class Circle implements Shape {
    private double radius;

    /**
     * Создает новый круг с заданным радиусом.
     *
     * @param radius Радиус круга.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Вычисляет площадь круга.
     *
     * @return Площадь круга.
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Геттеры и сеттеры для радиуса
    // ...
}

