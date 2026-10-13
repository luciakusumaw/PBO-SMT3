public class Customer {
    private String name;
    private int basePoints;

    public Customer(String name, int basePoints) {
        this.name = name;
        this.basePoints = basePoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBasePoints() {
        return basePoints;
    }

    public void setBasePoints(int basePoints) {
        this.basePoints = basePoints;
    }

    public void calculatePoints() {
        System.out.println("Base Points: " + basePoints);
    }

    public void calculatePoints(int bonusPoints) {
        int total = basePoints + bonusPoints;
        System.out.println("Total Points with Bonus: " + total);
    }

    public void displayInfo() {
        System.out.println("Customer Name: " + name + " | Points: " + basePoints);
    }

    public String getServiceBenefit() {
        return "Standard Service Access";
    }
}