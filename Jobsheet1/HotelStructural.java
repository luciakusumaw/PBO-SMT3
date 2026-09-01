public class HotelStructural {
    public static void main(String[] args) {
        String guestName, 
        guestName2, guestName3,
        guestName4, guestName5,
        guestName6, guestName7,
        guestName8, guestName9,
        guestName10;

        int duration, duration2, 
        duration3, duration4,
        duration5, duration6,
        duration7, duration8, 
        duration9, duration10;

        double price, price2, price3,
        price4, price5, price6,
        price7, price8, price9, price10;

        guestName = "Andi";
        duration = 2;
        price = 500000;

        guestName2 = "Aqeela";
        duration2 = 1;
        price2 = 350000;

        guestName3 = "Lucia";
        duration3 = 3;
        price3 = 750000;

        guestName4 = "Tiara";
        duration4 = 2;
        price4 = 450000;

        guestName5 = "Jennie";
        duration5 = 4;
        price5 = 1200000;

        guestName6 = "Fitri";
        duration6 = 1;
        price6 = 300000;

        guestName7 = "Lisa";
        duration7 = 2;
        price7 = 600000;

        guestName8 = "Jisoo";
        duration8 = 5;
        price8 = 2000000;

        guestName9 = "Rose";
        duration9 = 3;
        price9 = 850000;

        guestName10 = "Mohan";
        duration10 = 1;
        price10 = 400000;

        bookRoom(guestName, duration);
        payment(price, duration);

        System.out.println("Guest Name : " + guestName);
        System.out.println("Duration   : " + duration + " nights");
        System.out.println("Room Price : Rp " + price);
        System.out.println();

        System.out.println("Guest Name : " + guestName2);
        System.out.println("Duration   : " + duration2 + " nights");
        System.out.println("Room Price : Rp " + price2);
        System.out.println();

        System.out.println("Guest Name : " + guestName3);
        System.out.println("Duration   : " + duration3 + " nights");
        System.out.println("Room Price : Rp " + price3);
        System.out.println();

        System.out.println("Guest Name : " + guestName4);
        System.out.println("Duration   : " + duration4 + " nights");
        System.out.println("Room Price : Rp " + price4);
        System.out.println();

        System.out.println("Guest Name : " + guestName5);
        System.out.println("Duration   : " + duration5 + " nights");
        System.out.println("Room Price : Rp " + price5);
        System.out.println();

        System.out.println("Guest Name : " + guestName6);
        System.out.println("Duration   : " + duration6 + " nights");
        System.out.println("Room Price : Rp " + price6);
        System.out.println();

        System.out.println("Guest Name : " + guestName7);
        System.out.println("Duration   : " + duration7 + " nights");
        System.out.println("Room Price : Rp " + price7);
        System.out.println();

        System.out.println("Guest Name : " + guestName8);
        System.out.println("Duration   : " + duration8 + " nights");
        System.out.println("Room Price : Rp " + price8);
        System.out.println();

        System.out.println("Guest Name : " + guestName9);
        System.out.println("Duration   : " + duration9 + " nights");
        System.out.println("Room Price : Rp " + price9);
        System.out.println();

        System.out.println("Guest Name : " + guestName10);
        System.out.println("Duration   : " + duration10 + " nights");
        System.out.println("Room Price : Rp " + price10);
    }

    public static void bookRoom(String guestName, int duration){
        System.out.println("Booking success for " + guestName+ " for "+ duration+ " nights");
    }

    public static void payment(double roomPrice, int duration)
    {
        double total = roomPrice * duration;
        System.out.println("Payment total: Rp " + total);
    }

}