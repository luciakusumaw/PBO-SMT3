package Jobsheet2;

public class Hotel {
    public String guestName;
    public int duration;
    public double price;

    public void bookRoom(){
        System.out.println("Booking is sucess for " + guestName+ " for " +duration+" nights");
    }

    public double calculateTotalPayment(){
        return price*duration;
    }

    public void displayInfo(){
        System.out.println("Guest Name: " + guestName);
        System.out.println("Duration: " + duration + " nights");
        System.out.println("Room Price: Rp " + price);
        System.out.println("Total Paid: Rp " + calculateTotalPayment());

    }
}
