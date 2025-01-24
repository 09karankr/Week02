package VehicleTransportSystem;

public class VehicleTransport {
    public static void main(String[] args){
       Car c = new Car(200,"petrol", 6,"car");
       Truck truck = new Truck(150,"diesel",7, "Truck");
       Motorcycle moto = new Motorcycle(200,"petrol", "Motorcyclee");

       c.displayInfo();
       truck.displayInfo();
       moto.displayInfo();
    }
}
