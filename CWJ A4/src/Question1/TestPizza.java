package Question1;

public class TestPizza {

    public static void testPizzaShapeAndPrice() {

        IShape rectangleShape = new Rectangle(4, 6);
        Pizza rectanglePizza = new Pizza(12.5, rectangleShape);


        assert (rectanglePizza.getPrice() == 12.5);
        assert (rectanglePizza.getShape().getArea() == 24);

        IShape circleShape = new Circle(3);
        Pizza circlePizza = new Pizza(15.0, circleShape);


        assert (circlePizza.getPrice() == 15.0);
        assert (Math.abs(circlePizza.getShape().getArea() - 28.27) < 0.01);

        System.out.println("Test passed!");
    }

    public static void main(String[] args) {
        testPizzaShapeAndPrice();
    }
}
