package Assignment;

public class Demo {
    public static void main(String[] args) {
        Player player1 = new Player("Fernando Torres", 20, "Liverpool FC", "Striker");
        Player player2 = new Player();
        Coach coach1 = new Coach("Jurgen Klopp", 48, "Liverpool FC", "LFC2134");
        System.out.println("====Before Modification====");
        player1.displayInfo();
        coach1.displayInfo();

        //coba modif
        player1.setAge(27);
        coach1.setClubName("Borussia Dortmund");
        coach1.setLicenseId("BD3455");

        System.out.println("====After Modification====");
        player1.displayInfo();
        coach1.displayInfo();
        player2.displayInfo();
    }
    
}
