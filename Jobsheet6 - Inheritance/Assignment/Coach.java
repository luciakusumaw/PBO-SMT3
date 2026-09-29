package Assignment;

public class Coach extends ClubMember {
    private String licenseId;

    public Coach() {
        super();
    }

    public Coach (String name, int age, String clubName, String licenseId) {
        super(name, age, clubName);
        this.licenseId = licenseId;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId){
        this.licenseId = licenseId;
    }

    public void displayInfo(){
        System.out.println("----Coach Info----");
        System.out.println("Name             : "+getName());
        System.out.println("Age              : " + getAge());
        System.out.println("Club             : " +getClubName());
        System.out.println("License ID       : " + getLicenseId());
    }
}
