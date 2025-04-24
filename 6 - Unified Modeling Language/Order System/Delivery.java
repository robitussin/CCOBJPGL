class Delivery {
    private String deliveryMethod;
    private boolean isDelivered;

    public Delivery(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
        this.isDelivered = false;
    }

    public void deliver() {
        isDelivered = true;
        System.out.println("Delivery completed via " + deliveryMethod);
    }

    public String getStatus() {
        return isDelivered ? "Delivered" : "Pending";
    }
}