public class OrderItem {
    private MenuItem menuItem;
    private int quantity;

    public double getTotalPrice() {
        return menuItem.getPrice() * quantity;
    }
}