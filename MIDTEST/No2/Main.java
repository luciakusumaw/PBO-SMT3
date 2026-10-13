public class Main {
    public static void main(String[] args) {
        Customer c = new Customer("Jennie Kim", 100);
        c.displayInfo();
        c.calculatePoints();
        c.calculatePoints(50);
        System.out.println("Benefit: " + c.getServiceBenefit());
        System.out.println("--------------------------------------------------");

        Member m = new Member("Lalisa Manoban", 250, "MEM-01");
        m.displayInfo();
        m.calculatePoints(100);
        System.out.println("Benefit: " + m.getServiceBenefit());
        System.out.println("--------------------------------------------------");

        VipMember vip = new VipMember("Roseanne Park", 500, "VIP-99", 15.0);
        vip.displayInfo();
        vip.calculatePoints();
        System.out.println("Benefit: " + vip.getServiceBenefit());
    }
}