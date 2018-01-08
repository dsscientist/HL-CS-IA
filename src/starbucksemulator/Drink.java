package starbucksemulator;

import java.util.HashSet;
import java.util.Set;


public class Drink extends Item {
    private Size size;
    private int numShot;
    private Set<String> custom = new HashSet<String>();
    
    public Drink(String s, double d) {
        super(s, d);
    }
    
    @Override
    public String toString() {
        
    }
}
