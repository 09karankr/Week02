package vehiclerentalsystem;

public class Truck extends Vehicle implements Insurable{
    private static final double INSURANCE_RATE = 0.10;
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck insurance rate: 10% of rental rate.";
    }

}
