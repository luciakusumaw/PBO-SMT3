package Number1;

import java.util.ArrayList;

public class Product {
    private String productId;
    private float productPrice;
    private String productType;
    private ArrayList<Stock> stocks;

    public Product(String productId, float productPrice, String productType) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productType = productType;
        this.stocks = new ArrayList<Stock>();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public ArrayList<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(ArrayList<Stock> stocks) {
        this.stocks = stocks;
    }

    public void addProduct() {
        System.out.println("Product " + productId + " added.");
    }

    public void modifyProduct() {
        System.out.println("Product " + productId + " modified.");
    }

    public Product selectProduct(String productId) {
        if (this.productId.equals(productId)) {
            return this;
        }
        return null;
    }
}