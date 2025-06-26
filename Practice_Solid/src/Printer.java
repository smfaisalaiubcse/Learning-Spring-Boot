interface IPrinter {
    void Print(IShape shape);
}

class Printer implements IPrinter {
    public void Print(IShape shape) {
        System.out.println(shape);
    }
}