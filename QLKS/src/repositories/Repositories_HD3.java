/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;
import java.sql.*;
import Model.Model_HD3;
import dbconnect.DBconnect;
import java.util.ArrayList;
/**
 *
 * @author Chi Dat
 */
public class Repositories_HD3 {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;
    
    public int them_HD3(Model_HD3 hd3){
        sql = "INSERT INTO HOADON(MAHD,MANV,MAKH,SoDienThoai,DiaChi,TienCoc, NgayXuatDon) \n" +
"values(?,?,?,?,?,?, GETDATE())";
        
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, hd3.getMaHD());
            ps.setObject(2, hd3.getMaNV());
            ps.setObject(3, hd3.getMaKH());
            ps.setObject(4, hd3.getSoDienThoai());
            ps.setObject(5, hd3.getDiaChi());
            ps.setObject(6, hd3.getTienCoc());
            
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
//    public Model_HD3  checkTung_HD3(String maHDmoi){
//        sql = "select MAHD,MANV,MAKH,SoDienThoai,DiaChi,TienCoc from HOADON\n" +
//"where MAHD = ?";
//        Model_HD3 hd = null;
//        try {
//            con = dbconnect.DBconnect.getConnection();
//            ps = con.prepareStatement(sql);
//            ps.setObject(1, maHDmoi);
//            rs = ps.executeQuery();
//            while(rs.next()){
//                String maHD;
//                String maNV;
//                String maKH;
//                String soDienThoai;
//                String diaChi;
//                String tienCoc;
//                 maHD = rs.getString(1);
//                 maNV = rs.getString(2);
//                 maKH = rs.getString(3);
//                 soDienThoai = rs.getString(4);
//                 diaChi = rs.getString(5);
//                 tienCoc = rs.getString(6);
//                 hd = new Model_HD3(maHD, maNV, maKH, soDienThoai, diaChi, 0);
//            }return hd;
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//        
//    }
    public boolean checkTrung_HD3(String maHD){
        sql = "select MAHD from HOADON\n" +
"where MAHD = ?";
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, maHD);
            rs = ps.executeQuery();
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
