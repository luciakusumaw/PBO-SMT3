public class UserMain {
    public static void main(String[] args) {
        UserProfile userProfile = new UserProfile(101, "password123", "Budi Santoso", 20, "budi@email.com", "ktp.jpg");

        System.out.println("User ID: " + userProfile.get_User_id());
        System.out.println("Password: " + userProfile.get_password());
        System.out.println("Name: " + userProfile.get_name());
        System.out.println("Age: " + userProfile.get_age());
        System.out.println("Email: " + userProfile.get_email());
        userProfile.edit_profile();
        userProfile.show_documents();

        System.out.println("--------------------------------------------------");

        User baseUser = new User(userProfile);
        baseUser.log_in(101, 12345);
        baseUser.recover_password();
        baseUser.log_out();

        System.out.println("--------------------------------------------------");

        Customer customer = new Customer(userProfile);
        System.out.println("Initial Verification Status: " + customer.get_verification_status());
        customer.apply_verification("ktp.jpg");
        System.out.println("Updated Verification Status: " + customer.get_verification_status());

        System.out.println("--------------------------------------------------");

        UserProfile adminProfile = new UserProfile(999, "admin123", "Admin Ganteng", 25, "admin@email.com", "admin.pdf");
        Admin admin = new Admin(adminProfile);

        admin.log_in(999, 54321);
        admin.update_vehicle_details(505);
        admin.add_vehicle();
        admin.Retrieve_complain();
        admin.verify_user();
        admin.log_out();
    }
}