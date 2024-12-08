import org.example.Circle;
import org.example.Rectangle;
import org.example.Triangle;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 8);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3, 4, 5);
        List.of(rectangle, circle, triangle).forEach(e -> System.out.println(e.calculateArea() + " " + e.calculatePerimeter()));

        System.out.println(GeometryUtils.convertSquareCentimetersToSquareMeters(circle.calculatePerimeter()));
    }
}
