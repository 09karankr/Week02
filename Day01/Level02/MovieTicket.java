
 class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;

    
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = -1; 
        this.price = 0.0; // Default price
    }

    // Method to book a ticket
    public void bookTicket(int seatNumber, double price) {
        if (this.seatNumber != -1) {
            System.out.println("Seat already booked! Seat Number: " + this.seatNumber);
        } else {
            this.seatNumber = seatNumber;
            this.price = price;
            System.out.println("Ticket booked successfully!");
        }
    }

    public void displayTicketDetails() {
        if (seatNumber == -1) {
            System.out.println("No ticket booked yet.");
        } else {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        }
    }

    
    public static void main(String[] args) {
        
        MovieTicket ticket = new MovieTicket("Inception");

        
        ticket.displayTicketDetails();

        
        ticket.bookTicket(42, 15.99);

       
        ticket.displayTicketDetails();

       
        ticket.bookTicket(50, 20.00);
    }
}
