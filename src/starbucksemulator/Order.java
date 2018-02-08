package starbucksemulator;

import java.util.ArrayList;
import java.util.List;


public class Order {
    private List<Item> items = new ArrayList<Item>();
    private String name = "[name]";
    
    public Order() {
    }
    
    public void addItem(Item i) {
        items.add(i);
    }
    
    public Item current() {
        if (items.size() > 0) {
            return items.get(items.size() - 1);
        }
        return null; //handle exception elsewhere
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
