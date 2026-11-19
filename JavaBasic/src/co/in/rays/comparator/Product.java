
package co.in.rays.comparator;

public class Product {

    public int price;
    public String category;
    public String productName;

    public Product(int price, String category, String productName) {

        this.price = price;
        this.category = category;
        this.productName = productName;
    }

    @Override
    public String toString() {

        return "Price: " + price + ", Category: " + category
                + ", Product Name: " + productName;
    }
}
