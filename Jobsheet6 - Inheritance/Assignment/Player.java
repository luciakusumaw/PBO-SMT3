package Assignment;

public  class Player extends ClubMember {
    private String position;

    public Player(){
        super();
    }

    public Player(String name, int age, String clubName, String position) {
        super(name, age, clubName); 
        this.position = position;
    }
    public String getPosition() { 
        return position; 
    }
    public void setPosition(String position) { 
        this.position = position; 
    }

    public void displayInfo() {
        System.out.println("--- Player Info ---");
        System.out.println("Name     : " + getName());
        System.out.println("Age      : " + getAge());
        System.out.println("Club     : " + getClubName());
        System.out.println("Position : " + position);
    }
}
