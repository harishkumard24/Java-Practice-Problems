package Q6;

public abstract class Shape {
    private String shade;

    public Shape(String shade) {
        this.shade = shade;
    }

    public String getShade() {
        return shade;
    }

    public void setShade(String shade) {
        this.shade = shade;
    }

    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return "Shape[color=" + shade + "]";
    }
}
