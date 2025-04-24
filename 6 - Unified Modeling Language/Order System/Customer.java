import java.util.*;

class Customer {
    private String name;
    private String address;
    private List<Order> orders; // Aggregation

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return name + " (" + address + ")";
    }

    public List<Order> getOrders() {
        return orders;
    }
}