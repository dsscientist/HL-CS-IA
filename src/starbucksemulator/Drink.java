package starbucksemulator;

import java.util.HashSet;
import java.util.Set;


public class Drink extends Item {
    private Size size;
    private String milk;
    private boolean isIced;
    private Espresso espresso;
    private Set<String> custom = new HashSet<String>();
    
    public Drink(String s, double d) {
        super(s, d);
    }
    
    public Drink() {
        
    }
    
    public void setSize(String s) {
        size = Size.valueOf(s);
    }
    
    public void setMilk(String s) {
        milk = s;
    }
    
    public void setIced() {
        isIced = !isIced;
    }
    
    @Override
    public String toString() {
        String s = "";
        if (isIced) {
            s += "Iced ";
        }
        s += name;
        s += espresso + "\n";
        if (!milk.equalsIgnoreCase("2% milk")) {
            s += milk + "\n";
        }
        s += makeString(custom);
        return s;
    }
    
    private String makeString(Set<String> custom) {
        String s = "";
        for (String i : custom) {
            s += String.format("  %s\n", i);
        }
        return s;
    }
}
