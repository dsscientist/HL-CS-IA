package starbucksemulator;

import java.awt.Component;
import java.awt.Insets;
import javax.swing.border.Border;
import java.awt.Graphics;

/**
 *
 * @author shirdav18
 */
public class RoundedBorder implements Border {
    
    private int radius;
    
    RoundedBorder(int r) {
        radius = r;
    }
    
    public Insets getBorderInsets(Component c) {
        return new Insets(radius + 1, radius + 1, radius + 2, radius);
    }
    
    public boolean isBorderOpaque() {
        return true;
    }
    
    public void paintBorder(Component c, Graphics g, int x, int  y, int width, int height) {
        g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
    }
}
