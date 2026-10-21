package TASK;

public class Main {
    public static void main(String[] args) {
        Bakery bread = new Bread("Whole Wheat Bread", 18000, "Whole Wheat");
        Bakery pastry = new Pastry("Croissant", 25000, 24);

        bread.displayInfo();
        System.out.println("Total Price (3 pcs, 10% discount): Rp " + bread.calculateTotalPrice(3, 10));
        System.out.println("Bake Time (2 batches)          : " + bread.calculateBakeTime(2) + " mins");
        System.out.println("----------------------------------------");
        pastry.displayInfo();
        System.out.println("Total Price (2 pcs, 5% discount) : Rp " + pastry.calculateTotalPrice(2, 5));
        System.out.println("Bake Time (2 batches)          : " + pastry.calculateBakeTime(2) + " mins");
    }
}