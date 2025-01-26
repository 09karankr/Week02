package ridehailing;

public interface GPS {
    void updateLocation(String newLocation);
    String getCurrentLocation();
}
