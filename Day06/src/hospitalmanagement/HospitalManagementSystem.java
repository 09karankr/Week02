package hospitalmanagement;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient inPatient = new InPatient(101, "Aaman", 45, "Pneumonia", 5, 200.0);
        Patient outPatient = new OutPatient(102, "Bobby", 30, "Flu", 100.0);

        MedicalRecord inPatientRecord = (MedicalRecord) inPatient;
        MedicalRecord outPatientRecord = (MedicalRecord) outPatient;

        inPatientRecord.addRecord("Initial diagnosis: Pneumonia");
        inPatientRecord.addRecord("Prescribed antibiotics");

        outPatientRecord.addRecord("Consultation for flu symptoms");

        BillingSystem.generateBill(inPatient);
        System.out.println(inPatient.getDiagnosis());
        System.out.println("InPatient Records: " + inPatientRecord.viewRecords());

        BillingSystem.generateBill(outPatient);
        System.out.println(outPatient.getDiagnosis());
        System.out.println("OutPatient Records: " + outPatientRecord.viewRecords());
    }
}
