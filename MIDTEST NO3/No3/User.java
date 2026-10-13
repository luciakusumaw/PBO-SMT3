public class User {
    protected UserProfile userProfile;

    public User(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public boolean log_in(int user_id, int password) {
        System.out.println("User logged in");
        return true;
    }

    public void recover_password() {
        System.out.println("Password recovery initiated");
    }

    public void log_out() {
        System.out.println("User logged out");
    }
}