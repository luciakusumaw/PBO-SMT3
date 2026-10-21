package TASK;

public class Bread extends Bakery {
    public String flour;

    public Bread(String name, double price, String flourType) {
        super(name, price);
        this.flour = flourType;
    }

    @Override
    public int calculateBakeTime(int batches) {
        return batches * 30;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Flour Type   : " + flour);
    }
}