package RestaurantManagement;

public class Person {
    protected String name;
    protected int id;
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }




    // Method to display basic details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

}
