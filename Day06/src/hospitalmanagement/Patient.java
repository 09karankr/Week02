package hospitalmanagement;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;  // Encapsulated sensitive data

    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }


   public abstract double calculateBill();


    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }


    public String getDiagnosis() {
        return "Diagnosis: " + diagnosis;
    }
}
