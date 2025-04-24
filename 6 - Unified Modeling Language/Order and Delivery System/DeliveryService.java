public interface DeliveryService extends BaseService<Delivery> {
    void dispatchOrder(String orderId);
    void markAsDelivered(String deliveryId);
}