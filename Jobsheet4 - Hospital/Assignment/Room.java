package Assignment;

public class Room {
    private String roomNumber;
    private String bedType;
    private double roomPrice;

    public Room(String roomNumber, String bedType, double roomPrice) {
        this.roomNumber = roomNumber;
        this.bedType = bedType;
        this.roomPrice = roomPrice;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getRoomInfo() {
        return "Room " + roomNumber + " (" + bedType + ") - Rp " + roomPrice + "/night";
    }
}