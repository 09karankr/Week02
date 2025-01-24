package OnlineRetailOrderManagement;

public class Order {
    protected String orderId;
    protected String orderDate;



     Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
        public String getOrderStatus() {
            return "Order placed.";
        }

        public void displayOrderDetails() {
            System.out.println("Order ID: " + orderId);
            System.out.println("Order Date: " + orderDate);
            System.out.println("Status: " + getOrderStatus());
        }
    }
