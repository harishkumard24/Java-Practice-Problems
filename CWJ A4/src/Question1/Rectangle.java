package Question1;

public class Rectangle implements IShape {
    private double height;
    private double width;


    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }


    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
