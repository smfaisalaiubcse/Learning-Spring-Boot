// The Interface Segregation Principle (ISP) states that no client should be forced to depend on methods it does not use.
// By introducing I2DShape and I3DShape interfaces, 2D and 3D shape responsibilities are separated, so classes only implement interfaces relevant to them.
// IShape acts as a common marker or base interface, promoting loose coupling and better maintainability.
// This avoids forcing 2D shapes to implement 3D methods (and vice versa), adhering to ISP.
interface IShape {

}

interface I2DShape extends IShape {
    double getArea();
}

interface I3DShape extends IShape {
    double getVolume();
}

class Circle implements I2DShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements I2DShape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}


// Square does not extend Rectangle to avoid violating the Liskov Substitution Principle (LSP).
// Inheritance would allow a Square to be used wherever a Rectangle is expected, but a Square
// requires both sides to be equal, while a Rectangle allows independent length and width.
// This difference in behavior can lead to incorrect or unexpected results if a Square is
// substituted for a Rectangle, thus breaking LSP.
class Square implements I2DShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

class Cube implements I3DShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }
}