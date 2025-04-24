class Order {
    private Customer customer;
    private Product product;
    private Delivery delivery; // Composition
    private DeliveryAgent deliveryAgent; // Association

    public Order(Customer customer, Product product, Delivery delivery) {
        this.customer = customer;
        this.product = product;
        this.delivery = delivery;
    }

    public void setDeliveryAgent(DeliveryAgent agent) {
        this.deliveryAgent = agent;
    }

    public void placeOrder() {
        System.out.println("Order placed by: " + customer);
        System.out.println("Product: " + product);
        System.out.println("Delivery status: " + delivery.getStatus());
    }

    public void deliverOrder() {
        delivery.deliver();
        System.out.println("Delivered by: " + deliveryAgent);
        System.out.println("Updated delivery status: " + delivery.getStatus());
    }
}