/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Penarikan extends javax.swing.JFrame {

    public Awal Awal;
    public MenuUtama MenuUtama;
    public ATM atm = new ATM();

    public Penarikan() {
        setLocation(420, 180);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton2 = new javax.swing.JRadioButton();
        btgJumlah = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rb100 = new javax.swing.JRadioButton();
        rb300 = new javax.swing.JRadioButton();
        rb500 = new javax.swing.JRadioButton();
        rb1000 = new javax.swing.JRadioButton();
        txtJumlahLain = new javax.swing.JTextField();
        btnKeluar = new javax.swing.JButton();
        btnTarik = new javax.swing.JButton();
        rbJumlahLain = new javax.swing.JRadioButton();
        btnTL = new javax.swing.JButton();

        jRadioButton2.setText("100.000");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 300));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("MENU UTAMA PENARIKAN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("(PECAHAN UANG RP. 50.000)");

        btgJumlah.add(rb100);
        rb100.setForeground(new java.awt.Color(255, 255, 0));
        rb100.setText("100.000");
        rb100.setOpaque(false);
        rb100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb100ActionPerformed(evt);
            }
        });

        btgJumlah.add(rb300);
        rb300.setForeground(new java.awt.Color(255, 255, 0));
        rb300.setText("300.000");
        rb300.setOpaque(false);
        rb300.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb300ActionPerformed(evt);
            }
        });

        btgJumlah.add(rb500);
        rb500.setForeground(new java.awt.Color(255, 255, 0));
        rb500.setText("500.000");
        rb500.setOpaque(false);
        rb500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb500ActionPerformed(evt);
            }
        });

        btgJumlah.add(rb1000);
        rb1000.setForeground(new java.awt.Color(255, 255, 0));
        rb1000.setText("1.000.000");
        rb1000.setOpaque(false);
        rb1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1000ActionPerformed(evt);
            }
        });

        txtJumlahLain.setEditable(false);

        btnKeluar.setText("KELUAR");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        btnTarik.setText("TARIK");
        btnTarik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarikActionPerformed(evt);
            }
        });

        btgJumlah.add(rbJumlahLain);
        rbJumlahLain.setForeground(new java.awt.Color(255, 255, 0));
        rbJumlahLain.setText("JUMLAH LAIN");
        rbJumlahLain.setOpaque(false);
        rbJumlahLain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbJumlahLainActionPerformed(evt);
            }
        });

        btnTL.setText("TRANSAKSI LAINNYA");
        btnTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel2)
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnKeluar)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb100)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rb500))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb300)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rb1000)))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbJumlahLain)
                        .addGap(18, 18, 18)
                        .addComponent(txtJumlahLain, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTarik)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb100)
                    .addComponent(rb500))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb300)
                    .addComponent(rb1000))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbJumlahLain)
                    .addComponent(txtJumlahLain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnTarik)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKeluar)
                    .addComponent(btnTL))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        Awal = new Awal();
        Awal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTLActionPerformed
        MenuUtama = new MenuUtama();
        MenuUtama.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTLActionPerformed

    private void btnTarikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarikActionPerformed
        int uang = 0;
        if (rb100.isSelected() == true) {
            uang = 100000;
        } else if (rb300.isSelected() == true) {
            uang = 300000;
        } else if (rb500.isSelected() == true) {
            uang = 500000;
        } else if (rb1000.isSelected() == true) {
            uang = 1000000;
        } else if (rbJumlahLain.isSelected() == true) {
            uang = Integer.parseInt(txtJumlahLain.getText());
        }
        String hasil = atm.EnterAmount(uang);
        JOptionPane.showMessageDialog(this, hasil, "Inforamsi", JOptionPane.INFORMATION_MESSAGE);
        txtJumlahLain.setText("");
    }//GEN-LAST:event_btnTarikActionPerformed

    private void rbJumlahLainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbJumlahLainActionPerformed
        txtJumlahLain.setEditable(true);
        txtJumlahLain.requestFocus();
    }//GEN-LAST:event_rbJumlahLainActionPerformed

    private void rb300ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb300ActionPerformed
        txtJumlahLain.setEditable(false);
    }//GEN-LAST:event_rb300ActionPerformed

    private void rb100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb100ActionPerformed
        txtJumlahLain.setEditable(false);
    }//GEN-LAST:event_rb100ActionPerformed

    private void rb500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb500ActionPerformed
        txtJumlahLain.setEditable(false);
    }//GEN-LAST:event_rb500ActionPerformed

    private void rb1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1000ActionPerformed
        txtJumlahLain.setEditable(false);
    }//GEN-LAST:event_rb1000ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Penarikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Penarikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Penarikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Penarikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Penarikan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgJumlah;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnTL;
    private javax.swing.JButton btnTarik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton rb100;
    private javax.swing.JRadioButton rb1000;
    private javax.swing.JRadioButton rb300;
    private javax.swing.JRadioButton rb500;
    private javax.swing.JRadioButton rbJumlahLain;
    private javax.swing.JTextField txtJumlahLain;
    // End of variables declaration//GEN-END:variables
}
