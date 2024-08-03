/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import java.sql.*;
import Model.Model_TrangChu;
import java.util.ArrayList;

public class Repositories_TrangChu {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    String sql = null;

    public ArrayList<Model_TrangChu> getAll_TrangChu() {
        sql = "select p.MA_P,p.Tang,lp.MALP,p.TinhTrang,lp.LoaiPhong,lp.Gia,lp.SONGUOIO,lp.MoTa \n"
                + "from PHONG p INNER JOIN LOAIPHONG lp on p.MALP = lp.MALP";
        ArrayList<Model_TrangChu> list_Phong = new ArrayList<>();
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String maPhong = rs.getString(1);
                int tang = rs.getInt(2);
                String maLP = rs.getString(3);
                String tinhTrang = rs.getString(4);
                String loaiPhong = rs.getString(5);
                double giaPhong = rs.getDouble(6);
                int soNGuoio = rs.getInt(7);
                String moTa = rs.getString(8);
                Model_TrangChu phong = new Model_TrangChu(maPhong, tang, maLP, tinhTrang, loaiPhong, giaPhong, soNGuoio, moTa);
                list_Phong.add(phong);
            }
            return list_Phong;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Model_TrangChu> timKiemPhong(String timKiemPhong) {
        ArrayList<Model_TrangChu> list_TimPhong = new ArrayList<>();
        sql = "select p.MA_P,p.Tang,lp.MALP,p.TinhTrang,lp.LoaiPhong,lp.Gia,lp.SONGUOIO,lp.MoTa \n"
                + "from PHONG p INNER JOIN LOAIPHONG lp on p.MALP = lp.MALP\n"
                + "where p.MA_P like ? or TinhTrang like ? or LoaiPhong like ? or Gia like ? or MoTa like ? ";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, '%' + timKiemPhong + '%');
            ps.setString(2, '%' + timKiemPhong + '%');
            ps.setString(3, '%' + timKiemPhong + '%');
            ps.setString(4, '%' + timKiemPhong + '%');
            ps.setString(5, '%' + timKiemPhong + '%');
            rs = ps.executeQuery();
            while (rs.next()) {
                String maPhong = rs.getString(1);
                int tang = rs.getInt(2);
                String maLP = rs.getString(3);
                String tinhTrang = rs.getString(4);
                String loaiPhong = rs.getString(5);
                double giaPhong = rs.getDouble(6);
                int soNGuoio = rs.getInt(7);
                String moTa = rs.getString(8);
                Model_TrangChu phong = new Model_TrangChu(maPhong, tang, maLP, tinhTrang, loaiPhong, giaPhong, soNGuoio, moTa);
                list_TimPhong.add(phong);
            }
            return list_TimPhong;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //Code nút sửa 
    public int sua_TC(String maP, Model_TrangChu m) {
        sql = "UPDATE PHONG\n"
                + "SET TinhTrang = ?\n"
                + "WHERE MA_P = ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getTinhTrang());
                ps.setObject(2, maP);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public int xoa_TC(String maP) {
        sql = "delete from PHONG where MA_P = ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, maP);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
