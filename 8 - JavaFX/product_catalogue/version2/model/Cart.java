package model;

import java.util.ArrayList;
import javafx.scene.layout.Pane;

public class Cart {

    // This array list will hold all items in the cart
    private ArrayList<Pane> items = new ArrayList<Pane>();

    public void addItem(Pane pane) {
        items.add(pane);
    };

    public void showItems() {
        System.out.println(items);
    };

    public ArrayList<Pane> getItemList() {
        return items;
    }

}