package org.itenas.oop.project.view;

import javax.swing.JOptionPane;
import org.itenas.oop.project.repository.ControllerLogin;

/**
 *
 * @author aryan
 */
public class LoginUtama extends javax.swing.JFrame {
    Boolean hasil;
    ControllerLogin conLog = new ControllerLogin();
    
    public LoginUtama() {
        initComponents();
        setLocationRelativeTo(null);
        
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            LoginAction(); 
        }
    }
});

        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtPassword.requestFocus(); 
        }
    }
});
    }

    public void LoginAction(){
        int stat = conLog.LoginUtama(txtUsername.getText(), String.valueOf(txtPassword.getPassword()));
        String tipeAkun = conLog.TipeAkunLogin(txtUsername.getText(), String.valueOf(txtPassword.getPassword()));
        
        if (stat == 1 && "Admin".equals(tipeAkun)){
            JOptionPane.showMessageDialog(null, "Login berhasil", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            new MainAdminForm().setVisible(true);
            new LoginUtama().setVisible(false);
            dispose();
        }else if (stat == 1 && "Penyelenggara".equals(tipeAkun)){
            JOptionPane.showMessageDialog(null, "Login berhasil", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            new MainPenyelenggaraForm().setVisible(true);
            new LoginUtama().setVisible(false);
            dispose();
        }else if (stat == 1 && "Pendaftar".equals(tipeAkun)){
            JOptionPane.showMessageDialog(null, "Login berhasil", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            new MainPendaftarForm().setVisible(true);
            new LoginUtama().setVisible(false);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Username atau password yang anda masukkan salah!", "Pesan", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void showPassword(){
        if (cbShowPassword.isSelected()){
            txtPassword.setEchoChar((char)0);
            cbShowPassword.setText("Hide Password");
        }else{
            txtPassword.setEchoChar('*');
            cbShowPassword.setText("Show Password");
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

        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        textSelamatDatang9 = new javax.swing.JLabel();
        textUsername9 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        textPassword9 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        cbShowPassword = new javax.swing.JCheckBox();
        btnLogin = new javax.swing.JButton();
        textRegisterPenyelenggara9 = new javax.swing.JLabel();
        textBelumPunyaAkun9 = new javax.swing.JLabel();
        labelImageBackgound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel19.setBackground(new java.awt.Color(121, 215, 190));

        jPanel20.setBackground(new java.awt.Color(246, 244, 240));

        textSelamatDatang9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        textSelamatDatang9.setForeground(new java.awt.Color(51, 51, 51));
        textSelamatDatang9.setText("Selamat Datang!");

        textUsername9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textUsername9.setForeground(new java.awt.Color(51, 51, 51));
        textUsername9.setText("Username");

        txtUsername.setBackground(new java.awt.Color(239, 239, 239));
        txtUsername.setForeground(new java.awt.Color(51, 51, 51));
        txtUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 191, 191), 1, true));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        textPassword9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textPassword9.setForeground(new java.awt.Color(51, 51, 51));
        textPassword9.setText("Password");

        txtPassword.setBackground(new java.awt.Color(239, 239, 239));
        txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 191, 191), 1, true));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        cbShowPassword.setForeground(new java.awt.Color(51, 51, 51));
        cbShowPassword.setText("Show Password");
        cbShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShowPasswordActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(46, 80, 119));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        textRegisterPenyelenggara9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textRegisterPenyelenggara9.setForeground(new java.awt.Color(51, 51, 51));
        textRegisterPenyelenggara9.setText("Register");
        textRegisterPenyelenggara9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textRegisterPenyelenggara9MouseClicked(evt);
            }
        });

        textBelumPunyaAkun9.setForeground(new java.awt.Color(51, 51, 51));
        textBelumPunyaAkun9.setText("Belum punya akun?");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(textSelamatDatang9))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbShowPassword)
                            .addComponent(textUsername9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(textPassword9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword)
                            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(textBelumPunyaAkun9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textRegisterPenyelenggara9)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(textSelamatDatang9)
                .addGap(37, 37, 37)
                .addComponent(textUsername9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(textPassword9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbShowPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textRegisterPenyelenggara9)
                    .addComponent(textBelumPunyaAkun9))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        labelImageBackgound.setIcon(new javax.swing.ImageIcon("C:\\Novila Arya\\Sekolah\\ITENAS\\Semester 3\\ISB-205\\Program\\Tugas Besar\\logregicon350.png")); // NOI18N
        labelImageBackgound.setText("jLabel1");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(labelImageBackgound, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(labelImageBackgound)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void cbShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShowPasswordActionPerformed
        showPassword();
    }//GEN-LAST:event_cbShowPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        LoginAction();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void textRegisterPenyelenggara9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textRegisterPenyelenggara9MouseClicked
        new RegisterUtama().setVisible(true);
        new LoginUtama().setVisible(false);
        dispose();
    }//GEN-LAST:event_textRegisterPenyelenggara9MouseClicked

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
            java.util.logging.Logger.getLogger(LoginUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox cbShowPassword;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JLabel labelImageBackgound;
    private javax.swing.JLabel textBelumPunyaAkun9;
    private javax.swing.JLabel textPassword9;
    private javax.swing.JLabel textRegisterPenyelenggara9;
    private javax.swing.JLabel textSelamatDatang9;
    private javax.swing.JLabel textUsername9;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
