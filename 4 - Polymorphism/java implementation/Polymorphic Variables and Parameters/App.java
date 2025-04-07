import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // Polymorphic variable/object
        GroceryItem item1 = new Junkfood();
        item1.itemName = "V-cut";

        // Polymorphic variable/object
        GroceryItem item2 = new Shampoo();
        item2.itemName = "Pantene";

        // Polymorphic array
        ArrayList<GroceryItem> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);

        for (GroceryItem item : items) {
            item.getItemName();
        }

        // Cashier Object
        Cashier c1 = new Cashier();

        // Polymorphic Argument
        c1.checkOut(item1);

        // Polymorphic Argument
        c1.checkOut(item2);

    }
}
