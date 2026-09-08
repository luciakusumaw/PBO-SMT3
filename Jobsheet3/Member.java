public class Member {
    private String idCard;
    private String name;
    private double loanLimit;
    private double loanAmount;

    public Member(String idCard, String name, double loanLimit){
        this.idCard = idCard;
        this.name = name;
        this.loanLimit = loanLimit;
        this.loanAmount = 0;
    }

    public void borrow(int amount){
        if (loanAmount+amount>loanLimit){
            System.out.println("Sorry the loan amount exceeds the limit.");
        } else{
            loanAmount += amount;
        }
    }

    public void installment(int amount){
        if (amount > loanAmount){
            System.out.println("Installment exceeds the current loan amount");
        }else{
            loanAmount -= amount;
        }
    }

    public String getIdCardNumber() {
        return idCard;
    }

    public String getName() {
        return name;
    }

    public double getLimitLoan() {
        return loanLimit;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

}
