package Number1;

public class Stock {
    private Product product;
    private int quantity;
    private int shopNo;

    public Stock(Product product, int quantity, int shopNo) {
        this.product = product;
        this.quantity = quantity;
        this.shopNo = shopNo;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getShopNo() {
        return shopNo;
    }

    public void setShopNo(int shopNo) {
        this.shopNo = shopNo;
    }

    public void addStock() {
        this.quantity++;
    }

    public void modifyStock(String productId) {
        if (this.product != null && this.product.getProductId().equals(productId)) {
            System.out.println("Stock for product " + productId + " modified.");
        }
    }

    public int selectStockItem(String productId) {
        if (this.product != null && this.product.getProductId().equals(productId)) {
            return this.quantity;
        }
        return 0;
    }
}