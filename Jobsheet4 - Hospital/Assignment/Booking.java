package Assignment;
import java.util.ArrayList;

public class Booking {
    private String bookingId;
    private int duration;
    private Guest guest;
    private ArrayList<Room> roomList;

    public Booking(String bookingId, Guest guest, int duration) {
        this.bookingId = bookingId;
        this.guest = guest;
        this.duration = duration;
        this.roomList = new ArrayList<>();
    }

    public void addRoom(Room room) {
        this.roomList.add(room);
    }

    public String getBookingId() {
        return bookingId;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public double getPayment() {
        double totalRoomPrice = 0.0;
        for (Room room : roomList) {
            totalRoomPrice += room.getRoomPrice();
        }
        return totalRoomPrice * duration;
    }

    public void printBookingDetail() {
        System.out.println("            BOOKING DETAIL              ");
        System.out.println("Booking ID   : " + bookingId);
        System.out.println("Guest Info   : " + guest.getGuestInfo());
        System.out.println("Duration     : " + duration + " nights");
        System.out.println("Rooms Booked : ");
        if (roomList.isEmpty()) {
            System.out.println("  - No rooms selected.");
        } else {
            for (Room room : roomList) {
                System.out.println("  - " + room.getRoomInfo());
            }
        }
        System.out.println("----------------------------------------");
        System.out.println("Total Payment: Rp " +  getPayment());
    }
}