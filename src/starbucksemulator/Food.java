package starbucksemulator;


public class Food extends Item {
    private boolean warmed;
    
    public Food(String s, double d) {
        super(s, d);
    }
    
    public void setWarm(boolean b) {
        warmed = b;
    }
    
    @Override
    public String toString() {
        String s = "";
        return s;
    }
}
