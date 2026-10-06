package Tasks.ImplementationTheory;

public class Coach extends ClubMember {
    private String licenseId;

    public Coach() {
        super();
        this.licenseId = "";
    }
    public Coach(String name, int age, String clubName, double baseSalary, String licenseId) {
        super(name, age, clubName, baseSalary);
        this.licenseId = licenseId;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    @Override
    public void displayInfo() {
        System.out.println("---- Coach Info ----");
        super.displayInfo();
        System.out.println("License ID       : " + licenseId);
    }
}