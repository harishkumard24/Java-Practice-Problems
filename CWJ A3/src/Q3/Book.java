package Q3;

public class Book {
    private String title;
    private Author writer;
    private double cost;
    private int stock;

    public Book(String title, Author writer, double cost) {
        this.title = title;
        this.writer = writer;
        this.cost = cost;
        this.stock = 0; // default stock is 0
    }

    public Book(String title, Author writer, double cost, int stock) {
        this.title = title;
        this.writer = writer;
        this.cost = cost;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public Author getWriter() {
        return writer;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Book[title=" + title + ", " + writer.toString() + ", price=" + cost + ", stock=" + stock + "]";
    }
}
