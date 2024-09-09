public class Product {
    private int number;
    private String name; 
    private int quantity;
    private double price;

    // Parameterized constructor
    public Product(int number, String name, int quantity, double price) {
        this.number = number;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Default constructor (if needed)
    public Product() {
        this(0, "", 0, 0.0); // 

    // Getter for number
    public int getNumber() {
        return this.number;
    }

    // Setter for number
    public void setNumber(int number) {
        this.number = number;
    }

    // Getter for name
    public String getName() {
        return this.name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for quantity
    public int getQuantity() {
        return this.quantity;
    }

    // Setter for quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Getter for price
    public double getPrice() {
        return this.price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }
}
}