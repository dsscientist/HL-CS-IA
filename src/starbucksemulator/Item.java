package starbucksemulator;


public abstract class Item {
    private String name;
    private double price;
    
    public Item(String s, double d) {
        setName(s);
        setPrice(d);
    }
    
    public void setName(String s) {
        name = s;
    }
    
    public void setPrice(double d) {
        price = d;
    }
}
