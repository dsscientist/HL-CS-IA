package starbucksemulator;

import java.util.ArrayList;
import java.util.List;


public class Order {
    private List<Item> items = new ArrayList<Item>();
    String name = "[*NAME*]";
    private int size;
    private static Order tempStorage;
    
    public Order() {
    }
    
    public double getCost() {
        double total = 0;
        for (Item i: items) {
            total += i.price;
        }
        return total;
    }
    
    public void addItem(Item i) {
        items.add(i);
        size++;
    }
    
    public int getSize() {
        return size;
    }
    
    public Item current() {
        if (items.size() > 0) {
            return items.get(items.size() - 1);
        }
        return null; //handle exception elsewhere
    }
       
    public void removeItem() {
        if (items.size() > 0) {
            items.remove(items.size() - 1);
        }
    }
    
    public void saveOrder() {
        tempStorage = this;
    }
    
    public Order recallOrder() {
        Order temp = tempStorage;
        tempStorage = null;
        return temp;
    }
    
    public void output() { //this is making the "sticker"
        int size = items.size();
        int count = 1;
        for (Item i : items) {
            System.out.println("+----------------------------+");
            System.out.printf(" Item: %d of %d\n", count, size);
            count++;
            System.out.println(" *" + name + "*");
            System.out.println(" " + i);
            System.out.println("+----------------------------+");
        }
    }
    
    @Override
    public String toString() {
        String s = "";
        s += name + "\n";
        for (Item i: items) {
            s += i + "\n";
        }
        return s;
    }
}
