package main;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modell.Auto;

public class AutosProgramGui extends javax.swing.JFrame {

    private Auto[] autok;
    private int index;

    public AutosProgramGui() {
        autok = new Auto[5];
        index = 0;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTank = new javax.swing.JLabel();
        lbTankAllapot = new javax.swing.JLabel();
        lbPotkerek = new javax.swing.JLabel();
        lbPotkerekSzam = new javax.swing.JLabel();
        lbDefekt = new javax.swing.JLabel();
        lbDefektAllapot = new javax.swing.JLabel();
        lbAuto = new javax.swing.JLabel();
        lbAutoAllapot = new javax.swing.JLabel();
        autoPanel = new javax.swing.JPanel();
        btBeindit = new javax.swing.JButton();
        btMegy = new javax.swing.JButton();
        btTankol = new javax.swing.JButton();
        cbEselyDefektre = new javax.swing.JCheckBox();
        btLeallit = new javax.swing.JButton();
        btKerekcsere = new javax.swing.JButton();
        cbxAutoKivalasztasa = new javax.swing.JComboBox<>();
        UjAutoPanel = new javax.swing.JPanel();
        cbUzemanyag = new javax.swing.JCheckBox();
        sprPotkerekSzam = new javax.swing.JSpinner();
        lbPotkerekBevitel = new javax.swing.JLabel();
        cbBeinditva = new javax.swing.JCheckBox();
        btGarázsba = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Állapot"));

        lbTank.setText("Tank:");

        lbPotkerek.setText("Pótkerék:");

        lbDefekt.setText("Defekt:");

        lbAuto.setText("Autó:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbDefekt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbDefektAllapot))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbPotkerek)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbPotkerekSzam))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTank)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbTankAllapot))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbAuto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbAutoAllapot)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAuto)
                    .addComponent(lbAutoAllapot))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTank)
                    .addComponent(lbTankAllapot))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPotkerek)
                    .addComponent(lbPotkerekSzam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDefekt)
                    .addComponent(lbDefektAllapot))
                .addGap(21, 21, 21))
        );

        autoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Autó"));

        btBeindit.setText("Beindít");
        btBeindit.setEnabled(false);
        btBeindit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBeinditActionPerformed(evt);
            }
        });

        btMegy.setText("Megy");
        btMegy.setEnabled(false);
        btMegy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMegyActionPerformed(evt);
            }
        });

        btTankol.setText("Tankol");
        btTankol.setEnabled(false);
        btTankol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTankolActionPerformed(evt);
            }
        });

        cbEselyDefektre.setText("Esély defektre?");
        cbEselyDefektre.setEnabled(false);

        btLeallit.setText("Leállít");
        btLeallit.setEnabled(false);
        btLeallit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLeallitActionPerformed(evt);
            }
        });

        btKerekcsere.setText("Kerékcsere");
        btKerekcsere.setEnabled(false);
        btKerekcsere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKerekcsereActionPerformed(evt);
            }
        });

        cbxAutoKivalasztasa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Autó kiválasztása--" }));
        cbxAutoKivalasztasa.setToolTipText("");
        cbxAutoKivalasztasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAutoKivalasztasaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout autoPanelLayout = new javax.swing.GroupLayout(autoPanel);
        autoPanel.setLayout(autoPanelLayout);
        autoPanelLayout.setHorizontalGroup(
            autoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(autoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(autoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(autoPanelLayout.createSequentialGroup()
                        .addComponent(btMegy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(cbEselyDefektre))
                    .addGroup(autoPanelLayout.createSequentialGroup()
                        .addGroup(autoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(autoPanelLayout.createSequentialGroup()
                                .addComponent(btTankol)
                                .addGap(18, 18, 18)
                                .addComponent(btKerekcsere))
                            .addGroup(autoPanelLayout.createSequentialGroup()
                                .addComponent(btBeindit)
                                .addGap(18, 18, 18)
                                .addComponent(btLeallit))
                            .addComponent(cbxAutoKivalasztasa, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        autoPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btBeindit, btKerekcsere, btLeallit, btMegy, btTankol});

        autoPanelLayout.setVerticalGroup(
            autoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(autoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxAutoKivalasztasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(autoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBeindit)
                    .addComponent(btLeallit))
                .addGap(18, 18, 18)
                .addGroup(autoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMegy)
                    .addComponent(cbEselyDefektre))
                .addGap(18, 18, 18)
                .addGroup(autoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTankol)
                    .addComponent(btKerekcsere))
                .addGap(17, 17, 17))
        );

        UjAutoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Új autó"));

        cbUzemanyag.setText("Üzemanyag");

        sprPotkerekSzam.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        sprPotkerekSzam.setToolTipText("");

        lbPotkerekBevitel.setText("Pótkerekek:");

        cbBeinditva.setText("Beindítva");

        btGarázsba.setText("Garázsba");
        btGarázsba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGarázsbaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UjAutoPanelLayout = new javax.swing.GroupLayout(UjAutoPanel);
        UjAutoPanel.setLayout(UjAutoPanelLayout);
        UjAutoPanelLayout.setHorizontalGroup(
            UjAutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UjAutoPanelLayout.createSequentialGroup()
                .addGroup(UjAutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UjAutoPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(UjAutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbUzemanyag)
                            .addComponent(cbBeinditva, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UjAutoPanelLayout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(UjAutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btGarázsba, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(UjAutoPanelLayout.createSequentialGroup()
                                .addComponent(lbPotkerekBevitel)
                                .addGap(18, 18, 18)
                                .addComponent(sprPotkerekSzam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        UjAutoPanelLayout.setVerticalGroup(
            UjAutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UjAutoPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(cbUzemanyag)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbBeinditva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UjAutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sprPotkerekSzam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPotkerekBevitel))
                .addGap(37, 37, 37)
                .addComponent(btGarázsba)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(UjAutoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(autoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(autoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UjAutoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGarázsbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGarázsbaActionPerformed
        boolean uzemanyag = cbUzemanyag.isSelected();
        boolean beinditva = cbBeinditva.isSelected();
        int potKerekSzam = (int) sprPotkerekSzam.getValue();

        Auto a = new Auto(uzemanyag, beinditva, potKerekSzam);
        autok[index++] = a;
        cbxAutoKivalasztasa.addItem("Autó " + index);
    }//GEN-LAST:event_btGarázsbaActionPerformed

    private void cbxAutoKivalasztasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAutoKivalasztasaActionPerformed
        int i = cbxAutoKivalasztasa.getSelectedIndex() - 1;
        if (i > -1) {
            allapotPanelKiiras(i);
            elerhetosegModositas(true);
        } else {
            elerhetosegModositas(false);
        }

    }//GEN-LAST:event_cbxAutoKivalasztasaActionPerformed

    private void elerhetosegModositas(boolean elerheto) {
        btBeindit.setEnabled(elerheto);
        btLeallit.setEnabled(elerheto);
        btMegy.setEnabled(elerheto);
        cbEselyDefektre.setEnabled(elerheto);
        btTankol.setEnabled(elerheto);
        btKerekcsere.setEnabled(elerheto);
    }

    private void allapotPanelKiiras(int i) {
        String ki = autok[i].isBeinditva() ? "Beindítva" : "Leállítva";
        lbAutoAllapot.setText(ki);
        ki = autok[i].isUzemanyag() ? "Tele" : "Üres";
        lbTankAllapot.setText(ki);
        lbPotkerekSzam.setText("" + autok[i].getPotkerek());
        ki = autok[i].isDefekt() ? "Van" : "Nincs";
        lbDefektAllapot.setText(ki);
    }

    private void btBeinditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBeinditActionPerformed
        int i = cbxAutoKivalasztasa.getSelectedIndex() - 1;
        autok[i].setBeinditva(true);
        allapotPanelKiiras(i);
    }//GEN-LAST:event_btBeinditActionPerformed

    private void btMegyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMegyActionPerformed
        int i = cbxAutoKivalasztasa.getSelectedIndex() - 1;
        if (cbEselyDefektre.isSelected()) {
            try {
                autok[i].megyEselyDefektre();
                allapotPanelKiiras(i);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(autoPanel, ex.getMessage());
            }
        } else {
            try {
                autok[i].megy();
                allapotPanelKiiras(i);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(autoPanel, ex.getMessage());
            }
        }
    }//GEN-LAST:event_btMegyActionPerformed

    private void btLeallitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLeallitActionPerformed
        int i = cbxAutoKivalasztasa.getSelectedIndex() - 1;
        autok[i].setBeinditva(false);
        allapotPanelKiiras(i);
    }//GEN-LAST:event_btLeallitActionPerformed

    private void btTankolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTankolActionPerformed
        int i = cbxAutoKivalasztasa.getSelectedIndex() - 1;
        try {
            autok[i].tankol();
            allapotPanelKiiras(i);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(autoPanel, ex.getMessage());
        }
    }//GEN-LAST:event_btTankolActionPerformed

    private void btKerekcsereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKerekcsereActionPerformed
        int i = cbxAutoKivalasztasa.getSelectedIndex() - 1;
        try {
            autok[i].kerekCsere();
            allapotPanelKiiras(i);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(autoPanel, ex.getMessage());
        }
    }//GEN-LAST:event_btKerekcsereActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AutosProgramGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutosProgramGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutosProgramGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutosProgramGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutosProgramGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UjAutoPanel;
    private javax.swing.JPanel autoPanel;
    private javax.swing.JButton btBeindit;
    private javax.swing.JButton btGarázsba;
    private javax.swing.JButton btKerekcsere;
    private javax.swing.JButton btLeallit;
    private javax.swing.JButton btMegy;
    private javax.swing.JButton btTankol;
    private javax.swing.JCheckBox cbBeinditva;
    private javax.swing.JCheckBox cbEselyDefektre;
    private javax.swing.JCheckBox cbUzemanyag;
    private javax.swing.JComboBox<String> cbxAutoKivalasztasa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAuto;
    private javax.swing.JLabel lbAutoAllapot;
    private javax.swing.JLabel lbDefekt;
    private javax.swing.JLabel lbDefektAllapot;
    private javax.swing.JLabel lbPotkerek;
    private javax.swing.JLabel lbPotkerekBevitel;
    private javax.swing.JLabel lbPotkerekSzam;
    private javax.swing.JLabel lbTank;
    private javax.swing.JLabel lbTankAllapot;
    private javax.swing.JSpinner sprPotkerekSzam;
    // End of variables declaration//GEN-END:variables
}
