package starbucksemulator;

import java.util.ArrayList;
import java.util.List;


public class Order {
    private List<Item> items = new ArrayList<Item>();
    private String name = "[name]";
    
    public void addItem(Item i) {
        items.add(i);
    }
    
    //voidItem method
    
    @Override
    public String toString() {
        String s = "";
        for (Item i: items) {
            s += i + "\n";
        }
        return s;
    }
}
