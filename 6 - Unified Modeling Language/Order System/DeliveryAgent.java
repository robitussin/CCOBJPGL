import java.util.*;

class DeliveryAgent {
    private String name;
    private List<Order> assignedOrders; // Association

    public DeliveryAgent(String name) {
        this.name = name;
        this.assignedOrders = new ArrayList<>();
    }

    public void assignOrder(Order order) {
        assignedOrders.add(order);
        order.setDeliveryAgent(this); // Association
    }

    public String toString() {
        return name;
    }
}