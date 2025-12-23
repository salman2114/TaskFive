public class Book {
    // Attributes [cite: 14-17]
    private String title;
    private String author;
    private double price;
    private int quantity;

    // Constructors [cite: 14]
    public Book() {
        // Default constructor
    }

    public Book(String title, String author, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters [cite: 14]
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    // Method to display info [cite: 14]
    public void displayInfo() {
        System.out.println("Book: " + title + " | Author: " + author +
                " | Price: $" + price + " | Stock: " + quantity);
    }
}