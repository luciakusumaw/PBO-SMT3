package Tasks.ImplementationTheory;

public class Demo {
    public static void main(String[] args) {
        Player player1 = new Player("Fernando Torres", 20, "Liverpool FC", 50000000.0, "Striker");
        Player player2 = new Player();
        Coach coach1 = new Coach("Jurgen Klopp", 48, "Liverpool FC", 120000000.0, "LFC2134");

        System.out.println("==== Before Modification ====");
        player1.displayInfo();
        player1.calculateSalary();
        player1.calculateSalary(15000000.0);

        System.out.println();
        coach1.displayInfo();
        coach1.calculateSalary();
        coach1.calculateSalary(25000000.0);

        // Modifikasi 
        player1.setAge(27);
        coach1.setClubName("Borussia Dortmund");
        coach1.setLicenseId("BD3455");

        System.out.println("\n==== After Modification ====");
        player1.displayInfo();
        System.out.println();
        coach1.displayInfo();
        System.out.println();
        player2.displayInfo();
    }
}