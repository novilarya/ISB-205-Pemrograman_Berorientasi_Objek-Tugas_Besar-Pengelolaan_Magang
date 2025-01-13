/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.itenas.oop.project.component;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.itenas.oop.project.connection.ConnectionManager;
import org.itenas.oop.project.model.Hasil;
import org.itenas.oop.project.model.Magang;
import org.itenas.oop.project.model.MagangPendaftar;
import org.itenas.oop.project.model.Pendaftar;
import org.itenas.oop.project.repository.ControllerMagang;
import org.itenas.oop.project.repository.ControllerPendaftar;

/**
 *
 * @author aryan
 */
public class HasilSeleksi extends javax.swing.JPanel {

    Boolean hasil;
    ControllerMagang conMagang = new ControllerMagang();
    ControllerPendaftar conPendaftar = new ControllerPendaftar();
    private DefaultTableModel model;
    private DefaultTableModel modelPendaftar;
    private ConnectionManager conMan = new ConnectionManager();
    private Connection con = conMan.connectDb();;
    private String judulMagang = null ;
    
    public HasilSeleksi() {
        initComponents();     
        model = new DefaultTableModel();
        tabelHasil.setModel(model);
        model.addColumn("Judul");
        model.addColumn("Nama");
        model.addColumn("Status");
        getData();  
    }
    
    public final void getData(){
        DefaultTableModel dtm = (DefaultTableModel) tabelHasil.getModel();

        dtm.setRowCount(0);

        List<Hasil> listHasil = conMagang.showHasil();
        String[] data = new String[8];
        for (Hasil newHasil : listHasil){
            data[0] = newHasil.getJudul();
            data[1] = newHasil.getNama();
            data[2] = newHasil.getStatus();
            dtm.addRow(data);
        }
    }
    
    private void tampilkanDataHasil(String judulMagang){

        Hasil hasil = new Hasil();
        hasil = conMagang.mencariHasilBerdasarkanJudul(judulMagang);
        
        
        DefaultTableModel dtm = (DefaultTableModel) tabelHasil.getModel();
        dtm.setRowCount(0);        
        if (hasil != null){
            String[] data = new String[7];
            data[0] = hasil.getJudul();
            data[1] = hasil.getNama();
            data[2] = hasil.getStatus();
            dtm.addRow(data);
        }else{
            JOptionPane.showMessageDialog(null,"Barang dengan judul " + judulMagang + " tidak ditemukan!");
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

        textUsername6 = new javax.swing.JLabel();
        txtSearchJudulMagang = new javax.swing.JTextField();
        btnSearchJudul = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelHasil = new javax.swing.JTable();

        setBackground(new java.awt.Color(239, 236, 229));

        textUsername6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textUsername6.setForeground(new java.awt.Color(51, 51, 51));
        textUsername6.setText("Pencarian hasil berdasarkan judul");

        txtSearchJudulMagang.setBackground(new java.awt.Color(239, 239, 239));
        txtSearchJudulMagang.setForeground(new java.awt.Color(51, 51, 51));
        txtSearchJudulMagang.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 191, 191), 1, true));
        txtSearchJudulMagang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchJudulMagangActionPerformed(evt);
            }
        });

        btnSearchJudul.setBackground(new java.awt.Color(153, 153, 255));
        btnSearchJudul.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearchJudul.setForeground(new java.awt.Color(51, 51, 51));
        btnSearchJudul.setText("Search");
        btnSearchJudul.setBorder(null);
        btnSearchJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchJudulActionPerformed(evt);
            }
        });

        tabelHasil.setBackground(new java.awt.Color(239, 239, 239));
        tabelHasil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Judul", "Nama", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelHasil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelHasilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelHasil);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textUsername6)
                        .addGap(0, 520, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearchJudulMagang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textUsername6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchJudulMagang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchJudulMagangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchJudulMagangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchJudulMagangActionPerformed

    private void btnSearchJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchJudulActionPerformed
        try {
            String judulMagang = txtSearchJudulMagang.getText();            
            if (judulMagang.isEmpty()){
                getData();
            }else{
                tampilkanDataHasil(judulMagang);              
            }            
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Anda Salah Memasukkan Judul!");
        }
    }//GEN-LAST:event_btnSearchJudulActionPerformed
    
    private void tabelHasilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelHasilMouseClicked
      
    }//GEN-LAST:event_tabelHasilMouseClicked

    private boolean someCondition() {
        return true; 
    }
    private void setForm(javax.swing.JPanel form) {        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchJudul;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelHasil;
    private javax.swing.JLabel textUsername6;
    private javax.swing.JTextField txtSearchJudulMagang;
    // End of variables declaration//GEN-END:variables
}
