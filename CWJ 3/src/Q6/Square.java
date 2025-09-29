package Q6;

public class Square extends Shape {
    private double side;

    public Square(String shade, double side) {
        super(shade);
        this.side = side;
    }

    public double getSide() { return side; }
    public void setSide(double side) { this.side = side; }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square[side=" + side + ", color=" + getShade() +
                ", area=" + area() + ", perimeter=" + perimeter() + "]";
    }
}
