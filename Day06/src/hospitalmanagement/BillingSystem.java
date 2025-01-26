package hospitalmanagement;

public class BillingSystem {
    public static void generateBill(Patient patient) {
        System.out.println(patient.getPatientDetails());
        System.out.println("Total Bill: " + patient.calculateBill());
    }
}
