package VehicleTransportSystem;

public class Truck extends Vehicle{
    public int NumberOfTyre;

    public Truck(int maxSpeed, String fuelType, int numberOfTyre, String truck) {
        super(maxSpeed, fuelType, truck);
        NumberOfTyre = numberOfTyre;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of tyre is: " + NumberOfTyre);

    }
}
