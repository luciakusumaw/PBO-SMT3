package Number1;

public class Customer {
    private String customerId;
    private String customerName;
    private String address;
    private String phone;

    public Customer(String customerId, String customerName, String address, String phone) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void addCustomer() {
        System.out.println("Customer " + customerName + " added.");
    }

    public void editCustomer() {
        System.out.println("Customer " + customerId + " updated.");
    }

    public void deleteCustomer() {
        System.out.println("Customer " + customerId + " deleted.");
    }
}