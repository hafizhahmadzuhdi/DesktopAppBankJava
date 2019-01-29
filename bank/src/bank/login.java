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
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public Awal Awal;
    public MenuUtama MenuUtama;

    public static Akun Kartu;
    public static String ID;
    public static int PIN;
    public static ATM atm = new ATM ();
    

    
    public login() { 
        initComponents();
        setLocation(420, 180);

        
        this.btnLogin.setVisible(false);
        this.lbPIN.setVisible(false);
        this.passPin.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnInput = new javax.swing.JButton();
        lbPIN = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        passPin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 300));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("MASUKAN KARTU");

        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("ID KARTU");

        btnInput.setText("Input Kartu");
        btnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputActionPerformed(evt);
            }
        });

        lbPIN.setForeground(new java.awt.Color(255, 255, 0));
        lbPIN.setText("MASUKAN PIN");

        btnLogin.setText("LOG IN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCancel.setText("KELUAR");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(lbPIN))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passPin, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btnInput, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInput))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPIN)
                    .addComponent(passPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnCancel))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        ID = txtID.getText();
        PIN = Integer.parseInt(String.valueOf(passPin.getPassword()));
        if(atm.ValidatePIN(PIN)== true){
              MenuUtama = new MenuUtama();
               MenuUtama.setVisible(true);
               this.dispose();
         }
        else {
                JOptionPane.showMessageDialog(this, "PIN salah", "Inforamsi", JOptionPane.INFORMATION_MESSAGE);
        }
//        if(PIN==Kartu.getPIN()) {
//               MenuUtama = new MenuUtama();
//               MenuUtama.setVisible(true);
//               this.dispose();
//             
//        } else {
//                JOptionPane.showMessageDialog(this, "PIN salah", "Inforamsi", JOptionPane.INFORMATION_MESSAGE);
//            
//        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed
            
        
        if(atm.ValidateCard(txtID.getText())==true){
                     this.txtID.setEditable(false);
                     this.btnLogin.setVisible(true);
                     this.lbPIN.setVisible(true);
                     this.passPin.setVisible(true);
                     this.btnInput.setVisible(false);
        }
        
        else {
                JOptionPane.showMessageDialog(this, "ID tidak ditemukan", "Inforamsi", JOptionPane.INFORMATION_MESSAGE);

        }

        
        
        
    }//GEN-LAST:event_btnInputActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        Awal = new Awal();
        Awal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnInput;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbPIN;
    private javax.swing.JPasswordField passPin;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
