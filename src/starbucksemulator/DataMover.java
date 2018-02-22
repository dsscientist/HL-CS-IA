package starbucksemulator;


public class DataMover { //allows me to stop thread until data is received (like dialog would)
    private int i;
    private String s;
    private Item item;
    private boolean done = false;
    
    public DataMover() {
        
    }
    
    public void setInt(int j) {
        i = j;
    }
    
    public int getInt() {
        return i;
    }
    
    public void setString(String str) {
        s = str;
    }
    
    public String getString() {
        return s;
    }
    
    public void setItem(Item i) {
        item = i;
    }
    
    public Item getItem() {
        return item;
    }
    
    public synchronized void guardDone() {
        done = false;
        while (!done) {
            try {
                wait();
            } catch (InterruptedException e) {
                
            }
        }
    }
    
    public synchronized void notifyDone() {
        done = true;
        notifyAll();
    }
}
