class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Rahul";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }
}

public class HotelBookingSystem{
    public static void main(String[] args) {
        
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        defaultBooking.displayBookingDetails();

        
        HotelBooking customBooking = new HotelBooking("Alice Johnson", "Deluxe", 3);
        System.out.println("\nCustom Booking:");
        customBooking.displayBookingDetails();

        // Using the copy constructor
        HotelBooking copiedBooking = new HotelBooking(customBooking);
        System.out.println("\nCopied Booking:");
        copiedBooking.displayBookingDetails();
    }
}


   
