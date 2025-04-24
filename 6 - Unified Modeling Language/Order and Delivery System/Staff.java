public class Staff extends User {
    public void updateOrderStatus(Order order, String status) {
        order.setStatus(status);
    }
}