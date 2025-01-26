package ridehailing;

public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicle car = new Car("C123", "Karan Kumar", 15.0);
        Vehicle bike = new Bike("B456", "Johny", 5.0);
        Vehicle auto = new Auto("A789", "Manish singh", 8.0);

        GPS carGPS = (GPS) car;
        GPS bikeGPS = (GPS) bike;
        GPS autoGPS = (GPS) auto;

        carGPS.updateLocation("Delhi");
        bikeGPS.updateLocation("Banglore");
        autoGPS.updateLocation("Mumbai");

        RideBookingSystem.processRide(car, 10);
        System.out.println("Car location: " + carGPS.getCurrentLocation());

        RideBookingSystem.processRide(bike, 5);
        System.out.println("Bike location: " + bikeGPS.getCurrentLocation());

        RideBookingSystem.processRide(auto, 7);
        System.out.println("Auto location: " + autoGPS.getCurrentLocation());
    }
}
