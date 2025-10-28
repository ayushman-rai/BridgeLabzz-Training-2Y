public class Product {
    private static double discount = 10.0; // shared among all products
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this'
    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Display method
    void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID + ", Name: " + productName +
                    ", Price: ₹" + price + ", Quantity: " + quantity + ", Discount: " + discount + "%");
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product(201, "Laptop", 60000, 1);
        Product.updateDiscount(15.0);
        p1.displayProductDetails();
    }
}
