package Jobsheet2;

public class HotelDemo {
    public static void main(String[] args) {
        Hotel guest1 = new Hotel();
        guest1.guestName = "Andi";
        guest1.duration = 2;
        guest1.price = 500000;
        guest1.bedType = "Deluxe";
        guest1.roomNumber = "101";
        guest1.cleanRoom(true);

        Hotel guest2 = new Hotel();
        guest2.guestName = "Lucia";
        guest2.duration = 3;
        guest2.price = 750000;
        guest2.bedType = "Superior";   
        guest2.roomNumber = "201";     
        guest2.cleanRoom(false);

        guest1.displayInfo();
        guest1.bookRoom();
        System.out.println();

        guest2.displayInfo();
        guest2.bookRoom();
        System.out.println();

        System.out.println("Updating guest details\n");

        guest1.duration = 4; 
        guest2.price = 800000;

        guest1.displayInfo();
        guest2.displayInfo();
    }
}

