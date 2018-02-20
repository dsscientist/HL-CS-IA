package starbucksemulator;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Drink extends Item {
    private Size size = Size.GRANDE;
    private String dName = "";
    private String milk = "2% MILK";
    private boolean isIced;
    private Espresso espresso;
    private List<String> custom = new ArrayList<String>();
    
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
    
    public Drink copy() {
        Drink temp = new Drink("", this.price);
        temp.dName = this.dName;
        temp.espresso = this.espresso.copy(temp);
        temp.isIced = this.isIced;
        temp.milk = this.milk;
        temp.size = this.size;
        temp.custom = new ArrayList<>(this.custom);
        return temp;
    }
    
    public boolean checkDuplicate(String s) { //return value modelled after Collection class
        Iterator<String> itr = custom.iterator();
        while (itr.hasNext()) {
            if (itr.next().contains(s)) {
                itr.remove(); //since this checks each time, no more than one duplicate possible
                return true;
            }
        }
        return false;
    }
    
    public void addCustom(String s) {
        custom.add(s);
    }
    
    public String removeCustom() {
        if (custom.size() > 0) {
            return custom.remove(custom.size() - 1);
        } else if (!milk.equalsIgnoreCase("2% milk")){
            milk = "2% milk";
            return "2% milk";
        } else {
            StarbucksEmulator.order.removeItem();
        }
        return "";
    }
    
    public void clearCustom() {
        custom.clear();
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
    
    public void setDrinkName(String s) {
        dName = s;
    }
    
    @Override
    public String toString() {
        String s = name;
        if (isIced) {
            s += "Iced ";
        }
        if (dName.equals("")) {
            s += String.format("%s [drink]\n", size);
        } else {
            s += String.format("%s %s\n", size, dName);
            try {
                ResultSet rs = StarbucksEmulator.stmt.executeQuery("SELECT * FROM DRINKPRICE WHERE SIZE='" + size + "'");
                rs.next();
                price = rs.getDouble("COST");
            } catch (SQLException ex) {
                Logger.getLogger(Drink.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        s += espresso;
        if (!milk.equalsIgnoreCase("2% milk")) {
            if (!(milk.equalsIgnoreCase("nonfat milk") || milk.equalsIgnoreCase("whole milk"))) {
                try {
                    ResultSet rs = StarbucksEmulator.stmt.executeQuery("SELECT * FROM CUSTOMCOST WHERE CUSTOM='NONDAIRY'");
                    rs.next();
                    double extraCost = rs.getDouble("COST");
                    price += extraCost;
                    s += String.format("    %s\t%.2f\n", milk, extraCost);
                } catch (SQLException ex) {
                    Logger.getLogger(Drink.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                s += "    " + milk + "\n";
            }
        }
        s += makeString(custom);
        return s;
    }
    
    private String makeString(List<String> custom) {
        String s = "";
        for (String i : custom) {
            if (i.contains("syrup")) { //
                try {
                    ResultSet rs = StarbucksEmulator.stmt.executeQuery("SELECT * FROM CUSTOMCOST WHERE CUSTOM='SYRUP'");
                    rs.next();
                    double extraCost = rs.getDouble("COST");
                    price += extraCost;
                    s += String.format("    %s\t%.2f\n", i, extraCost);
                } catch (SQLException ex) {
                    Logger.getLogger(Drink.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (i.contains("sauce")) { //
                try {
                    ResultSet rs = StarbucksEmulator.stmt.executeQuery("SELECT * FROM CUSTOMCOST WHERE CUSTOM='SAUCE'");
                    rs.next();
                    double extraCost = rs.getDouble("COST");
                    price += extraCost;
                    s += String.format("    %s\t%.2f\n", i, extraCost);
                } catch (SQLException ex) {
                    Logger.getLogger(Drink.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                s += String.format("    %s\n", i);
            }
        }
        return s;
    }
}
