/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.itenas.oop.project.component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.itenas.oop.project.connection.ConnectionManager;
import org.itenas.oop.project.event.EventMenuSelected;
import org.itenas.oop.project.model.ModelMenu;
import org.itenas.oop.project.model.ModelProfil;

/**
 *
 * @author aryan
 */
public class HeaderMenu extends javax.swing.JPanel {
    private ConnectionManager conMan;
    private Connection conn;
    private JFrame fram;
    private EventMenuSelected event;
    
    public void addEventMenuSelected(EventMenuSelected event){
        this.event = event;
        profil1.addEventMenuSelected(event);
    }
    
    public HeaderMenu() {
        this.fram = fram;
        initComponents();
        setOpaque(false);
        profil1.setOpaque(false);
        init();
        getNama();
    }
    
    private void getNama(){
        conMan = new ConnectionManager();
        conn = conMan.connectDb();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();

            String queryAdmin = "SELECT nama FROM temp_daftar_akun";
            rs = stmt.executeQuery(queryAdmin);
            if (rs.next()) {
                txtNama.setText(String.valueOf(rs.getString("nama")));
            }
          

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error saat menarik data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }    
    
    private void init(){
        profil1.addItem(new ModelProfil("Profil", ModelProfil.MenuType.MENU));
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMoving = new javax.swing.JPanel();
        txtNama = new javax.swing.JLabel();
        profil1 = new org.itenas.oop.project.repository.Profil<>();
        txtNama1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        panelMoving.setOpaque(false);

        txtNama.setBackground(new java.awt.Color(153, 153, 153));
        txtNama.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtNama.setForeground(new java.awt.Color(51, 51, 51));
        txtNama.setText("Nama");

        txtNama1.setBackground(new java.awt.Color(153, 153, 153));
        txtNama1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtNama1.setForeground(new java.awt.Color(51, 51, 51));
        txtNama1.setText("Selamat Datang, ");

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMovingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNama1)
                .addGap(0, 0, 0)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(319, Short.MAX_VALUE))
            .addGroup(panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMovingLayout.createSequentialGroup()
                    .addContainerGap(588, Short.MAX_VALUE)
                    .addComponent(profil1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        panelMovingLayout.setVerticalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNama)
                    .addComponent(txtNama1))
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelMovingLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(profil1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }

    private int x;
    private int y;

    public void initMoving(JFrame fram) {
        panelMoving.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }

        });
        panelMoving.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                fram.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelMoving;
    private org.itenas.oop.project.repository.Profil<String> profil1;
    private javax.swing.JLabel txtNama;
    private javax.swing.JLabel txtNama1;
    // End of variables declaration//GEN-END:variables
}
