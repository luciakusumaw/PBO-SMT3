package Number2;

public class Main {
    public static void main(String[] args) {
        Employee mechanic = new Employee("E01", "Budi Santoso", "Senior Mechanic");

        Customer cust1 = new Customer("Lucia Wardani", "082345673013");
        Customer cust2 = new Customer("Ahmad Fauzi", "081298765432");

        Vehicle car1 = new Vehicle("N 1234 AB", "Honda", "Civic", "Car", cust1);
        Vehicle bike1 = new Vehicle("N 4321 EF", "Yamaha", "NMAX", "Motorcycle", cust1);
        cust1.addVehicle(car1);
        cust1.addVehicle(bike1);

        Vehicle car2 = new Vehicle("B 5678 CD", "Toyota", "Avanza", "Car", cust2);
        Vehicle bike2 = new Vehicle("AG 8765 GH", "Honda", "Vario 160", "Motorcycle", cust2);
        cust2.addVehicle(car2);
        cust2.addVehicle(bike2);

        Service regularService = new Service("Oil Change", 150000.0);
        Service engineTuneUp = new Service("Engine Tune-Up", 100000.0);

        System.out.println("             BENGKEL MAJU - SERVICE ESTIMATE                ");
        System.out.println("============================================================\n");

        mechanic.performService(car1, regularService);
        mechanic.performService(car2, engineTuneUp);
        mechanic.performService(bike1, regularService);
        mechanic.performService(bike2, engineTuneUp);
    }
}