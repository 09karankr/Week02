package RestaurantManagement;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef("Gordon", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("James", 201, 5);
        System.out.println("----- Chef Details -----");
        chef.displayDetails();
        chef.performDuties();




        System.out.println("\n----- Waiter Details -----");
        waiter.displayDetails();
        waiter.performDuties();
    }

}
