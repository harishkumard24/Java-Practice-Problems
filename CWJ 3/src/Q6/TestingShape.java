package Q6;

public class TestingShape {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red", 5.5);
        Shape s2 = new Rectangle("Blue", 4.0, 6.0);
        Shape s3 = new Square("Green", 7.0);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
