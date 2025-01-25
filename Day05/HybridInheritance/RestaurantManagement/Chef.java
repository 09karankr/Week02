package RestaurantManagement;

public class Chef extends Person implements Worker{
    private String specialty;
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }
    @Override
    public void performDuties() {
        System.out.println("Preparing delicious meals. Specialty: " + specialty);
    }

}
