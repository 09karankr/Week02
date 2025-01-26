package ridehailing;

public class Bike extends Vehicle implements GPS{
    private String location;

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }

    @Override
    public String getCurrentLocation() {
        return location != null ? location : "Location not updated";
    }
}
