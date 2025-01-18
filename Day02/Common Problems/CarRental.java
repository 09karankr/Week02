public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Unknown Model";
        this.rentalDays = 0;
        this.dailyRate = 0.0;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: " + dailyRate);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    // Main method to test the CarRental class
    public static void main(String[] args) {
        // Using the parameterized constructor to create a rental
        CarRental rental1 = new CarRental("Karan Kumar", "Toyota Corl", 5, 50.0);
        System.out.println("Car Rental Details:");
        rental1.displayRentalDetails();

        // Using the default constructor
        CarRental rental2 = new CarRental();
        System.out.println("\nDefault Car Rental Details:");
        rental2.displayRentalDetails();
    }
}
