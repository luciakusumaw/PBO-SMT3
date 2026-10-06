package Tasks.ImplementationTheory;

public class ClubMember {
    private String name;
    private int age;
    private String clubName;
    private final double baseSalary; 

   
    public ClubMember() {
        this.name = "";
        this.age = 0;
        this.clubName = "";
        this.baseSalary = 0.0;
    }

    public ClubMember(String name, int age, String clubName, double baseSalary) {
        this.name = name;
        this.age = age;
        this.clubName = clubName;
        this.baseSalary = baseSalary;
    }

    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }

    public int getAge() { 
        return age; 
    }
    public void setAge(int age) { 
        this.age = age; 
    }

    public String getClubName() { 
        return clubName; 
    }
    public void setClubName(String clubName) { 
        this.clubName = clubName; 
    }

    public double getBaseSalary() {
        return baseSalary;
    }


    public void displayInfo() {
        System.out.println("Name             : " + name);
        System.out.println("Age              : " + age);
        System.out.println("Club             : " + clubName);
        System.out.printf("Base Salary      : Rp %.2f\n", baseSalary);
    }

  
    public void calculateSalary() {
        System.out.printf("Total Salary       : Rp %.2f\n", baseSalary);
    }

  
    public void calculateSalary(double bonus) {
        double total = baseSalary + bonus;
        System.out.printf("Total Salary+Bonus : Rp %.2f\n", total);
    }
}