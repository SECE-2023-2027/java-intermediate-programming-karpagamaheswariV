import java.util.Scanner;

class Product {
    // Private variables
    private String productId;
    private String productName;
    private double price;
    private int stockQuantity;

    // Parameterized Constructor
    public Product(String productId, String productName, double price, int stockQuantity) {
        this.productId = productId;
        this.productName = productName;

        if (price < 0)
            this.price = 0.0;
        else
            this.price = price;

        if (stockQuantity < 0)
            this.stockQuantity = 0;
        else
            this.stockQuantity = stockQuantity;
    }

    // Getters
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    // Setters
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        if (price < 0)
            this.price = 0.0;
        else
            this.price = price;
    }

    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity < 0)
            this.stockQuantity = 0;
        else
            this.stockQuantity = stockQuantity;
    }

    // Method to apply discount
    public void applyDiscount(double percentage) {
        price = price - (price * percentage / 100);
    }
}

public class ProductInventory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User Input
        System.out.print("Enter Product ID: ");
        String productId = sc.nextLine();

        System.out.print("Enter Product Name: ");
        String productName = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Stock Quantity: ");
        int stockQuantity = sc.nextInt();

        System.out.print("Enter Discount Percentage: ");
        double discount = sc.nextDouble();

        // Create Product object
        Product p = new Product(productId, productName, price, stockQuantity);

        // Apply Discount
        p.applyDiscount(discount);

        // Display Output
        System.out.println("\n----- Product Details -----");
        System.out.println("Product ID: " + p.getProductId());
        System.out.println("Product Name: " + p.getProductName());
        System.out.println("Price after Discount: " + p.getPrice());
        System.out.println("Stock Quantity: " + p.getStockQuantity());

        sc.close();
    }
}