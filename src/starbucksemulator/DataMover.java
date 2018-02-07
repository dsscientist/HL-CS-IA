package starbucksemulator;


public class DataMover {
    private int i;
    private boolean done = false;
    
    public DataMover() {
        
    }
    
    public void setI(int j) {
        i = j;
    }
    
    public int getI() {
        return i;
    }
    
    public synchronized void guardDone() {
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
