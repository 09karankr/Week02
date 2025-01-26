package ridehailing;

public class Auto extends Vehicle implements GPS{
    private String location;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 5;  // Additional base charge for autos
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
