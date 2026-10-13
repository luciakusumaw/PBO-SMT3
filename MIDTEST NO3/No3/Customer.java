public class Customer extends User {
    private boolean verification_status = false;

    public Customer(UserProfile userProfile) {
        super(userProfile);
    }

    public boolean get_verification_status() {
        return verification_status;
    }

    public void apply_verification(String doc) {
        System.out.println("Verification applied using document: " + doc);
        this.verification_status = true;
    }
}