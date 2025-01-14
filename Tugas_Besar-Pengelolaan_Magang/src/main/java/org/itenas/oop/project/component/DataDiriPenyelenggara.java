/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.itenas.oop.project.component;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import org.itenas.oop.project.connection.ConnectionManager;
import org.itenas.oop.project.view.LoginUtama;

/**
 *
 * @author aryan
 */
public class DataDiriPenyelenggara extends javax.swing.JPanel {
    private ConnectionManager conMan;
    private Connection conn;
    Statement stmt;
    ResultSet rs;
    
    public DataDiriPenyelenggara() {
        initComponents();
        MengubahData();
    }

    public void MengubahData(){
        String nama = null; 
        conMan = new ConnectionManager();
        conn = conMan.connectDb(); 
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM temp_daftar_akun;");
            if (rs.next()) { 
                txtNama.setText(rs.getString("nama"));
                txtInstansi.setText(rs.getString("instansi"));
                txtUsername.setText(rs.getString("username"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            conMan.disconnectDb(conn);
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

        txtNama = new javax.swing.JTextField();
        textNama = new javax.swing.JLabel();
        textInstansi = new javax.swing.JLabel();
        txtInstansi = new javax.swing.JTextField();
        textUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnCekPassword = new javax.swing.JButton();

        setBackground(new java.awt.Color(239, 236, 229));

        txtNama.setBackground(new java.awt.Color(239, 239, 239));
        txtNama.setForeground(new java.awt.Color(51, 51, 51));
        txtNama.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 191, 191), 1, true));
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        textNama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textNama.setForeground(new java.awt.Color(51, 51, 51));
        textNama.setText("Nama");

        textInstansi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textInstansi.setForeground(new java.awt.Color(51, 51, 51));
        textInstansi.setText("Instansi");

        txtInstansi.setBackground(new java.awt.Color(239, 239, 239));
        txtInstansi.setForeground(new java.awt.Color(51, 51, 51));
        txtInstansi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 191, 191), 1, true));
        txtInstansi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInstansiActionPerformed(evt);
            }
        });

        textUsername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textUsername.setForeground(new java.awt.Color(51, 51, 51));
        textUsername.setText("Username");

        txtUsername.setBackground(new java.awt.Color(239, 239, 239));
        txtUsername.setForeground(new java.awt.Color(51, 51, 51));
        txtUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 191, 191), 1, true));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(153, 255, 153));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(51, 51, 51));
        btnUpdate.setText("Update");
        btnUpdate.setBorder(null);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnCekPassword.setBackground(new java.awt.Color(153, 255, 153));
        btnCekPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCekPassword.setForeground(new java.awt.Color(51, 51, 51));
        btnCekPassword.setText("Cek Password");
        btnCekPassword.setBorder(null);
        btnCekPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNama)
                    .addComponent(txtInstansi)
                    .addComponent(txtUsername)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textInstansi, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 602, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCekPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textInstansi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInstansi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCekPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(451, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtInstansiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInstansiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInstansiActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String newNama = txtNama.getText();
        String newInstansi = txtInstansi.getText();
        String newUsername = txtUsername.getText();
        int id = 0;
        conMan = new ConnectionManager();
        conn = conMan.connectDb(); 
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT id FROM temp_daftar_akun;");
            if (rs.next()) { 
               id = rs.getInt("id"); 
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        String query = "UPDATE daftar_akun SET nama = '"
                + newNama + "', instansi = '"
                + newInstansi + "', username = '"
                + newUsername + "' WHERE id = "
                + id + ";";
        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Update berhasil silahkan login ulang!", "Pesan", JOptionPane.INFORMATION_MESSAGE);        
            try {
                conMan = new ConnectionManager();
                conn = conMan.connectDb();
                stm.executeUpdate("TRUNCATE TABLE temp_daftar_akun;");
                new LoginUtama().setVisible(true);
                javax.swing.JFrame topFrame = (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
                if (topFrame != null) {
                    topFrame.dispose();
                }
            } catch (SQLException ex) {
                System.out.println("error: " + ex.getMessage());                            
            }        
        } catch (SQLException ex){
            System.out.println("error: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCekPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekPasswordActionPerformed
        new CekPassword().setVisible(true);
    }//GEN-LAST:event_btnCekPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCekPassword;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel textInstansi;
    private javax.swing.JLabel textNama;
    private javax.swing.JLabel textUsername;
    private javax.swing.JTextField txtInstansi;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
