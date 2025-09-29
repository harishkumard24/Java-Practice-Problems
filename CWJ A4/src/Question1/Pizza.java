package Question1;

public class Pizza  {
    private double price;
    private IShape shape;


    public Pizza(double price, IShape shape) {
        this.price = price;
        this.shape = shape;
    }


    public double getPrice() {
        return price;
    }


    public IShape getShape() {
        return shape;
    }
}
