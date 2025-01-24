package VehicleTransportSystem;

public class Car extends Vehicle{
    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity, String car) {
        super(maxSpeed, fuelType, car);
        this.seatCapacity = seatCapacity;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("max seat capacity is: " + seatCapacity);
    }
}
