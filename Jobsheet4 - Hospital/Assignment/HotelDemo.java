package Assignment;

public class HotelDemo {
    public static void main(String[] args) {
        Room room101 = new Room("101", "Deluxe King", 500000.0);
        Room room102 = new Room("102", "Deluxe Twin", 450000.0);
        Room room201 = new Room("201", "Executive Suite", 1200000.0);

        Guest guest1 = new Guest("G001", "Lucia Torres");
        Guest guest2 = new Guest("G002", "Budi Santoso");

        Booking booking1 = new Booking("BKG-2026-001", guest1, 2);
        booking1.addRoom(room101);
        booking1.addRoom(room102);

        Booking booking2 = new Booking("BKG-2026-002", guest2, 3);
        booking2.addRoom(room201);

        booking1.printBookingDetail();
        booking2.printBookingDetail();
    }
}