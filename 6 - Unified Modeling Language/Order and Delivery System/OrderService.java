import java.util.List;

public interface OrderService extends BaseService<Order> {
    Order placeOrder(Customer customer, List<OrderItem> items);
    void cancelOrder(String orderId);
}