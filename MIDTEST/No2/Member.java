public class Member extends Customer {
    private String memberId;

    public Member(String name, int basePoints, String memberId) {
        super(name, basePoints);
        this.memberId = memberId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @Override
    public void displayInfo() {
        System.out.println("Member ID: " + memberId + " | Name: " + getName() + " | Points: " + getBasePoints());
    }

    @Override
    public String getServiceBenefit() {
        return "Free Shipping & 5% Discount";
    }
}