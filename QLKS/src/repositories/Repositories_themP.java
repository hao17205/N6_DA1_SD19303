/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import Model.Model_TrangChu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author rinbo
 */
public class Repositories_themP {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public ArrayList<Model.Model_TrangChu> getAll_LP() {
        ArrayList<Model.Model_TrangChu> list_LP = new ArrayList<>();
        sql = "select MALP, LoaiPhong, Gia, MoTa from LOAIPHONG";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String maLP = rs.getString(1);
                String loaiP = rs.getString(2);
                double gia = rs.getDouble(3);
                String moTa = rs.getString(4);
                Model.Model_TrangChu m = new Model_TrangChu(maLP, loaiP, gia, moTa);
                list_LP.add(m);
            }
            return list_LP;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int them(Model_TrangChu m) {
        sql = "insert into PHONG(MA_P, Tang, MALP, TinhTrang)\n"
                + "values(?,?,?,N'Trống')";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getMaPhong());
            ps.setObject(2, m.getTang());
            ps.setObject(3, m.getMaLP());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public String checkTrung_LP(String maP_new) {
        ArrayList<Model.Model_TrangChu> list_LP = new ArrayList<>();
        sql = "select MA_P from PHONG where MA_P like ?";
         try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, maP_new);
            rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getString("MA_P").equalsIgnoreCase(maP_new)) {
                    return "TRùng mã";
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return "Có bug gọi cho thằng code ngay SĐT 0397639827";
        }
    }
}
