package starbucksemulator;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Drink extends Item {
    private Size size = Size.GRANDE;
    private String milk = "2% MILK";
    private boolean isIced;
    private Espresso espresso;
    private Set<String> custom = new HashSet<String>();
    
    public Drink(String s, double d) {
        super(s, d);
        espresso = new Espresso(this);
    }
    
    public Drink() {
        super("", 0.0);
        espresso = new Espresso(this);
    }
    
    public Espresso getEspresso() {
        return espresso;
    }
    
    public Size getSize() {
        return size;
    }
    
    public void addCustom(String s) {
        custom.add(s);
    }
    
    public void setSize(String s) {
        size = Size.valueOf(s);
        try {
            ResultSet rs = StarbucksEmulator.stmt.executeQuery(String.format("SELECT NUMSHOTS FROM RECIPEKEY WHERE SIZE='%s'", size));
            rs.next();
            espresso.setShots(rs.getInt("NUMSHOTS"));
        } catch (SQLException ex) {
            Logger.getLogger(Espresso.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        if (name.equals("")) {
            s += String.format("%s [drink]\n", size);
        } else {
            s += String.format("%s %s\n", size, name);
        }
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
