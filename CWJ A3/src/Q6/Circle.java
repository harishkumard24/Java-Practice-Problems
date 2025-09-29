package Q6;

public class Circle extends Shape {
    private double radius;

    public Circle(String shade, double radius) {
        super(shade);
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + getShade() +
                ", area=" + area() + ", perimeter=" + perimeter() + "]";
    }
}
