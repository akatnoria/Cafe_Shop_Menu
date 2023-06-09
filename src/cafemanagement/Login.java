/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafemanagement;

import dao.UserDao;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author Lenovo
 */
public class Login extends javax.swing.JFrame {

   public String emailPattern= "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$" ;
   public String mobileNumerPattern= "^[0-9]*$" ;
    
    
    public Login() {
        initComponents();
        btnLogin.setEnabled(false);
    }
    
    public void Clear(){
        txtemail.setText("");
        txtPassword.setText("");
        btnLogin.setEnabled(false);
    }
    
    public void ValidateFields(){
        String email = txtemail.getText();
        String password = txtPassword.getText();
        
        if(email.matches(emailPattern) && !password.equals("")){
            btnLogin.setEnabled(true);
        }else{
             btnLogin.setEnabled(false);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnClear = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnSignup = new javax.swing.JButton();
        backgroundjLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1256, 638));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1256, 638));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(133, 121, 121));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 1, 56), new java.awt.Color(0, 51, 51))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 2147483647));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Email");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 90, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setText("Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 90, -1));

        txtemail.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailKeyReleased(evt);
            }
        });
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 321, -1));

        txtPassword.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 321, -1));

        btnClear.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\CafeManagement\\src\\images\\clear.png")); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, 36));

        btnLogin.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 110, 36));

        btnExit.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\CafeManagement\\src\\images\\exit small.png")); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 100, 36));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 51));
        jLabel10.setText("Forgot Password?");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        btnSignup.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnSignup.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\CafeManagement\\src\\images\\save.png")); // NOI18N
        btnSignup.setText("Signup");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 130, 36));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 620, 330));

        backgroundjLabel1.setBackground(new java.awt.Color(51, 255, 204));
        backgroundjLabel1.setPreferredSize(new java.awt.Dimension(1366, 786));
        getContentPane().add(backgroundjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        Clear();
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Signup().setVisible(true);
    }//GEN-LAST:event_btnSignupActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Close Application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
         // TODO add your handling code here:
        String email = txtemail.getText();
        String password = txtPassword.getText();
         User user = null;
         user =UserDao.login(email, password);        
         if(user == null)
         {
             JOptionPane.showConfirmDialog(null, "<html><b style= \"color:red\">Incorrect Username or Password </b></html>", "Message", JOptionPane.ERROR_MESSAGE);
        }
         else
         {
            if(user.getStatus().equals("false"))
            {
                ImageIcon icon = new ImageIcon("src\\popupicon\\wait.png");
                JOptionPane.showMessageDialog(null,"<html><b>Wait for Admin Approval</b></html>","Message", JOptionPane.INFORMATION_MESSAGE, icon);
                Clear();
            }
            if(user.getStatus().equals("true"))
            {
                setVisible(false);
                new Home(email).setVisible(true);
            }
         }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        ValidateFields();
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new ForgotPassword().setVisible(true);
        
    }//GEN-LAST:event_jLabel10MouseClicked

    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyReleased
        // TODO add your handling code here:
        ValidateFields();
    }//GEN-LAST:event_txtemailKeyReleased

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundjLabel1;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignup;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtemail;
    // End of variables declaration//GEN-END:variables
}
