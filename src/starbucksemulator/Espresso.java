package starbucksemulator;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static starbucksemulator.Roast.*;

public class Espresso {
    private int shotNum = 2; //because the default 'grande' size corresponds to 2 shots
    private boolean isDecaf = false;
    private Roast roast = SIGNATURE;
    private boolean isRistretto = false;
    private static final String[] SHOT_NAME = {"Single", "Double", "Triple", "Quad"};
    private Drink parent;
    
    public Espresso(Drink d) {
        parent = d;
        ResultSet rs;
        try {
            rs = StarbucksEmulator.stmt.executeQuery(String.format("SELECT NUMSHOTS FROM RECIPEKEY WHERE SIZE='%s'",parent.getSize()));
            rs.next();
            shotNum = rs.getInt("NUMSHOTS");
        } catch (SQLException ex) {
            Logger.getLogger(Espresso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setShots(int i) {
        shotNum = i;
    }
    
    public void setDecaf() {
        isDecaf = !isDecaf;
    }
    
    public void setRoast(Roast r) {
        roast = r;
    }
    
    public Espresso copy(Drink d) {
        Espresso temp = new Espresso(d);
        temp.shotNum = this.shotNum;
        temp.isDecaf = this.isDecaf;
        temp.isRistretto = this.isRistretto;
        temp.roast = this.roast;
        return temp;
    }
    
    public void setRistretto() {
        isRistretto = !isRistretto;
    }
    
    public int getShotNum() {
        return shotNum;
    }
    
    public boolean getRistretto() {
        return isRistretto;
    }
    
    public boolean getDecaf() {
        return isDecaf;
    }
    
    public String toString() {
        String s = "";
        if (roast == BLONDE) {
            s += "    Blonde\n";
        }
        if (isDecaf) {
            s += "    Decaf\n";
        }
        ResultSet rs;
        int shots = 0;
        double extraCost = 0;
        try {
            rs = StarbucksEmulator.stmt.executeQuery(String.format("SELECT NUMSHOTS FROM RECIPEKEY WHERE SIZE='%s'",parent.getSize()));
            rs.next();
            shots = rs.getInt("NUMSHOTS");
            rs = StarbucksEmulator.stmt.executeQuery("SELECT COST FROM CUSTOMCOST WHERE CUSTOM='PLUSSHOT'");
            rs.next();
            extraCost = rs.getDouble("COST");
        } catch (SQLException ex) {
            Logger.getLogger(Espresso.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (shotNum <= SHOT_NAME.length) {
            if (shotNum != 0) {
                if (shots > shotNum) {
                    s += String.format("    %s\n", SHOT_NAME[shotNum - 1]);
                } else if (shotNum > shots) {
                    parent.price += (shotNum - shots) * extraCost;
                    s += String.format("    %s\t\t%.2f\n", SHOT_NAME[shotNum - 1],
                            (shotNum - shots) * extraCost);
                }
            }
        } else {
            if (shotNum > shots) {
                parent.price += (shotNum - shots) * extraCost;
                s += String.format("    %d Shots\t\t%.2f\n", shotNum, (shotNum - shots) * extraCost);
            } else {
                s += String.format("    %d Shots\n", shotNum);
            }
        }
        if (isRistretto) {
            s += "    Ristretto\n";
        }
        return s;
    }
}
