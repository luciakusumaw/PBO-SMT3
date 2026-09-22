package Number2;

public class Employee {
    private String employeeId;
    private String employeeName;
    private String role;

    public Employee(String employeeId, String employeeName, String role) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.role = role;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void performService(Vehicle vehicle, Service service) {
        double totalCost = service.calculateTotalCost(vehicle);
        System.out.println("Technician     : " + employeeName + " (" + role + ")");
        System.out.println("Owner          : " + vehicle.getOwner().getName() + " (" + vehicle.getOwner().getPhoneNumber() + ")");
        System.out.println("Vehicle        : " + vehicle.getBrand() + " " + vehicle.getModel() + " [" + vehicle.getPlateNumber() + "]");
        System.out.println("Vehicle Type   : " + vehicle.getVehicleType());
        System.out.println("Service Item   : " + service.getServiceName());
        System.out.println("Base Price     : Rp" + service.getServicePrice());
        System.out.println("Estimated Cost : Rp" + totalCost);
        System.out.println("------------------------------------------------------------");
    }
}