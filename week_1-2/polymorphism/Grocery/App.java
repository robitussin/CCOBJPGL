public class App {
    public static void main(String[] args) throws Exception {

        // Polymorphic variable/object
        GroceryItem item1 = new Junkfood();
        item1.name = "V-cut";

        // Polymorphic variable/object
        GroceryItem item2 = new Shampoo();
        item2.name = "Pantene";

        // Polymorphic array
        GroceryItem[] itemArray = new GroceryItem[2];
        itemArray[0] = item1;
        itemArray[1] = item2;

        // Instead of calling the showItemName for each grocery item, we can loop
        // through the polymorphic array
        for (int i = 0; i < 2; i++) {
            itemArray[i].showItemName();
        }

        // Cashier Object
        Cashier c1 = new Cashier();

        // Polymorphic Argument
        c1.checkOut(item1);

        // Polymorphic Argument
        c1.checkOut(item2);

    }
}
