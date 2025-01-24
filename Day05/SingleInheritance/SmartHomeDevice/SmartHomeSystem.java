package SmartHomeDevice;

public class SmartHomeSystem {
    public static void main(String[] args){
        Thermostat thermostat = new Thermostat("TH002","online", 22.5);

        thermostat.displayStatus();
    }
}
