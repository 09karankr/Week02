class Patient {
    // Static variable for hospital name
    private static String hospitalName = "City Care Hospital";

   
    private static int totalPatients = 0;

    // Instance variables
    private String name;
    private int age;
    private String ailment;
    private final int patientID;

    
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    // Static method to get the total number of patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Static method to set the hospital name
    public static void setHospitalName(String name) {
        hospitalName = name;
    }

    // Method to display patient details
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Object is not an instance of Patient class.");
        }
    }

    
    public static void main(String[] args) {
        // Creating patient objects
        Patient p1 = new Patient("Raha", 30, "Fever", 101);
        Patient p2 = new Patient("Pawan", 25, "Flu", 102);

        // Displaying patient details
        System.out.println("Patient 1 Details:");
        p1.displayPatientDetails();

        System.out.println("\nPatient 2 Details:");
        p2.displayPatientDetails();

        // Displaying total patients
        System.out.println("\nTotal Patients Admitted: " + Patient.getTotalPatients());

        // Updating hospital name
        System.out.println("\nUpdating Hospital Name...");
        Patient.setHospitalName("Global Health Center");

        // Displaying updated details
        System.out.println("\nPatient 1 Details After Hospital Name Update:");
        p1.displayPatientDetails();

        System.out.println("\nPatient 2 Details After Hospital Name Update:");
        p2.displayPatientDetails();

        // Displaying total patients again
        System.out.println("\nTotal Patients Admitted: " + Patient.getTotalPatients());
    }
}
