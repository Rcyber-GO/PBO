public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(10.0);
        Cylinder c3 = new Cylinder(2.0, 10.0);
        c3.setColor("blue");

        printCylinder("c1", c1);
        printCylinder("c2", c2);
        printCylinder("c3", c3);
        System.out.println(c3);
    }

    private static void printCylinder(String name, Cylinder cylinder) {
        double radius = cylinder.getRadius();
        double baseArea = Math.PI * radius * radius;

        System.out.println(name);
        System.out.println("radius       = " + radius);
        System.out.println("color        = " + cylinder.getColor());
        System.out.println("height       = " + cylinder.getHeight());
        System.out.println("base area    = " + baseArea);
        System.out.println("surface area = " + cylinder.getArea());
        System.out.println("volume       = " + cylinder.getVolume());
        System.out.println();
    }
}
