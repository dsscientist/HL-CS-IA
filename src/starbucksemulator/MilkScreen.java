/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbucksemulator;

import java.sql.Statement;


public class MilkScreen extends javax.swing.JPanel {
    
    private javax.swing.JButton[] buttons = new javax.swing.JButton[24];
    private Statement stmt;
    private Drink current;
    private String mutator = ""; //for 'extra' and 'light'
    
    public MilkScreen(Statement s) {
        initComponents();
        stmt = s;
        addButtons();
        roundButtons();
    }
    
    private void addButtons() {
        buttons[0] = almondMilkBtn;
        buttons[1] = coconutMilkBtn;
        buttons[2] = dairyBtn;
        buttons[3] = eggnogBtn;
        buttons[4] = extraBtn;
        buttons[5] = halfNHalfBtn;
        buttons[6] = heavyCreamBtn;
        buttons[7] = wholeMilkBtn;
        buttons[8] = lactaidMilkBtn;
        buttons[9] = lightBtn;
        buttons[10] = nonfatMilkBtn;
        buttons[11] = onePMilkBtn;
        buttons[12] = soyMilkBtn;
        buttons[13] = twoPMilkBtn;
        buttons[14] = with1PBtn;
        buttons[15] = with2PBtn;
        buttons[16] = withAlmondBtn;
        buttons[17] = withCoconutBtn;
        buttons[18] = withHalfNHalfBtn;
        buttons[19] = withHeavyCreamBtn;
        buttons[20] = withLactaidBtn;
        buttons[21] = withNonfatBtn;
        buttons[22] = withSoyBtn;
        buttons[23] = withWholeBtn;
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

        nonfatMilkBtn = new javax.swing.JButton();
        onePMilkBtn = new javax.swing.JButton();
        twoPMilkBtn = new javax.swing.JButton();
        wholeMilkBtn = new javax.swing.JButton();
        soyMilkBtn = new javax.swing.JButton();
        lactaidMilkBtn = new javax.swing.JButton();
        coconutMilkBtn = new javax.swing.JButton();
        almondMilkBtn = new javax.swing.JButton();
        halfNHalfBtn = new javax.swing.JButton();
        heavyCreamBtn = new javax.swing.JButton();
        eggnogBtn = new javax.swing.JButton();
        dairyBtn = new javax.swing.JButton();
        withAlmondBtn = new javax.swing.JButton();
        withHalfNHalfBtn = new javax.swing.JButton();
        withHeavyCreamBtn = new javax.swing.JButton();
        extraBtn = new javax.swing.JButton();
        lightBtn = new javax.swing.JButton();
        with2PBtn = new javax.swing.JButton();
        withWholeBtn = new javax.swing.JButton();
        withSoyBtn = new javax.swing.JButton();
        withLactaidBtn = new javax.swing.JButton();
        withCoconutBtn = new javax.swing.JButton();
        withNonfatBtn = new javax.swing.JButton();
        with1PBtn = new javax.swing.JButton();

        nonfatMilkBtn.setBackground(new java.awt.Color(204, 255, 255));
        nonfatMilkBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        nonfatMilkBtn.setText("Nonfat Milk");
        nonfatMilkBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nonfatMilkBtnMouseClicked(evt);
            }
        });

        onePMilkBtn.setBackground(new java.awt.Color(204, 255, 255));
        onePMilkBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        onePMilkBtn.setText("1% Milk");
        onePMilkBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onePMilkBtnMouseClicked(evt);
            }
        });

        twoPMilkBtn.setBackground(new java.awt.Color(204, 255, 255));
        twoPMilkBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        twoPMilkBtn.setText("2% Milk");
        twoPMilkBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twoPMilkBtnMouseClicked(evt);
            }
        });

        wholeMilkBtn.setBackground(new java.awt.Color(204, 255, 255));
        wholeMilkBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        wholeMilkBtn.setText("Whole Milk");
        wholeMilkBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wholeMilkBtnMouseClicked(evt);
            }
        });

        soyMilkBtn.setBackground(new java.awt.Color(255, 255, 204));
        soyMilkBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        soyMilkBtn.setText("Soy Milk");
        soyMilkBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soyMilkBtnMouseClicked(evt);
            }
        });

        lactaidMilkBtn.setBackground(new java.awt.Color(255, 255, 204));
        lactaidMilkBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        lactaidMilkBtn.setText("Lactaid Milk");
        lactaidMilkBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lactaidMilkBtnMouseClicked(evt);
            }
        });

        coconutMilkBtn.setBackground(new java.awt.Color(255, 255, 204));
        coconutMilkBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        coconutMilkBtn.setText("Coconut Milk");
        coconutMilkBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coconutMilkBtnMouseClicked(evt);
            }
        });

        almondMilkBtn.setBackground(new java.awt.Color(255, 255, 204));
        almondMilkBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        almondMilkBtn.setText("Almond Milk");
        almondMilkBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                almondMilkBtnMouseClicked(evt);
            }
        });

        halfNHalfBtn.setBackground(new java.awt.Color(204, 204, 255));
        halfNHalfBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        halfNHalfBtn.setText("Half & Half (Breve)");
        halfNHalfBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                halfNHalfBtnMouseClicked(evt);
            }
        });

        heavyCreamBtn.setBackground(new java.awt.Color(204, 204, 255));
        heavyCreamBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        heavyCreamBtn.setText("Heavy Cream");
        heavyCreamBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                heavyCreamBtnMouseClicked(evt);
            }
        });

        eggnogBtn.setBackground(new java.awt.Color(204, 204, 255));
        eggnogBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        eggnogBtn.setText("Eggnog");
        eggnogBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eggnogBtnMouseClicked(evt);
            }
        });

        dairyBtn.setBackground(new java.awt.Color(204, 204, 204));
        dairyBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        dairyBtn.setText("Add Dairy");
        dairyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dairyBtnMouseClicked(evt);
            }
        });

        withAlmondBtn.setBackground(new java.awt.Color(255, 255, 204));
        withAlmondBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        withAlmondBtn.setText(" WithAlmond Milk");
        withAlmondBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withAlmondBtnMouseClicked(evt);
            }
        });

        withHalfNHalfBtn.setBackground(new java.awt.Color(204, 204, 255));
        withHalfNHalfBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        withHalfNHalfBtn.setText("With Half & Half (Breve)");
        withHalfNHalfBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withHalfNHalfBtnMouseClicked(evt);
            }
        });

        withHeavyCreamBtn.setBackground(new java.awt.Color(204, 204, 255));
        withHeavyCreamBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        withHeavyCreamBtn.setText("With Heavy Cream");
        withHeavyCreamBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withHeavyCreamBtnMouseClicked(evt);
            }
        });
        withHeavyCreamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withHeavyCreamBtnActionPerformed(evt);
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

        with2PBtn.setBackground(new java.awt.Color(204, 255, 255));
        with2PBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        with2PBtn.setText("With 2% Milk");
        with2PBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                with2PBtnMouseClicked(evt);
            }
        });

        withWholeBtn.setBackground(new java.awt.Color(204, 255, 255));
        withWholeBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        withWholeBtn.setText("With Whole Milk");
        withWholeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withWholeBtnMouseClicked(evt);
            }
        });

        withSoyBtn.setBackground(new java.awt.Color(255, 255, 204));
        withSoyBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        withSoyBtn.setText("With Soy Milk");
        withSoyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withSoyBtnMouseClicked(evt);
            }
        });

        withLactaidBtn.setBackground(new java.awt.Color(255, 255, 204));
        withLactaidBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        withLactaidBtn.setText("With Lactaid Milk");
        withLactaidBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withLactaidBtnMouseClicked(evt);
            }
        });

        withCoconutBtn.setBackground(new java.awt.Color(255, 255, 204));
        withCoconutBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        withCoconutBtn.setText("With Coconut Milk");
        withCoconutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withCoconutBtnMouseClicked(evt);
            }
        });

        withNonfatBtn.setBackground(new java.awt.Color(204, 255, 255));
        withNonfatBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        withNonfatBtn.setText("With Nonfat Milk");
        withNonfatBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withNonfatBtnMouseClicked(evt);
            }
        });

        with1PBtn.setBackground(new java.awt.Color(204, 255, 255));
        with1PBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        with1PBtn.setText("With 1% Milk");
        with1PBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                with1PBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eggnogBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dairyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(halfNHalfBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(heavyCreamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(coconutMilkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(almondMilkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(soyMilkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lactaidMilkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(twoPMilkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(wholeMilkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nonfatMilkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(onePMilkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(withHalfNHalfBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(withHeavyCreamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(withCoconutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(withAlmondBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(withSoyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(withLactaidBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(with2PBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(withWholeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(extraBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(withNonfatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(with1PBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nonfatMilkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(onePMilkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(twoPMilkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wholeMilkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soyMilkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lactaidMilkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coconutMilkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(almondMilkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(halfNHalfBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(heavyCreamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(extraBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(withNonfatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(with1PBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(with2PBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(withWholeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(withSoyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(withLactaidBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(withCoconutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(withAlmondBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(withHalfNHalfBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(withHeavyCreamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eggnogBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dairyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkCurrentNull() {
        if (StarbucksEmulator.order.current() == null) {
            StarbucksEmulator.order.addItem(new Drink());
            current = (Drink)StarbucksEmulator.order.current();
        }
        current = (Drink)StarbucksEmulator.order.current();
    }
    
    private void updateText() {
        ((EmulatorPanel)this.getParent().getParent()).updateText(StarbucksEmulator.order.toString());
    }
    
    private void withHeavyCreamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withHeavyCreamBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withHeavyCreamBtnActionPerformed

    private void nonfatMilkBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nonfatMilkBtnMouseClicked
        checkCurrentNull();
        current.setMilk(nonfatMilkBtn.getText());
        updateText();
    }//GEN-LAST:event_nonfatMilkBtnMouseClicked

    private void onePMilkBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onePMilkBtnMouseClicked
        checkCurrentNull();
        current.setMilk(onePMilkBtn.getText());
        updateText();
    }//GEN-LAST:event_onePMilkBtnMouseClicked

    private void twoPMilkBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoPMilkBtnMouseClicked
        checkCurrentNull();
        current.setMilk(twoPMilkBtn.getText());
        updateText();
    }//GEN-LAST:event_twoPMilkBtnMouseClicked

    private void wholeMilkBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wholeMilkBtnMouseClicked
        checkCurrentNull();
        current.setMilk(wholeMilkBtn.getText());
        updateText();
    }//GEN-LAST:event_wholeMilkBtnMouseClicked

    private void soyMilkBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soyMilkBtnMouseClicked
        checkCurrentNull();
        current.setMilk(soyMilkBtn.getText());
        updateText();
    }//GEN-LAST:event_soyMilkBtnMouseClicked

    private void lactaidMilkBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lactaidMilkBtnMouseClicked
        checkCurrentNull();
        current.setMilk(lactaidMilkBtn.getText());
        updateText();
    }//GEN-LAST:event_lactaidMilkBtnMouseClicked

    private void coconutMilkBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coconutMilkBtnMouseClicked
        checkCurrentNull();
        current.setMilk(coconutMilkBtn.getText());
        updateText();
    }//GEN-LAST:event_coconutMilkBtnMouseClicked

    private void almondMilkBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_almondMilkBtnMouseClicked
        checkCurrentNull();
        current.setMilk(almondMilkBtn.getText());
        updateText();
    }//GEN-LAST:event_almondMilkBtnMouseClicked

    private void halfNHalfBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_halfNHalfBtnMouseClicked
        checkCurrentNull();
        current.setMilk(halfNHalfBtn.getText());
        updateText();
    }//GEN-LAST:event_halfNHalfBtnMouseClicked

    private void heavyCreamBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_heavyCreamBtnMouseClicked
        checkCurrentNull();
        current.setMilk(heavyCreamBtn.getText());
        updateText();
    }//GEN-LAST:event_heavyCreamBtnMouseClicked

    private void eggnogBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eggnogBtnMouseClicked
        checkCurrentNull();
        current.setMilk(eggnogBtn.getText());
        updateText();
    }//GEN-LAST:event_eggnogBtnMouseClicked

    private void dairyBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dairyBtnMouseClicked
        checkCurrentNull();
        current.setMilk(dairyBtn.getText());
        updateText();
    }//GEN-LAST:event_dairyBtnMouseClicked

    private void withNonfatBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withNonfatBtnMouseClicked
        checkCurrentNull();
        current.addCustom(String.format("w/ %snonfat milk", mutator));
        updateText();
        mutator = "";
    }//GEN-LAST:event_withNonfatBtnMouseClicked

    private void with1PBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_with1PBtnMouseClicked
        checkCurrentNull();
        current.addCustom(String.format("w/ %s1 percent milk", mutator));
        updateText();
        mutator = "";
    }//GEN-LAST:event_with1PBtnMouseClicked

    private void with2PBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_with2PBtnMouseClicked
        checkCurrentNull();
        current.addCustom(String.format("w/ %s2 percent milk", mutator));
        updateText();
        mutator = "";
    }//GEN-LAST:event_with2PBtnMouseClicked

    private void withWholeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withWholeBtnMouseClicked
        checkCurrentNull();
        current.addCustom(String.format("w/ %swhole milk", mutator));
        updateText();
        mutator = "";
    }//GEN-LAST:event_withWholeBtnMouseClicked

    private void withSoyBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withSoyBtnMouseClicked
        checkCurrentNull();
        current.addCustom(String.format("w/ %ssoy milk", mutator));
        updateText();
        mutator = "";
    }//GEN-LAST:event_withSoyBtnMouseClicked

    private void withLactaidBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withLactaidBtnMouseClicked
        checkCurrentNull();
        current.addCustom(String.format("w/ %slactaid milk", mutator));
        updateText();
        mutator = "";
    }//GEN-LAST:event_withLactaidBtnMouseClicked

    private void withCoconutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withCoconutBtnMouseClicked
        checkCurrentNull();
        current.addCustom(String.format("w/ %scoconut milk", mutator));
        updateText();
        mutator = "";
    }//GEN-LAST:event_withCoconutBtnMouseClicked

    private void withAlmondBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withAlmondBtnMouseClicked
        checkCurrentNull();
        current.addCustom(String.format("w/ %salmond milk", mutator));
        updateText();
        mutator = "";
    }//GEN-LAST:event_withAlmondBtnMouseClicked

    private void withHalfNHalfBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withHalfNHalfBtnMouseClicked
        checkCurrentNull();
        current.addCustom(String.format("w/ %sbreve", mutator));
        updateText();
        mutator = "";
    }//GEN-LAST:event_withHalfNHalfBtnMouseClicked

    private void withHeavyCreamBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withHeavyCreamBtnMouseClicked
        checkCurrentNull();
        current.addCustom(String.format("w/ %sheavy cream", mutator));
        updateText();
        mutator = "";
    }//GEN-LAST:event_withHeavyCreamBtnMouseClicked

    private void extraBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extraBtnMouseClicked
        mutator = "extra ";
    }//GEN-LAST:event_extraBtnMouseClicked

    private void lightBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lightBtnMouseClicked
        mutator = "light ";
    }//GEN-LAST:event_lightBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton almondMilkBtn;
    private javax.swing.JButton coconutMilkBtn;
    private javax.swing.JButton dairyBtn;
    private javax.swing.JButton eggnogBtn;
    private javax.swing.JButton extraBtn;
    private javax.swing.JButton halfNHalfBtn;
    private javax.swing.JButton heavyCreamBtn;
    private javax.swing.JButton lactaidMilkBtn;
    private javax.swing.JButton lightBtn;
    private javax.swing.JButton nonfatMilkBtn;
    private javax.swing.JButton onePMilkBtn;
    private javax.swing.JButton soyMilkBtn;
    private javax.swing.JButton twoPMilkBtn;
    private javax.swing.JButton wholeMilkBtn;
    private javax.swing.JButton with1PBtn;
    private javax.swing.JButton with2PBtn;
    private javax.swing.JButton withAlmondBtn;
    private javax.swing.JButton withCoconutBtn;
    private javax.swing.JButton withHalfNHalfBtn;
    private javax.swing.JButton withHeavyCreamBtn;
    private javax.swing.JButton withLactaidBtn;
    private javax.swing.JButton withNonfatBtn;
    private javax.swing.JButton withSoyBtn;
    private javax.swing.JButton withWholeBtn;
    // End of variables declaration//GEN-END:variables
}
