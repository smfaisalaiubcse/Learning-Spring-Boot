public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Cube cube = new Cube(5.0);
        CalculateCircleArea(circle);
        IPrinter printer = new Printer();
        printer.Print(circle);
        CalculateRectangleArea(rectangle);
        printer.Print(rectangle);
        CalculateCubeVolume(cube);
        printer.Print(cube);
    }

    private static void CalculateCircleArea(I2DShape circle) {
        System.out.println("Circle Area: " + circle.getArea());
    }

    private static void CalculateRectangleArea(I2DShape rectangle) {
        System.out.println("Rectangle Area: " + rectangle.getArea());
    }

    private static void CalculateCubeVolume(I3DShape cube) {
        System.out.println("Cube Volume: " + cube.getVolume());
    }
}