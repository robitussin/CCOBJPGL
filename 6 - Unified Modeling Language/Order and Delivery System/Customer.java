public class Customer extends User {
    private String deliveryAddress;

    public void updateAddress(String newAddress) {
        this.deliveryAddress = newAddress;
    }
}