package starbucksemulator;

import static starbucksemulator.Roast.*;

public class Espresso {
    private int shotNum;
    private boolean isDecaf = false;
    private Roast roast = SIGNATURE;
    private boolean isRistretto = false;
    private static final String[] SHOT_NAME = {"Single", "Double", "Triple", "Quad"};
    
    public void setShots(int i) {
        shotNum = i;
    }
    
    public void setDecaf(boolean b) {
        isDecaf = b;
    }
    
    public void setRoast(Roast r) {
        roast = r;
    }
    
    public void setRistretto(boolean b) {
        isRistretto = b;
    }
    
    public String toString() {
        String s = "";
        if (roast == BLONDE) {
            s += "  Blonde";
        }
        if (isDecaf) {
            s += "  Decaf";
        }
        if (shotNum < SHOT_NAME.length) {
            if (shotNum != 0) {
                s += String.format("  %s\n", SHOT_NAME[shotNum - 1]);
            }
        } else {
            s += String.format("  %d Shots", shotNum);
        }
        if (isRistretto) {
            s += "  Ristretto";
        }
        return s;
    }
}
