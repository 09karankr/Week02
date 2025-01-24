package VehicleTransportSystem;

public class Motorcycle extends Vehicle{
    private int gears;
    public Motorcycle(int maxSpeed, String fuelType, String Motorcyclee) {
        super(maxSpeed, fuelType, Motorcyclee);
        this.gears = gears;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Motorcycle has: " + gears + "gears");
    }
}
