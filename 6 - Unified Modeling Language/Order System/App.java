import java.util.*;

public class App {
    public static void main(String[] args) {
        // Create objects
        Customer customer = new Customer("Elizer", "551 M.F. Jhocson Street Sampaloc Manila");
        Product product = new Product("Fried Chicken", 1200.00);
        Delivery delivery = new Delivery("Grab");
        DeliveryAgent agent = new DeliveryAgent("Rona the Deliverer");

        // Composition
        Order order = new Order(customer, product, delivery);

        // Aggregation
        customer.addOrder(order);

        // Association
        agent.assignOrder(order);

        // Process
        order.placeOrder();
        order.deliverOrder();

        // Aggregation Example Output
        System.out.println("\nOrders placed by " + customer + ":");
        for (Order o : customer.getOrders()) {
            System.out.println("-> Product: " + product);
        }
    }
}
