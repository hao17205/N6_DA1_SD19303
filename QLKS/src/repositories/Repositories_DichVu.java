/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import java.sql.*;
import java.util.ArrayList;
import model.Model_DichVu;

/**
 *
 * @author rinbo
 */
public class Repositories_DichVu {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    private String sql = null;

    public ArrayList<model.Model_DichVu> getAll_DV() {
        ArrayList<model.Model_DichVu> list_DV = new ArrayList<>();
        sql = "SELECT MADV, TenDichVu, Gia, LoaiDichVu, MoTa FROM DICHVU";

        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String maDV = rs.getString(1);
                String tenDV = rs.getString(2);
                double gia = rs.getDouble(3);
                String loaiDV = rs.getString(4);
                String moTa = rs.getString(5);

                model.Model_DichVu m = new Model_DichVu(maDV, tenDV, gia, loaiDV, moTa);
                list_DV.add(m);
            }
            return list_DV;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int them_DV(Model_DichVu m) {
        sql = "INSERT INTO DICHVU(MADV, TenDichVu, Gia, LoaiDichVu, MoTa)\n"
                + "VALUES(?,?,?,?,?)";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getMaDV());
            ps.setObject(2, m.getTenDV());
            ps.setObject(3, m.getGia());
            ps.setObject(4, m.getLoaiDV());
            ps.setObject(5, m.getMoTa());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int sua_DV(String maDV, Model_DichVu m) {
        sql = "UPDATE DICHVU\n"
                + "SET TenDichVu = ?, Gia = ?, LoaiDichVu = ?, MoTa = ?\n"
                + "WHERE MADV = ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getTenDV());
            ps.setObject(2, m.getGia());
            ps.setObject(3, m.getLoaiDV());
            ps.setObject(4, m.getMoTa());
            ps.setObject(5, maDV);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int xoa(String maDV){
        sql = "delete from DICHVU where MADV = ?";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, maDV);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public ArrayList<model.Model_DichVu> timKiem(String timKiem){
                ArrayList<model.Model_DichVu> list_DV = new ArrayList<>();
        sql = "SELECT MADV, TenDichVu, Gia,  LoaiDichVu, MoTa FROM DICHVU WHERE MADV LIKE ? or TenDichVu like ? or gia like ? or MoTa like ? or LoaiDichVu like ?";

        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + timKiem + "%");
            ps.setString(2, "%" + timKiem + "%");
            ps.setString(3, "%" + timKiem + "%");
            ps.setString(4, "%" + timKiem + "%");
            ps.setString(5, "%" + timKiem + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                String maDV = rs.getString(1);
                String tenDV = rs.getString(2);
                double gia = rs.getDouble(3);
                String loaiDV = rs.getString(4);
                String moTa = rs.getString(5);

                model.Model_DichVu m = new Model_DichVu(maDV, tenDV, gia, loaiDV, moTa);
                list_DV.add(m);
            }
            return list_DV;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
//check trùng ở bảng 
}
