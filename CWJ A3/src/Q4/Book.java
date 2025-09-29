package Q4;

public class Book {
    private String title;
    private Author writer;
    private double cost;
    private int availableQty;
    private String publisher;

    public Book(String title, Author writer, double cost, String publisher) {
        this.title = title;
        this.writer = writer;
        this.cost = cost;
        this.publisher = publisher;
        this.availableQty = 10;
    }

    public Book(String title, Author writer, double cost, String publisher, int availableQty) {
        this.title = title;
        this.writer = writer;
        this.cost = cost;
        this.publisher = publisher;
        this.availableQty = availableQty;
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

    public int getAvailableQty() {
        return availableQty;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setAvailableQty(int availableQty) {
        this.availableQty = availableQty;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return "Book[title=" + title + ", " + writer.toString() +
                ", price=" + cost + ", qty=" + availableQty + ", publisher=" + publisher + "]";
    }
}
