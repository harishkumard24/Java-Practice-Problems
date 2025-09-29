package Q6;

public class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(String shade, double length, double breadth) {
        super(shade);
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }

    public double getBreadth() { return breadth; }
    public void setBreadth(double breadth) { this.breadth = breadth; }

    @Override
    public double area() {
        return length * breadth;
    }

    @Override
    public double perimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ", breadth=" + breadth + ", color=" + getShade() +
                ", area=" + area() + ", perimeter=" + perimeter() + "]";
    }
}
