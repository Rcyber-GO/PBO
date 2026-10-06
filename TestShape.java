public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape("black", false);
        Circle circle = new Circle(2.0, "blue", true);
        Rectangle rectangle = new Rectangle(3.0, 4.0, "yellow", true);
        Square square = new Square(5.0, "green", true);

        System.out.println(shape);
        System.out.println(circle + " area=" + circle.getArea()
                + " perimeter=" + circle.getPerimeter());
        System.out.println(rectangle + " area=" + rectangle.getArea()
                + " perimeter=" + rectangle.getPerimeter());
        System.out.println(square + " area=" + square.getArea()
                + " perimeter=" + square.getPerimeter());

        square.setWidth(8.0);
        System.out.println("after setWidth(8.0): width=" + square.getWidth()
                + ", length=" + square.getLength());
        square.setLength(3.0);
        System.out.println("after setLength(3.0): width=" + square.getWidth()
                + ", length=" + square.getLength()
                + ", area=" + square.getArea()
                + ", perimeter=" + square.getPerimeter());
    }
}