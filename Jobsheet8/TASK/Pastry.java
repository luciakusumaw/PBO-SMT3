package TASK;

public class Pastry extends Bakery {
    public int butterLayers;

    public Pastry(String name, double price, int butterLayers) {
        super(name, price);
        this.butterLayers = butterLayers;
    }

    @Override
    public int calculateBakeTime(int batches) {
        return (batches * 20) + 10;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Butter Layers: " + butterLayers);
    }
}