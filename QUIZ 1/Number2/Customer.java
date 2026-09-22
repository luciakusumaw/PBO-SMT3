package Number2;
import java.util.ArrayList;

public class Customer {
    private String name;
    private String phone;
    private ArrayList<Vehicle> vehicles;

    public Customer(String name, String phone){
        this.name = name;
        this.phone = phone;
        this.vehicles = new ArrayList<Vehicle>();
    }
    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNumber() {
            return phone;
        }

        public void setPhoneNumber(String phone) {
            this.phone = phone;
        }

        public ArrayList<Vehicle> getVehicles() {
            return vehicles;
        }

        public void addVehicle(Vehicle vehicle) {
            this.vehicles.add(vehicle);
        }
}