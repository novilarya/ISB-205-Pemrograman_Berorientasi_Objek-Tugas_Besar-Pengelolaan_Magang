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
import org.itenas.oop.project.model.Magang;
import org.itenas.oop.project.model.MagangPendaftar;

import org.itenas.oop.project.model.Pendaftar;

/**
 *
 * @author aryan
 */
public class ControllerPendaftar {
Scanner input = new Scanner(System.in);
    ConnectionManager conMan = new ConnectionManager();
    Connection con = conMan.connectDb();
    String penyelenggara = null;
    
    public String mengambilInstansi() throws SQLException{
        conMan = new ConnectionManager();
        String instansi = null;       
        Connection conn = conMan.connectDb();
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("SELECT instansi from tempinstansi");
        
        try {
            while (rs.next()){
                instansi = rs.getString("instansi");
            }             
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return instansi;
    }
    
    public boolean insertPendaftar(String nama, String jenisKelamin, String pendidikanSaatIni, int umur, String judul, String pengalamanOrganisasi, String pengalamanLainnya){        
       
        try {
            Statement stm = con.createStatement();
            String query2 = "INSERT INTO daftar_pendaftar_magang "
                + "(nama, jenis_kelamin, pendidikan_saat_ini, umur, judul, pengalaman_organisasi, pengalaman_lainnya)"
                + "values ('" + nama + "', '" + jenisKelamin + "', '" + pendidikanSaatIni + "', '" + umur + "', '" + judul + "', '" + pengalamanOrganisasi + "', '" + pengalamanLainnya + "')";        
            stm.executeUpdate(query2);            
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        } 
           
    }
    
    public MagangPendaftar mencariMagangPendaftarBerdasarkanNama(String namaPendaftar){
        MagangPendaftar magangPendaftar = new MagangPendaftar();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM daftar_pendaftar_magang WHERE nama LIKE '%" + namaPendaftar + "%'");
            while (rs.next()){
                magangPendaftar.setNama(rs.getString("nama"));
            }
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }    
        return magangPendaftar;
    }

    public List<MagangPendaftar> showPendaftarBerdasarkanMagang(String judulMagang){
        List<MagangPendaftar> listMagangPendaftar = new ArrayList<MagangPendaftar>();
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM daftar_pendaftar_magang WHERE judul = '" + judulMagang + "';");
            while (rs.next()) {  
                MagangPendaftar magangPendaftar = new MagangPendaftar();
                magangPendaftar.setKodeSeleksi(rs.getInt("kode_seleksi"));
                magangPendaftar.setNama(rs.getString("nama"));
                magangPendaftar.setJenisKelamin(rs.getString("jenis_kelamin"));
                magangPendaftar.setPendidikanSaatIni(rs.getString("pendidikan_saat_ini"));
                magangPendaftar.setUmur(rs.getInt("umur"));
                magangPendaftar.setJudulMagang(rs.getString("judul"));
                
                listMagangPendaftar.add(magangPendaftar);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listMagangPendaftar;
    }  
    public boolean insertMagangPendaftar(String nama, String jenisKelamin, String pendidikanSaatIni, int umur, String judul){
    
        try {
            Statement stm = con.createStatement();
            String query = "INSERT INTO daftar_pendaftar_magang "
                + "(nama, jenis_kelamin, pendidikan_saat_ini, umur, judul)"
                + "values ('" + nama + "', '" + jenisKelamin + "', '" + pendidikanSaatIni + "', '" + umur + "', '" + judul + "')";
        
            stm.executeUpdate(query);
            
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }         
    }
    
    public Pendaftar showPendaftar(){
        Pendaftar pendaftar = new Pendaftar();
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM temp_daftar_akun");
            while (rs.next()) {                
                pendaftar.setIdPendaftar(rs.getInt("id"));
                pendaftar.setNama(rs.getString("nama"));
                pendaftar.setJenisKelamin(rs.getString("jenis_kelamin"));
                pendaftar.setPendidikanSaatIni(rs.getString("pendidikan_saat_ini"));
                pendaftar.setUmur(rs.getInt("umur"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return pendaftar;
    }    
}
