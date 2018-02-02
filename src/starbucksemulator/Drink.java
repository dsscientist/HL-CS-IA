package starbucksemulator;

import java.util.HashSet;
import java.util.Set;


public class Drink extends Item {
    private Size size;
    private String milk;
    private Espresso espresso;
    private Set<String> custom = new HashSet<String>();
    
    public Drink(String s, double d) {
        super(s, d);
    }
    
    
    @Override
    public String toString() {
        String s = "";
        //print drink name
        s += espresso + "\n";
        s += milk + "\n";
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
