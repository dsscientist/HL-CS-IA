/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbucksemulator;

/**
 *
 * @author shirdav18
 */
public class CustomScreen extends javax.swing.JPanel {

    private javax.swing.JButton[] buttons = new javax.swing.JButton[12];
    private Drink current;
    private String mutator = "add "; //default
    
    public CustomScreen() {
        initComponents();
        addButtons();
        roundButtons();
    }

    private void addButtons() {
        buttons[0] = extraBtn;
        buttons[1] = extraHotBtn;
        buttons[2] = foamBtn;
        buttons[3] = iceBtn;
        buttons[4] = lightBtn;
        buttons[5] = noBtn;
        buttons[6] = roomBtn;
        buttons[7] = subBtn;
        buttons[8] = temperatureBtn;
        buttons[9] = warmBtn;
        buttons[10] = waterBtn;
        buttons[11] = whipBtn;
    }
    
    private void roundButtons() {
        for (javax.swing.JButton b : buttons) {
            b.setBorder(new RoundedBorder(10));
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        roomBtn = new javax.swing.JButton();
        iceBtn = new javax.swing.JButton();
        noBtn = new javax.swing.JButton();
        subBtn = new javax.swing.JButton();
        whipBtn = new javax.swing.JButton();
        foamBtn = new javax.swing.JButton();
        extraBtn = new javax.swing.JButton();
        lightBtn = new javax.swing.JButton();
        waterBtn = new javax.swing.JButton();
        temperatureBtn = new javax.swing.JButton();
        extraHotBtn = new javax.swing.JButton();
        warmBtn = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        roomBtn.setBackground(new java.awt.Color(204, 204, 204));
        roomBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        roomBtn.setText("With Room");
        roomBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomBtnMouseClicked(evt);
            }
        });

        iceBtn.setBackground(new java.awt.Color(204, 255, 255));
        iceBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        iceBtn.setText("Ice");
        iceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iceBtnMouseClicked(evt);
            }
        });

        noBtn.setBackground(new java.awt.Color(0, 0, 0));
        noBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        noBtn.setForeground(new java.awt.Color(255, 255, 255));
        noBtn.setText("No");
        noBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noBtnMouseClicked(evt);
            }
        });

        subBtn.setBackground(new java.awt.Color(0, 0, 0));
        subBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        subBtn.setForeground(new java.awt.Color(255, 255, 255));
        subBtn.setText("Sub");
        subBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subBtnMouseClicked(evt);
            }
        });

        whipBtn.setBackground(new java.awt.Color(204, 255, 255));
        whipBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        whipBtn.setText("Whipped Cream");
        whipBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whipBtnMouseClicked(evt);
            }
        });

        foamBtn.setBackground(new java.awt.Color(204, 204, 204));
        foamBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        foamBtn.setText("Foam");
        foamBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foamBtnMouseClicked(evt);
            }
        });

        extraBtn.setBackground(new java.awt.Color(0, 0, 0));
        extraBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        extraBtn.setForeground(new java.awt.Color(255, 255, 255));
        extraBtn.setText("Extra");
        extraBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                extraBtnMouseClicked(evt);
            }
        });

        lightBtn.setBackground(new java.awt.Color(0, 0, 0));
        lightBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        lightBtn.setForeground(new java.awt.Color(255, 255, 255));
        lightBtn.setText("Light");
        lightBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lightBtnMouseClicked(evt);
            }
        });

        waterBtn.setBackground(new java.awt.Color(204, 255, 255));
        waterBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        waterBtn.setText("Water");
        waterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                waterBtnMouseClicked(evt);
            }
        });

        temperatureBtn.setBackground(new java.awt.Color(255, 255, 204));
        temperatureBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        temperatureBtn.setText("Temperature");
        temperatureBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                temperatureBtnMouseClicked(evt);
            }
        });

        extraHotBtn.setBackground(new java.awt.Color(255, 255, 204));
        extraHotBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        extraHotBtn.setText("Extra Hot");
        extraHotBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                extraHotBtnMouseClicked(evt);
            }
        });

        warmBtn.setBackground(new java.awt.Color(255, 255, 204));
        warmBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        warmBtn.setText("Warm");
        warmBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                warmBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(subBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                                .addComponent(extraBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)
                                .addComponent(lightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(waterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(whipBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(extraHotBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(warmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(temperatureBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(foamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(roomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {iceBtn, whipBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(noBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(whipBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(waterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(extraBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(extraHotBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(warmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(temperatureBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkCurrentNull() {
        if (StarbucksEmulator.order.current() == null) {
            StarbucksEmulator.order.addItem(new Drink());
        }
        current = (Drink)StarbucksEmulator.order.current();
    }
    
    private void updateText() {
        ((EmulatorPanel)this.getParent().getParent()).updateText(StarbucksEmulator.order.toString());
    }
    
    private void noBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noBtnMouseClicked
        mutator = "no ";
    }//GEN-LAST:event_noBtnMouseClicked

    private void subBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subBtnMouseClicked
        mutator = "sub ";
    }//GEN-LAST:event_subBtnMouseClicked

    private void extraBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extraBtnMouseClicked
        mutator = "extra ";
    }//GEN-LAST:event_extraBtnMouseClicked

    private void lightBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lightBtnMouseClicked
        mutator = "light ";
    }//GEN-LAST:event_lightBtnMouseClicked

    private void iceBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iceBtnMouseClicked
        checkCurrentNull();
        current.addCustom(String.format("%sice", mutator));
        updateText();
        mutator = "add ";
    }//GEN-LAST:event_iceBtnMouseClicked

    private void waterBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_waterBtnMouseClicked
        checkCurrentNull();
        current.addCustom(String.format("%swater", mutator));
        updateText();
        mutator = "add ";
    }//GEN-LAST:event_waterBtnMouseClicked

    private void whipBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whipBtnMouseClicked
        checkCurrentNull();
        current.addCustom(String.format("%swhip", mutator));
        updateText();
        mutator = "add ";
    }//GEN-LAST:event_whipBtnMouseClicked

    private void foamBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foamBtnMouseClicked
        checkCurrentNull();
        current.addCustom(String.format("%sfoam", mutator));
        updateText();
        mutator = "add ";
    }//GEN-LAST:event_foamBtnMouseClicked

    private void roomBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomBtnMouseClicked
        checkCurrentNull();
        if (mutator.equals("add ")) {
            mutator = "";
        }
        current.addCustom(String.format("w/ %sroom", mutator));
        updateText();
        mutator = "add ";
    }//GEN-LAST:event_roomBtnMouseClicked

    private void extraHotBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extraHotBtnMouseClicked
        checkCurrentNull();
        current.checkDuplicate("warm");
        current.addCustom("extra hot");
        updateText();
    }//GEN-LAST:event_extraHotBtnMouseClicked

    private void warmBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_warmBtnMouseClicked
        checkCurrentNull();
        current.checkDuplicate("extra hot");
        current.addCustom("warm");
        updateText();
    }//GEN-LAST:event_warmBtnMouseClicked

    private void temperatureBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temperatureBtnMouseClicked
        checkCurrentNull();
        DataMover dm = StarbucksEmulator.dm;
        Thread thread = new Thread() {
            public void run() {
                NumberKeyPopup nkp = new NumberKeyPopup("TEMPERATURE", StarbucksEmulator.stmt, dm);
                nkp.setVisible(true);
                dm.guardDone();
                nkp.dispose();
                current.addCustom(String.format("%d degrees", dm.getInt()));
                updateText();
            }
        };
        thread.start();
    }//GEN-LAST:event_temperatureBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton extraBtn;
    private javax.swing.JButton extraHotBtn;
    private javax.swing.JButton foamBtn;
    private javax.swing.JButton iceBtn;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JButton lightBtn;
    private javax.swing.JButton noBtn;
    private javax.swing.JButton roomBtn;
    private javax.swing.JButton subBtn;
    private javax.swing.JButton temperatureBtn;
    private javax.swing.JButton warmBtn;
    private javax.swing.JButton waterBtn;
    private javax.swing.JButton whipBtn;
    // End of variables declaration//GEN-END:variables
}
