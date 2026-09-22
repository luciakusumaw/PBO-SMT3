package Number1;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private String orderId;
    private float amount;
    private Date orderDate;
    private Customer customer;
    private ArrayList<Product> products;

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<Product>();
        this.orderDate = new Date();
        this.amount = 0.0f;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void createOrder() {
        this.amount = 0.0f;
        for (Product p : products) {
            this.amount += p.getProductPrice();
        }
        System.out.println("Order " + orderId + " for " + customer.getCustomerName() + " created. \nTotal amount: " + amount);
    }

    public void editOrder(String orderId) {
        this.orderId = orderId;
        System.out.println("Order ID changed to " + orderId);
    }
}