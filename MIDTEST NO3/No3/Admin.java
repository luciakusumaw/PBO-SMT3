public class Admin extends User {

    public Admin(UserProfile userProfile) {
        super(userProfile);
    }

    public void update_vehicle_details(int vehicle_id) {
        System.out.println("Vehicle details updated for ID: " + vehicle_id);
    }

    public String add_vehicle() {
        System.out.println("Vehicle added.");
        return "Vehicle Added";
    }

    public void Retrieve_complain() {
        System.out.println("Complaints retrieved.");
    }

    public void verify_user() {
        System.out.println("User verified by admin.");
    }
}