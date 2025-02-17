/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itenas.oop.project.component;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import org.itenas.oop.project.connection.ConnectionManager;
import org.itenas.oop.project.repository.ControllerPendaftar;

/**
 *
 * @author aryan
 */
public class PendaftaranFrame extends javax.swing.JFrame {
    private ConnectionManager conMan;
    private Connection conn;
    private ControllerPendaftar conPen;
    Boolean hasil;
    Statement stmt;
    ResultSet rs;
    
    public PendaftaranFrame() {
        initComponents();
        getData();
    }
    
    public void getData(){
        String nama = null; 
        conMan = new ConnectionManager();
        conPen = new ControllerPendaftar();
        conn = conMan.connectDb(); 
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM temp_daftar_akun;");
            if (rs.next()) { 
                txtJudul.setText(rs.getString("judul"));
                txtNama.setText(rs.getString("nama"));
                txtJenisKelamin.setText(rs.getString("jenis_kelamin"));
                txtPendidikan.setText(rs.getString("pendidikan_saat_ini"));
                txtUmur.setText(rs.getString("umur"));
                txtPengalamanOrganisasi.setText(rs.getString("pengalaman_organisasi"));
                txtPengalamanLainnya.setText(rs.getString("pengalaman_lainnya"));                
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

        jPanel1 = new javax.swing.JPanel();
        textInstansi = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        textUsername = new javax.swing.JLabel();
        txtJenisKelamin = new javax.swing.JTextField();
        textPassword = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        textNama1 = new javax.swing.JLabel();
        textNama2 = new javax.swing.JLabel();
        txtPendidikan = new javax.swing.JTextField();
        txtUmur = new javax.swing.JTextField();
        txtJudul = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtPengalamanLainnya = new javax.swing.JTextArea();
        textPengalamanLainnya = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPengalamanOrganisasi = new javax.swing.JTextArea();
        textOrganisasi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(239, 236, 229));

        textInstansi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textInstansi.setForeground(new java.awt.Color(51, 51, 51));
        textInstansi.setText("Nama");

        txtNama.setBackground(new java.awt.Color(239, 239, 239));
        txtNama.setForeground(new java.awt.Color(51, 51, 51));
        txtNama.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 191, 191), 1, true));
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        textUsername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textUsername.setForeground(new java.awt.Color(51, 51, 51));
        textUsername.setText("Umur");

        txtJenisKelamin.setBackground(new java.awt.Color(239, 239, 239));
        txtJenisKelamin.setForeground(new java.awt.Color(51, 51, 51));
        txtJenisKelamin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 191, 191), 1, true));
        txtJenisKelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJenisKelaminActionPerformed(evt);
            }
        });

        textPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textPassword.setForeground(new java.awt.Color(51, 51, 51));
        textPassword.setText("Judul Magang");

        btnSubmit.setBackground(new java.awt.Color(153, 255, 153));
        btnSubmit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(51, 51, 51));
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(null);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        textNama1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textNama1.setForeground(new java.awt.Color(51, 51, 51));
        textNama1.setText("Jenis Kelamin");

        textNama2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textNama2.setForeground(new java.awt.Color(51, 51, 51));
        textNama2.setText("Pendidikan Saat Ini");

        txtPendidikan.setBackground(new java.awt.Color(239, 239, 239));
        txtPendidikan.setForeground(new java.awt.Color(51, 51, 51));
        txtPendidikan.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 191, 191), 1, true));
        txtPendidikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPendidikanActionPerformed(evt);
            }
        });

        txtUmur.setBackground(new java.awt.Color(239, 239, 239));
        txtUmur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 191, 191)));

        txtJudul.setBackground(new java.awt.Color(239, 239, 239));
        txtJudul.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 191, 191)));

        txtPengalamanLainnya.setBackground(new java.awt.Color(239, 239, 239));
        txtPengalamanLainnya.setColumns(20);
        txtPengalamanLainnya.setForeground(new java.awt.Color(51, 51, 51));
        txtPengalamanLainnya.setRows(5);
        txtPengalamanLainnya.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 191, 191)));
        jScrollPane3.setViewportView(txtPengalamanLainnya);

        textPengalamanLainnya.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textPengalamanLainnya.setForeground(new java.awt.Color(51, 51, 51));
        textPengalamanLainnya.setText("Pengalaman Lainnya (Pekerjaan/Penghargaan/Keahlian)");

        txtPengalamanOrganisasi.setBackground(new java.awt.Color(239, 239, 239));
        txtPengalamanOrganisasi.setColumns(20);
        txtPengalamanOrganisasi.setForeground(new java.awt.Color(51, 51, 51));
        txtPengalamanOrganisasi.setRows(5);
        txtPengalamanOrganisasi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(191, 191, 191)));
        jScrollPane2.setViewportView(txtPengalamanOrganisasi);

        textOrganisasi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textOrganisasi.setForeground(new java.awt.Color(51, 51, 51));
        textOrganisasi.setText("Pengalaman Organisasi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNama1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textInstansi, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(textNama2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(674, 674, 674))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtPendidikan)
                            .addComponent(txtJenisKelamin)
                            .addComponent(txtNama)
                            .addComponent(txtJudul, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUmur))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textOrganisasi, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textPengalamanLainnya, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(textPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textInstansi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNama1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUmur, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNama2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPendidikan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textOrganisasi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPengalamanLainnya)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 791, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtJenisKelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJenisKelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJenisKelaminActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        hasil = conPen.insertPendaftar(txtNama.getText(), txtJenisKelamin.getText(), txtPendidikan.getText(), Integer.parseInt(txtUmur.getText()), txtJudul.getText(), txtPengalamanOrganisasi.getText(), txtPengalamanLainnya.getText());
        new PendaftaranFrame().setVisible(false);
        dispose();
        if (hasil){
            JOptionPane.showMessageDialog(null, "Anda Berhasil Melakukan Pendaftaran!");
        }else{
            JOptionPane.showMessageDialog(null, "Data gagal ditambahkan", " Pesan", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtPendidikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPendidikanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPendidikanActionPerformed

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
            java.util.logging.Logger.getLogger(PendaftaranFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PendaftaranFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PendaftaranFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PendaftaranFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PendaftaranFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel textInstansi;
    private javax.swing.JLabel textNama1;
    private javax.swing.JLabel textNama2;
    private javax.swing.JLabel textOrganisasi;
    private javax.swing.JLabel textPassword;
    private javax.swing.JLabel textPengalamanLainnya;
    private javax.swing.JLabel textUsername;
    private javax.swing.JTextField txtJenisKelamin;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPendidikan;
    private javax.swing.JTextArea txtPengalamanLainnya;
    private javax.swing.JTextArea txtPengalamanOrganisasi;
    private javax.swing.JTextField txtUmur;
    // End of variables declaration//GEN-END:variables
}
