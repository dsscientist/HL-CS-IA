/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbucksemulator;

import java.sql.Connection;


public class EspressoDrinkScreen extends javax.swing.JPanel {
    
    private javax.swing.JButton[] buttons = new javax.swing.JButton[24];
    private Connection con;
    
    public EspressoDrinkScreen(Connection c) {
        initComponents();
        con = c;
        addButtons();
        addMouseListeners();
        roundButtons();
    }
    
    private void addButtons() {
        buttons[0] = almondMilkBtn;
        buttons[1] = coconutMilkBtn;
        buttons[2] = dairyButton;
        buttons[3] = eggnogBtn;
        buttons[4] = extraBtn;
        buttons[5] = halfNHalfBtn;
        buttons[6] = heavyCreamBtn;
        buttons[7] = jButton4;
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
    
    public void addMouseListeners() {
        for (javax.swing.JButton b : buttons) {
            b.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    System.out.println("hi");
                }
            });
        }
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
        jButton4 = new javax.swing.JButton();
        soyMilkBtn = new javax.swing.JButton();
        lactaidMilkBtn = new javax.swing.JButton();
        coconutMilkBtn = new javax.swing.JButton();
        almondMilkBtn = new javax.swing.JButton();
        halfNHalfBtn = new javax.swing.JButton();
        heavyCreamBtn = new javax.swing.JButton();
        eggnogBtn = new javax.swing.JButton();
        dairyButton = new javax.swing.JButton();
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

        twoPMilkBtn.setBackground(new java.awt.Color(204, 255, 255));
        twoPMilkBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        twoPMilkBtn.setText("2% Milk");

        jButton4.setBackground(new java.awt.Color(204, 255, 255));
        jButton4.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        jButton4.setText("Whole Milk");

        soyMilkBtn.setBackground(new java.awt.Color(255, 255, 204));
        soyMilkBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        soyMilkBtn.setText("Soy Milk");

        lactaidMilkBtn.setBackground(new java.awt.Color(255, 255, 204));
        lactaidMilkBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        lactaidMilkBtn.setText("Lactaid Milk");

        coconutMilkBtn.setBackground(new java.awt.Color(255, 255, 204));
        coconutMilkBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        coconutMilkBtn.setText("Coconut Milk");

        almondMilkBtn.setBackground(new java.awt.Color(255, 255, 204));
        almondMilkBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        almondMilkBtn.setText("Almond Milk");

        halfNHalfBtn.setBackground(new java.awt.Color(204, 204, 255));
        halfNHalfBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        halfNHalfBtn.setText("Half & Half (Breve)");

        heavyCreamBtn.setBackground(new java.awt.Color(204, 204, 255));
        heavyCreamBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        heavyCreamBtn.setText("Heavy Cream");

        eggnogBtn.setBackground(new java.awt.Color(204, 204, 255));
        eggnogBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        eggnogBtn.setText("Eggnog");

        dairyButton.setBackground(new java.awt.Color(204, 204, 204));
        dairyButton.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        dairyButton.setText("Add Dairy");

        withAlmondBtn.setBackground(new java.awt.Color(255, 255, 204));
        withAlmondBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        withAlmondBtn.setText(" WithAlmond Milk");

        withHalfNHalfBtn.setBackground(new java.awt.Color(204, 204, 255));
        withHalfNHalfBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        withHalfNHalfBtn.setText("With Half & Half (Breve)");

        withHeavyCreamBtn.setBackground(new java.awt.Color(204, 204, 255));
        withHeavyCreamBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        withHeavyCreamBtn.setText("With Heavy Cream");
        withHeavyCreamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withHeavyCreamBtnActionPerformed(evt);
            }
        });

        extraBtn.setBackground(new java.awt.Color(0, 0, 0));
        extraBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        extraBtn.setForeground(new java.awt.Color(255, 255, 255));
        extraBtn.setText("Extra");

        lightBtn.setBackground(new java.awt.Color(0, 0, 0));
        lightBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        lightBtn.setForeground(new java.awt.Color(255, 255, 255));
        lightBtn.setText("Light");

        with2PBtn.setBackground(new java.awt.Color(204, 255, 255));
        with2PBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        with2PBtn.setText("With 2% Milk");

        withWholeBtn.setBackground(new java.awt.Color(204, 255, 255));
        withWholeBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        withWholeBtn.setText("With Whole Milk");

        withSoyBtn.setBackground(new java.awt.Color(255, 255, 204));
        withSoyBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        withSoyBtn.setText("With Soy Milk");

        withLactaidBtn.setBackground(new java.awt.Color(255, 255, 204));
        withLactaidBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        withLactaidBtn.setText("With Lactaid Milk");

        withCoconutBtn.setBackground(new java.awt.Color(255, 255, 204));
        withCoconutBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        withCoconutBtn.setText("With Coconut Milk");

        withNonfatBtn.setBackground(new java.awt.Color(204, 255, 255));
        withNonfatBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        withNonfatBtn.setText("With Nonfat Milk");

        with1PBtn.setBackground(new java.awt.Color(204, 255, 255));
        with1PBtn.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        with1PBtn.setText("With 1% Milk");

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
                        .addComponent(dairyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(dairyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void withHeavyCreamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withHeavyCreamBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withHeavyCreamBtnActionPerformed

    private void nonfatMilkBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nonfatMilkBtnMouseClicked
        
    }//GEN-LAST:event_nonfatMilkBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton almondMilkBtn;
    private javax.swing.JButton coconutMilkBtn;
    private javax.swing.JButton dairyButton;
    private javax.swing.JButton eggnogBtn;
    private javax.swing.JButton extraBtn;
    private javax.swing.JButton halfNHalfBtn;
    private javax.swing.JButton heavyCreamBtn;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton lactaidMilkBtn;
    private javax.swing.JButton lightBtn;
    private javax.swing.JButton nonfatMilkBtn;
    private javax.swing.JButton onePMilkBtn;
    private javax.swing.JButton soyMilkBtn;
    private javax.swing.JButton twoPMilkBtn;
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
