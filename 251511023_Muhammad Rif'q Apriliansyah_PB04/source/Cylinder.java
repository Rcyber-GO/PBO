public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super(1.0, "red", true);
        height = 1.0;
    }

    public Cylinder(double height) {
        super(1.0, "red", true);
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius, "red", true);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        double radius = getRadius();
        return 2 * Math.PI * radius * height + 2 * super.getArea();
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString()
                + ", height=" + height;
    }
}
