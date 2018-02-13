/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbucksemulator;

import javax.swing.JFrame;


/**
 *
 * @author shirdav18
 */
public class MainScreen extends javax.swing.JPanel {

    private javax.swing.JButton[] buttons = new javax.swing.JButton[15];
    private Drink current;
        
    public MainScreen() {
        initComponents();
        addButtons();
        roundButtons();
    }

    private void addButtons() {
        buttons[0] = blondeBtn;
        buttons[1] = decafBtn;
        buttons[2] = doppioBtn;
        buttons[3] = grandeBtn;
        buttons[4] = icedBtn;
        buttons[5] = kidsBtn;
        buttons[6] = moreShotsBtn;
        buttons[7] = quadBtn;
        buttons[8] = ristrettoBtn;
        buttons[9] = shortBtn;
        buttons[10] = soloBtn;
        buttons[11] = tallBtn;
        buttons[12] = tripleBtn;
        buttons[13] = updosedBtn;
        buttons[14] = ventiBtn;
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

        doppioBtn = new javax.swing.JButton();
        kidsBtn = new javax.swing.JButton();
        shortBtn = new javax.swing.JButton();
        tallBtn = new javax.swing.JButton();
        icedBtn = new javax.swing.JButton();
        soloBtn = new javax.swing.JButton();
        grandeBtn = new javax.swing.JButton();
        quadBtn = new javax.swing.JButton();
        tripleBtn = new javax.swing.JButton();
        ventiBtn = new javax.swing.JButton();
        blondeBtn = new javax.swing.JButton();
        decafBtn = new javax.swing.JButton();
        ristrettoBtn = new javax.swing.JButton();
        moreShotsBtn = new javax.swing.JButton();
        updosedBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1024, 600));

        doppioBtn.setBackground(new java.awt.Color(204, 204, 255));
        doppioBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        doppioBtn.setText("Doppio");
        doppioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doppioBtnMouseClicked(evt);
            }
        });

        kidsBtn.setBackground(new java.awt.Color(255, 255, 153));
        kidsBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        kidsBtn.setText("Kids");
        kidsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kidsBtnMouseClicked(evt);
            }
        });

        shortBtn.setBackground(new java.awt.Color(255, 255, 153));
        shortBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        shortBtn.setText("Short");
        shortBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shortBtnMouseClicked(evt);
            }
        });

        tallBtn.setBackground(new java.awt.Color(255, 255, 153));
        tallBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        tallBtn.setText("Tall");
        tallBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tallBtnMouseClicked(evt);
            }
        });

        icedBtn.setBackground(new java.awt.Color(204, 255, 255));
        icedBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        icedBtn.setText("Iced");
        icedBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icedBtnMouseClicked(evt);
            }
        });

        soloBtn.setBackground(new java.awt.Color(204, 204, 255));
        soloBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        soloBtn.setText("Solo");
        soloBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soloBtnMouseClicked(evt);
            }
        });

        grandeBtn.setBackground(new java.awt.Color(255, 255, 153));
        grandeBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        grandeBtn.setText("Grande");
        grandeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grandeBtnMouseClicked(evt);
            }
        });

        quadBtn.setBackground(new java.awt.Color(204, 204, 255));
        quadBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        quadBtn.setText("Quad");
        quadBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quadBtnMouseClicked(evt);
            }
        });

        tripleBtn.setBackground(new java.awt.Color(204, 204, 255));
        tripleBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        tripleBtn.setText("Triple");
        tripleBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tripleBtnMouseClicked(evt);
            }
        });

        ventiBtn.setBackground(new java.awt.Color(255, 255, 153));
        ventiBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        ventiBtn.setText("Venti");
        ventiBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ventiBtnMouseClicked(evt);
            }
        });

        blondeBtn.setBackground(new java.awt.Color(204, 255, 255));
        blondeBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        blondeBtn.setText("Blonde");
        blondeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blondeBtnMouseClicked(evt);
            }
        });

        decafBtn.setBackground(new java.awt.Color(204, 255, 255));
        decafBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        decafBtn.setText("Decaf");
        decafBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                decafBtnMouseClicked(evt);
            }
        });

        ristrettoBtn.setBackground(new java.awt.Color(204, 204, 255));
        ristrettoBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        ristrettoBtn.setText("Ristretto");
        ristrettoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ristrettoBtnMouseClicked(evt);
            }
        });

        moreShotsBtn.setBackground(new java.awt.Color(204, 204, 255));
        moreShotsBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        moreShotsBtn.setText("More Shots");
        moreShotsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moreShotsBtnMouseClicked(evt);
            }
        });

        updosedBtn.setBackground(new java.awt.Color(204, 204, 255));
        updosedBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        updosedBtn.setText("Updosed");
        updosedBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updosedBtnMouseClicked(evt);
            }
        });
        updosedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updosedBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(shortBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soloBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tallBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doppioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(kidsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grandeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tripleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blondeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ventiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(quadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(decafBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(updosedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ristrettoBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moreShotsBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(moreShotsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(ristrettoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(blondeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(decafBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tripleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(96, 96, 96)
                                .addComponent(updosedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(grandeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ventiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(icedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(soloBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(doppioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(96, 96, 96)
                                .addComponent(kidsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(shortBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tallBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkCurrentNull() {
        if (StarbucksEmulator.order.current() == null) {
            StarbucksEmulator.order.addItem(new Drink());
        }
        current = (Drink)StarbucksEmulator.order.current();
    }
    
    private void updateText() {
        ((EmulatorPanel)this.getParent().getParent()).updateText(current.toString());
    }
    
    private void icedBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icedBtnMouseClicked
        checkCurrentNull();
        current.setIced();
        updateText();
    }//GEN-LAST:event_icedBtnMouseClicked

    private void blondeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blondeBtnMouseClicked
        checkCurrentNull();
        current.getEspresso().setRoast(Roast.BLONDE);
        updateText();
    }//GEN-LAST:event_blondeBtnMouseClicked

    private void updosedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updosedBtnActionPerformed
        
    }//GEN-LAST:event_updosedBtnActionPerformed

    private void decafBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decafBtnMouseClicked
        checkCurrentNull();
        current.getEspresso().setDecaf();
        updateText();
    }//GEN-LAST:event_decafBtnMouseClicked

    private void updosedBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updosedBtnMouseClicked
        checkCurrentNull();
        current.getEspresso().setShots(current.getEspresso().getShotNum() + 1);
        updateText();
    }//GEN-LAST:event_updosedBtnMouseClicked

    private void soloBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soloBtnMouseClicked
        checkCurrentNull();
        current.getEspresso().setShots(1);
        updateText();
    }//GEN-LAST:event_soloBtnMouseClicked

    private void doppioBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doppioBtnMouseClicked
        checkCurrentNull();
        current.getEspresso().setShots(2);
        updateText();
    }//GEN-LAST:event_doppioBtnMouseClicked

    private void tripleBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tripleBtnMouseClicked
        checkCurrentNull();
        current.getEspresso().setShots(3);
        updateText();
    }//GEN-LAST:event_tripleBtnMouseClicked

    private void quadBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quadBtnMouseClicked
        checkCurrentNull();
        current.getEspresso().setShots(4);
        updateText();
    }//GEN-LAST:event_quadBtnMouseClicked

    private void moreShotsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moreShotsBtnMouseClicked
        checkCurrentNull();
        DataMover dm = StarbucksEmulator.dm;
        NumberKeyPopup nkp = new NumberKeyPopup("QUANTITY", StarbucksEmulator.stmt, dm);
        nkp.setVisible(true);
        dm.guardDone();
        nkp.dispose();
        current.getEspresso().setShots(dm.getInt());
        updateText();
    }//GEN-LAST:event_moreShotsBtnMouseClicked

    private void ristrettoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ristrettoBtnMouseClicked
        checkCurrentNull();
        current.getEspresso().setRistretto();
        updateText();
    }//GEN-LAST:event_ristrettoBtnMouseClicked

    private void kidsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kidsBtnMouseClicked
        checkCurrentNull();
        current.setSize(kidsBtn.getText().toUpperCase());
        updateText();
    }//GEN-LAST:event_kidsBtnMouseClicked

    private void shortBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shortBtnMouseClicked
        checkCurrentNull();
        current.setSize(shortBtn.getText().toUpperCase());
        updateText();
    }//GEN-LAST:event_shortBtnMouseClicked

    private void tallBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tallBtnMouseClicked
        checkCurrentNull();
        current.setSize(tallBtn.getText().toUpperCase());
        updateText();
    }//GEN-LAST:event_tallBtnMouseClicked

    private void grandeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grandeBtnMouseClicked
        checkCurrentNull();
        current.setSize(grandeBtn.getText().toUpperCase());
        updateText();
    }//GEN-LAST:event_grandeBtnMouseClicked

    private void ventiBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventiBtnMouseClicked
        checkCurrentNull();
        current.setSize(ventiBtn.getText().toUpperCase());
        updateText();
    }//GEN-LAST:event_ventiBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blondeBtn;
    private javax.swing.JButton decafBtn;
    private javax.swing.JButton doppioBtn;
    private javax.swing.JButton grandeBtn;
    private javax.swing.JButton icedBtn;
    private javax.swing.JButton kidsBtn;
    private javax.swing.JButton moreShotsBtn;
    private javax.swing.JButton quadBtn;
    private javax.swing.JButton ristrettoBtn;
    private javax.swing.JButton shortBtn;
    private javax.swing.JButton soloBtn;
    private javax.swing.JButton tallBtn;
    private javax.swing.JButton tripleBtn;
    private javax.swing.JButton updosedBtn;
    private javax.swing.JButton ventiBtn;
    // End of variables declaration//GEN-END:variables
}
