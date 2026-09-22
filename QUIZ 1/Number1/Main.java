package Number1;

public class Main {
    public static void main(String[] args) {
        Customer cust = new Customer("C01", "Lucia Wardani", "Blitar", "082345673013");
        cust.addCustomer();
        cust.setAddress("Blitar");
        cust.editCustomer();

        Product prod1 = new Product("P01", 150000.0f, "Accessories");
        Product prod2 = new Product("P02", 750000.0f, "Electronics");
        prod1.addProduct();
        prod2.addProduct();

        prod1.setProductPrice(175000.0f);
        prod1.modifyProduct();
        Product found = prod1.selectProduct("P01");

        Stock stock1 = new Stock(prod1, 50, 101);
        stock1.addStock();
        stock1.modifyStock("P01");
        int sisaStok = stock1.selectStockItem("P01");

        Order order = new Order("ORD001", cust);
        order.getProducts().add(prod1);
        order.getProducts().add(prod2);
        order.createOrder();
        order.editOrder("ORD001-REV");

        System.out.println("\n--- SUMMARY ---");
        System.out.println("Customer : " + cust.getCustomerName() + " (" + cust.getAddress() + ")");
        if (found != null) {
            System.out.println("Product   : " + found.getProductId() + " (" + found.getProductType() + ")");
        }
        System.out.println("Stock     : " + sisaStok + " unit in Shop No " + stock1.getShopNo());
        System.out.println("Order  : " + order.getOrderId() + " | Total Rp" + order.getAmount());

        cust.deleteCustomer();
    }
}