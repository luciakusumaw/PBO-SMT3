package Tasks.ImplementationTheory;

public class Player extends ClubMember {
    private String position;

    public Player() {
        super();
        this.position = "";
    }

    
    public Player(String name, int age, String clubName, double baseSalary, String position) {
        super(name, age, clubName, baseSalary); 
        this.position = position;
    }

    public String getPosition() { 
        return position; 
    }

    public void setPosition(String position) { 
        this.position = position; 
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Player Info ---");
        super.displayInfo();
        System.out.println("Position         : " + position);
    }
}