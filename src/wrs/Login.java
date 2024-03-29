/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package wrs;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import wrs.SystemWRS.*;

/**
 *
 * @author PC
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        SystemWRS.MsSqlDB();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPNL = new javax.swing.JPanel();
        wrsLBL = new javax.swing.JLabel();
        usernameLBL = new javax.swing.JLabel();
        passwordLBL = new javax.swing.JLabel();
        usernameFLD = new javax.swing.JTextField();
        passFLD = new javax.swing.JPasswordField();
        exitBTN = new javax.swing.JButton();
        loginBTN1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Water Refilling Station [Login]");
        setName("loginFRM"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 800));
        getContentPane().setLayout(new java.awt.CardLayout());

        wrsLBL.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        wrsLBL.setText("Water Refilling Station");

        usernameLBL.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        usernameLBL.setText("Username");

        passwordLBL.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        passwordLBL.setText("Password");

        usernameFLD.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        passFLD.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        exitBTN.setBackground(new java.awt.Color(255, 102, 102));
        exitBTN.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        exitBTN.setText("Exit");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        loginBTN1.setBackground(new java.awt.Color(102, 255, 102));
        loginBTN1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        loginBTN1.setText("Log In");
        loginBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBTN1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPNLLayout = new javax.swing.GroupLayout(mainPNL);
        mainPNL.setLayout(mainPNLLayout);
        mainPNLLayout.setHorizontalGroup(
            mainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPNLLayout.createSequentialGroup()
                .addGroup(mainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPNLLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(wrsLBL))
                    .addGroup(mainPNLLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(mainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLBL)
                            .addComponent(usernameLBL))
                        .addGap(47, 47, 47)
                        .addGroup(mainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameFLD, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passFLD, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPNLLayout.createSequentialGroup()
                                .addComponent(loginBTN1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exitBTN)))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        mainPNLLayout.setVerticalGroup(
            mainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPNLLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(wrsLBL)
                .addGap(33, 33, 33)
                .addGroup(mainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameFLD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLBL))
                .addGap(18, 18, 18)
                .addGroup(mainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passFLD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLBL))
                .addGap(18, 18, 18)
                .addGroup(mainPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitBTN)
                    .addComponent(loginBTN1))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        getContentPane().add(mainPNL, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBTNActionPerformed

    private void loginBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBTN1ActionPerformed
        // TODO add your handling code here:
        
        if (!(usernameFLD.getText().equals("")) || !(passFLD.getText().equals("")))
        {
            Connection conn = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            try{
                conn = SystemWRS.MsSqlDB();
                ps = conn.prepareStatement("SELECT * FROM account WHERE username = ?");
                ps.setString(1, usernameFLD.getText());
                rs = ps.executeQuery();

                if (rs.next())
                {
                    String db_password = rs.getString("password");
                    String db_username = rs.getString("username");

                    if (usernameFLD.getText().equals(db_username))
                    {
                        if(passFLD.getText().equals(db_password))
                        {
                            java.awt.EventQueue.invokeLater(new Runnable()
                            {
                                public void run()
                                {
                                    new Menu().setVisible(true);
                                    dispose();
                                }
                            });
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Wrong credentials, please try again!");
                        }
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"No user found!");
                }
            }
            catch (SQLException e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
            finally
            {
                try
                {
                    if (rs != null){
                        rs.close();
                    }
                    if (ps != null) {
                        ps.close();
                    }
                    if (conn != null) {
                        conn.close();
                    }
                }
                catch (SQLException e)
                {
                    JOptionPane.showMessageDialog(null,e.getMessage());
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please fill the information needed!");
        }
    }//GEN-LAST:event_loginBTN1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBTN;
    private javax.swing.JButton loginBTN1;
    private javax.swing.JPanel mainPNL;
    private javax.swing.JPasswordField passFLD;
    private javax.swing.JLabel passwordLBL;
    private javax.swing.JTextField usernameFLD;
    private javax.swing.JLabel usernameLBL;
    private javax.swing.JLabel wrsLBL;
    // End of variables declaration//GEN-END:variables
}
