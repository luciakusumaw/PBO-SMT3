package Jobsheet2;

public class Hotel {
    public String guestName, roomNumber, bedType;
    public int duration;
    public double price;
    public boolean isClean;

    public void bookRoom(){
        System.out.println("Booking is sucess for " + guestName+ " for " +duration+" nights");
    }

    public double calculateTotalPayment(){
        return price*duration;
    }

    public void cleanRoom(boolean isClean) {
        this.isClean = isClean;
        if (this.isClean) {
            System.out.println("Room " + roomNumber + " is ready");
        } else {
            System.out.println("Room " + roomNumber + " is dirty and needs cleaning\n");
        }
    }

    public void displayInfo(){
        System.out.println("Guest Name: " + guestName);
        System.out.println("Duration: " + duration + " nights");
        System.out.println("Room Price: Rp " + price);
        System.out.println("Room Type: "+bedType);
        System.out.println("Room status: "+ (isClean ? "Clean" : "Needs Cleaning"));
        System.out.println("Total Paid: Rp " + calculateTotalPayment());
    
    }
}
