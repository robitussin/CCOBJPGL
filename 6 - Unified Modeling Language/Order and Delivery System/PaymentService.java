public interface PaymentService extends BaseService<Payment> {
    Payment processPayment(String orderId, double amount);
}