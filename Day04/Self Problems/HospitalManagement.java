import java.util.ArrayList;
import java.util.List;

class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public String getName() {
        return name;
    }
}

class Doctor {
    private String name;
    private String specialty;
    private List<Patient> patients;

    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
        this.patients = new ArrayList<>();
    }

    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
        System.out.println("Dr. " + name + " (Specialty: " + specialty + ") is consulting with " + patient.getName() + ".");
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public List<Patient> getPatients() {
        return patients;
    }
}

class Patient {
    private String name;
    private int age;
    private List<Doctor> doctors;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        
        Hospital hospital = new Hospital("City General Hospital");

        // Create doctors
        Doctor doctor1 = new Doctor("Rahul", "Cardiology");
        Doctor doctor2 = new Doctor("Ravi", "Neurology");

    
        Patient patient1 = new Patient("Shweta", 30);
        Patient patient2 = new Patient("Bobby", 40);

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Perform consultations
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);

        // Display associations
        System.out.println("Doctors consulted by " + patient1.getName() + ":");
        for (Doctor doctor : patient1.getDoctors()) {
            System.out.println("  - Dr. " + doctor.getName() + " (" + doctor.getSpecialty() + ")");
        }

        System.out.println("Patients consulted by Dr. " + doctor1.getName() + ":");
        for (Patient patient : doctor1.getPatients()) {
            System.out.println("  - " + patient.getName());
        }
    }
}
