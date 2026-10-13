public class VipMember extends Member {
    private double cashbackRate;

    public VipMember(String name, int basePoints, String memberId, double cashbackRate) {
        super(name, basePoints, memberId);
        this.cashbackRate = cashbackRate;
    }

    public double getCashbackRate() {
        return cashbackRate;
    }

    public void setCashbackRate(double cashbackRate) {
        this.cashbackRate = cashbackRate;
    }

    @Override
    public void displayInfo() {
        System.out.println("VIP ID: " + getMemberId() + " | Name: " + getName() + " | Points: " + getBasePoints() + " | Cashback: " + cashbackRate + "%");
    }

    @Override
    public String getServiceBenefit() {
        return "Express Shipping, Lounge Access & " + cashbackRate + "% Cashback";
    }
}