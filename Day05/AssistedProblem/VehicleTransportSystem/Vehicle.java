package VehicleTransportSystem;

public class Vehicle {
    public String vehicle;
    private int maxSpeed;
    private String fuelType;

    public Vehicle(int maxSpeed, String fuelType, String vehicle) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
        this.vehicle = vehicle;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getFuelType() {
        return fuelType;
    }
    public void displayInfo(){
        System.out.println("Vehicle is: "+ vehicle+ " and the Max speed is: "+ maxSpeed + " and the fuel type of the vehicle is: " + fuelType);


    }
}
