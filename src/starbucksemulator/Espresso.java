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
    
    public void setRistretto() {
        isRistretto = !isRistretto;
    }
    
    public int getShotNum() {
        return shotNum;
    }
    
    public String toString() {
        String s = "";
        if (roast == BLONDE) {
            s += "  Blonde\n";
        }
        if (isDecaf) {
            s += "  Decaf\n";
        }
        if (shotNum <= SHOT_NAME.length) {
            if (shotNum != 0) {
                try {
                    ResultSet rs = StarbucksEmulator.stmt.executeQuery(String.format("SELECT NUMSHOTS FROM RECIPEKEY WHERE SIZE='%s'",parent.getSize()));
                    rs.next();
                    int shots = rs.getInt("NUMSHOTS");
                    if (shots != shotNum) {
                        s += String.format("  %s\n", SHOT_NAME[shotNum - 1]);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Espresso.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            s += String.format("  %d Shots\n", shotNum);
        }
        if (isRistretto) {
            s += "  Ristretto";
        }
        return s;
    }
}
