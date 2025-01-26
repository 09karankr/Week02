package vehiclerentalsystem;

import java.util.ArrayList;

public class VehicleRentalSystem {
    public static void processVehicleRental(Vehicle vehicle, int days) {
        double rentalCost = vehicle.calculateRentalCost(days);
        double insuranceCost = 0.0;

        if (vehicle instanceof Insurable) {
            insuranceCost = ((Insurable) vehicle).calculateInsurance();
            System.out.println(((Insurable) vehicle).getInsuranceDetails());
        }
        System.out.println("---------------");
        vehicle.displayDetails();
        System.out.println("Rental cost for " + days + " days: " + rentalCost);
        System.out.println("Insurance Cost: " + insuranceCost);
        System.out.println("Total Cost: " + (rentalCost + insuranceCost));
        System.out.println("---------------");
    }
    public static void main(String[] args) {
        // Creating a list of vehicles (Polymorphism)
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR123", 50));
        vehicles.add(new Bike("BIKE456", 20));
        vehicles.add(new Truck("TRUCK789", 150));

        int rentalDays = 5;

        // Process each vehicle and print details
        for (Vehicle vehicle : vehicles) {
            processVehicleRental(vehicle, rentalDays);
        }
    }
}
