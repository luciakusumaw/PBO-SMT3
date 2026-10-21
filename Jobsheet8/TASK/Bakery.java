package TASK;
public abstract class Bakery {
    public String name;
    public double price;

    public Bakery(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double calculateTotalPrice(int quantity, double discountPercent) {
        double total = this.price * quantity;
        return total - (total * (discountPercent / 100.0));
    }

    public void displayInfo() {
        System.out.println("Product Name : " + name);
        System.out.println("Unit Price   : Rp " + price);
    }

    public abstract int calculateBakeTime(int batches);
}