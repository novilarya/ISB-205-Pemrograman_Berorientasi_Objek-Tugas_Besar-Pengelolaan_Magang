/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itenas.oop.project.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.itenas.oop.project.connection.ConnectionManager;
import org.itenas.oop.project.model.Hasil;
import org.itenas.oop.project.model.Magang;

public class ControllerMagang {
    ConnectionManager conMan = new ConnectionManager();
    Connection con = conMan.connectDb();
    String pendaftar = null;
    
    public String mengambilInstansi() throws SQLException{
        conMan = new ConnectionManager();
        String instansi = null;       
        Connection conn = conMan.connectDb();
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("SELECT instansi FROM temp_daftar_akun");
        
        try {
            while (rs.next()){
                instansi = rs.getString("instansi");
            }             
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return instansi;
    }
    
    public boolean insertMagang(String judulMagang, String lokasi, String tipeMagang, String posisiMagang, String deskripsiMagang, String kualifikasiMagang){        
       
        try {
            Statement stm = con.createStatement();
            String penyelenggara = mengambilInstansi();
            String query2 = "INSERT INTO daftar_magang "
                + "(judul, penyelenggara, lokasi, tipe, posisi, deskripsi, kualifikasi)"
                + "values ('" + judulMagang + "', '" + penyelenggara + "', '" + lokasi + "', '" + tipeMagang + "', '" + posisiMagang + "', '" + deskripsiMagang + "', '" + kualifikasiMagang + "')";
        
            stm.executeUpdate(query2);
            
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        } 
           
    }  
    


    public boolean updateMagang(String judulMagang, String penyelenggara, String lokasi, String tipeMagang, String posisiMagang, String deskripsiMagang, String kualifikasiMagang, String judul){
        String query = "UPDATE daftar_magang SET judul = '"
                + judulMagang + "', penyelenggara = '"
                + penyelenggara + "', lokasi = '"                
                + lokasi + "', tipe = '"
                + tipeMagang + "', posisi = '"
                + posisiMagang + "', deskripsi = '"
                + deskripsiMagang + "', kualifikasi = '"
                + kualifikasiMagang + "' WHERE judul = '"
                + judul + "'";
        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }    
    
    public boolean deleteMagang(String judulMagang){
        String query = "DELETE FROM daftar_magang WHERE judul = '" + judulMagang + "'";
        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }
    
    public Magang mencariBerdasarkanJudul(String judulMagang){
        Magang magang = new Magang();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM daftar_magang WHERE judul LIKE '%" + judulMagang + "%'");
            while (rs.next()){
                magang.setJudulMagang(rs.getString("judul"));
                magang.setPenyelenggara(rs.getString("penyelenggara"));
                magang.setLokasi(rs.getString("lokasi"));
                magang.setTipeMagang(rs.getString("tipe"));
                magang.setPosisiMagang(rs.getString("posisi"));
                magang.setDeskripsiMagang(rs.getString("deskripsi"));
                magang.setKualifikasiMagang(rs.getString("kualifikasi"));
            }
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }    
        return magang;
    }

    public List<Magang> showMagang(){
        List<Magang> listMagang = new ArrayList<Magang>();
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM daftar_magang");
            while (rs.next()) {                
                Magang magang = new Magang();
                magang.setJudulMagang(rs.getString("judul"));
                magang.setPenyelenggara(rs.getString("penyelenggara"));
                magang.setLokasi(rs.getString("lokasi"));
                magang.setTipeMagang(rs.getString("tipe"));
                magang.setPosisiMagang(rs.getString("posisi"));
                magang.setDeskripsiMagang(rs.getString("deskripsi"));
                magang.setKualifikasiMagang(rs.getString("kualifikasi"));

                listMagang.add(magang);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listMagang;
    }  
    
    public List<Hasil> showHasil(){
        List<Hasil> listHasil = new ArrayList<Hasil>();
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT hasil_seleksi.nama, hasil_seleksi.judul, hasil_seleksi.status " + 
                    "FROM hasil_seleksi INNER JOIN temp_daftar_akun " + 
                    "ON hasil_seleksi.nama = temp_daftar_akun.nama " +
                    "WHERE hasil_seleksi.nama = temp_daftar_akun.nama;");
            while (rs.next()) {                
                Hasil hasil = new Hasil();
                hasil.setNama(rs.getString("nama"));
                hasil.setJudul(rs.getString("judul"));
                hasil.setStatus(rs.getString("status"));
                listHasil.add(hasil);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listHasil;
    } 
    
        
    public Hasil mencariHasilBerdasarkanJudul(String judulMagang){
        Hasil hasil = new Hasil();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT hasil_seleksi.nama, hasil_seleksi.judul, hasil_seleksi.status " + 
                    "FROM hasil_seleksi INNER JOIN temp_daftar_akun " + 
                    "ON hasil_seleksi.nama = temp_daftar_akun.nama " +
                    "WHERE (hasil_seleksi.nama = temp_daftar_akun.nama) && (judul LIKE '%" + judulMagang + "%');");            
            while (rs.next()){
                hasil.setNama(rs.getString("nama"));
                hasil.setJudul(rs.getString("judul"));
                hasil.setStatus(rs.getString("status"));
            }
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }    
        return hasil;
    }
    
    public List<Magang> showMagangBerdasarkanPenyelenggara(){
        List<Magang> listMagang = new ArrayList<Magang>();
        
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT daftar_magang.judul, daftar_magang.penyelenggara, daftar_magang.lokasi, " +
                    "daftar_magang.tipe, daftar_magang.posisi, daftar_magang.deskripsi, daftar_magang.kualifikasi " +
                    "FROM daftar_magang INNER JOIN temp_daftar_akun ON daftar_magang.penyelenggara = temp_daftar_akun.instansi " +
                    "WHERE daftar_magang.penyelenggara = temp_daftar_akun.instansi");
            while (rs.next()) {                
                Magang magang = new Magang();
                magang.setJudulMagang(rs.getString("judul"));
                magang.setPenyelenggara(rs.getString("penyelenggara"));
                magang.setLokasi(rs.getString("lokasi"));
                magang.setTipeMagang(rs.getString("tipe"));
                magang.setPosisiMagang(rs.getString("posisi"));
                magang.setDeskripsiMagang(rs.getString("deskripsi"));
                magang.setKualifikasiMagang(rs.getString("kualifikasi"));

                listMagang.add(magang);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listMagang;
    }    
    
}
