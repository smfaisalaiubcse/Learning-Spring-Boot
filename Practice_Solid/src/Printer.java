// The IPrinter interface is used here to follow the Dependency Inversion Principle (DIP) from SOLID.
// DIP states that high-level modules should not depend on low-level modules, but both should depend on abstractions.
// By depending on the IPrinter interface (an abstraction), code becomes more flexible, testable, and maintainable.

interface IPrinter {
    void Print(IShape shape);
}

class Printer implements IPrinter {
    public void Print(IShape shape) {
        System.out.println(shape);
    }
}