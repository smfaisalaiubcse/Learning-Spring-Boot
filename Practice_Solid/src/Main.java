public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        CalculateCircleArea(circle);
        new Printer().Print(circle);
        CalculateRectangleArea(rectangle);
    }

    private static void CalculateCircleArea(Circle circle) {
        System.out.println("Circle Area: " + circle.getArea());
    }

    private static void CalculateRectangleArea(Rectangle rectangle) {
        System.out.println("Rectangle Area: " + rectangle.getArea());
    }
}