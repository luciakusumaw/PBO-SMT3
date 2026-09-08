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

    public void borrow(int borrowAmount){
        if (loanAmount+borrowAmount>loanLimit){
            System.out.println("Sorry the loan amount exceeds the limit.");
        } else{
            loanAmount += borrowAmount;
        }
    }

    public void installment(int installmentAmount){
        if (installmentAmount > loanAmount){
            System.out.println("Installment exceeds the current loan amount");
        }else if(installmentAmount<(0.10*loanAmount)){
            System.out.println("Sorry, the installment must be 10% of the loan amount");
        }else{
            loanAmount -= installmentAmount;
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
