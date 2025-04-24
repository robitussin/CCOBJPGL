import java.util.List;

public class Order {
    private String orderId;
    private Customer customer;
    private List<OrderItem> items;
    private String status; // PENDING, CONFIRMED, DELIVERED, CANCELLED
    private String orderDate;

    public double calculateTotal() {
        return items.stream().mapToDouble(OrderItem::getTotalPrice).sum();
    }

    public void setStatus(String status) {
        this.status = status;
    }
}