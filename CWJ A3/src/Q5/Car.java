package Q5;

public class Car {
    private String brand;
    private String variant;
    private String purchaseDate;
    private String paintColor;
    private double cost;

    public Car(String brand, String variant, String purchaseDate, String paintColor, double cost) {
        this.brand = brand;
        this.variant = variant;
        this.purchaseDate = purchaseDate;
        this.paintColor = paintColor;
        this.cost = cost;
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getVariant() { return variant; }
    public void setVariant(String variant) { this.variant = variant; }

    public String getPurchaseDate() { return purchaseDate; }
    public void setPurchaseDate(String purchaseDate) { this.purchaseDate = purchaseDate; }

    public String getPaintColor() { return paintColor; }
    public void setPaintColor(String paintColor) { this.paintColor = paintColor; }

    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }

    @Override
    public String toString() {
        return "Car [Brand: " + brand +
                ", Model: " + variant +
                ", Purchase Date: " + purchaseDate +
                ", Color: " + paintColor +
                ", Price: INR " + String.format("%,.2f", cost) + "]";
    }
}
