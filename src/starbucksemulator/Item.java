package starbucksemulator;


public abstract class Item {
    protected String name;
    protected double price;
    
    public Item() {
        
    }
    
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
