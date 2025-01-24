package OnlineRetailOrderManagement;

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        // Creating an Order object
        Order order = new Order("ORD123", "2025-01-20");
        order.displayOrderDetails();
        System.out.println();

        // Creating a ShippedOrder object
        ShippedOrder shippedOrder = new ShippedOrder("ORD456", "2025-01-18", "TRK789456");
        shippedOrder.displayOrderDetails();
        System.out.println();

        // Creating a DeliveredOrder object
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD789", "2025-01-15", "TRK123789", "2025-01-22");
        deliveredOrder.displayOrderDetails();
    }
}
