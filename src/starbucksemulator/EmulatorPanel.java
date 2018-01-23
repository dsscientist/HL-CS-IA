/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbucksemulator;

import com.sun.prism.paint.Color;
import java.awt.FontMetrics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTabbedPane;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

/**
 *
 * @author shirdav18
 */
public class EmulatorPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmulatorPanel
     */
    public EmulatorPanel() {
        JTabbedPane labelTabs = new JTabbedPane(JTabbedPane.RIGHT);
        this.add(labelTabs);
        labelTabs.setSize(1024, 600);
        labelTabs.setLocation(342, 70);
        labelTabs.setUI(new BasicTabbedPaneUI() {
            @Override
            protected int calculateTabWidth(
                    int tabPlacement, int tabIndex, FontMetrics metrics) {
                return 100;
            }
            
            @Override
            protected int calculateTabHeight(
                    int tabPlacement, int tabIndex, int fontHeight) {
                return 149;
            }
        });
        MainScreen ms = new MainScreen();
        labelTabs.addTab("MAIN", null, ms, "Hi");
        SyrupScreen ss = new SyrupScreen();
        labelTabs.addTab("SYRUP", null, ss, "Hi");
        MilkScreen m2s = new MilkScreen();
        labelTabs.addTab("MILK", null, m2s, "Hi");
        CustomScreen cs = new CustomScreen();
        labelTabs.addTab("CUSTOM", null, cs, "Hi");
        labelTabs.addMouseListener(new MouseAdapter() {
            public void MouseClicked(MouseEvent e) {
                labelTabs.setVisible(true);
            }
        });
        labelTabs.setVisible(true);
        labelTabs.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        JTabbedPane drinkTabs = new JTabbedPane(JTabbedPane.TOP);
        this.add(drinkTabs);
        drinkTabs.setSize(924, 630);
        drinkTabs.setLocation(0, 70);
        drinkTabs.setUI(new BasicTabbedPaneUI() {
            @Override
            protected int calculateTabWidth(
                    int tabPlacement, int tabIndex, FontMetrics metrics) {
                return 230;
            }
            @Override
            protected int calculateTabHeight(
                    int tabPlacement, int tabIndex, int fontHeight) {
                return 30;
            }
        });
        ms = new MainScreen();
        drinkTabs.addTab("MAIN", null, ms, "Hi");
        ss = new SyrupScreen();
        drinkTabs.addTab("SYRUP", null, ss, "Hi");
        m2s = new MilkScreen();
        drinkTabs.addTab("MILK", null, m2s, "Hi");
        cs = new CustomScreen();
        drinkTabs.addTab("CUSTOM", null, cs, "Hi");
        drinkTabs.addMouseListener(new MouseAdapter() {
            public void MouseClicked(MouseEvent e) {
                drinkTabs.setVisible(true);
            }
        });
        drinkTabs.setVisible(true);
        drinkTabs.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }
    
    public void bringToFront(JTabbedPane jtp) {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
