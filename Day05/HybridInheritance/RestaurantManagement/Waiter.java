package RestaurantManagement;

public class Waiter extends Person implements Worker {
    private int tableCount;
    public Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }
    @Override
    public void performDuties() {
        System.out.println("Serving customers and managing " + tableCount + " tables.");
    }

}
