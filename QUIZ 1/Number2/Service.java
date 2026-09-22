package Number2;

public class Service {
    private String serviceName;
    private double servicePrice;

    public Service(String serviceName, double servicePrice) {
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(double servicePrice) {
        this.servicePrice = servicePrice;
    }

    public double calculateTotalCost(Vehicle vehicle) {
        double fee = 0.0;
        if (vehicle.getVehicleType().equalsIgnoreCase("Car")) {
            fee = 50000.0;
        } else if (vehicle.getVehicleType().equalsIgnoreCase("Motorcycle")) {
            fee = 20000.0;
        }
        return this.servicePrice + fee;
    }
}